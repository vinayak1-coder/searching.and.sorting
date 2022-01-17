//Find the index of first occurrence in a sorted array
//Find the index of last occurrence in a sorted array
public class firstocc {
    public int first(int a[],int n,int l,int r,int x){
        if(r>=l) {
            int mid = l + (r - l) / 2;
            if ((mid == 0 || x > a[mid - 1]) && a[mid] == x)
                return mid;
            else if (x > a[mid])
                return first(a, n, mid + 1, r, x);
            else
                return first(a, n, l, mid - 1, x);
        }
        return -1;
    }
    public int second(int a[],int n,int l,int r,int x){
        if(r>=l) {
            int mid = l + (r -l) / 2;
            if ((mid == n-1 || x < a[mid + 1]) && a[mid] == x)
                return mid;
            else if (x < a[mid])
                return second(a, n, l, mid - 1, x);
            else
                return second(a, n, mid + 1, r, x);
        }
        return -1;

    }
    public static void main(String[] args)
    {
        firstocc obj1 = new firstocc();
        firstocc obj2 = new firstocc();
        int a[] = { 1, 2, 2,2, 3, 4, 7, 8, 8 };
        int n= a.length;
        int x=2;
        int found = obj1.first(a,n,0,n-1,x);
        int found1 = obj2.second(a, n, 0,n-1,x);
        System.out.println("First Occurrence = " + found);
        System.out.println("Last Occurrence = " + found1);
    }

}
