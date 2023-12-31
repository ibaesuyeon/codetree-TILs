import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i<=b; i++) {
            if ( 1920%a == 0 || 2880%a == 0){
                System.out.println(1); break;

            } 
            else System.out.println(0);
        }   
    }
}