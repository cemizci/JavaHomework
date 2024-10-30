import java.util.Scanner;

public class H5_HouseExample {
<<<<<<< HEAD
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




=======
  public static void main(String[] args) {

     String str = "3 sen ver 5 de ben ekleyeyim 8 olsun";

      // ilk s'yi büyük S yapın

        System.out.println(str.replaceFirst("s", "S"));

      // ilk space'yi yıldız yapın

        System.out.println(str.replaceFirst(" ", "*"));

      // ilk sayı yerine yıldız yapın

        System.out.println(str.replaceFirst("3", "*")); // Dinamik değildir.

        /*
             \\s : space  \\S : space olmayan hersey        \\s+ : yanyana birden fazla space
              \\d : digits \\D : digit olmayan hersey
              \\w : harf, rakam veya _ \\W : harf, rakam veya _ olmayan hersey
         */

        System.out.println(str.replaceFirst("\\d", "*")); //Dinamik bir yapıdır
        System.out.println(str.replaceAll("\\d", "*"));

        // bütün e'leri E yapın
        System.out.println(str.replace("e" , "E"));
        System.out.println(str.replace('e' , 'E'));

        System.out.println(str.replaceAll("\\w", "*"));
>>>>>>> c5194c54d790a567471cb95c42b25297fe75320f



    }
}
