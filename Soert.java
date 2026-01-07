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

// ----------------reverse a number ----------------

// import java.util.Scanner;

// public class Practice{
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     // System.out.print("Enter a  number: ");
//     int n = 1286;
//     int r = 0;
//     while (n!=0) {
//      int rem = n%10;
//       r=r*10 + rem;
//       n/=10;
//     }
//     System.out.print(r);
//   }
// }

// ----------------factorial-----------
// public class Practice {

//      public static void main(String[] args) {
//         int n = 5;
//         int temp = 1;
//         while (n!=0){
//            temp *=n;
//            n--;
//         }
//         System.out.print(temp);
//      }
// }

// -------------------squre of number ---------------------
// public class Practice {
//    public static void main(String[] args) {
//       int a = 2;
//       int b = 5;
//       int i = 1;
//       int sqr = 1;
//       while (i <= b) {
//          sqr *= a;
//          i++;
//       }
//       System.out.print(sqr);
//    }
// }

// ----------------pattern1---------------
// public class Practice {

//    public static void main(String[] args) {
//       int n = 4;
//       for (int i = 1;i<=n;i++){
//          for(int j = i;j<=n;j++){
//             System.out.print("*");
//          }
//          System.out.println(" ");
//       }
//    }
// }

// ---------------------1 2 1 2 pattern -------------------

// public class Practice {

//    public static void main(String[] args) {
//       int n = 5;
//       for(int i =1 ;i<=n;i++){
//          for (int j = 1;j<= n ;j++){
//             System.out.print(j +" ");
//          }
//          System.out.println();
//       }
//    }
// }

// -----------------haafreversetriangel--------------

// public class Practice {

//    public static void main(String[] args) {
//       int n = 5;
//       for(int i =1;i<=n;i++){
//          for(int j = 1;j<=n;j++){
//               System.out.print("*");
//          }
//          System.out.println(" ");
//       }
//    }
// }

// ---------------pyramid------------------
// public class Practice {

//    public static void main(String[] args) {

//       int n = 6;
//       if(n%2!=0){
//       for(int i = 0;i<n;i++){
//          for (int j = 1;j<=i;j++){
//             System.out.print(" ");
//          }
//          for(int k = 1;k<=n-i*2;k++){
//           System.out.print(k);
//          }
//          System.out.println();
//       }
//    }
//    else System.out.println("Please ente a odd number ");
//    }
// }

// --------------------plus sign----------------
// public class Practice {

//    public static void main(String[] args) {
//       int n =5;
//       for(int i = 1;i<=n;i++){
//          if(i!=3){
//             for(int k =1;k<=2;k++){
//                System.out.print(" ");
//             }
//          }
//          for(int j = 1;j<=n;j++){
//             if(j==3||i==3){
//                System.out.print("*");
//             }
//          }
//          System.out.println();
//       }
//    }
// }

// ----------------------cros pattern--------------

// public class Practice {

//    public static void main(String[] args) {
//       int n = 5;
//       for(int i = 1;i<=n;i++){
//          if(i)
//          for(int j = 1;j<=n;j++){
//             if(i==j){
//             System.out.print("*");
//             }
//          }
//          System.out.println();
//       }
//    }
// }

// -------------------number patern-----------

// public class Practice {

//     public static void main(String[] args) {
//         int cnt = 1;
//         for(int i =1;i<=4;i++){
//             for (int j = 1;j<=i;j++ ){
//                  System.out.print(cnt);
//                  cnt++;
//             }
//             System.out.println();
//         }
//     }
// }

// ----------binary triangel---------------

// public class Practice {

//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1;i<=n;i++){
//             for(int j = 1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print(0);
//                 }
//                 else{
//                     System.out.print(1);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// -------------------halftraingel-------------------
// public class Practice {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k<=i*2-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// --------------------num half triangel------------------
// public class Practice {

//     public static void main(String[] args) {
//         int n = 4;
//         for(int i =1;i<=n;i++){
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k<i;k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }

// -----------------------1 121 12321 pattern -----------------

// public class Practice {

//     public static void main(String[] args) {
//         int n = 4;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1;k<=i;k++){
//                 System.out.print(k);
//             }
//             for(int k = i-1;k>=1;k--){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }

//     }
// }

// ---------------------pattern----------
// public class Practice {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 0; k < n - i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// ----------------------fulldimaond------------
// public class Practice {

//     public static void main(String[] args) {
//         int n = 3;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i*2-1;k++){
//                 System.out.print("*");
//             }
//          System.out.println();

//         }

//         for(int l = 0;l<n-1;l++){
//             for(int m= 0;m<=l;m++){
//                 System.out.print(" ");
//             }
//             for(int o = 0;o<n-l*2;o++){
//                 System.out.print("*");
//             }
//                     System.out.println();

