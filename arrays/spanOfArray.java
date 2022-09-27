// import java.io.*;
// import java.util.*;

// public class spanOfArray{

// public static void main(String[] args) throws Exception {
//     Scanner scn=new Scanner(System.in);
//     int  n=scn.nextInt();
//     int [] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=scn.nextInt();
//     }
//     //span=max-min;
//     int min=Integer.MAX_VALUE;
//     int max=Integer.MIN_VALUE;
//     for(int i=0;i<n;i++){
//         max=Math.max(max,arr[i]);
//         min=Math.min(min,arr[i]);
//     }
//     int span=max-min;
//     System.out.println(span);
//  }

// }

//or//

// import java.util.*;
// public class spanOfArray{
//    // infi - 1e8
//   //  math.min - max -- if else
// public static void main(String[] args) {
//     Scanner scn=new Scanner(System.in);
//         int  n=scn.nextInt();
//         int [] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=scn.nextInt();
//         }

//         int max = -(int)1e9;
//         int min = (int)1e9;

//         for(int i = 0; i<n; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//             if(arr[i] < min){
//                 min = arr[i];
//             }
//         }

//         System.out.println(max-min);
//     }
// }
