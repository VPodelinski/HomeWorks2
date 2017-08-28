package by.Vitali.HomeWorks.WB3EX15.Beans;

/**
 * Created by viivpo2010 on 28.8.17.
 */
public class Receiver {

    private int num;
    private String name;

    public Receiver(){
        num = 0;
        name = "";
    }

    public Receiver(final int num, final String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(final int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