//         }

//     }
// }

// -------------------------Array----------------------
// ------------------------Array-sum----------------------

// import java.util.Scanner;

// public class Practice {

//     public static void main(String[] args) {
//         Scanner inp = new  Scanner(System.in);
//         System.out.print("Enter a Size of arr: ");
//         int n = inp.nextInt();
//         int[] arr  = new int[n];
//         System.out.print("Enter a element: ");
//         for(int i = 0;i<n;i++){
//             arr[i]=inp.nextInt();
//         }
//         int sum = 0;
//         for(int j =0;j<n;j++){
//             sum+=arr[j];
//         }
//         System.out.print(sum);

//     }
// }

// -------------------max in arr--------------------

// import java.util.Scanner;

// public class Practice {

//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.out.print("Entera size");
//         int n = inp.nextInt();
//         int[] arr = new int[n];
//         System.out.print("Entera element of arr");
//         for (int i = 0; i < n; i++) {
//             arr[i] = inp.nextInt();
//         }
//         int max =0;
//         for(int j =0;j<n;j++){
//             if(arr[j]>max){
//                 max = arr[j];
//             }
//         }
//             System.out.print("Greatest element in the array is: "+max);

//     }
// }

// -----------------play with arr----------------

// import java.util.Scanner;

// public class Practice {

//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.out.print("Enter a size of n : ");
//         int n=inp.nextInt();
//         String[] arr= new String[n]; 
//         System.out.print("Enter a char: ");
//         for(int i =0;i<arr.length;i++){
//          arr[i] = inp.next();
//         }
//        System.out.print("char in array: ");
//        for(int j =0;j<arr.length;j++){
//          System.out.print(arr[j]);
//        }
//     }
// }

// -------------------practicee----------------

// import java.util.Scanner;

// public class Practice{
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter a size: ");
//     int n = inp.nextInt();
//     String arr[]= new String[n];

//     System.out.print("Take input of element "+arr.length);
//     for(int i = 0;i<arr.length;i++){
//       arr[i]=inp.next();
//     }

//     System.out.print("input element in array");
//     for(int j = 0;j<arr.length;j++){
//       System.out.print(arr[j]);
//     }
//   }
// }

// --------------------------array deep copy or shadhow copy-----------------

// import java.lang.reflect.Array;
// import java.util.Arrays;

// public class Practice {

//   public static void main(String[] args) {
//     int[] x = {10,20,30,40,50};
//     System.out.println("original array");
//     System.out.println(x[1]);

//     System.out.println("After a shalllow copy");
//      int[] y=x;
//      y[1] = 200;
//      System.out.println(x[1]);

//      System.out.println("After deep copy");
//      int[] z = Arrays.copyOf(x, x.length);//deepcopy
//      z[1]=100;
//      System.out.println("After deep clone");
//      System.out.println(z[1]);
//      System.out.println("Which arry copy z");
//      System.out.println(x[1]);
//   }
// }

// ---------------sumofpair==target----------------

// import java.util.Scanner;

// public class Practice {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("enter a size: ");
//     int n = sc.nextInt();
//     int arr[] = new int[n];

//     System.out.print("Enter a element ");
//     for(int i =0;i<arr.length;i++){
//       arr[i]=sc.nextInt();
//     }

//     int target = 12;
//     for(int i =0;i<arr.length;i++){
//       for(int j =i+1;j<arr.length;j++){
//        int sum = arr[i]+arr[j];
//         if(sum==target){
//           System.out.println("A sum of Pair in array: "+arr[i]+"and"+arr[j]);
//         }
//       }
//     }
//     sc.close();
//   }
// }

// ----------------------------sortarray---------------------

// import java.util.Arrays;
// import java.util.Scanner;

// public class Practice {

//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);

//     System.out.print("Enter a size: ");
//     int n = inp.nextInt();
//     int arr[]=new int[n];

//     System.out.println("Enter a elemnt in arr");
//     for(int i = 0;i<arr.length;i++){
//       arr[i]=inp.nextInt();
//     }
//     print(arr);
//     Arrays.sort(arr);
//     print(arr);
//     }

//  public static void print(int[] arr){
//       for(int j =0;j<arr.length;j++){
//         System.out.print(arr[j]+" ");
//       }
//       System.out.println();

//   }
// }

// -------------------mulbyeevn add by odd---------------

// import java.util.Scanner;

// public class Practice {

//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.println("Enter a size of arr");
//     int n =inp.nextInt();

//     int arr[]= new int[n];
//     System.out.println("Enter a elemt: ");
//     for(int i = 0;i<arr.length;i++){
//       arr[i]=inp.nextInt();
//     }
//     print(arr);
//     evnodd(arr);
//     System.out.println("After a evnodd opration");
//     print(arr);
//   }
//   public static void print(int[] arr){
//     for(int j = 0;j<arr.length;j++){
//       System.out.print(arr[j]+" ");
//     }
//     System.out.println();
//   }

