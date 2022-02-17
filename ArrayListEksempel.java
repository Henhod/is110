import java.util.ArrayList;

public class ArrayListEksempel {

        public static void main(String[] args) {

            ArrayList<String> fruitList = new ArrayList<String>();
            // Sett inn i liste
            fruitList.add("Mango");
            fruitList.add("Apple");
            fruitList.add("Strawberry");
            fruitList.add("Potetfrukt");

            System.out.println(fruitList);

            // Finn fram epleobjekt i liste
            System.out.println("The element at index 0 is " + fruitList.get(0));

            // Slett element
            fruitList.remove("Potetfrukt");
            System.out.println(fruitList);


            // Iterator og While-løkke som henter element fra fruitList til fruktKurv og sletter fra fruitList
            ArrayList<String> fruktKurv = new ArrayList<String>();

            int i = fruitList.size();
            while (i > 0) {
                fruktKurv.add(fruitList.get(0));
                fruitList.remove(0);
                System.out.println("fruitlist: " + fruitList + "   fruktKurv: " + fruktKurv);
                i--;
            }
            for (String a : fruktKurv) {
                System.out.println(a);
            }

        }

}


