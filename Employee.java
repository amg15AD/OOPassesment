public abstract class Employee extends Customer implements Payable{
    protected final double discount = 0.10;

    public Employee(String name, Size size) {
        super(name, size);
    }


    @Override
    public void printInfo() {

    }
}
