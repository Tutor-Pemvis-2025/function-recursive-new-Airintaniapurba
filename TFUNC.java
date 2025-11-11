//12S25046 - Airin Tania Purba

import java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, result;

        n = Integer.parseInt(input.nextLine());
        result = angka(n);
        System.out.println("Bilangan yang dimasukkan :" + n);
        System.out.println("Hasil perhitungan rekursif :" + result);
    }
    
    public static int angka(int n) {
        int result;

        if (n == 0) {
            result = 0;
        } else {
            result = n + angka(n - 1);
        }
        
        return result;
    }
}
