import java.util.ArrayList;

public class ArrayListEksempel {

        public static void main(String[] args) {

            ArrayList<String> fruitList = new ArrayList();

            fruitList.add("Mango");
            fruitList.add("Banan");
            fruitList.add("Pære");
            fruitList.add("Eple");

            System.out.println(fruitList);

            System.out.println("Frukten i indeks 0 er: " + fruitList.get(0));

            fruitList.remove("Eple");
            System.out.println(fruitList);

            ArrayList<String> fruktKurv = new ArrayList<>();

            int i = fruitList.size();
            while (i > 0) {
                fruktKurv.add(fruitList.get(0));
                fruitList.remove(0);
                System.out.println("Fruitlist: " + fruitList + "Fruktkurv: " + fruktKurv);
                i--;
            }
            for (String a : fruktKurv) {
                System.out.println(a);
            }
        }


}


