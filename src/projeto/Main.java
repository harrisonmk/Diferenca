package projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int diferenca;

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        diferenca = (a*b-c*d);
        
        System.out.println("DIFERENCA = "+diferenca);

    }

}
