public class App {
    public static void main(String[] args) throws Exception {
        double primenumber = 89636899568596577.0;
        Boolean prime = true;
        for (int i = 2; i < primenumber; i++) {
            if (primenumber % i == 0) {
                prime = false;
            }
            if (primenumber < 2) {
                System.out.println("sayı asal değildir");
            }
            if (primenumber < 1) {
                System.out.println("geçersiz sayı");
            }
        }
        if (prime == true) {
            System.out.println("                        sayı asaldır");

        } else {
            System.out.println("sayı asal değldir");

        }
    }

}
