public class App {
    public static void main(String[] args) throws Exception {
        int fnumber1 = 220;
        int fnumber2 = 284;
        int random = 0;
        for (int i = 1; i < fnumber1; i++) {
            if (fnumber1 % i == 0) {
                random = random + i;

            }

        }
        if (random == fnumber2) {
            System.out.println("bu ikisi arkadaş sayıdır");
        } else {
            System.out.println("arkadaş sayı değilller");
        }
    }
}
