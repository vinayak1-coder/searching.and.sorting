// Java program to count 1's in a sorted array
class Count1s{
    int s1(int arr[], int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == high || arr[mid + 1] == 0)
                    && (arr[mid] == 1))
                return mid + 1;
            if (arr[mid] == 1)
                return s1(arr, (mid + 1), high);
            return s1(arr, low, (mid - 1));
        }
        return 0;
    }
    public static void main(String args[])
    {
        Count1s ob = new Count1s();
        int arr[] = { 1,1,1,1,1,0,0,0};
        int n = arr.length;
        System.out.println("Count of 1s in array is " + ob.s1(arr, 0, n - 1));
    }
}

