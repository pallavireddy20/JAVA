import java.util.Scanner;
public class forloop {

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();   // user input

        System.out.println("Numbers from 1 to " + n + " are:");
        for(int i = 1; i <= n; i++) {   // loop from 1 to N
            System.out.print(i + " ");
        }
    }
}
