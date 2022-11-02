package ders08_turnery_switch;

public class C08_SwitchCase {
    public static void main(String[] args) {
        //ay numarasını alıp mevsimi yazdırın

        int ayno=13;

        switch (ayno){
            case 12:
            case 1:
            case 2:
                System.out.println("kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("geçersiz ay numarası");
        }




    }
}
