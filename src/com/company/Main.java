package com.company;

import java.util.Scanner;
import java.lang.Math;

/**
 * Temat: Rozwiązywanie równań pierwszego, drugiego i trzeciego stopnia. Implementacja  w języku Java.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Start programu.");
        System.out.println("Podaj, który rodzaj funkcji chcesz obliczyć. (Poprzez wpisanie 1,2 lub 3.)");
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
            if(f==3) {
                System.out.println("Wybrałeś funkcję sześcienną.");
                System.out.println("f(x) = ax3 + bx2 + cx + d");
                double a, b, c, d, wyznacznik,q,p,p3,pierwiastek,y;
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
                pierwiastek = Math.pow(a,1/3);
                if(a==0){
                    double deltakk;
                    double deltak =b*b-4*a*c;
                    deltakk = Math.sqrt(deltak);
                    double x1a0 =(-b-deltakk)/2*a;
                    double x2a0 =(-b+deltakk)/2*a;
                    double x0a0 =-b/2*a;
                    if(deltak>0){
                        System.out.println("x1= "+x1a0);
                        System.out.println("x2= "+x2a0);
                    }
                    else if(deltak==0){
                        System.out.println("x0 = "+x0a0);
                    }
                    else if(deltak<0){
                        System.out.println("Nie ma rozwiązania.");
                    }
                }
                else{
                    b=b/a;
                    c=c/a;
                    d=d/a;
                    q=b*(2*b*b-9*c)/27+d;
                    p=c-b*b/3;
                    p3=p*p*p;
                    wyznacznik=q*q+4*p3/27;
                    y=(-1)*b/3;
                    if(wyznacznik>0){
                        double pw=Math.sqrt(wyznacznik);
                        double pierwszy=pierwiastek*(((-1)*q-pw)/2);
                        double drugi=pierwiastek*(((-1)*q+pw)/2);
                        double wynik=(pierwszy+drugi+y);
                        System.out.println("delta>0");
                        System.out.println("Rozwiązaniem równania jest: "+wynik);
                    }
                    else if(wyznacznik<0){
                        double pp3=Math.abs(p/3);
                        double u=2*Math.sqrt(pp3);
                        double trzyp=Math.abs(27/p3);
                        double v = Math.acos(-Math.sqrt(trzyp) * q / 2);
                        double x1,x2,x3;
                        x1=u*Math.cos(v/3)+y;
                        x2=u*Math.cos((v+2*Math.PI)/3)+y;
                        x3=u*Math.cos((v+4*Math.PI)/3)+y;
                        System.out.println("delta<0");
                        System.out.println("x1= "+x1);
                        System.out.println("x2= "+x2);
                        System.out.println("x3= "+x3);
                    }
                    else if(wyznacznik==0){
                        double u=(-1)*pierwiastek*(q/2);
                        double x1,x2;
                        x1=(2*u)+y;
                        x2=((-1)*u)+y;
                        System.out.println("delta=0");
                        System.out.println("x1= "+x1);
                        System.out.println("x2= "+x2);
                    }
                }
            }
        System.out.println("Koniec programu.");
    }
}
