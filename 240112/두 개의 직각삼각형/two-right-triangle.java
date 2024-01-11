import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space =0;
        for(int i =n; i>0; i--){
            for (int j =i; j>0; j--) {
                System.out.print("*");
            }
            for (int k = 0; k<space+space-1; k=k+2) {
                System.out.print(" ");
            }
            for (int j = i; j>0; j--) {
                System.out.print("*");
            }
            space=space+2;
            System.out.println("");
        }
    }
}