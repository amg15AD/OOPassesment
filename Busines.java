public class Busines implements Payable{
    private String name;
    private int productQtySupplied;
    private double productPrice;

    public Busines(String name, int productQtySupplied, double productPrice) {
        this.name = name;
        this.productQtySupplied = productQtySupplied;
        this.productPrice = productPrice;
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