//   public static void evnodd(int[] arr){
//     for(int i = 0;i<arr.length;i++){
//       if(i%2==0){
//         arr[i]=arr[i]*2;
//       }
//       else{
//         arr[i]=arr[i]+10;
//       }
//     }
//     System.out.println();
//   }
// }

// --------------------lenear search--------------

// import java.util.Scanner;

// public class Practice {

//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);

//     System.out.println("Enter a size of element: ");
//     int n = inp.nextInt();

//     int[] arr= new int[n];

//     System.out.println("Enter a element in arr");
//     for(int i =0;i<arr.length;i++){
//         arr[i]=inp.nextInt();
//     }
//    print(arr);

//      System.out.print("Enter Trarget num: ");
//     int target=inp.nextInt();
//       boolean found = false;
//       for(int j=0;j<arr.length;j++ ){
//         if(arr[j]==target){
//           found=true;
//         }
//       }
//       if(found) System.out.println("Elemrnt is found");
//       else System.out.println("not found");
//   }

//   public static void print(int[] arr) {
//     System.out.println("A element in arr: ");
//     for (int i = 0; i < arr.length; i++) {
//       System.out.print(arr[i] + " ");
//     }
//     System.out.println();
//   }
// }

// --------------------sum of pair-------------------

// public class Practice {

//   public static void main(String[] args) {
//     int[] arr = { 1, 5, 8, -3, 2 };
//     int target = 9;
//     for (int i = 0; i < arr.length; i++) {
//       for (int j = i+1; j < arr.length; j++) {

//         if(    arr[i] + arr[j] ==target){
//            System.out.println("found pair "+i+" And "+j);
//         }
//         System.out.println("not found");
//       }
//     }

//   }
// }

// -----------------------------Scond max ------------------------
// public class Practice {

//   public static void main(String[] args) {
//     int[] arr={1,5,8,-3,8};
//     int max = arr[0];
//     int smax = arr[0];
//     for(int i =0;i<arr.length;i++){
//       if(max<arr[i]){
//         smax=max;
//         max=arr[i]; 
//       }
//       else if (arr[i] > smax && arr[i] != max) {
//         smax = arr[i];
//       }
//     }
//     System.out.println("Second max: "+smax);
//   }
// }

// --------------for second max ------------------

// public  class Practice {
// public static void main(String[] args) {
//   int[] arr={10,10,10};
//   int max = Integer.MIN_VALUE;
//   int smax= Integer.MIN_VALUE;
//   for(int i = 0;i<arr.length;i++){
//     if(arr[i]>max){
//       max=arr[i];
//     }
//   }
//   for(int  j=0;j<arr.length;j++){
//     if(arr[j]>max && arr[j]!=max){
//       smax=arr[j];
//     }
//   }
//   System.out.print(max);
//   System.out.print(smax);
// }
// }

// -------------------------foreach loop -------------------
// public class Practice {

//   public static void main(String[] args) {
//     int[] arr={2,5,4,6,7};
//     // for(int i =0;i<arr.length;i++){
//     //   System.out.print(i);
//     // }
//     for(int elem:arr){
//       elem*=2;
//       System.out.print(elem+" ");
//     }
//   }
// }

// ---------------------reversearray-------------------
// public class Practice {

//   public static void main(String[] args) {
//     int [] arr = {6,8,1,2,4,9};
//     int k =1;
//     for(int i = 0;i<arr.length/2;i++){
//       int temp = arr[i];
//       arr[i]=arr[arr.length-k];
//       arr[arr.length-k]=temp;
//       k++;
//     }
//     System.out.println("A reverse element: ");
//     for(int j=0;j<arr.length;j++){
//       System.out.print(arr[j]+" ");
//     }
//   }
// }

// ---------------------rotate an aarray d-------------------
// public class Practice {

//     public static void main(String[] args) {
//         int[] arr = {6,8,1,2,4,9,0};
//         int[] brr = new int[arr.length];
//         int d=3;
//         for(int i =0;i<arr.length;i++){
//             brr[i]=arr[d+i];
//         }
//         for(int j =0;j<brr.length;j++){
//         System.out.println(brr[j]);
//         }
//     }
// }

// public class Practice {

//     public static void main(String[] args) {
//         int[] arr= {1,2,3,4,5};
//         int[] brr ;
//         brr = new int[3];
//         int d=2;
//         for(int i =0;i<arr.length;i++){
//             brr[i]=arr[d+i];
//         }
//         for(int j =0;j<brr.length;j++){
//             System.out.print(brr[j]);
//         }
//     }
// }

// --------------------------reverse d -----------------

// import java.util.Scanner;

