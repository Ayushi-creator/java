import java.util.*;

public class primeTillN{
    
    public static Scanner scn=new Scanner(System.in);

        public static boolean isPrime(int num){
          for(int i=2;i*i<=num;i++){
            if((num % i)==0)
              return false;
            }
            return true;
          }
         
              public static void main(String[] args) {
                int a=scn.nextInt();
                int b=scn.nextInt();
                for(int i=a;i<=b;i++){
                    if(isPrime(i))
                    System.out.println(i);

                }
                
          }
        
    
    
}
