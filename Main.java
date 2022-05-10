import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int mat,muzik,fizik,kimya,turkce,tarih;
        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat=inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik=inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih=inp.nextInt();

        int toplam=(mat+muzik+fizik+kimya+turkce+tarih);
        double sonuc=(toplam/6);
        System.out.println("Ortalamanız:" +sonuc);
        if(sonuc <=60){

            System.out.println("Sınıfta Kaldınız");

        }

        else {
            System.out.println("Sınıfı Geçtiniz");
        }


    }
}
