/**
 * reversestring
 */

 // TC == 0(N)   AND  SC = O(1);
public class reversestring {

    public static void reverse(char[]arr){
        int i =0;
        int j = arr.length;
        while(i>j){
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j]= temp;
           i++;
           j--;
        }

    }
}