import java.util.Scanner;

public class H_07_forLoopExample {
    public static void main(String[] args) {

      /*
         1.SORU
         1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak yazdirin.
       */

              //  for (int i = 1; i < 100; i++) {
              //      System.out.print(i+" " );
              //  }
              //  System.out.println(" ");

      /*
         2.SORU
         Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
         dahil) 7 ila bolunebilen sayilari yazdirin.
       */

                 //  Scanner scan = new Scanner(System.in);
                 //  System.out.println("Bir tam sayı giriniz");
                 //  int sayı = scan.nextInt();


                 //  for (int i = 1; i <= sayı; i++) {
                 //      if (i % 7 == 0){
                 //          System.out.println(i);
                 //      }
                 //  }


      /*
         3.SORU
         Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
         dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
         Baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
      */



                 //  Scanner scan = new Scanner (System.in);
                 //  System.out.println("Lütfen iki adet pozitif tam sayı giriniz");
                 //  int sayı1 = scan.nextInt();
                 //  int sayı2 = scan.nextInt();

                 //  int toplam = 0;

                 //  for (int i = sayı1; i <= sayı2 ; i++) {
                 //       toplam += i;
                 //  }if (sayı1 > sayı2){
                 //      System.out.println("İlk sayı ikinci sayıdan büyük olamaz");
                 //  }else {
                 //      System.out.println(toplam );
                 //  }


        /*
            4.SORU
            Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
            dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
            baslangic degerinden kucuk olsa da program calissin

         */


                     //   Scanner scan = new Scanner (System.in);
                     //   System.out.println("Lütfen pozitif iki tam sayı giriniz: ");
                     //   int sayı1 = scan.nextInt();
                     //   int sayı2 = scan.nextInt();

                     //   int toplam = 0;

                     //   for (int i = sayı1; i <= sayı2 ; i++) {
                     //       toplam += i;
                     //   }
                     //   System.out.println(toplam);













      /*
         5.SORU
         Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin
      */


          //     Scanner scan = new Scanner (System.in);
          //      System.out.println("Lütfen 20'den küçük bir sayı giriniz: ");
          //      int sayı = scan.nextInt();


          //    if (sayı < 0  || sayı >= 20) {
          //        System.out.println("Lütfen 20'den küçük bir sayı giriniz: ");
          //    }else {
          //        int faktoriyel = 1;
          //        for (int i = 1; i <= sayı; i++) {
          //            faktoriyel *= i;
          //        }System.out.println(sayı + "! = " + faktoriyel);
          //    }


     /*
       6.SORU
       Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
       hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
       Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
     */


            // Scanner scan = new Scanner (System.in);
            // System.out.println("Lütfen 20'den küçük bir sayı giriniz: ");
            //  int sayı = scan.nextInt();


            //  if (sayı < 0 || sayı >= 20 ) {
            //       System.out.println("Lütfen 0 ile 20 arasında bir sayı girin.");
            //   }else {

            //      long faktoriyel = 1;

            //       System.out.print(sayı + "! = ");

            //       for (int i = sayı; i > 1; i--) {
            //            faktoriyel *= i;
            //           System.out.print(i + " * " );

            //       } System.out.println(" 1 = " + faktoriyel);
            //    }

       // kullanıcıdan pozitif bir tam sayı alıp rakamlar toplamını yazdırın

    //   Scanner scan = new Scanner (System.in);
    //   System.out.println("Lütfen pozitif bir tamsayı giriniz: ");
    //   int girilenSayı = scan.nextInt();
    //   int sayı = girilenSayı;


    //   int basamakSayısı = (sayı+"").length();
    //   int rakamlarToplamı = 0;

    //   for (int i = 0; i < basamakSayısı ; i++) {
    //       rakamlarToplamı += sayı%10;
    //       sayı /=10;
    //   }

    //   System.out.println("Verilen " + girilenSayı + " sayısının rakamlar toplamı : " + rakamlarToplamı);

    /*
      Kullanicidan pozitif bir sayi alin, 1’den baslayarak o sayiya kadar tum tamsayilari yazdirin, sira
      - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
      - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
      - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
     */

       //    Scanner scan = new Scanner (System.in);
       //    System.out.println("Lütfen pozitif bir tamsayı giriniz: ");
       //    int sayı = scan.nextInt();
//
//
       //     for (int i = 1; i <=sayı ; i++) {
//
       //     if (i % 3 == 0 && i % 5 == 0) {
       //         System.out.print("fizzBuzz ");
       //     } else if (i % 3 == 0) {
       //         System.out.print("fizz ");
       //     }else if (i % 5 == 0) {
       //         System.out.print("buzz ");
       //     }else {
       //         System.out.print(i + " ");
       //     }
//
//
       // }


        /*
          Kullanıcıdan bir string isteyin ve stringi tersten yazdırın
         */

     //  Scanner scan = new Scanner (System.in);
     //  System.out.println("Lütfen bir metin giriniz");
     //  String metin = scan.nextLine();

     //  for (int i = metin.length()-1; i >=0 ; i--) {
     //      System.out.print(metin.charAt(i));
     //  }

         /*
            Kullanıcıdan bir string isteyin ve stringi tersten Kaydedin
          */


       //   Scanner scan = new Scanner (System.in);
       //   System.out.println("Lütfen bir metin giriniz");
       //   String metin = scan.nextLine();
//
       //   String tersMetin = "";
//
       //   for (int i = metin.length()-1; i >= 0; i--) {
       //       tersMetin+=metin.charAt(i);
       //   }
       //   System.out.println(tersMetin);
       //
       //   // tersten yazılsı aynı olan metinlere Palindrome denir
       //   // ey edip adanada pide ye

        /*
        Kullanicidan pozitif bir tamsayi isteyip,
        sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz: ");
        int sayı = scan.nextInt();

        for (int i = 2; i < sayı ; i++) {
            if (sayı % i == 0){
                System.out.print("Asal değil");
                break ;
            }

            if (i == sayı -1){
                System.out.println("Asal sayı");
            }


        }



    }
}
