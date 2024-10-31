import java.util.Scanner;

public class H_08_forLoopQuestions {
    public static void main(String[] args) {

        /*  1-SORU
              Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

              Test Data
              34
              Beklenen Cikti =  7

           */

           // int sayı = 117;
           // int sonucSayı= sayı ;
           // int basamakSayısı = (sayı+"").length();
           // int rakamlarToplamı = 0;
//
           // for (int i = 0; i < basamakSayısı; i++) {
           //     rakamlarToplamı += sayı%10;
           //     sayı /= 10;
           // }
           // System.out.println("Verilen " + sonucSayı + " sayısının rakamlar toplamı : " + rakamlarToplamı);

          // ****************************************************************************************

            /*
                2-Soru
                1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
             */
              //  for (int i = 1; i <= 20 ; i++) {
              //      System.out.println(i + " ");
              //  }

            //****************************************************************************************

            /*
              3--Soru
              Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
             */

                Scanner scan = new Scanner(System.in);
                System.out.println("Lütfen bir sayı giriniz");
                int sayı = scan.nextInt();


                int carpım = 1;

                for (int i = 1; i <= 10 ; i++) {
                    System.out.println(i+ " * " + sayı + " = " + (sayı*i));
                }

    }
}
