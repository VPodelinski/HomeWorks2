package by.Vitali.HomeWorks.Json.modelATM;

/**
 * Created by viivpo2010 on 14.8.17.
 */

public class Cash {
    private   int cash5;
    private   int cash10;
    private   int cash20;
    private   int cash50;
    private   int cash100;

    public int getCash5() {
        return cash5;
    }

    public void setCash5(int cash5) {
        this.cash5 = cash5;
    }

    public int getCash10() {
        return cash10;
    }

    public void setCash10(int cash10) {
        this.cash10 = cash10;
    }

    public int getCash20() {
        return cash20;
    }

    public void setCash20(int cash20) {
        this.cash20 = cash20;
    }

    public int getCash50() {
        return cash50;
    }

    public void setCash50(int cash50) {
        this.cash50 = cash50;
    }

    public int getCash100() {
        return cash100;
    }

    public void setCash100(int cash100) {
        this.cash100 = cash100;
    }

    @Override
    public String toString() {
        return "Cash{" +
                "cash5=" + cash5 +
                ", cash10=" + cash10 +
                ", cash20=" + cash20 +
                ", cash50=" + cash50 +
                ", cash100=" + cash100 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cash cash = (Cash) o;

        if (cash5 != cash.cash5) return false;
        if (cash10 != cash.cash10) return false;
        if (cash20 != cash.cash20) return false;
        if (cash50 != cash.cash50) return false;
        return cash100 == cash.cash100;
    }

    @Override
    public int hashCode() {
        int result = cash5;
        result = 31 * result + cash10;
        result = 31 * result + cash20;
        result = 31 * result + cash50;
        result = 31 * result + cash100;
        return result;
    }
}
