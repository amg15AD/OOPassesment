public class Tester {
    public static void main(String[] args) {
        //Q1 & Q2
        Cloth cloth1 = new Cloth("Shirt",10,Size.M);
        Cloth cloth2 = new Cloth("pants",30,Size.L);
        Cloth cloth3 = new Cloth("jacket",20,Size.L);
        Cloth[] cloths = {cloth1, cloth2, cloth3};
        //==========================================================
        // Q3-1,2,3 Q4
        Student student1 = new Student("Remy",Size.L);
        Student student2 = new Student("Remy",Size.XL);
        student1.printUniqueStudentID();
        student2.printUniqueStudentID();
        student1.printUniqueStudentID();




    }


}
