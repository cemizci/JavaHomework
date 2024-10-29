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


        fiyat1 = fiyat1.replace(".", "_");
        fiyat2 = fiyat2.replace("." , "_");


        fiyat1=fiyat1.replaceAll("\\W" , "");
        fiyat2=fiyat2.replaceAll("\\W", "");


        fiyat1=fiyat1.replace("_", ".");
        fiyat2=fiyat2.replace("_", ".");

        String toplamFiyat = ( Double.parseDouble(fiyat1) + Double.parseDouble(fiyat2) + " €" );
        System.out.println(toplamFiyat);




    }
}
