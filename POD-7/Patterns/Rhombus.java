import java.util.*;

public class Rhombus{
    public static void Rhombus_Pattern(int num){
        for (int i = 1; i <= num; i++) {
            for (int s = num-i; s >1; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int n = sc.nextInt();

        Rhombus_Pattern(n);
    }
}