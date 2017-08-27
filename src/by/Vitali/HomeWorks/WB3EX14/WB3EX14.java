package by.Vitali.HomeWorks.WB3EX14;

import by.Vitali.HomeWorks.WB3EX14.Beans.Expense;
import by.Vitali.HomeWorks.WB3EX14.Beans.Receiver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by viivpo2010 on 27.8.17.
 */
public class WB3EX14 extends HttpServlet {

    private static final long serialVersionUID = 1L;
    DAOClass daoClass;


    @Override
    public void init()  {

        daoClass = DAOClass.getDAOClass();

        String url = getServletConfig().getInitParameter("url");
        String user = getServletConfig().getInitParameter("user");
        String password = getServletConfig().getInitParameter("password");

        daoClass.setUrl(url);
        daoClass.setUser(user);
        daoClass.setPassword(password);
        daoClass.connect();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<html><head><title>Tables from database MYDB</title></head><body>");
        out.println("<h1>Table: expenses</h1><table border=2>");
        out.println("<tr><th>NUM </th><th>PAYDATE </th><th>RECEIVER </th><th>VALUE </th></tr>");

        List<Expense> expenses = daoClass.getExpenses();
        for (Expense expense :expenses) {
            out.println("<tr>");
            out.println("<td>" + expense.getNum() + "</td>");
            out.println("<td>" + expense.getPayDate() + "</td>");
            out.println("<td>" + expense.getReceiver() + "</td>");
            out.println("<td>" + expense.getValue() + "</td>");
            out.println("</tr>");

        }
        out.println("</table>");


        out.println("<h1>Table: receivers</h1><table border=2>");
        out.println("<tr><th>NUM </th><th>NAME </th></tr>");


        List<Receiver> receivers = daoClass.getReceivers();
        for (Receiver receiver : receivers) {
            out.println("<tr>");
            out.println("<td>" + receiver.getNum() + "</td>");
            out.println("<td>" + receiver.getName() + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}
