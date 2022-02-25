public class ArrayEksempel {

    public static void main(String[] args) {
        String[] cars = {"Audi", "Bmw", "Tesla", "Ford"};
        System.out.println("Bilen på indeks 0 = " + cars[0]);
        cars[0] = "Volvo";
        System.out.println("Bilen på indeks 0 er nå:" + cars [0]);

        System.out.println("Antall biler = " + cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        if (cars[2] == "Bmw") {
            System.out.println("Bil på indeks 2 er Bmw");
        }
        else {
            System.out.println("Feil i liste");
        }


    }
}
