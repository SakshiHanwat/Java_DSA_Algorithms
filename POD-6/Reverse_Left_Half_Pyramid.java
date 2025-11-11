import java.util.*;

public class Reverse_Left_Half_Pyramid {
    public static void Print_Reverse_Left_Half_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //print spaces 
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();

        Print_Reverse_Left_Half_Pyramid(size);
    }
}