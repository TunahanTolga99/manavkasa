import java.util.Scanner;
public class kasa {
    public static void main(String[] args) {

        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.00,tutar;

        double armutkg,elmakg,domateskg,muzkg,patlicankg;
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armutkg = inp.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmakg = inp.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domateskg = inp.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muzkg = inp.nextDouble();
        System.out.print("Patllıcan Kaç Kilo ? : ");
        patlicankg = inp.nextDouble();

        double armutPrice,elmePrice,domatesPrice,muzPrize,patlicanPrize;

        armutPrice = armutkg * armut;
        elmePrice = elmakg * elma;
        domatesPrice = domateskg * domates;
        muzPrize = muzkg * muz;
        patlicanPrize = patlicankg * patlican;

        double total = patlicanPrize+elmePrice+muzPrize+armutPrice+domatesPrice;

        System.out.println("Toplam tutar" + total);


    }
}
