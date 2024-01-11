import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=(n+n-1); i=i+2) {
            for (int k = 1; k<=i; k++)
                System.out.print("*");
            System.out.println(""); 
        }       
    }
}