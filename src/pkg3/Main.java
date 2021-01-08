package pkg3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Menyelesaikan SPLDV");
        System.out.println("dalam persamaan:");
        System.out.println("a1x + b1y + c1 = 0");
        System.out.println("a2x + a2y + c2 = 0");
        
        Scanner input = new Scanner(System.in);
        
        double a1, b1, c1, a2, b2, c2;
        
        System.out.print("a1 = ");
        a1 = input.nextDouble();
        System.out.print("b1 = ");
        b1 = input.nextDouble();
        System.out.print("c1 = ");
        c1 = input.nextDouble();
        System.out.print("a2 = ");
        a2 = input.nextDouble();
        System.out.print("b2 = ");
        b2 = input.nextDouble();
        System.out.print("c2 = ");
        c2 = input.nextDouble();
        //input semua variabel
        
        /*
        *a1c2 = a
        *a2c1 = b
        *a2b1 = c
        *a1b2 = d
        */
        
        double a, b, c, d;
        a = a1 * c2;
        b = a2 * c1;
        c = a2 * b1;
        d = a1 * b2;
        
        /*
        *b1c2 = e
        *b2c1 = f
        *b2a1 = g
        *b1a2 = h
        */
        
       double e, f, g, h;
        e = b1 * c2;
        f = b2 * c1;
        g = b2 * a1;
        h = b1 * a2;
        
        double atas1, bawah1, atas2, bawah2;
        atas1 = a - b;
        bawah1 = c - d;
        atas2 = e - f;
        bawah2 = g - h;
        
        double x, y;
        x = atas2 / bawah2;
        y = atas1 / bawah1;
        
        System.out.println("x = " +x);
        System.out.println("y = " +y);
        
        
    }
    
}