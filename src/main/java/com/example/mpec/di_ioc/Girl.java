package com.example.mpec.di_ioc;

public class Girl {
    private Outfit outfit;
    private HairStyle hairStyle;

    public Girl(Outfit anything,HairStyle hairStyle ){
        outfit = anything;
        hairStyle = hairStyle;
    }

    // Các class không nên phụ thuộc vào các lớp kế thừa cấp thấp, mà nên phụ thuộc vào
    //Abstract class(Lớp trừu tượng)
    /*DI là 1 Design pattern , nó là việc các Obj nên phụ thuộc vào Abtract class
    * và thể hiện chi tiết của nó sẽ dược inject vào đối tượng trong lúc runtime
    * */

    // IoC - inversion of Control
    public static void main(String[] args) {
        Outfit outfit = new Tshirt();
        HairStyle hairStyle = new RedHairStyle();

        Girl a = new Girl(outfit, hairStyle);
    }
}
