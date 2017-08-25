package by.Vitali.HomeWorks.WB3EX11;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by viivpo2010 on 20.8.17.
 */
public class WB3EX11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String info = request.getHeader("User-Agent");
        String match = info.toLowerCase();
        String browser = "";

        if (match.contains("opr")|| match.contains("opera")) {
            browser = "Opera";
        } else if (match.contains("safari") && match.contains("version")) {
            browser = "Safari";
        } else if (match.contains("chrome")) {
            browser = "Chrome";
        }
        else if (match.contains("firefox") || match.contains("mozilla")) {
            browser = "Mozilla";
        }

        PrintWriter out = response.getWriter();
        String hello = "Welcome user " + browser + "!!!";
        out.println("<html><head><title>" + browser + "</title></head>");
        out.println("<body><h1>" + hello + "</h1></body></html>");
    }
}
