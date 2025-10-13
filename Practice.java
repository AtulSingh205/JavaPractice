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

// import java.util.Scanner;

// class triangel{
//     public void display(int x ,int y , int z ){
//            if(x+y>z && y+z>x && z+x>y){
//             System.out.println("Valid Traingel");
//            }
//            else{
//             System.out.println("Invalid Triangel");
//            }
//     }
// }

// public class Practice {
// public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter a number ");
//     int a = inp.nextInt();
//     System.out.print("Enter b number: ");
//     int b = inp.nextInt();
//     System.out.print("Enter c number: ");
//     int c = inp.nextInt();
//     triangel obj = new triangel();
//     obj.display(a, b, c);
// }

// } 

// -------------divisibelby 5 and 3--------------
// import java.util.Scanner;

// class divisibel{
//     public void display(int n ){
//       if(n%5==0||n%3==0){
//         System.out.print("Its divisibel by 5 and 3");
//       }
//        else if(n%3==0){
//         System.out.println("Its divisibel by 3");
//       }
//        else if(n%5==0){
//         System.out.println("Its divisibel by 5 ");
//       }
//       else{
//         System.out.println("It is not divisibel by 5 and 3");
//       }
//     }
// }

// public class Practice{
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = inp.nextInt();
//         divisibel obj =new divisibel();
//         obj.display(n);
//     }
// }

// --------------------find codinate---------------

// import java.util.Scanner;

// class cordinate{
//   public void display(int x, int y){
//     if(x==0 && y==0){
//         System.out.print("This is on X-axis nd  Y-axis");
//     }
//     else if(x>0 && y>0){
//         System.out.print("This is an align in First quardent");
//     }
//     else if(x<0 && y>0){
//         System.out.print("This is align in  second quardent");
//     }
//     else if(x<0 && y<0){
//         System.out.print("This is align in third quardent");
//     }
//     else if(x>0 && y<0){
//         System.out.print("This is align in fourth quardent ");
//     }
//     else if(x==0){
//         System.out.println("This is allign on Y-axis");
//     }
//     else if(y==0){
//         System.out.println("this is allign on X-axis");
//     }
//   }
// }
// public class Practice{
//   public static void main(String[] args) {
//     Scanner inp =new Scanner(System.in);
//     System.out.print("Enter x-axis number: ");
//     int a = inp.nextInt();
//     System.out.print("Enter Y-axis number: ");
//     int b = inp.nextInt();
//     cordinate obj =new cordinate();
//     obj.display(a, b);

//   }
// }

// ------------------------FInd Greatest out of three number ---------------------

// import java.util.Scanner;
//  class A{

//     public void display(int x,int y,int z){
//        if(x>y && x>z){
//           System.out.print("X is gretest number ");
//        }
//        else if(y>x && y>z){
//         System.out.print(" Y is gretest number ");
//        }
//        else if(z>x && z>y){
//         System.out.print("Z is greatest number ");
//        }
//     }
//  }

// public class Practice{
//     public  static void main(String[] args){
//        Scanner inp = new Scanner(System.in);
//        System.out.print("Enter a number:");
//        int a = inp.nextInt();
//        System.out.print("Enter b number:");
//        int b = inp.nextInt();
//        System.out.print("Enter c number:");
//        int c = inp.nextInt();

//        A obj = new A();
//        obj.display(a, b, c);

//     }
// }

// -------------------Even odd--------------

// import java.util.Scanner;

//  class  A{
//     public void display(int a){
//          if(a%2==0){
//             System.out.print("this is an even number");
//          } 
//          else{
//             System.out.print("This is an odd number");
//          }       
//     }
// } 

// public class Practice{
//     public static void main(String[] args) {
//         Scanner inp  =new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = inp.nextInt();
//          A obj =new A();
//          obj.display(n);
//     }
// }

// ---------------------Terneryor-----------------

// import java.util.Scanner;
// class A{
//     public void display(int x ){
//         System.out.print((x%2==0) ? "Even" :"odd");
//     }
// }

// public class Practice{
//   public static void main(String[] args){
//     Scanner inp =new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = inp.nextInt();
//     A obj = new A();
//     obj.display(n);
//   }
// }

// --------------------Print even 1-100--------------

// import java.util.Scanner;

// class A {
//   public void display(int x) {
//     for (int i = 0; i < x; i++) {
//       if (i % 2 == 0) {
//         System.out.println("This is an Even number: " + i);
//       }
//     }
//   }
// }

// public class Practice {
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter a End number to find even : ");
//     int n = inp.nextInt();
//     A obj = new A();
//     obj.display(n);
//   }
// }

// -------------------Print  odd number Whish Divisibel by 3----------------

// import java.util.Scanner;
//  class  A{
//   public void display(int x){
//     int count =0;
//     for(int i =1;i<=x;i++){
//       if(i%100!=0 && i%3==0){
//         System.out.println("Thhis is an odd or Divisibel by 3: " + i);
//         count++;
//       }
//     }
//     System.out.println("This is an number of divided by 3 "+count);
//   }    
// } 
// public class Practice{
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = inp.nextInt();
//     A obj = new A();
//     obj.display(n);
//   }
// }

// -------------for loop ap---------

import java.util.Scanner;

class Ap {
  public void display(int x , int y) {
    int a = x;
    int b = y;
    for (int i = a; 1<= i; i-=b) {
      System.out.print(i + " ");
    }
  }
}

public class Practice {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter a n number: ");
    int n = inp.nextInt();
    System.out.print("Enter a n number: ");
    int m = inp.nextInt();
    Ap obj = new Ap();
     obj.display(n,m);

  }
}