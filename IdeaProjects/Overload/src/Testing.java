public class Testing {
    public static void main(String[] args) {
        Shape shape1 = new Shape(0);
        Shape shape2 = new Shape(4, 10.0);
        Shape shape3 = new Shape(6, 12.0, 14.0);
        Shape shape4 = new Shape(7, 15.0, 17.0, 19.0);

        String shape1Details = shape1.getShapeDetails();
        String shape3Details= shape2.getShapeDetails();
        String shape4Details= shape3.getShapeDetails();
        String shape5Details= shape4.getShapeDetails();

        System.out.println("Shape 1 Details:/n" + shape1Details);
        System.out.println("Shape 2 Details:/n" + shape3Details);
        System.out.println("Shape 3 Details:/n" + shape4Details);
        System.out.println("Shape 4 Details:/n" + shape5Details);
    }
}
