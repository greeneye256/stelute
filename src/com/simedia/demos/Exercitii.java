package com.simedia.demos;

public class Exercitii {

    public void printComentariu (int x){
        System.out.println("Acesta este comentariul " + x + ":");
    }

    public boolean par(int x){
        return (x%2==0);
    }

    public boolean impar(int x){
        return (x%2==1);
    }

    public int ultimaCifra(int x){
        return x%10;
    }
    public int suma2Numere (int x,int y){
        return x+y;
    }
    public int penultimaCifra(int x){
        if (x>9){return ultimaCifra(x/10);}
        else return ultimaCifra(x);
    }
    public boolean amandouaPare(int x, int y){
        return (par(x)&&par(y));
    }

    public void printSumAndElseIfXandYAreEven(int x, int y) {
        boolean ambelePare = par(x)&&par(y);
        if (ambelePare){
            System.out.println(suma2Numere(x, y) + ", " + ultimaCifra(x) + ", " + penultimaCifra(y));
        }
    }
    public void printNumber(int x){
        System.out.println(x);
    }
    public void printNumberIfOdd(int y){
        if (impar(y)){
            System.out.println(ultimaCifra(y));
        }
    }
    public int xLaPutereaY(int x, int y){
        int result = 1;
        while (y>0){
            result*=x;
            y--;
        }
        return result;
    }
    public int countNumberDigits(int x){
        int count = 0;
        while (x>0){
            count++;
            x/=10;
        }
        return count;
    }
    public void printMultiple(int x){
        StringBuilder row = new StringBuilder();
        while (x>0){
            row.append("*");
            x--;
        }
        String str = row.toString();
        System.out.println(str);
    }



}
