import java.util.List;

public class test {
    String [] cityName = {"Palermo", "Roma", "Milano"};
    List<String> array = Arrays.asList(cityName);
    System.out.println("The city is = " + cityName[1]);
     try {cityName.add("Genova")} ; try' without 'catch', 'finally' or resource declarations
    System.out.println("impossible to add a new array, the list is unmodifiable ");

}
