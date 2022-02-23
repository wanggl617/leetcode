package Bit;

public class QuickMulti {

    public static void main(String[] args){
        
        QuickMulti test = new QuickMulti();
        System.out.println(test.quickMulti(88, 12));
        System.out.println(88*12);
    }

    public int quickMulti(int a,int b){
        int ans = 0;
        while(b > 0){
            if((b & 1) == 1){
                ans += a;
            }
            a = a << 1;
            b = b >> 1;
        }
        return ans;
    }
}