// public class  Practice{
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);

//         System.out.println("Emnte n: ");
//         int n =inp.nextInt() ;
//         int[] arr = new int[n];
//         System.out.println("Enter a arr "+arr.length+": ");
//         for(int i = 0;i<arr.length;i++){
//             arr[i]=inp.nextInt();
//         }
//         System.out.println("Enter a d: ");
//         int d = inp.nextInt();
//         d%=n;
//         revers(arr, 0, d-1);
//         revers(arr, d, n-1);
//         revers(arr, 0, n-1);

//         for (int i : arr) {
//             System.out.print(i+" ");
//         }

//     }
//     static void revers(int[] arr,int i, int j){
//         while(i<j){
//         int temp = arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//         i++;
//         j--;
//         }
//     }
// }

// ------------find missing one------------------

// import java.util.Scanner;

// public class Practice {

//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n =inp.nextInt();

//         int[] arr = new int[n];

//         for (int i =0;i<arr.length;i++){
//          for(int j =0;j<arr.length;j++){
//             if{
//                 if(arr[i]==arr[j]){
//                 break;
//                 }
//             else{
//                 system.out.print(arr[j]);
//             }
//             }
//             }
//         }
//     }
// }

// ----------------------misss in array--------

// import java.util.Scanner;

// public class Practice {

//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.out.println("Enter a length : ");
//         int length = inp.nextInt();

//         // int[] arr = new int[length];
//         // System.out.print("Enter a element: ");
//         // for(int i =0;i<length;i++){
//         //    arr[i] = inp.nextInt();
//         // }

//         int[] arr = {1,3,4,5};

//          int cal = length*(length+1)/2;
//          int sum =0 ;
//          for(int i = 0;i<arr.length;i++){
//             sum+= arr[i];
//          }
//          int findmiss = cal - sum;
//          System.out.println(findmiss);
//     }
// }

// ----------------------segrigate------------
// public class Segrigate{
//     public static void main(String[] args) {
//         int arr[] = {0,1,0,1,0,1};
//         int countZero =0;

//         for(int i = 0;i<arr.length;i++){
//             if(arr[i]==0){
//             countZero++;
//             }
//         }

//         for(int i =0;i<countZero;i++){
//            arr[i]=0;
//         }

//         for(int i=countZero;i<arr.length;i++){
//             arr[i]=1;
//         }

//         System.out.println("After segrigate:");
//         for(int i = 0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// ----------------------segrigate2nd approch----------------

// public class Segrigate {

//     public static void main(String[] args) {
//         int arr[] = {1,0,1,0,1,0};
//         int i =0;
//         int j =arr.length-1;
//         while (i<j) {
//             if(arr[i]==0) i++;
//             else if(arr[j]==1) j--;
//             else if(i>j) break;
//             else if(arr[i]==1 && arr[j]==0){
//                 arr[i]=0;
//                 arr[j]=1;
//                 i++;
//                 j--;
//             }
//         }
//         for(int k= 0;k<arr.length;k++){
//             System.out.print(arr[k]+" ");
//         }
//     }
// }

// ----------------------swap array-------------
// public class sawp {

//      public static void main(String[] args) {
//         int[] arr={1,2,3,4,5};
//         int i = 0;
//         int j = 1;
//         while(j<arr.length){
//                 int temp = arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//                 i+=2;
//                 j+=2;
//             }
//         for(int k=0;k<arr.length;k++){
//             System.out.print(arr[k]+" ");
//         }
//      }

// }

// ---------------Array List---------------

// import java.util.ArrayList;

// public class Arrlist{
//     int[] Convert(ArrayList<Integer> arr){
//         int[] Array = new int[arr.size()];
//         for(int i = 0;i<arr.size();i++){
//             Array[i] = arr.get(i);
//         }
//         return Array;
//     }
//      void  display(int[] arr){
//         System.out.println("Output: ");
//         for(int i = 0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(10);
//         arr.add(20);
//         arr.add(30);
//         arr.add(40);
//       System.out.println(arr);
//       arr.set(2, 25);
//       System.out.println(arr);
//     Arrlist obj = new Arrlist();

//     int[] array = obj.Convert(arr);

//     obj.display(array);
//     }
// }

// -----------array+carray------------

// import java.util.ArrayList;
// import java.util.Scanner;

// public class carry {

//     void carray(ArrayList<Integer> arr ,int n){
//         int carray=1;
//         for(int i = n-1;i>=0;i--){
//                if(arr.get(i)+carray<=9){
//                 arr.set(i,arr.get(i)+carray);
//                 carray=0;
//                }
//                else{
//                 arr.set(i,0);
//                 carray=1;
//                }
//         }
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> ans = new ArrayList<>();
//        Scanner inp = new Scanner(System.in);
//        System.out.println("Enter a size of  Arraay: ");
//        int n = inp.nextInt();
//        for(int i = 0;i <n;i++){
//         System.out.print("Enter a Element: ");
//         int x = inp.nextInt();
//         ans.add(x);
//        }
//        System.out.println(ans);
//        carry obj =new carry();
//       obj.carray(ans,n);
//       System.out.println(ans);

