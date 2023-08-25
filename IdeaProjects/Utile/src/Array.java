public class Array {

        public static void main(String[] args) {
            String[] carBrand = {"Fiat", "Ferrari", "Lamborghini", "BMW", "Mustang"};
            System.out.print(carBrand[2]);
            Integer[] primeNumbers = new Integer[6];
            primeNumbers[0] = 1;
            primeNumbers[1] = 2;
            primeNumbers[2] = 3;
            primeNumbers[3] = 5;
            primeNumbers[4] = 7;
            primeNumbers[5] = 11;
            System.out.print(" array content  ");
            for (Integer primeNumber : primeNumbers) {
                System.out.print(primeNumber);


            }
        }

    }
