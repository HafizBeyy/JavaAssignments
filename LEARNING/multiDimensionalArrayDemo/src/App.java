public class App {
    public static void main(String[] args) throws Exception {

        String[][] isim = new String[2][2];
        isim[0][0] = "anan";
        isim[0][1] = "baban";
        isim[1][0] = "abin";
        isim[1][1] = "ablan";

        for (int i = 0; i <= isim.length; i++) {
            System.out.println("-----------------");

            for (int j = 0; j < isim.length; j++) {
                System.out.println(isim[i][j]);

            }
        }

    }
}
