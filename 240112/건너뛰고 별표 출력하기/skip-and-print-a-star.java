import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 1; j<=n; j++){
            for (int i = 1; i<=j; i++) {
                System.out.print("*");
            }
            System.out.println("\n");            
        }
        for (int j = n-1; j>0; j--) {
            for (int i = 1; i<=j; i++) {
                System.out.print("*");
            }
            System.out.println("\n");      
        }
    }
}