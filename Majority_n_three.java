import java.util.*;
public class Majority_n_three{
    public static int majorityElement(int[] arr){
        int majority=arr[0],votes=1;
        for(int i=0;i<arr.length;i++){
            if(votes==0){
                votes++;
                majority=arr[i];
            }
            else if(majority==arr[i]){
                votes++;
            }
            else{
                votes--;
            }
        }
        return majority;
    }
    public static void main(String[] args){
        int[] arr={4,2,1,3,2,2,1,3,3,3,3,3};
        System.out.println(majorityElement(arr));
    }
}