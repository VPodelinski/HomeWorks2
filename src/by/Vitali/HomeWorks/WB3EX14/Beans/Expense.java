package by.Vitali.HomeWorks.WB3EX14.Beans;

/**
 * Created by viivpo2010 on 26.8.17.
 */
public class Expense {

        private int num;
        private String payDate;
        private int receiver;
        private int value;

        public Expense(){
            num = 0;
            payDate = "";
            receiver = 0;
            value = 0;
        }

        public Expense(final int num, final String payDate, final int receiver, final int value) {
            this.num = num;
            this.payDate = payDate;
            this.receiver = receiver;
            this.value = value;
        }

        public int getNum() {
            return num;
        }

        public void setNum(final int num) {
            this.num = num;
        }

        public String getPayDate() {
            return payDate;
        }

        public void setPaydate(final String payDate) {
            this.payDate = payDate;
        }

        public int getReceiver() {
            return receiver;
        }

        public void setReceiver(final int receiver) {
            this.receiver = receiver;
        }

        public int getValue() {

            return value;
        }

        public void setValue(final int value) {
            this.value = value;
        }

}
