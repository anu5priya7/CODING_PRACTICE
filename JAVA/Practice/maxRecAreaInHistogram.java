 
 import  java.util.*;
public class maxRecAreaInHistogram {

    public static void maxArea(int arr[]) { //O(n)
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) { // next smmaller right
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] =  s.peek() ;
            }

            s.push(i);
        }

        // next smaller left
         s = new Stack<>();

        for (int i = 0; i < arr.length; i++) { // next smaller left

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) { // next smaller left
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] =  s.peek() ;
            }

            s.push(i);
        }

        // current Area 
         for (int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height * width;
            maxArea = Math.max(currArea , maxArea);
         }

        System.out.println("MAx Area of histogram is = " + maxArea);

    }

    public static void main(String[] args) {
       // int arr[] = { 2, 1, 5, 6, 2, 3 };
        int arr[] = { 2, 4};
        maxArea(arr);

    }
}
