public class HourlyEmployee extends Employee{
    private float hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String name, Size size, double hourlyWage, float hoursWorked) {
        super(name, size);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }


    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;

    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }



    @Override
    public void printPriceAfterDiscount(Cloth cloth) {

    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
