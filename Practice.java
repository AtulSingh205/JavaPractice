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

// import java.util.Scanner;

// class Ap {
//   public void display(int x , int y) {
//     int a = x;
//     int b = y;
//     for (int i = a; 1<= i; i-=b) {
//       System.out.print(i + " ");
//     }
//   }
// }

// public class Practice {
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter a n number: ");
//     int n = inp.nextInt();
//     System.out.print("Enter a n number: ");
//     int m = inp.nextInt();
//     Ap obj = new Ap();
//      obj.display(n,m);

//   }
// }

// -----------------GP-------------------

// import java.util.Scanner;

// class Gp {
//   public void display(int x, int y) {
//     int a = x;
//     int b = y;
//     int n = 10;
//     for (int i = 0; i <= n; i++) {
//       System.out.println(a);
//       a*=b;
//     }
//   }
// }

// public class Practice {
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = inp.nextInt();

//     System.out.print("Enter a number: ");
//     int m = inp.nextInt();
//     Gp obj = new Gp();
//     obj.display(n, m);
//   }
// }

// --------------------pairof n-1 --------------

// class pair {
//   public void display() {
//     int n = 10;
//     for (int i = 1; i < n; i++) {
//       System.out.print(i);
//       System.out.print(" ");
//       System.out.print(n);
//       System.out.print(" , ");
//       n-=1;
//     }
//   }

// }

// public class Practice {
//   public static void main(String[] args) {
//       // Scanner inp= new Scanner;
//       // System.out.print("enter a number: ");
//       // int n = inp.nextInt();
//       // System.out.print("enter a number: ");
//       // int m = inp.nextInt();
//       pair obj = new pair();
//       obj.display();
//     }
// }

// -------------------------find compostite number find Prime number ------------------

// import java.util.Scanner;

// public class Practice {
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter a nmber: ");
//     int n = inp.nextInt();
//     boolean Flag = true;
//     for (int i = 2; i <= Math.sqrt(n); i++) {
//       if (n % i == 0) {
//         Flag = false;
//       }
//     }
//     if (Flag == false) {
//       System.out.print("Composite nunber ");
//     } else if (n == 1) {
//       System.out.print("This is not a composite number and not a Prime number");
//     } else {
//       System.out.print("this is an Prime number ");
//     }
//   }
// }


// --------------------practice while loop ------------------------

// import java.util.Scanner;

// public class Practice{
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = inp.nextInt();
//     int i =1;
//     int sum =0;
//     while (i<=n) {
//       System.out.println(i);
//        sum+=i;
//       i++;
//     }
//     System.out.println("A sum of all number is: "+sum);
//   }
// }

// -----------------------count number s tore in identifier -------------

// import java.util.Scanner;

// public class Practice{
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = inp.nextInt();
//     int cnt =0;
//     while(n!=0){
//      n/=10;
//       cnt++;
//     }
//     System.out.print("A conut number of element in number "+cnt);
//   }

// }

// ---------------------sum of digit by using while --------------------

// import java.util.Scanner;

// public class Practice{
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = inp.nextInt();
//     int sum = 0;
//     int cnt=0;
//     int b=0 ;
//     while (n!=0){
//       b =  n%10;
//       sum+=b;
//       n/=10;
//       cnt++;
//     }
//     System.out.println("A number of elemen store in identifier is "+cnt);
//     System.out.print("A number of sum is: "+sum);
//   }
// }

