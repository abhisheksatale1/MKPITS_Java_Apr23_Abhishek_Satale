package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Addition addition=new Addition();
        addition.add(12,14);
        Addition addition2=new Addition2();
        addition2.add(12,14);
        Substraction substraction=new Substraction();
        substraction.sub(20,10);
        Substraction substraction1=new Substraction2();
        substraction1.sub(20,10);
        Multiplication multiplication =new Multiplication();
        multiplication.mul(12,2);
        Multiplication multiplication1 =new Multiplication1();
        multiplication1.mul(12,2);
        Division division =new Division();
        division.div(14,7);
        Division division1 =new Division1();
        division1.div(7,14);
        Modulus modulus = new Modulus();
        modulus.div(7,14);
        Modulus modulus1 =new Modulus1();
        modulus1.div(7,14);
        Areaofrectangle areaofrectangle=new Areaofrectangle();
        areaofrectangle.div(12,11);
        Areaofrectangle areaofrectangle1=new Areaoftriangle();
        areaofrectangle1.div(12,14);
        Perimeter perimeter =new Perimeter1();
        perimeter.div(1,1);
        Perimetereoftriangle perimetereoftriangle=new Perimetereoftriangle1();
        perimetereoftriangle.div(12,21,30);
        Areaofcircle areaofcircle=new Areaofcircle();
        areaofcircle.div(25);
        Areaofcircle areaofcircle1=new Perimeterofcircle();
        areaofcircle1.div(25);
        Multidiv multidiv=new Multidiv();
        multidiv.div(14,12,10);
        Multidiv multidiv1=new Multidiv1();
        multidiv1.div(14,122,1);

    }
}