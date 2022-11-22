package ders35_exceptions;

public class C02_ArithmeticException {
    public static void main(String[] args) {
        // verilen 2 tamsayıyı birbirine bolup
        // sonucun tamsayı kısmını yazdırın

        int sai1=20;
        int sayi2=0;
        try {
            // riskli olduğunu öngördüğümüz kodlar
            System.out.println(sai1/sayi2);
            System.out.println("bakalım bu satır çalışacak mı?");

        } catch (ArithmeticException e) {
            // catch (ArithmeticException e) öngördüğümüz risk
            System.out.println("sayı sıfıra bölünemez");
            // catch ( 0'den sonraki { } catch bloğu denir
            // beklenen risk gerçekleşirse çalışacak kodlar

        }

        /*
        bazı exceptionlar if else ile handle edilebilir ancak tüm exceptionlar için if else yeterli olmaz
         */
    }
}
