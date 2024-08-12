package org.example.ParkingLot.Model;

import java.util.Date;
import java.util.List;
import java.util.PrimitiveIterator;

public class Bill extends BaseModel{
        private Date exitTime;
        private int amount;
        private Ticket ticket;
        private Operator operator;
        private List<Payment> paymentList;
        private BillStatus billStatus;

        public Date getExitTime() {
                return exitTime;
        }

        public void setExitTime(Date exitTime) {
                this.exitTime = exitTime;
        }

        public int getAmount() {
                return amount;
        }

        public void setAmount(int amount) {
                this.amount = amount;
        }

        public Ticket getTicket() {
                return ticket;
        }

        public void setTicket(Ticket ticket) {
                this.ticket = ticket;
        }

        public Operator getOperator() {
                return operator;
        }

        public void setOperator(Operator operator) {
                this.operator = operator;
        }

        public List<Payment> getPaymentList() {
                return paymentList;
        }

        public void setPaymentList(List<Payment> paymentList) {
                this.paymentList = paymentList;
        }

        public BillStatus getBillStatus() {
                return billStatus;
        }

        public void setBillStatus(BillStatus billStatus) {
                this.billStatus = billStatus;
        }
}
