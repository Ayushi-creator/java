import java.util.Scanner;
public class benjaminbulb {
    public static void benjaminbulb(int n){
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        benjaminbulb(n);
    }
}

//////////////////////or leetcode solution////////////////////
class Solution {
    public int bulbSwitch(int n) {
          return (int)Math.sqrt(n);
    }
}

