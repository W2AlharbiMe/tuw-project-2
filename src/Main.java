import PoolingSystem.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // coupons will be a hash map
        // HashMap<String, boolean> -> O(1)
        HashMap<String, Boolean> coupons = new HashMap<>();

        coupons.put("JAVA", true);
        coupons.put("Tuwaiq", true);
        coupons.put("SpringBoot", true);


        // 1. create addresses
        Address a1 = new Address("Olaya, North.", "Riyadh", "Saudi Arabia", "0000000");
        Address a2 = new Address("Malaz Dist.", "Riyadh", "Saudi Arabia", "0000000");
        Address a3 = new Address(" Tahliah Street.", "Riyadh", "Saudi Arabia", "0000000");


        // 2. Create routes

        Route r1 = new Route(a2, a1, 56.0);
        Route r2 = new Route(a3, a1, 40.0);

        // 3. Create cars
        Car c1 = new Car("BMW-M892131", r1);
        Car c2 = new Car("Audi-R82131831", r2);


        // 4. create Subscribers

        try {
            System.out.println();

            Subscribers s1 = new Subscribers("Abdullah", "1231312", c2);

            NonSubscribers n1 = new NonSubscribers("Salem", "22222", c1, coupons);
            NonSubscribers n2 = new NonSubscribers("Mohammed", "11234455", c1, coupons);

//            // use this to test the exception
//            NonSubscribers n3 = new NonSubscribers("P3", "11234455", c1, coupons);
//            NonSubscribers n4 = new NonSubscribers("P4", "11234455", c1, coupons);
//            NonSubscribers n5 = new NonSubscribers("P5", "11234455", c1, coupons);
//            NonSubscribers n6 = new NonSubscribers("P6", "11234455", c1, coupons);


            n1.activateCoupon("JAVA");
//            n2.activateCoupon("SpringBoot");

            System.out.println("-------------------------\n");

            System.out.println(n1.toString());

            System.out.println("-------------------------\n");

            System.out.println(n2.toString());

            System.out.println("-------------------------\n");

            System.out.println(s1.toString());
        } catch(Exception e1) {
            System.out.println(e1.getMessage());
        }

    }
}
