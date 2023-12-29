import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;
        while (i<=a) {
            if(!(i%2 == 0 && i%4 !=0)) {
                if(!((i/8)%2 == 0)) {
                    if(!((i%7)<4)) System.out.print(i+" ");
                }
            }
            i++;
        }
    }
}