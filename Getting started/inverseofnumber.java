import java.util.Scanner;

public class inverseofnumber {
    public static int inverseofnumber(int num){
        int lastIndex=1,res=0;
        while(num!=0){
            int ld=num%10;
            num/=10;
            res+=lastIndex*(int)Math.pow(10,ld-1);
            lastIndex++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ans=inverseofnumber(n);
        System.out.println(ans);
    }
    
}
