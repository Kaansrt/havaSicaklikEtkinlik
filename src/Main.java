import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        /*
        System.out.print("Sıcaklık değerini giriniz : ");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat > 5 && heat < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat > 15 && heat < 25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
        */

        // Alınan kitap sayısına göre indirim hesaplayan ugyulama

        double  kitapSayi, birimFiyat = 10, tutar;
        double indirim = 0;
        System.out.print("Aldığınız kitap sayısını giriniz : ");
        kitapSayi = input.nextInt();
        tutar= kitapSayi*birimFiyat;
        if (kitapSayi >= 5 && kitapSayi < 10) {
            indirim = 0.2;
        } else if (kitapSayi >= 10 && kitapSayi < 15) {
            indirim=0.4;
        } else if (kitapSayi > 15) {
            indirim = 0.5;
        }
        double yeniTutar = tutar - (tutar * indirim);
        System.out.println(tutar + "TL");
        System.out.println("İndirim miktarı : " + (tutar - yeniTutar));
        System.out.println("İndirimli hali "+yeniTutar);


    }
}