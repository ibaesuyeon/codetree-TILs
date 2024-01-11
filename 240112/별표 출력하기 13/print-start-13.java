import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n; int min = 1;
        for(int i = 1; i<=2*n; i++) {
            if (i%2 != 0){
                //odd
                for ( int j = max; j>0; j=j-1) {
                    System.out.print("* ");
                }
                max--;
            }
            else {
                //even
                for (int k = 0; k<min; k=k+1) {
                    System.out.print("* ");
                }
                min++;
            }
            System.out.println("");
        }
    }
}