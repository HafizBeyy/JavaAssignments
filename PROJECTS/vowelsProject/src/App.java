public class App {
    public static void main(String[] args) throws Exception {
        String a = "a";
        String secilen = a.toLowerCase();
        switch (secilen) {
            case "e":
            case "i":
            case "ö":
            case "ü":
                System.out.println("İnce sesli harf");

                break;
            case "a":
            case "o":
            case "u":
            case "ı":
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("Geçersiz karakter");
                break;
        }

    }
}
