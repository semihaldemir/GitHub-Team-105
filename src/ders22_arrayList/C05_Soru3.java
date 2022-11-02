package ders22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Soru3 {
    public static void main(String[] args) {


        String[] arr={"Sumeyra","Mehmet","Ekrem","Yilmaz","Ayse"};

        List<String> yeniList= new ArrayList<>();

        for (String each:arr
             ) {

            if (each.length()%2==0){

                yeniList.add(each.substring(0,each.length()/2));

            }else {

                yeniList.add(each.substring((each.length()-1)/2));

            }

        }
        System.out.println(yeniList);
    }
}
