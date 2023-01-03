//! bu projede kullandığımız tüm operationlar kesinlikle sadece String lerle ve String içeren 
//! değişkenlerle çalışır

public class App {
    public static void main(String[] args) throws Exception {
        {
            // ! ".length" kaç karakter içeriyorsa sayısal olarak verir
            System.out.println("--------------------------------");
            String text = "bu cümledeki karakter sayısı şudur: ";
            System.out.println(text + text.length());
            System.out.println("--------------------------------");
            // todo ".charAt" bahsedilen değişkenin seçilen indexteki karakterini alır.
            String text1 = "Bu içerikteki 15. karakter:";
            System.out.println(text1 + text1.charAt(14));
            System.out.println("--------------------------------");
            // ? ".concat" string in içine kendimiz yazddığımız yada daha önceden
            // tanımlayıp
            // ? dahil
            // ? ettiğimiz 'String' i ekler. kesinlikle sadece string. BAŞKA DEĞER
            // EKLENEMEZ
            String text2 = "main sentence |";
            String addition = "extra sentence ";
            System.out.println(text2.concat(addition));
            System.out.println("--------------------------------");
            // * ".startsWith" ve ".endsWith" yazdığımız !String! in hangi harfi ile
            // * başlayıp bitmesi durumuna göre */
            // * "boolean" yani true or false verir */
            System.out.println(addition.startsWith("e"));
            System.out.println(addition.endsWith("c"));
            System.out.println("--------------------------------");
            // todo "değişken.getChars" dedikten sonra (sayı1,sayı2,src,sayı3) sayı1
            // todo değişkenden alınacak karakterlerin hangi indexten başlayacağını,
            // sayi2
            // todo (sondaki dahil edilmez)
            // todo nerde biteceğini,
            // todo src nereye dahil edileceiğini,sayı3 ise dahil edilecek yerin hangi
            // todo indexinden başlayacağını belirler
            String lorem = "Ut aliquam erat a vestibulum posuere. Pellentesque eleifendcursus nulla, a facilisis orci accumsan id.";
            char[] characters = new char[20];
            lorem.getChars(38, 58, characters, 0);
            System.out.println(characters);
            System.out.println("----------------------------------");
            // ? "değişken.indexOf" değişkenin içindeki belirttiğimiz şeyi bulmaya yarar
            System.out.println(addition.indexOf('t'));
            // ? "değişken.lastIndexOf" ise aramaya sondan başlar
            // ? tek tırnak (') karakter , çift tırnak (") ise String bulmaya yarar
            System.out.println(addition.lastIndexOf('e'));
            System.out.println("----------------------------------");
        }
        {
            String learntry1 = " lorem ipsum dolar sit amet ";
            // ? .replace sadecce tek bir karakteri değiştirmeye yarar ve tek tırnak
            // ? kullanılır
            System.out.println(learntry1.replace(' ', '-'));
            learntry1 = learntry1.replace('l', 'k');
            System.out.println("----------------------------------");
            // * .substring metinden belirledğimiz konumdan text almaya yarar !ana metin
            // * */ değişmez! */
            System.out.println(learntry1.substring(19));
            System.out.println("----------------------------------");
            // ! .split metni parçalamaya yarar zaten split bölmek demek
            // ! for döngüsü içinde olmasının sebebi !learntry1.split! bir veri oldu
            // artık
            // ! bu veriyi atamak için for dahilinde yeni bir değişken lazım
            for (String k : learntry1.split(" ")) {
                System.out.println(k);
            }
            System.out.println("----------------------------------");
            // todo .lowerCase küçük harfe, .upperCase büyük harfe çevirir.
            String a = "İPSUM DOLA MERAK HOP COP KAÇIK";
            String kucukA = a.toLowerCase();
            System.out.println(kucukA);
            String b = "helo melo cet keriz keşmir fıtık olom";
            String buyukB = b.toUpperCase();
            System.out.println(buyukB);
            System.out.println("----------------------------------");
            // * .trim boşlukları silmeye yarar */
            System.out.println(learntry1.trim());
        }
    }
}
