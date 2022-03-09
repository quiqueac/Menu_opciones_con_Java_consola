/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuopciones;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MenuOpciones 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int ent;
        do
        {
            System.out.println("Ingrese el numero de la opcion según desee");
            System.out.println("1.- Identificacion de año bisiesto");
            System.out.println("2.- Entero de raiz cuadrada");
            System.out.println("3.- Ecuación de segundo grado");
            Scanner in = new Scanner (System.in);
            ent = in.nextInt();
            switch(ent)
            {
                case 1:
                    int año;
                    System.out.println("Identificacion de año biciesto");
                    System.out.println("Ingrese el año a corroborar");
                    Scanner on = new Scanner(System.in);
                    año = on.nextInt();
                    if( (año%4 == 0) && ((!(año%100 == 0) && !(año%400==0)) || ((año%100 == 0) && (año%400==0))))
                    {
                        System.out.println("Año biciesto");
                    }
                    else
                    {
                        System.out.println("Año no biciesto");
                        System.out.println("Ingrese 0 para volver al menu");
                        Scanner back = new Scanner (System.in);
                        ent = back.nextInt();
                    }
                break;
                case 2:
                    int raiz,x,t=1;
                    System.out.println("Resultado entero de raiz cuadrada");
                    System.out.println("Ingrese el numero a calcular raiz cuadrada");
                    Scanner cal = new Scanner (System.in);
                    raiz = cal.nextInt();
                    for(x=0;raiz>=t;x++)
                    {
                        raiz = raiz - t;
                         t = t+2;
                    }
                   System.out.print("El resultado entero es: ");
                   System.out.println(x);
                   System.out.println("Ingrese 0 para volver al menu");
                   Scanner ret = new Scanner (System.in);
                   ent = ret.nextInt();
                break;
                case 3:
                    int a,b,c;
                    t=1;
                    System.out.println("Ecuacion de segundo grado");
                    System.out.println("Ingrese el valor de las varriables a, b y c");
                    System.out.println("ax²+bx+c=0");
                    System.out.println("Ingrese el valor de a");
                    Scanner aa = new Scanner (System.in);
                    a = aa.nextInt();
                    System.out.println("Ingrese el valor de b");
                    Scanner bb = new Scanner (System.in);
                    b = bb.nextInt();
                    System.out.println("Ingrese el valor de c");
                    Scanner cc = new Scanner (System.in);
                    c = cc.nextInt();
                    int d =((b*b)-(4*a*c));
                    for(x=0;d>=t;x++)
                    {
                        d = d - t;
                        t = t+2;
                    }
                    double emas = (-b+x);
                    double emenos = (-b-x);
                    double rmas = (emas/(2*a));
                    double rmenos = (emenos/(2*a));
                    System.out.println("El Resultado 1 es igual a: ");
                    System.out.println(rmas);
                    System.out.println("El resultado 2 es igual a: ");
                    System.out.println(rmenos);
                    System.out.println("Ingrese 0 para volver al menu");
                   Scanner reto = new Scanner (System.in);
                   ent = reto.nextInt();
                break;     
            }
            System.out.println();
        }
        while(ent==0); 
    } 
}
