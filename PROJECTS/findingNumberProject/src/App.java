
public class App {
    public static void main(String[] args) throws Exception {
        int[] sayilar = { 4, 435, 564, 234, 453, 67, 3, 7, 2, 5, 8 };
        int buluncak = 435;
        Boolean varmi = false;
        for (int deger : sayilar) {

            if (buluncak == deger) {
                varmi = true;
            }
        }
        if (varmi) {
            System.out.println("aradığınız sayı vardır");
        }
        if (varmi == false) {
            System.out.println("aradığınız sayı yoktur");
        }
    }
}
