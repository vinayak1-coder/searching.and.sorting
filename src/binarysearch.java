//Binary Search Iterative
//Binary Search Recursive
public class binarysearch {
    public static int iteration(int a[],int n, int key ){
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid =(l+r)/2;
            if(key==a[mid])
                return mid;
            else if(key<a[mid])
                r=mid-1;
            else if(key>a[mid])
                l=mid+1;
        }
        return -1;

    }
    public static int recursion(int b[], int lo,int l,int r){
        if(l>r)
            return -1;
        else{
            int mid = (l+r)/2;
            if(lo==b[mid])
                return mid;
            else if(lo<b[mid])
                return recursion(b,lo,l,mid-1);
            else if(lo>b[mid])
                return recursion(b,lo,l+1,r);
        }
        return -1;

    }

    public static void main(String[] args) {
        binarysearch obj1 = new binarysearch();
        binarysearch obj2 = new binarysearch();
        int a[]={15,21,47,84,96};
        int b[]={15,21,47,84,96};
        int found = obj1.iteration(a,5,96);
        int found1 = obj2.recursion(b,96,0,b.length-1);
        System.out.println("iteration");
        System.out.println(found);
        System.out.println("recursion");
        System.out.println(found1);
    }
}
