import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        for(int k = 0; k<n; k++){
            for (int i = (n*x); i>0; i=i-x){
                System.out.print(i+" ");
            }
            x++;
            System.out.println("");            
        }

    }
}