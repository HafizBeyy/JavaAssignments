public class App {
    public static void main(String[] args) throws Exception {
        // 6-->1,2,3
        int pnumber = 6;
        int total = 0;
        for (int i = 1; i <= pnumber; i++) {
            if (pnumber % i == 0) {
                total = total + i;
            }
        }
        if (pnumber * 2 == total) {
            System.out.println("mükemmel sayı");
        } else {
            System.out.println("değil");
        }

    }
}
