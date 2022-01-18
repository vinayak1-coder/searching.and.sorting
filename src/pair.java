public class pair {
    public static boolean find(int a[],int n){
        int size = a.length;
        int i=0,j=1;
        while(i<size && j<size){
            if(i!=j &&(a[i]-a[j] ==n ||a[j]-a[i]==n)){
                System.out.println("pair found "+a[i]+","+a[j]);
                return true;
            }
            else if(a[j]-a[i]<n)
                j++;
            else
                i++;

        }
        System.out.println("no result found");
        return false;
    }

    public static void main(String[] args) {
        int a[]={1,16,100,140};
        int n=-40;
        find(a,n);
    }
}
