// public class Practice {
//     public static void main(String[] args) {
//         System.out.println("Hello Java");
//     }
// }

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();
        System.out.print("Enter a number: ");
        int m = inp.nextInt();
        System.out.println("And the of number is: "+(n+m));
    }
}