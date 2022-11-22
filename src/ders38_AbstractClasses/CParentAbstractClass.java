package ders38_AbstractClasses;

public abstract class CParentAbstractClass {

    /*
    Abstract bir class abstract methodlara sahip olabilir
    bir classı abstarct yapmak için class declaration'ına abstract keyword eklenmelidir
     */

    public abstract  void mecburiMethod1();

    public abstract void mecburiMethod2();
    // Soyut yani Abstract nethodların bady si olmaz

    public void concreteMethod(){
        // bugüne kadar kullandığımız normal methodlara
        // soyut olamayan method demek yerine
        // concrete method denir
    }



    /*
    bir parent class da child classların mutlaka override edeceği bir method oluşturduğumuzda
    method body'si gereksizleşir çnkü hiç çalışmayacaktır:

    1- parent classdan obje oluşturulamayacağı için objeler bu method kullanılamaz
    2- chil classlar da mecburen bu methodu override edeceklerinden,
      bu methodların bady si asla KULLANILMAYACAKTIR

      jAVA HİÇ KULLLANILMAYACAK BU METHOD BODY LERİ YAZMAMAmıza imkan tanımıştır
     */

    // chil classların mutlaka override etmesini istediğimiz methodları
    // abstract olarak tanımlar ve body siz olarak oluştururuz
}
