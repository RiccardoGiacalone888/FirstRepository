public class Main {
    public static void main(String[] args) {
        for (Month month : Month.values())
        if (month.name().endsWith("y")) {
            System.out.println(month + " :  ends with y");
        } else {
            System.out.println(month + " : not finish for y");
        }
    }
}
