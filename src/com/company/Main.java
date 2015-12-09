package com.company;

import java.util.Scanner;
import java.lang.Math;

/**
 * Temat: Rozwiązywanie równań pierwszego, drugiego i trzeciego stopnia. Implementacja  w języku Java.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Start programu.");
        System.out.println("Podaj, który rodzaj funkcji chcesz obliczyć. (Poprzez wpisanie a,b lub c.)");
        System.out.println("1)Liniowa");
        System.out.println("2)Kwadratowa");
        System.out.println("3)Sześcienna");
        double f;
        do {
            Scanner funkcja = new Scanner(System.in);
            f = funkcja.nextInt();
            if (f!=1 && f!=2 && f!=3) {
                System.out.println("Wybierz jedną z trzech możliwych opcji.");
            }
        }
        while (f==1 && f==2 && f==3);
            if(f==1){
                System.out.println("Wybrałeś funkcję Liniową.");
                System.out.println("f(x)=ax+b");
                System.out.println("Proszę podać a.");
                    double a1, b1, wynik1;
                        Scanner na = new Scanner(System.in);
                        a1 = na.nextInt();
                System.out.println("Proszę podać b.");
                    Scanner nb = new Scanner(System.in);
                    b1 = nb.nextInt();
                    wynik1 = -(b1/a1);
                if(a1==0){
                    System.out.println("Funkcja liniowa jest stała.");
                    System.out.println("Nie posiada miejsc zerowych");
                }
                else if(a1>0){
                    System.out.println("Funkcja liniowa jest rosnąca.");
                    System.out.println("A miejsce zerowe wynosi " + wynik1);
                }
                else if(a1<0){
                    System.out.println("Funkcja liniowa jest malejąca");
                    System.out.println("A miejsce zerowe wynosi " + wynik1);
                }
            }
            if (f==2){
                System.out.println("Wybrałeś funkcję kwadratową.");
                System.out.println("f(x)=ax2+bx+c");
                    double ak, bk, ck;
                System.out.println("Proszę podać a.");
                    Scanner akk = new Scanner(System.in);
                    ak = akk.nextInt();
                System.out.println("Proszę podać b.");
                    Scanner bkk = new Scanner(System.in);
                    bk = bkk.nextInt();
                System.out.println("Proszę podać c.");
                    Scanner ckk = new Scanner(System.in);
                    ck = ckk.nextInt();
                double deltakk;
                double deltak = bk * bk - 4 * ak *ck;
                deltakk = Math.sqrt(deltak);
                double x1 = (-bk - deltakk)/2*ak;
                double x2 = (-bk + deltakk)/2*ak;
                double x0 = -bk/2*ak;
                if(deltak>0){
                    System.out.println("x1= "+x1);
                    System.out.println("x2= "+x2);
                }
                else if(deltak==0){
                    System.out.println("x0 = "+x0);
                }
                else if(deltak<0){
                    System.out.println("Nie ma rozwiązania.");
                }

            }
            if(f==3){
                System.out.println("Wybrałeś funkcję sześcienną.");
                System.out.println("f(x) = ax3 + bx2 + cx + d");
                    double a, b, c, d, x1, x2, x3, delta;
                System.out.println("Proszę podać wartość a.");
                    Scanner ass = new Scanner(System.in);
                    a = ass.nextInt();
                System.out.println("Proszę podać wartość b.");
                    Scanner bss = new Scanner(System.in);
                    b = bss.nextInt();
                System.out.println("Proszę podać wartość c.");
                    Scanner css = new Scanner(System.in);
                    c = css.nextInt();
                System.out.println("Proszę podać wartość d.");
                    Scanner dss = new Scanner(System.in);
                    d = dss.nextInt();
                dss.close();
                delta = -4*c*c*c*a+c*c*b*b+18*c*b*a*d-27*d*d*a*a-4*d*b*b*b;
                double tdp = Math.sqrt(-3*delta);
                double ulamek = (9*c*b*a-27*d*a*a-2*b*b*b+3*a*tdp)/2*a*a*a;
                double pierwiastek1 = (1.0)/(3.0);
                double pierwiastek2 = Math.pow(ulamek,pierwiastek1);
                x1 = 1/3*pierwiastek2-((3*c*a-b*b)/3*a*a*pierwiastek2)-b/3*a;
                x2 = ((-1+Math.sqrt(-3))/6)*pierwiastek2+((1+Math.sqrt(-3))/6)*((3*c*a-b*b)/(a*a*pierwiastek2))-((b/3)*a);
                x3 = ((1+Math.sqrt(-3))/6)*pierwiastek2+((1-Math.sqrt(-3))/6)*((3*c*a-b*b)/(a*a*pierwiastek2))-((b/3)*a);
                System.out.println(x1);
                System.out.println(x2);
                System.out.println(x3);
            }
        System.out.println("Koniec programu.");
    }
}
