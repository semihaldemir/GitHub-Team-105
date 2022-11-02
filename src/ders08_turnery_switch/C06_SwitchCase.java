package ders08_turnery_switch;

public class C06_SwitchCase {
    public static void main(String[] args) {

        //kull girdiği gn nuarasının ismini yazdırın


        int gunno=8;
        /*

        if (gunno==1){
            System.out.println("pazartesi");
        } else if (gunno==2) {
            System.out.println("salı");
        } else if (gunno==3) {
            System.out.println("carşamba");
        } else if (gunno==4) {
            System.out.println("perşembe");
        } else if (gunno==5) {
            System.out.println("cuma");
        } else if (gunno==6) {
            System.out.println("cumartesi");
        } else if (gunno==7) {
            System.out.println("pazar");
        } else if (gunno==8) {
            System.out.println("Gecersiz Gun Numarası");
        }
        */

        switch (gunno){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecersiz gun no");
        }



    }
}
