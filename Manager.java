public class Manager extends Employee{
    private final double EXTRA_DISCOUNT = 0.05;
    private double salary;

    public Manager(String name, Size size, double salary) {
        super(name, size);
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }
}
