public class App {
    public static void main(String[] args) throws Exception {

        int islem = 0;

        int[] liste = { 397081, 387979801, 698790, 875332, 679807 };
        // ! foreach içindeki çok önemli
        // * eğer icerik diye ayrı bir değişken tanımlamasaydık liste dediğimiz şey
        // * */ sadece "veri" olacaktı*/
        // ? ancak liste dediğimiz veriyi icerik diye tanımlayarak onun içindeki veriyi
        // ? birnevi görünür hale getirdik
        long max = liste[4];

        for (int icerik : liste) {
            if (max < icerik) {
                max = icerik;
            }
            islem = islem + icerik;
        }
        System.out.println("Toplamı = " + islem);

        System.out.println("En büyük sayı " + max);
    }
}
