package by.Vitali.HomeWorks.WB3EX12;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
/**
 * Created by viivpo2010 on 20.8.17.
 */
public class WB3EX12 extends HttpServlet{

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

        counterVisit++;

        output = new FileOutputStream("/opt/tomcat/webapps/examples/WEB-INF/classes/by/Vitali/HomeWorks/EX8EX9/resource/count.txt");
        output.write(counterVisit);
        output.flush();

        response.setContentType("image/jpeg");
        BufferedImage image = new BufferedImage(500, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.setFont(new Font("Serif", Font.ITALIC, 50));
        graphics2D.setColor(Color.green);
        graphics2D.drawString("Count of visits ", 50, 50);
        graphics2D.setFont(new Font("Serif", Font.ITALIC, 50));
        graphics2D.setColor(Color.green);
        graphics2D.drawString(String.valueOf(counterVisit), 90, 90);
        graphics2D.drawString("  times!!!", 140, 130);
        ServletOutputStream output = response.getOutputStream();
        ImageIO.write(image, "jpeg", output);
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

