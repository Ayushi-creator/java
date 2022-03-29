import java.util.Scanner;

public class ReverseOfANumber {
    public static void ReverseOfANumber(int num){
        while(num!=0){
            int ld=num%10;
            num/=10;
            System.out.println(ld);
        }Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ReverseOfANumber(n);
    }
    public static void main(String[] args) {
        
    }
    
}
