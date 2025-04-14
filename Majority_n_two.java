import java.util.*;
public class Majority_n_twoBruteforce_{
    public static int majorityElement(int[] arr){
        int  n=arr.length;
        int count;
        for(int i=0;i<n;i++){
                 count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        
            if(count>n/2){
                return arr[i];
            }
        }
            return -1;
        }

    public static void main(String[] args){
        int[] arr={3,2,3};
        System.out.println(majorityElement(arr));
    }
}