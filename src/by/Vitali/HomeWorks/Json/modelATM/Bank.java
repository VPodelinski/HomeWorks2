package by.Vitali.HomeWorks.Json.modelATM;

/**
 * Created by viivpo2010 on 12.7.17.
 * Банк
 */
public class Bank {
    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        return name != null ? name.equals(bank.name) : bank.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
