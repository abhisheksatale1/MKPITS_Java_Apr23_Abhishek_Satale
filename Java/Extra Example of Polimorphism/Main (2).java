package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Areaofrectangle areaofrectangle=new Areaofrectangle();
        areaofrectangle.area(10,20);
        areaofrectangle.area(10,200);

        Areaoftriangle areaoftriangle=new Areaoftriangle();
        areaoftriangle.area(25);
        areaoftriangle.area(10,20,10);
        Substract substract = new Substract();
        substract.substraction(45,25);
        substract.substraction(20.00F, 14F);
        Addition addition=new Addition();
        addition.addition(14,11);
        addition.addition(14.00F,12.23F);
        Division division =new Division();
        division.division(12,144);
        division.division(12F,144.144F);
        Modulus modulus =new Modulus();
        modulus.modulus(12,145);
        modulus.modulus(12.00F,144.144F);
        Squarecube squarecube =new Squarecube();
        squarecube.squarecube(11,12);
        squarecube.squarecube(2L,3L,4L);
        Stringconcat stringconcat =new Stringconcat();
        stringconcat.squarecube(11L,12L);
        stringconcat.squarecube("11","12");
        Cube  cube =new Cube();
        cube.squarecube(1,2);
        cube.squarecube(3L,4L);
        Fcube fcube = new Fcube();
        fcube.squarecube(12.2F,21F);
        fcube.squarecube(14.23);
    }
}