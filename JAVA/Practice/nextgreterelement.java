
import java.util.*;

public class nextgreterelement {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

       for(int i=arr.length-1; i>=0; i--){ //nxtgreater right

       // for (int i = 0; i < arr.length; i++) { //next greater left // next smaller left
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
          //  while (!s.isEmpty() && arr[s.peek()] >= arr[i]) { // next smmaller right //next smaller left
                s.pop();
            }

            // 2 if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            // push
            s.push(i);
        }

        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }

        System.out.println();

    }
}

// next Greater right
// next greater left
// next smaller right
// next smaller left