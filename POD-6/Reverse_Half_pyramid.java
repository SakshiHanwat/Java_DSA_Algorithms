import java.util.*;

public class Reverse_Half_pyramid {
    public static void Print_Reverse_Half_pyramid(int num){
        for(int i = 0; i <= num; i++){
            for(int j = i; j<num; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no. : ");
        int n = sc.nextInt();
        Print_Reverse_Half_pyramid(n);
    }
}