package ders01_programlamayaGiris;

public class co2_Variables {
    public static void main(String[] args) {
        int sayi= 111;
        System.out.println("hello java");

        System.out.println(sayi);
        /* javada iki türlü yazdırma yapabiliriz
        eğer çift tırnak içinde bir bilgi yadırırsak
        java ne yazmışsak aynen konsolda yazdırıı

        Ancak "" olmayanbir şey görürse onun yazdırılacak bir metin değil bir
        değer taşıyan variable olduğunu anlar hafızada o variable ı getirir
         */
int not;
not=50;
        System.out.println(not);
        not=70;
        System.out.println(not);
        int okulNo=885;
        System.out.println(okulNo); //885
        System.out.println("okulNo"); // okulNo
        System.out.println("Okul No : "+okulNo); //Okul No : 885

        okulNo=976;
        System.out.println("yeni okul No : "+okulNo);
    }

}
