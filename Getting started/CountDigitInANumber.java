import java.util.Scanner;

public class CountDigitInANumber {
    public static int countDigitOFNumber(int num){
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }
       public static void main(String[] args) {
           Scanner scn=new Scanner(System.in);
           int n=scn.nextInt();
           int ans=countDigitOFNumber(n);
           System.out.println(ans);

        
    }
    
}
