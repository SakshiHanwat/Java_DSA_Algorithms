import java.util.*;

public class Right_Half_Pyramid {
    public static void Print_Right_Half_Pyramid(int num){
        for(int i = 0; i <= num; i++){
            for(int j = 0; j<num; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no. : ");
        int n = sc.nextInt();
        Print_Right_Half_Pyramid(n);
    }
}