//     }
// }

// ---------------------Array+Caarry-----------------------

// import java.util.ArrayList;
// import java.util.Scanner;

// public class carray{

//    void Addone(ArrayList<Integer> arr,int n ){
//             int carry = 1; 
//               for(int j =n-1;j>=0;j--){

//                if(arr.get(j)+carry<=9){
//                     arr.set(j, arr.get(j)+carry);
//                     carry =0;
//                }
//                else{
//                 arr.set(j,0);
//                 carry=1;
//                }
//               }
//      }

//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         //user se criteriya lena hai
//         System.out.println("Enter a Size of Arraay: ");
//         Scanner inp = new Scanner(System.in);
//         int Size=inp.nextInt();

//         //Ab For se Use se entry krwayenge 
//         System.out.println("Enter  user: ");
//         for(int i = 0;i<Size;i++){
//             int x = inp.nextInt();
//            arr.add(x);
//         }
//         carray obj = new carray();
//         obj.Addone(arr, Size);
//         System.out.println(arr);

//     }
// }

// ---------------------------Add 2 Array---------------------

// import java.util.ArrayList;
// import java.util.Scanner;

// public class carray {

//      void AddtoArr(ArrayList<Integer> brr1 , ArrayList<Integer> brr2 , int n  ){
//         int carry=0;
//          for(int i = n-1;i>=0;i--){
//             int sum = brr1.get(i)+brr2.get(i)+carry;
//             brr1.set(i,sum%10);
//             carry = sum/10;
//          }
//          if(carry>0){
//             brr1.add(0,carry);
//          }
//   }
//     public static void main(String[] args) {
//         ArrayList<Integer> arr1 = new ArrayList<>();
//         ArrayList<Integer> arr2 = new ArrayList<>();
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter a Size of arr: ");
//         int Size = input.nextInt();
//         System.out.println("Enter a Element For Arr1: ");

//         for(int i = 0;i<Size;i++){
//             int x = input.nextInt();
//             arr1.add(x);
//         }
//         System.out.println("Enter a Element For Arr2: ");
//         for(int i = 0;i<Size;i++){
//             int x = input.nextInt();
//             arr2.add(x);
//         }
//         carray obj = new carray();
//         obj.AddtoArr(arr1,arr2,Size);
//         System.out.println(arr1);
//          input.close();
//     }
// }

// ---------------Add Two Merge Sort-------------------

// public class Merge{

//     void  merge(int[] a, int[] b,int[] c){
//         int i = 0,j=0,k=0;
//         while(a.length<=c.length&&b.length<=c.length){
//             if(a[i]<=b[j]){
//                 c[k++]=b[i++];
//             }
//             else if(b[j]<=a[i]){
//                 c[k++]=a[i++];
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr1 = {2,5,6,9,20};
//         int[] arr2 = {1,3,4,5,7,8};
//         int[] arr3 = {};

//         Merge obj = new Merge();
//         obj.merge(arr1, arr2, arr3);
//         for(int i =0;i<=arr1.length+arr2.length;i++){
//             System.out.print(arr3[i]+" ");
//         }
//     }
// }

// ----------------------String concept-------------------

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.out.println("Enter a String: ");
//         String a = inp.nextLine();
//         System.out.print(a);
//     }
// }

// ----------------------calculate Percentage--------------------

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.out.println("Enter a Total_Value: ");
//         float Total_value  = inp.nextFloat();
//          float total = 0;
//         System.out.println("Enter a Physics out of "+Total_value  );
//          float p = inp.nextFloat();
//          total +=p;
//          System.out.println("Enter a Chemistry out of  "+Total_value);
//           float c = inp.nextFloat();
//           total +=c;
//           System.out.println("ENter a Mathmatics out of "+Total_value);
//           float M = inp.nextFloat();
//           total +=M;

//           float Percentage = total*100/(Total_value*3);

//           System.out.println("Your Percentage is : "+Percentage);
//     }
// }

// -------------------incremint decreement---------------------
// public class Practice{
//     public static void main(String[] args) {
//         int a = 5;
//         char b = 'a';
//         System.out.println(a++);
//         System.out.println(a);
//         System.out.println(++a);
//         System.out.println(a);
//         System.out.println(++b);
//     }
// }

// ----------------------quetion-------------

// public class Practice {
//     public static void main(String[] args) {
//         float a = 7.0f/4*9/2;
//         System.out.println(a);
//     }
// }

// --------------------question-Grade------------
// public class Practice {

