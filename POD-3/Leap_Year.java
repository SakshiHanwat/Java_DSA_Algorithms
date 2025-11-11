//POD 1. find all the algo for EVEN and ODD and create solutions
import java.util.*;
public class Leap_Year{

    public static boolean checkLeap_Year(int n){
        if((n % 4 == 0 && n % 100 != 0) || n % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int year = sc.nextInt();

        if(checkLeap_Year(year)){
            System.out.println(year +" is Leap Year");
        }else{
            System.out.println(year + " is not a Leap Year");
        }

    }
}