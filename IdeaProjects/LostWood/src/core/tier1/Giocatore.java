package core.tier1;

public class Giocatore {
    private String name;
    private String decks;
    private Integer hospital;
    private String ability;

    public Giocatore(String theName, String theDecks, Integer theHospital, String theAbility) {
        name = theName;
        decks = theDecks;
        hospital = theHospital;
        ability = theAbility;
        System.out.println("il più forte è "+ theName +       theDecks  + "ospedale" +  theHospital  +  theAbility);
    }
}
