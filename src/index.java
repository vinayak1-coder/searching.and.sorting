
public class index {
    public static int fixed(int a[],int l,int r){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (mid == a[mid])
                return mid;
            int res = -1;
            if (mid + 1 <= a[r])
                res = fixed(a, (mid + 1), r);
            if (res != -1)
                return res;
            if (mid - 1 >= a[l])
                return fixed(a, l, (mid - 1));
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { -10, -1, 0, 3, 10, 11, 30, 50, 100 };
        int n = a.length;
        System.out.println("Fixed Point is " + fixed(a, 0, n - 1));
    }
}
