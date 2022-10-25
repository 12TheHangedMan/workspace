package Project.BusinessLogic;

import java.time.LocalDate;

public class Tenant {

    private String tenantID;

    private double monthlyRate;

    private String[] monthlyPaymentChart; //record the actual payment for each month

    private LocalDate[] monthlyPaymentDateChart; //record the actual payment date for each month

    private LocalDate[] monthlyDueDateChart; //record the monthly due date for each month

    private double deposit;

    private static final int minCreditScore = 400;

    private Integer creditScore = null;/* Here I used Integer instead of int because this value can be null */

    private LocalDate moveInDate;

    private RealEstateTypes realEstateType;

    public Tenant(String tenantID, RealEstateTypes realEstateType, LocalDate moveInDate, double monthlyRent) {
        setTenantID(tenantID);
        setRealEstateType(realEstateType);
        setMoveInDate(moveInDate);
        setMonthlyRate(monthlyRent);
        initializeTenantInformation();
    }

    //for fields initialization that doesn't need variable input.
    private void initializeTenantInformation() {
        setDeposit();
        setMonthlyPaymentDateChart();
        setMonthlyPaymentChart();
        setMonthlyDueDateChart();
    }

    public Tenant(String tenantID, RealEstateTypes realEstateType, LocalDate moveInDate, double monthlyRent, Integer creditScore) {
        this(tenantID, realEstateType, moveInDate, monthlyRent);
        setCreditScore(creditScore);
    }

    public void payRent(String transactionID, LocalDate paymentDueDate, LocalDate TransactionDate) { // each payment should generate an ID that references the transaction.
        for (int i = 0; i < monthlyDueDateChart.length; i++) {
            if (paymentDueDate.isBefore(moveInDate)) {
                System.out.println("Invalid pay period, payment unsuccessful.");
                break;
            } else {
                if (getMonthlyDueDateChart()[i].equals(paymentDueDate)) {
                    if (getMonthlyPaymentChart()[i] == null) {
                        getMonthlyPaymentChart()[i] = transactionID;
                        getMonthlyPaymentDateChart()[i] = TransactionDate;
                        System.out.println("Payment " + transactionID + " processed success");
                    } else { // when duplicate payment is made, system should not process the transaction.
                        System.out.println("Payment has already been processed for Month: " + getMonthlyDueDateChart()[i].getMonth());
                    }
                    break;
                }
            }
        }
    }

    public String getTenantID() {
        return tenantID;
    }

    private void setTenantID(String tenantID) {
        this.tenantID = tenantID; // assign a unique ID to each tenant. Here does not set the logic to make ID unique.
    }

    public double getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public String[] getMonthlyPaymentChart() {
        return monthlyPaymentChart;
    }

    public void setMonthlyPaymentChart() {
        monthlyPaymentChart = new String[12];
        for (int i = 0; i < 12; i++) {
            monthlyPaymentChart[i] = null;
        }
    }

    public LocalDate[] getMonthlyPaymentDateChart() {
        return monthlyPaymentDateChart;
    }

    public void setMonthlyPaymentDateChart() {
        monthlyPaymentDateChart = new LocalDate[12];
    }

    public LocalDate[] getMonthlyDueDateChart() {
        return monthlyDueDateChart;
    }

    public void setMonthlyDueDateChart() {
        monthlyDueDateChart = new LocalDate[12];
        for (int i = 0; i < 12; i++) {
            monthlyDueDateChart[i] = getMoveInDate().plusMonths(i);
        }
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setDeposit() {
        deposit = getMonthlyRate();
        if (getCreditScore() == null || getCreditScore() < minCreditScore) {
            deposit += getMonthlyRate();
        }
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public LocalDate getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(LocalDate moveInDate) {
        this.moveInDate = moveInDate;
    }

    public RealEstateTypes getRealEstateType() {
        return realEstateType;
    }

    public void setRealEstateType(RealEstateTypes realEstateType) {
        this.realEstateType = realEstateType;
    }

    public String toString() {
        return "Tenant ID: " + getTenantID() + "\n" +
                "Deposit: " + getDeposit() + "\n" +
                "Monthly Rate: " + getMonthlyRate() + "\n" +
                "Moving in Date: " + getMoveInDate() + "\n" +
                "Renting Property Type: " + getRealEstateType();
    }
}
