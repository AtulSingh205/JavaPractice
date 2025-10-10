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