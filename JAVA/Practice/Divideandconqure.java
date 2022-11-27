public class Divideandconqure {

    public static void printArr(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSortalgorithm(int arr[], int si, int ei) {
        // kaam
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSortalgorithm(arr, si, mid); // left part
        mergeSortalgorithm(arr, mid + 1, ei); // right part


        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];

        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

 

   public static void main(String args[]){
       
       int arr[] = {6,3,9,5,2,4, -7, -1};
       mergeSortalgorithm(arr, 0, arr.length-1);
         printArr(arr);
   }

}