package by.Vitali.HomeWorks.Json.modelATM;

/**
 * Created by viivpo2010 on 14.8.17.
 */
public class Account {

    private String sumOfMoney;

    public String getSumOfMoney() {
        return sumOfMoney;
    }

    public void setSumOfMoney(String sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "sumOfMoney=" + sumOfMoney +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return sumOfMoney != null ? sumOfMoney.equals(account.sumOfMoney) : account.sumOfMoney == null;
    }

    @Override
    public int hashCode() {
        return sumOfMoney != null ? sumOfMoney.hashCode() : 0;
    }
}
