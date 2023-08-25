public class Main {
    public static void main(String[] args) {
        Person[] peopleArray = new Person[3];
        peopleArray[0] = new Person("Riccardo", 34);
        peopleArray[1] = new Person("Eleonora", 31);
        peopleArray[2] = new Person("Zelda", 1);
        String[] namesArray = new String[3];
        for (int i = 0; i < 3; i++) {
            namesArray[i] = peopleArray[i].getName();

        }
        printFirstLetters(namesArray);
        int n = 2;
        int k = 1;
        String result = thirdLettersChain(peopleArray, n, k);
        System.out.println("Risultato di third è " + result);

    }

    public static void printFirstLetters(String[] array) {
        for (String str : array) {
            if (str.length() > 3) {
                String firstThree = str.substring(0, 3);
                System.out.println(firstThree);
            } else {
                System.out.println("La parola " + str + "è troppo corta ");
            }

        }
    }
    public static String thirdLettersChain (Person[] array, int n, int k){
        if (k<0||k> array.length|| n<=0 || n> array.length-k){
            return "Parametri non vaidi";
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (int i=k;i<k+n;i++){
            String name = String.valueOf(array[i]);
            if (name.length()>=3){
                char thirdLetters= name.charAt(2);
                resultBuilder.append(thirdLetters);

            }
            else {
                resultBuilder.append('_');
            }

        }
        return resultBuilder.toString();
    }
}
