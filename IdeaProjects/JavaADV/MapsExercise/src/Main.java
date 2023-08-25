import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map <Integer, String> englishNumbers = new HashMap<>();
        englishNumbers.put(1, "One");
        englishNumbers.put(2, "Two");
        englishNumbers.put(3,"Three");
        englishNumbers.put(4, "Four");
        englishNumbers.put(5, "Five");
        Map <Integer, String> italianNumbersOdd = new HashMap<>();
        italianNumbersOdd.put(1, "Uno");
        italianNumbersOdd.put(3, "Tre");
        italianNumbersOdd.put(5,"Cinque");
        italianNumbersOdd.put(7, "Sette");
        italianNumbersOdd.put(9,"Nove");
        for (Map.Entry<Integer , String> entry : italianNumbersOdd.entrySet()) {
            englishNumbers.put(entry.getKey(), entry.getValue());
        }
        System.out.println("First HashMap modified " + englishNumbers);
        System.out.println("Value of key 5 " + englishNumbers.get(5));
        System.out.println("Value of key 6 " + englishNumbers.get(6));
        System.out.println("Value of key 7 " + englishNumbers.get(7));
        System.out.println("Value of key 8 " + englishNumbers.get(8));
        System.out.println("Value of key 9 " + englishNumbers.get(9));
            int keyToCheck = 6;
            if (englishNumbers.containsKey(keyToCheck)) {
                System.out.println("Value of key " + keyToCheck + ": " + englishNumbers.get(keyToCheck));
            } else {
                System.out.println("No associated value " + keyToCheck);
            }
        }
            
    }




