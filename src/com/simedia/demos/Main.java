package com.simedia.demos;

public class Main {

    public static void main(String[] args) {

        Exercitii ex2 = new Exercitii();
//        int x = 10438251;
//        int countCifre = ex2.countNumberDigits(x);
//        while (countCifre>0){
//            System.out.println(ex2.ultimaCifra(x/ex2.xLaPutereaY(10,countCifre-1)));
//            countCifre--;
//        }
//        int y =123456;
//        do {
//            System.out.println(y%10);
//            y/=10;
//        }
//        while (y>0);
        int rowNumber = 1;
        int i = 0;
        int a = 1;
        while (i<rowNumber){
            ex2.printMultiple(a);
            a+=2;
            i++;
        }



    }
}
