package by.Vitali.HomeWorks.WB3EX10;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by viivpo2010 on 19.8.17.
 */
public class WB3EX10 extends HttpServlet {

    private static final long serialVersionUID = 4L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("Name");
        String phoneNumber = request.getParameter("Phone");
        String mail = request.getParameter("Mail");
        String error = "";

        if (name == "") {
            error = "Field name is empty!";
        } else if (phoneNumber == "" && mail == "") {
            error = "Fields: phoneNumber or mail is empty" ;
        }
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println("<html><head><title>");
        if (!error.isEmpty()) {
            out.print(error + "</title></head><body><h1>" + error + "</h1>");
            out.println("<hr align=\"left\" width=\"410\" size=\"3\"color=\"Red\"/>");
        } else {
            out.print("Your contact info</title></head><body><h1>You entered contact information</h1>");
            out.print("<h1>Name: " + name + "</h1>");
            out.println("<hr align=\"left\" width=\"200\" size=\"3\"color=\"Green\"/>");
            out.print("<h1>PhoneNumber: " + phoneNumber + "</h1>");
            out.println("<hr align=\"left\" width=\"200\" size=\"3\"color=\"Green\"/>");
            out.print("<h1>Email: " + mail + "</h1>");
            out.println("<hr align=\"left\" width=\"200\" size=\"3\"color=\"Green\"/>");
        }
        out.println("</body></html>");
    }
}

