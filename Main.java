import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * Klasse Main + @version: 2021.3.2 + @author Henrik Hodne
 * Klassen inneholder eksempler av klassene String, Random, Hashmap og Hashset
 * Metodenes hensikt er å vise hvilke metoder klassene har ferdiglagd.
 */
public class Main {

    public static void main(String[] args) {

        // String



        // Random
        Random tall = new Random();

        int x = tall.nextInt(6);
        System.out.println(x);

        Random test = new Random();

        boolean y = test.nextBoolean();

        System.out.println(y);


        // Hashmap
        HashMap<String, Integer> Tallmap = new HashMap<String, Integer>();
        Tallmap.put("a" , 10);
        Tallmap.put("b" , 20);
        Tallmap.put("c" , 30);

        System.out.println(Tallmap);
        System.out.println(Tallmap.get("c"));

        HashMap<String, String> Innlogging = new HashMap<String, String>();
        Innlogging.put("Brukernavn1", "Passord1");
        Innlogging.put("Brukernavn2", "Passord2");
        Innlogging.put("Brukernavn3", "Passord3");

        System.out.println(Innlogging);
        Innlogging.remove("Brukernavn2");
        System.out.println(Innlogging);

        System.out.println(Innlogging.containsKey("Brukernavn2"));

        Innlogging.replace("Brukernavn3", "Passord123");
        System.out.println(Innlogging.values());
        System.out.println(Innlogging.keySet());


        // Hashset
        HashSet<String> h = new HashSet<String>();
        h.add("SeDet");
        h.add("Hallo");
        h.add("Heisann");

        System.out.println(h);

    }

}
