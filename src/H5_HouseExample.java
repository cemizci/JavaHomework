package PACKAGE_NAME;

public class H5_HouseExample {
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



    }
}
