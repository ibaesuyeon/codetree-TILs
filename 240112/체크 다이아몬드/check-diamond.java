import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        for(int i = 1; i<=(2*n-3); i++){
            for(int j = space; j>0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
            space--;

        }
        space = 1;
        for(int i = (2*n-4); i>0; i--) {
            for(int j = space; j>0; j--){
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