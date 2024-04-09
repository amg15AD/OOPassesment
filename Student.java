public class Student extends Customer{
    public  long studentId;
    public static long uniqueId = 0;
    private final double DISCOUNT = 0.05;



    public Student(String name, Size size) {
        super(name, size);
        uniqueId++;
        studentId = uniqueId;
    }
    public void printUniqueStudentID() {
        System.out.println(studentId);

    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {

    }

    @Override
    public void printInfo() {
        System.out.println();

    }
}
