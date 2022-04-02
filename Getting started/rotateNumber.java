// import java.util.*;
// public class rotateNumber {
//     public static int countDigitOFNumber(int num){
//         int count=0;
//         while(num!=0){
//             num/=10;
//             count++;
//         }
//         return count;
//     }
//     public static int rotateNumber(int num,int r){

//         int len=countDigitOFNumber(int num);
//         r=(r%len+len)%len;
//       
//         int a= num/ (int)Math.pow(10,r);
//         int b=num%(int)Math.pow(10,r);
//         return(b*(int)Math.pow(10,len-r)+a);
//     }
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         int n=scn.nextInt();
//         int r=scn.nextInt();
//         int ans=rotateNumber(n,r);
//         System.out.println(ans);

//     }
// }

                                //or
//   public static int rotateNumber(int num,int r){
//     int len=countDigitOFNumber( num);
//     r=(r%len+len)%len;
//      int div=1, mul=1;

// for(int i=1;i<=len;i++)
// if(i<=r)
// div*=10;
// else
// mul*=10;
//     int a=num/div;
//     int b=num%div;
//     return(b*mul+a);
//   }
