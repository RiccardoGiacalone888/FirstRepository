public class Tester {
    public static void main(String[] args) {
        SmartPhonePrice producerPrice1 = new SmartPhonePrice("Producer", 500.0);
        SmartPhonePrice producerPrice2 = new SmartPhonePrice("Producer", 500.0);
        SmartPhonePrice retailPrice1 = new SmartPhonePrice("Retail", 700.0);
        SmartPhonePrice retailPrice2 = new SmartPhonePrice("Retail", 700.0);

        SmartPhone smartphone1 = new SmartPhone("Brand1", "Model1", 4000, producerPrice1, retailPrice1);
        SmartPhone smartphone2 = new SmartPhone("Brand1", "Model1", 4000, producerPrice2, retailPrice2);

        System.out.println("Smartphone 1 Details:\n" + smartphone1);
        System.out.println("\nSmartphone 2 Details:\n" + smartphone2);

        if (smartphone1.equals(smartphone2)) {
            System.out.println("\nSmartphone 1 is equal to Smartphone 2.");
        } else {
            System.out.println("\nSmartphone 1 is not equal to Smartphone 2.");
        }

        try {
            SmartPhone clonedSmartphone = smartphone2.clone();
            System.out.println("\nCloned Smartphone Details:\n" + clonedSmartphone);

            if (smartphone2.equals(clonedSmartphone)) {
                System.out.println("\nSmartphone 2 is equal to the cloned Smartphone.");
            } else {
                System.out.println("\nSmartphone 2 is not equal to the cloned Smartphone.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nError occurred: " + e.getMessage());
        }
    }
}