//     public static void main(String[] args) {
//         char grade = 'a';

//         grade = (char)(grade+8);
//         System.out.println(grade);
//          grade = (char)(grade-8);
//         System.out.println(grade);
//     }
// }

// --------------------question-----------------

// import java.util.Scanner;

// public class Practice {

//      public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.out.println("Enter a V: ");
//         float V = inp.nextFloat();
//         System.out.println("Enter a U: ");
//         float U = inp.nextFloat();
//         System.out.println("Enter a, a: ");
//         float a = inp.nextFloat();
//         System.out.println("Enter a s: ");
//         float s = inp.nextFloat();

//         float squre  = (V*V)-(U*U);
//         float multiply = (2*a*s);
//         float Solution = squre/multiply;
//         System.out.println(Solution);

//      }
// }

// --------------------String Methods----------------------

// public class Practice{
//    public static void main(String[] args) {
//        String name = " Atul Singh";
//        System.out.println(name );
//        System.out.println(name.length());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trim());
//        System.out.println(name.substring(2));
//        System.out.println(name.substring(2, 5));
//        System.out.println(name.replace("t", "bd"));
//        System.out.println(name.startsWith(" "));
//        System.out.println(name.indexOf("t",2));
//        System.out.println(name.lastIndexOf("h"));
//        System.out.println(name.equals(" Atul Singh"));
//     }
// }

// -------------------------Escapesequence--------------------

// public class Practice {

//      public static void main(String[] args) {
//         System.out.println("Hii My self Atul Sing recently I completed My gradution  in \n BCA");
//      }
// }

// ---------------------replace-------------------

// import java.util.Scanner;

// public class Practice{
//    public static void main(String[] args) {
//       String name = "Dear name  Thanks A lot all They people which contribute their effort in my Life ";
//       System.out.println(name.replace("name", "All my Family"));
//    }
// }

// --------------------if else----------------------

// import java.util.Scanner;

// public class Practice {
//   public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     System.out.print("Enter your age: ");
//     int age = inp.nextInt();
//     if(age>=18){
//       System.out.print("You are eligibel for Making DL");
//     }
//     else{
//       System.out.println("You are not eligibel fo Making a Dl");
//     }
//   }
// }

// -------------------------true or flase --------------------

// public class Practice {
//   public static void main(String[] args) {
//       boolean a = true;
//       boolean b = false;
//       if(a || b){
//          System.out.print("both are Same");
//       }
//       else{
//          System.out.println("There is not same Value");
//       }
//   }
// }

// -----------------------Switch case----------------

// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.out.print("Enter a Date:");
//         int a = inp.nextInt();

//         switch (a) {
//             case 1:
//                 System.out.println("Sunday");
//                 break;
//             case 2:
//                 System.out.println("Monday");
//                 break;
//             case 3:
//                 System.out.println("Tuesday");
//                 break;
//             case 4:
//                 System.out.println("WednesDay");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             default:
//                 System.out.println("Please enter 1 to 7 date");
//                 break;
//         }
//         System.out.println("Thank you For Use My Code");

//     }
// }

// ----------------------------CBSE Percentage Calculator-------------------

// import java.util.Scanner;

// public class calculator{

//     void checkGrade(float percnt){
//         if(percnt>=90) System.out.print("A grade");
//         else if(percnt>=80 && percnt<90) System.out.println("B grade");
//         else if(percnt>=65 && percnt<80) System.out.println("C grade");
//         else if(percnt>=45 && percnt<65) System.out.println("D grade");
//         else System.out.println("Please try again ");
//     }
//     public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        System.out.print("Max Marks of Each subject is : ");
//        int Max_Marks = inp.nextInt();
//        int numofsub = 0;
//        float total = 0;
//        System.out.print("Enter a  Math marks: ");
//        total += inp.nextFloat();
//        numofsub+=1;
//        System.out.print("Enter a Physics Marks: ");
//        total +=inp.nextFloat();
//        numofsub+=1;
//        System.out.print("Enter a Chemistry Marks: ");
//        total +=inp.nextFloat();
//        numofsub+=1;
//        System.out.print("Enter a English marks: ");
//        total +=inp.nextFloat();
//        numofsub+=1;

//        float Percentage = total*100/(Max_Marks*numofsub);
//        System.out.println(Percentage);
//        calculator obj = new calculator();
//        obj.checkGrade(Percentage);
//     }
// }

// --------------------------RockPapperSessior Game----------------------

// import java.util.Random;
// import java.util.Scanner;

// public class Game{
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         Random random = new Random();
//         System.out.println("1=Rock");
//         System.out.println("2=Paper");
//         System.out.println("3=Siseor");

