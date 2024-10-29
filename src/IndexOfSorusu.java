import java.util.Scanner;

public class IndexOfSorusu {
    public static void main(String[] args) {

        // 1- Kullanıcıdan aldığımız metinde 3' den fala a harfi olduğunu biliyorsak
        //     3. a'nın index'ini yazdırın


        // 2 - Kullanıcıdan aldığımız metinde 3 veya daha fazla
        //     e olup olmadığını yazdırın


        // 3 -  Kullanıcıdan bir cümle ve aranan bir metin parçası isteyin
        //      kullanıcının verdiği metinlere göre aşağıdaki 3 cümleden
        //        birini yazdırın

        // - cümle aranan metni içermiyor
        // - cümle aranan metni sadece 1 adet içeriyor
        // - cümle aranan metni birden fazla içeriyor



        // Scanner scan = new Scanner (System.in);
        //     System.out.println("Lütfen bir cümle giriniz");
        //     String cumle = scan.nextLine();

        String str = "Ahmet hocanın ders anlatımı çok güzel";

        System.out.println(str.toLowerCase().indexOf("a" , 23));
        // 1.a'nın indexi 0'dır

        // 2. a'nın indexi 9'dur.

        // 3. a'nın indexi 19'dur.

        // 4. a'nın indexi 22'dir.

        // 5. a'nın indexi -1'dir.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scan.nextLine();

        if (str.contains("Ahmet hocanın ders anlatımı çok güzel")){
            System.out.println("cümle aranan metni sadece 1 adet içeriyor");
        }else if (! str.contains("Ahmet hocanın ders anlatımı çok güzel")){
            System.out.println("cümle aranan metni içermiyor");
        }




















    }
}
