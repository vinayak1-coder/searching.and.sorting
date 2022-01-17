//square root
public class square {
    public static int root(int x){
        if(x==0 || x==1)
            return x;
        long s=1,e=x,ans=0;
        while(e>=s){
            int mid = (int) ((e+s)/2);
            if(mid*mid == x)
                return (int)mid;
            if(mid*mid <x) {
                s = mid + 1;
                ans = mid;
            }
            if(mid*mid>x){
                e = mid-1;
            }

        }
        return (int)ans;
    }

    public static void main(String[] args) {
        int x=11;
        System.out.println(root(x));
    }
}
