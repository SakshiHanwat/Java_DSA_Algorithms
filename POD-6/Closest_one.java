import java.util.*;

public class Closest_one{
    public static void FindClosestOne(int x,int y,int z){
        int dis_xz = Math.abs(x-z);
        int dis_yz = Math.abs(y-z);

if (dis_xz < dis_yz) {
    System.out.println("Person 1 is closest to Person 3");
} else if (dis_yz < dis_xz) {
    System.out.println("Person 2 is closest to Person 3");
} else {
    System.out.println("Both are at the same distance from Person 3");
}
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the psition of Person1 : ");
        int x = sc.nextInt();
        System.out.println("Enter the psition of Person2 : ");
        int y = sc.nextInt();
        System.out.println("Enter the psition of Person3 : ");
        int z = sc.nextInt();

        FindClosestOne(x,y,z);
    }
}