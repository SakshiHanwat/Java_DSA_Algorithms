//POD 1. find all the algo for EVEN and ODD and create solutions
import java.util.*;
public class Even_Odd_ap1{

    public static boolean checkEvenOdd(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(checkEvenOdd(n)){
            System.out.println(n +" is Even number");
        }else{
            System.out.println(n + " is Odd number");
        }

    }
}