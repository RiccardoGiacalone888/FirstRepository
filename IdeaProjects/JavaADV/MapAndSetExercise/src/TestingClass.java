import java.util.*;

public class TestingClass {
    public static void main(String[] args) {
        //creo mappo utilizzando LinkedHashMap per mantenere l'ordine.
        Map<String, Integer> months = new LinkedHashMap<>();
        // Popolo la mappa utilizzando .put .
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);
        //Utilizzo il metodo set per mandare in consol le key di months
        Set<String> monthsKey = months.keySet();
        System.out.println("The months keys are : " + monthsKey);
        //creo una lista di Interi che mandi in consol i values di months.
        List<Integer> cardinalMonth = new ArrayList<>(months.values());
        System.out.println("The cardinal months are : " + cardinalMonth);
        //Credo un Array che converte months in un array di interi.
        Integer[] cardinalMonthArray = months.values().toArray(new Integer[0]);
        System.out.println("Array cardinal Months are : " + Arrays.toString(cardinalMonthArray));

    }
}
