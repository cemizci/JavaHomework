import java.util.Scanner;

public class C08_Switchh {
    public static void main(String[] args) {





        // kullacıdan bir rakam isteyin
        //rakam olrak girilen değeri yazı ile yazdırın


        String[] birler = new String []{"bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz..");
        int rakam = scan.nextInt();

        int birlerBasamagı = rakam;

        String yazı = birler[birlerBasamagı - 1];

        System.out.println("yazı = " + yazı);


        //kullanıcan gün numarasını alın
        //sayı olarak girilen günün ismini yazdırın
        //1- pazartesi ..... 7-pazar
        //1-7 arası rakamlar dışında bir değer girilirse ,hata mesajı verin


        String[] günler = new String []{"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "C.tesi", "Pazar",};

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen 1 ile 7 arasında bir rakam giriniz");
        int sayı = scanner.nextInt();

        int deger = sayı;

        String yazım = günler[deger -1];

        System.out.println(yazım);




















    }
}