//         System.out.print("Enter a Numb out of 3: ");
//         int User = inp.nextInt();
//         int computer = random.nextInt(3)+1;
//          System.out.println("Computer Choose: "+computer);
//         if(User==computer) System.out.print("Match Drow");
//         else if(User==1 && computer==3) System.out.println("User  Win the game rock beats Scisor");
//         else if(User==2 && computer==1) System.out.println("User  win the game Paper beats Rock");
//         else if(User==3 && computer==2) System.out.println("User  win the game Scisor beats Paper ");
//         else System.out.println("Computer won the Match");
//     }
// }

// --------------------loop------------------

// public class Practice{
//     public static void main(String[] args) {
//        System.out.println("Print Even Number: ");
//         for(int i = 1;i<5;i++){
//             System.out.println(2*i);
//         }
//            System.out.println("Print odd Number: ");
//         for(int j = 1; j<5;j++){
         
//             System.out.println(2*j+1);
//         }
//     }
// }

// ----------------------------break continou---------------------
// public class Practice {
// public static void main(String[] args) {
//     for(int i = 0;i<5;i++){
//         if(i<2){
//             System.out.println("Java is best");
//             System.out.println(i);
//             continue;
//         }
//         System.out.println("Thank you!");
//     }
    
// }
// }

// -------------------------Pattern----------------

// public class Practice {

//     public static void main(String[] args) {
//         int n = 4;
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<n-i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// --------------------------nth sum--------------------

// public  class Practice{
//     public static void main(String[] args) {
//         int  i = 1;
//         int sum = 0;
//         while (i<=6) {
//             if(i%2==0){
//                 sum+=i;
//             }
//           i++;
//         }
//         System.out.println("Sum of nth number: "+sum);
//     }
// }

// ----------------------------Tabel----------------

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//          System.out.println("Enter a number  for Tabel: ");
//          int n  = inp.nextInt();

//          for(int i = 1;i<=10;i++){
//             System.out.printf( "%d * %d = %d\n",n,i,n*i);
//          }
         
//     }
// }

// -----------------factorial--------------

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         System.err.println("Enter a Numb for feb: ");
//         int  n  = inp.nextInt();
//         int feb = 1;
//         for(int i = n ;i>0;i--){
//              feb *=i;
//         }
//         System.out.print("Your Answer is: "+ feb);
//     }
// }

// -------------------------factorial by while-----------------

// public class Practice{
//     public static void main(String[] args) {
//       int  n = 5;
//       int feb = 1;
//       int i = n;
//       while (i>0) {
//         feb *=i;
//         i--;
//       }
//       System.out.println(feb);
//     }
// }

// ------------------------whiile loop patern--------------


// public class Practice{
//     public static void main(String[] args) {
//         int i =0;
//         int n =4;
//         while (i<=n) {
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }

// ----------------------Array in Java-----------------

// public class Practice {

//     public static void main(String[] args) {

//         int[] marks = new int[5];
//         int[] arr = {21,31,41,51,61}; // array declaraion with intalization
//         for(int i =0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         System.out.println("Reverse of array---------");
//         for(int i =arr.length-1;i>0;i--) System.out.print(arr[i]+" ");

//         System.out.println();

//         System.out.println("Printing Using For Each loop");
//         for (int i : arr) System.out.print(i+" ");
//     }
// }

// --------------------- multidimension-----------------------

// public class Prctice{
//     public static void main(String[] args) {
//         int [] [] Marks = new int[2][3];
//         Marks[0][0]=80;
//         Marks[0][1]=90;
//         Marks[0][2]=100;
//         Marks[1][0]=60;
//         Marks[1][1]=70;
//         Marks[1][2]=80;

//         for(int i =0;i<Marks.length;i++){
//             for(int j = 0;j<Marks[i].length;j++){
//                 System.out.print(Marks[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// ------------------------Sum of array -----------------

// import java.util.Scanner;

// public class Prctice {

//    public static void main(String[] args) {
//     Scanner inp = new Scanner(System.in);
//     int[] [] arr = new int[2][3];
//     System.out.println("Enter a Element : ");
//     for(int i = 0 ; i<arr.length;i++){
//         for(int j = 0;j<arr[i].length;j++){
//              arr[i][j] = inp.nextInt();
//         }
//     }
//     System.out.println("Your enter element are: ");
//     for(int i = 0; i<arr.length;i++){
//         for(int j = 0;j<arr[i].length;j++){
//             System.out.print(arr[i][j]+" ");
//         }
//         System.out.println();
//     }
//     System.out.println("Your Sum Of Aaray: ");
//     int sum =0;
//     for(int i = 0;i<arr.length;i++){
//         for(int j = 0;j<arr[i].length;j++){
//             sum += arr[i][j];
//         }
//     }
//     System.out.println("Sum of Array :"+sum );
//    }
// }

// -------------------------sum of 2d ----------------

