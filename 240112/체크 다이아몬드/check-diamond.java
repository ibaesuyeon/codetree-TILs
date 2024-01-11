import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n;
        for(int i = 1; i<=n; i++){
            for(int j = space-1; j>0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
            space--;

        }
        space = 1;
        for(int i = n-1; i>0; i--) {
            for(int j = 0; j<space; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++) {
                System.out.print("* ");
            }

            System.out.println("");
            space++;
        }
    }
}