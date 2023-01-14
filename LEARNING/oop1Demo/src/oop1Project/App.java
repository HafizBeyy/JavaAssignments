package oop1Project;

public class App {
    public static void main(String[] args) throws Exception {
        Product p1 = new Product();
        p1.setName("macbook air");
        p1.setHire(54);
        Product p2 = new Product();
        p2.setHire(34);
        p2.setName("macbook air");
        p2.setDiscountPercentage(1);

        Product p3 = new Product();
        p3.setName("macbook air");

        Product p4 = new Product();
        p4.setName("macbook air");

        System.out.println(p1.getName());

        Product[] products = { p1, p2, p3, p4 };
        for (Product product : products) {
            System.out.println(product.getHire());
            product.setDiscountPercentage(5790);
        }
        System.out.println(p2.discountPercentage);
        {
            // p1.name = "MacBook AIR";
            // p1.price = 20000;
            // p1.discountPercentage = 0.001;
            // p1.hire = 10;
            // p1.coloroptions[0] = "gold";
            // p1.coloroptions[1] = "skyblue";
            // p1.coloroptions[2] = "perred";
            // p1.coloroptions[3] = "ananas";

            // p2.name = "MacBook mAIR";
            // p2.price = 223000;
            // p2.discountPercentage = 0.005;
            // p2.hire = 160;
            // p2.coloroptions[0] = "golftvyd";
            // p2.coloroptions[1] = "skytycvblue";
            // p2.coloroptions[2] = "pertfcvyred";
            // p2.coloroptions[3] = "anatcfnas";

            // p3.name = "MacBook fAIR";
            // p3.price = 20007650;
            // p3.discountPercentage = 0.001;
            // p3.hire = 9;
            // p3.coloroptions[0] = "golgbvd";
            // p3.coloroptions[1] = "skyftrblue";
            // p3.coloroptions[2] = "pebyurred";
            // p3.coloroptions[3] = "ana6rdnas";

            // p4.name = "MacBook tAIR";
            // p4.price = 2009800;
            // p4.discountPercentage = 0.0091;
            // p4.hire = 11;
            // p4.coloroptions[0] = "gıjold";
            // p4.coloroptions[1] = "skyb9lue";
            // p4.coloroptions[2] = "peruhred";
            // p4.coloroptions[3] = "ajınanas";

        }

    }
}
