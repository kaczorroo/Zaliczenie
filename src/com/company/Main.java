package com.company;

import java.util.Scanner;
import java.lang.Math;

/**
 * Temat: Rozwiązywanie równań pierwszego, drugiego i trzeciego stopnia. Implementacja  w języku Java.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Start programu.");
        System.out.println("Podaj, który rodzaj funkcji chcesz obliczyć. (Poprzez wpisanie 1 lub 2.");
        System.out.println("1)Liniowa");
        System.out.println("2)Kwadratowa");
        int f;
        Scanner funkcja = new Scanner(System.in);
        f = funkcja.nextInt();
        if (f == 1) {
            System.out.println("Wybrałeś funkcję Liniową.");
            System.out.println("f(x)=ax+b");
            System.out.println("Proszę podać a.");
            double a, b, wynik;
            Scanner na = new Scanner(System.in);
            a = na.nextInt();
            System.out.println("Proszę podać b.");
            Scanner nb = new Scanner(System.in);
            b = nb.nextInt();
            wynik = -(b / a);
            if (a == 0) {
                System.out.println("Funkcja liniowa jest stała.");
                System.out.println("Nie posiada miejsc zerowych");
            } else if (a > 0) {
                System.out.println("Funkcja liniowa jest rosnąca.");
                System.out.println("A miejsce zerowe wynosi " + wynik);
            } else if (a < 0) {
                System.out.println("Funkcja liniowa jest malejąca");
                System.out.println("A miejsce zerowe wynosi " + wynik);
            }
        }
        if (f == 2) {
            System.out.println("Wybrałeś funkcję kwadratową.");
            System.out.println("f(x)=ax2+bx+c");
            double a, b, c, delta, deltak, x1, x2, x0;
            System.out.println("Proszę podać a.");
            Scanner ak = new Scanner(System.in);
            a = ak.nextInt();
            System.out.println("Proszę podać b.");
            Scanner bk = new Scanner(System.in);
            b = bk.nextInt();
            System.out.println("Proszę podać c.");
            Scanner ck = new Scanner(System.in);
            c = ck.nextInt();
            delta = b * b - 4 * a * c;
            deltak = Math.sqrt(delta);
            x1 = (-b - deltak) / 2 * a;
            x2 = (-b + deltak) / 2 * a;
            x0 = -b / 2 * a;
            if (delta > 0) {
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);
            } else if (delta == 0) {
                System.out.println("x0 = " + x0);
            } else if (delta < 0) {
                System.out.println("Nie ma rozwiązania.");
            }
        }
        else {
            System.out.println("Błąd! Wybierz jedną z dwóch możliwych opcji.");
                }
        System.out.println("Koniec programu.");
    }
}
