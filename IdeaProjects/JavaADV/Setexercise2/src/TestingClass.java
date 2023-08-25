import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestingClass {
    public static void main(String[] args) {
        Set<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("Mondey");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        System.out.println("HashSet content is : " + daysOfWeek);

        Set<String> daysOfWeekLinked = new LinkedHashSet<>();
        daysOfWeekLinked.add("Mondey");
        daysOfWeekLinked.add("Tuesday");
        daysOfWeekLinked.add("Wednesday");
        daysOfWeekLinked.add("Thursday");
        daysOfWeekLinked.add("Friday");
        daysOfWeekLinked.add("Saturday");
        daysOfWeekLinked.add("Sunday");
        System.out.println("LinkedHashSet content is : " + daysOfWeekLinked);

        boolean isEqual = daysOfWeek.equals(daysOfWeekLinked);
        System.out.println(" Is the first Set equal to the second one? " + isEqual);
    }

}
