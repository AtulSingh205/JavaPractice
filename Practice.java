// public class Practice {
//     public static void main(String[] args) {
//         System.out.println("Hello Java");
//     }
// }

// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = inp.nextInt();
//         System.out.print("Enter a number: ");
//         int m = inp.nextInt();
//         System.out.println("And the of number is: "+(n+m));
//     }
// }

import java.util.Scanner;

class triangel{
    public void display(int x ,int y , int z ){
           if(x+y>z && y+z>x && z+x>y){
            System.out.println("Valid Traingel");
           }
           else{
            System.out.println("Invalid Triangel");
           }
    }
}

public class Practice {
public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter a number ");
    int a = inp.nextInt();
    System.out.print("Enter b number: ");
    int b = inp.nextInt();
    System.out.print("Enter c number: ");
    int c = inp.nextInt();
    triangel obj = new triangel();
    obj.display(a, b, c);
}
    
} 