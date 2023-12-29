import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count=0;
        while(true) {
            int age = sc.nextInt();
            if (age >29 || age <20) break;
            sum = sum + age;
            count++;
        }
        float avg = (float)sum/count;
        System.out.printf("%.2f",avg);

    }
}