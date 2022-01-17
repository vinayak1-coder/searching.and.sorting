//Count of occurrences of x in sorted element
public class count {
    public static int occu(int a[],int x, int n){
        int i,j;
        i=first(a,0,n-1,x,n);
        if(i== -1)
            return -1;
        j=last(a,i,n-1,x,n);
        return j-i+1;
    }
    public static int first(int a[],int l,int r,int x,int n){
        if(r>=l){
            int mid= (l+r)/2;
            if((mid==0 || x>a[mid-1])&& a[mid]==x)
                return mid;
            else if(x>a[mid])
                return first(a,mid+1,r,x,n);
            else
                return first(a,l,mid-1,x,n);
        }
        return -1;
    }
    public static int last(int a[],int l,int r,int x,int n){
        if(r>=l){
            int mid = (l+r)/2;
            if((mid ==n-1 || x<a[mid +1])&& a[mid]==x)
                return mid;
            else if (x<a[mid])
                return last(a,l,mid-1,x,n);
            else
                return last(a,mid+1,r,x,n);


        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={1,2,2,3,3,3,3};
        int x=3;
        int n= a.length;
        int c = occu(a,x,n);
        System.out.println(x+" occurs "+c+" times");
    }
}
