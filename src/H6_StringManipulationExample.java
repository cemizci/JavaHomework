import java.util.Scanner;

public class H6_StringManipulationExample {
    public static void main(String[] args) {

    /*
         Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
         input1 : “15.30 €” , input2 : “11.40 €”
         output : 26.70 €
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen fiyat giriniz");
        String fiyat1 = scan.nextLine();

        System.out.println("Lütfen fiyat giriniz");
        String fiyat2 = scan.nextLine();


        int spaceIndex = fiyat1.indexOf(" ");
        String paraBirimi = fiyat1.substring(spaceIndex);

        fiyat1 = fiyat1.replaceAll("\\D", "");
        fiyat2 = fiyat2.replaceAll("\\D" , "");

        double cash1 = Double.parseDouble(fiyat1);
        double cash2 = Double.parseDouble(fiyat2);

        double toplam = (cash1 + cash2) / 100;

        System.out.println("Toplam : " + toplam + paraBirimi);


    }
}