// public class Add{
//     public static void main(String[] args) {
//         int [] [] arr = 
//         {
//             {1,2,3},
//             {4,5,6}
//         };
//         int [] brr= new int[3];
//         for(int i = 0;i<arr.length;i++){
//             for(int j = 0;j<arr[i].length;j++){
//                 for(int k =i+1;k<arr[i].length;k++){
//                     brr = arr[i][j]+arr[k][j];
//                 }
//             }
//         }
        
//     }
// }

// --------------------array sum in row  -------------------

// public class Practice {
//      public static void main(String[] args) {
//           int [][] arr = {
//                {1,2,3},
//                {2,3,4}
//           };
//           for(int i = 0;i<arr.length;i++){
//                int rsum = 0;
//                for(int j = 0;j<arr[i].length;j++){
//                     rsum += arr[i][j];
//                }
//                System.out.println("row " + i + " sum="+rsum);
//           }
//      }
// }

// ------------------------sum of col--------------------

// public  class Csum{
//    public static void main(String[] args) {
//     int [] [] arr = {
//         {1,2,3},
//         {4,5,6}
//     };
//     for(int j =0;j<arr[0].length;j++){
//         int colsum = 0;
//         for(int i = 0;i<arr.length;i++){
//             colsum +=arr[i][j];
//         }
//         System.out.println("A colsum of: "+ j +" is "+colsum);
//     }
//    }
// }

// -------------------sum of matrix-----------------

// public class Matrix{
//     public static void main(String[] args) {
//         int [] [] arr1= {{1,2,3},{4,5,6}};
//         int [] [] arr2= {{6,7,8},{9,10,11}};
//         int [] [] arr3 = new int[2][3];

//         for(int i =0;i<arr1.length;i++){
//             for(int j =0;j<arr1[0].length;j++){
//                 arr3[i][j]=arr1[i][j]+arr2[i][j];
//             }
            
//         }
//     for(int i = 0;i<arr3.length;i++){
//         for(int j =0;j<arr3[0].length;j++){
//             System.out.print(arr3[i][j]+" ");
//         }
//         System.out.println();
//     }

//     }
// } 

// ----------------------reverse Array -----------------

// public class Rev{
//     public static void main(String[] args) {
//         int  [] rev= {1,2,3,4,5};
//         for(int  i = rev.length-1;i>=0;i--){
//               System.out.println("rev position : "+i+" place of : "+rev[i]+" ");
//         }
//     }
// }

// ------------------------sorted arrray------------------

// public class Soted{

//     public static void main(String[] args) {
//         boolean isSorted = true;
//         int[] arr ={2,4,5,2,1};
//         for(int i =0;i<arr.length-1;i++){
//             if(arr[i]>arr[i+1]){
//                 isSorted = false;
//                 break;
               
//             }
//         }
//          if(isSorted) System.out.println("This is a Sorted array");
//          else System.out.println("This is not a sorted array");
             
//     }
// }

// ----------------------compexity-------------------

//  public class Practice {
//    public static void main(String[] args) {
//     int[] arr = {5,1,3,4,2,4};
//     System.out.println(arr.length);
//     boolean[] Flag = new boolean[arr.length];
//     for(int i =0; i < arr.length;i++){
//              int elem = arr[i];
//              if(Flag[elem]==true) System.out.println("This is a duplicate elem");
//              else{
//                 Flag[elem] = true;
//             }
//         }
//     }
// }

//  ---------------------------2nd Approch-------------

// public class Practice{
//     public static void main(String[] args) {
//         int[] arr = {5,1,3,4,2,4};
//         int n = arr.length;
//         int sumOfArr = 0;
//         for(int i = 0;i<n;i++){
//             sumOfArr += arr[i];
//         }
//         System.out.println("Sum of arr is : "+sumOfArr);
//         int cal = (n-1)*n/2;
//         System.out.println("Mathmatics opr perform: "+cal);
//         int sub = sumOfArr-cal;
//         System.out.println("A Duplicate Arrayn element is: "+sub);
//     }
// }

// ---------------------Bubbel sort----------------

// public class Soert{

//     public static void main(String[] args) {
//          int[] arr = {5,-2,6,7,2,0,7,2};
//          int n = arr.length-1;
//          int swap =0;
//          int loop = 0;
//          for(int i = 0;i<n;i++){
//             for(int j = 0;j<n-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     swap++;
//                 }
//               loop++;
//             }
//         }
//         for(int j = 1;j<=n;j++){
//             System.out.print(arr[j]);
//         }
//         System.out.println();
//         System.out.println("A Swap happen Count:  "+swap);
//         System.out.println("A inner loop run :  "+loop);
//     }
    
// }

// --------------------------Bubbel sort reverse --------------------

public class Reverse{
    public static void main(String[] args) {
        in
    }
}