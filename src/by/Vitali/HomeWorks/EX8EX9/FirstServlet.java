package by.Vitali.HomeWorks.EX8EX9;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by viivpo2010 on 15.8.17.
 */
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private int counterVisit;
    // use FileInputStream and FileOutputStream because one wariable is written
    private FileInputStream input;
    private FileOutputStream output;

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            //path file to store the variable
            input = new FileInputStream("/opt/tomcat/webapps/examples/WEB-INF/classes/by/Vitali/HomeWorks/EX8EX9/resource/count.txt");
            try {
                counterVisit = Integer.parseInt(String.valueOf(input.read()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        counterVisit++;
        out.println("<html><head><title>Fist Servlet</title></head>");
        out.println("<body><h1>My first servlet WB3 EX8EX9</h1>");
        out.println("<hr align=\"left\" width=\"410\" size=\"3\"color=\"Red\"/>");
        out.println("<h2>Count of visits " + counterVisit + "</h2>");
        out.println("<hr align=\"left\" width=\"170\" size=\"3\"color=\"#36E052\"/>");
        out.println("</body></html>");
        output = new FileOutputStream("/opt/tomcat/webapps/examples/WEB-INF/classes/by/Vitali/HomeWorks/EX8EX9/resource/count.txt");
        output.write(counterVisit);
        output.flush();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        doGet(request ,response);
    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            output.close();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
