public class Main {

    public static void main(String[] args) {

        String[] stringArray = {"Carlo", "Samuele", "Riccardo", "Claudio", "Andrea"};


        String[] firstThreeLettersArray = new String[stringArray.length];


        for (int i = 0; i < stringArray.length; i++) {
            String currentString = stringArray[i];
            if (currentString.length() >= 3) {
                firstThreeLettersArray[i] = currentString.substring( 0,3);
            } else {
                firstThreeLettersArray[i] = currentString;
            }
        }


        for (String firstThreeLetters : firstThreeLettersArray) {
            System.out.println(firstThreeLetters);
        }
    }
}


