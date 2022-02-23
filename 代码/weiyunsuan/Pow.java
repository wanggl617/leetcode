package weiyunsuan;
import java.util.*;
public class Pow {
    public double quickMul(double x, long N){
        double ans = 1.0;
        double x_contribute = x;
        while(N > 0){
            if((N & -N) == 1){
                ans = ans * x_contribute;
            }
            x_contribute *= x_contribute;
            N = N >>1;

        }
        return ans;
    }
    public double mypow(double x, int n){
        long N = n;
        return N > 0?quickMul(x, N):1.0/quickMul(x, -N);
    }
    public static void main(String[] args) {
        Pow pw = new Pow();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double x  = sc.nextDouble();
            int n = sc.nextInt();
            System.out.println(pw.mypow(x, n));
        }
        
    }

}
