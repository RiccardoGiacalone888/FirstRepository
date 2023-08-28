public class Shape {
    protected String shapeName;
    protected int numberOfEdges;

    public Shape() {
        System.out.println("Shape object created.");
        shapeName = ("Undefined shape");
    }

    public String getShapeDetails() {
        return "Shape " + shapeName + " number of edges " + numberOfEdges;
    }

    public Shape(double radius) {
        System.out.println("The object Circle is created.");
        shapeName = "Circle";
        numberOfEdges = 0;
    }

    public Shape(int edges, double edgeLength) {
        System.out.println("The object Square is created.");
        shapeName = "Square";
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2) {
        System.out.println("The object Rectangle is created.");
        shapeName = "Rectangle";
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("The object Triangle is created.");
        shapeName = "Triangle";
        numberOfEdges = edges;
    }

}



