package letsuseit;

import java.util.Scanner;

public class mange {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int a = sx.nextInt();
        int b = sx.nextInt();
        int sum, run;
        for (int i = 0; i <= 10; i++) {
            sum = i + b;
            run = i + a;
            System.out.println("take the run =  " + run);
            System.out.println("take the run =  " + sum);
        }
    }
}
