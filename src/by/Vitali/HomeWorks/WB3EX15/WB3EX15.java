package by.Vitali.HomeWorks.WB3EX15;

import by.Vitali.HomeWorks.WB3EX15.Beans.Expense;
import by.Vitali.HomeWorks.WB3EX15.Beans.Receiver;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by viivpo2010 on 28.8.17.
 */
public class WB3EX15 extends HttpServlet {
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
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/WEB-INF/classes/by/Vitali/HomeWorks/WB3EX15/resource/WB3EX15.jsp");
                                                            //jsp файл находится в папке resource классом WB3EX15 но относительный путь в виде
                                                            // /resource/WB3EX15.jsp файл не находит!!!
        StringBuilder stringBuilder = new StringBuilder();
        List<Expense> expenses = daoClass.getExpenses();
        for (Expense expense : expenses) {
            stringBuilder.append("<tr>");
            stringBuilder.append("<td>" + expense.getNum() + "</td>");
            stringBuilder.append("<td>" + expense.getPayDate() + "</td>");
            stringBuilder.append("<td>" + expense.getReceiver() + "</td>");
            stringBuilder.append("<td>" + expense.getValue() + "</td>");
            stringBuilder.append("</tr>");
        }
        String expensesField = stringBuilder.toString();
        req.setAttribute("expenses", expensesField);
        stringBuilder = new StringBuilder();
        List<Receiver> receivers = daoClass.getReceivers();
        for (Receiver receiver : receivers) {
            stringBuilder.append("<tr>");
            stringBuilder.append("<td>" + receiver.getNum() + "</td>");
            stringBuilder.append("<td>" + receiver.getName() + "</td>");
            stringBuilder.append("</tr>");
        }
        String receiverField = stringBuilder.toString();
        req.setAttribute("receivers", receiverField);
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
