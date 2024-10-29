import java.util.Scanner;

public class H5_HouseExample {
    public static void main(String[] args) {

        /*
               Kullanicidan bir cumle alin
             - cumlede ev geciyorsa, "home home sweet home" yazdirin
             - cumlede is geciyorsa, "calismak guzeldir"
             - ikisini de iceriyorsa "Hem ev lazim hem is"
             - hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */


                Scanner scan = new Scanner(System.in);
                System.out.println("Lütfen bir cümle yazınız");
                String cumle = scan.nextLine().toLowerCase();

                boolean evVarmı = cumle.contains("ev");
                boolean isVarmı = cumle.contains("iş");


                if (evVarmı && isVarmı) {
                    System.out.println("Senden kralı yok");
                }else if (evVarmı) {
                    System.out.println("home home sweet home");
                }else if (isVarmı) {
                    System.out.println("çalışmak güzeldir");
                }else {
                    System.out.println("çook çalışman lazım");
                }







    }
}
