public class Main {
    public static void main(String[] args) {
        Product[] lettersArray = new Product[3];
        lettersArray [0]= new Product(216873817, "ciao", "ddd", 1);
        lettersArray[1]= new Product(212122,"Riccardo", "ccc",2);
        lettersArray[2]= new Product(456748, "Zelda", "fff", 3);
        printLettersArray(lettersArray);
    }
    public static void printLettersArray(Product [] lettersArray ){
        for (Product p : lettersArray){
            System.out.println(p.getManufacture().charAt(0));

        }
        int sumOfQuantity=0;
        for (Product product : lettersArray){
            sumOfQuantity+= product.getQuantity();
        }
        double avg = (double) sumOfQuantity/ lettersArray.length;
        System.out.println(avg);
    }
}
