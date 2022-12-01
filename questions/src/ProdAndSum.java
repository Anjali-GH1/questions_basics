import java.util.Scanner;

public class ProdAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = subtractProductAndSum(n);
        System.out.println(ans);
    }
    public static int subtractProductAndSum(int n) {
        int pro = 1;
        int sum = 0;
        while(n>0){
            int lastDig = n%10;
            pro = pro * lastDig;
            sum = sum + lastDig;
            n = n/10;
        }
        return pro - sum;
    }
}
