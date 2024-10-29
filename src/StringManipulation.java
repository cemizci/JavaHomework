import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen epostanızı giriniz");
        String email =scan.next();



       if (!email.contains("@")){
           System.out.println("gecersiz mail");
       }

        if (!email.contains("@gmail.com")){
            System.out.println("mail 'gmail' olmalı");
        }

        if (!email.endsWith("@gmail.com")){
            System.out.println("mailde yazım hatası var");
        }














    }
}
