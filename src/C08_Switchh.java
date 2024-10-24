import java.util.Scanner;

public class C08_Switchh {
    public static void main(String[] args) {





        // kullacıdan bir rakam isteyin
        //rakam olrak girilen değeri yazı ile yazdırın



        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz..");
        int rakam = scan.nextInt();



        if (rakam== 1){
            System.out.println("bir");
        }else if (rakam==2){
            System.out.println("iki");
        }else if (rakam==3){
            System.out.println("üç");
        }else if (rakam==4){
            System.out.println("dört");
        }else if (rakam==5){
            System.out.println("beş");
        }else if (rakam==6){
            System.out.println("altı");
        } else if (rakam==7) {
            System.out.println("yedi");
        } else if (rakam==8) {
            System.out.println("sekiz");
        } else if (rakam == 9) {
            System.out.println("dokuz");
        }else {
            System.out.println("Lütfen 1 ile 9 araında bir sayı giriniz..");
        }


    }
}
