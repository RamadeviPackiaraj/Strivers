//time O(n) Space O(1)
import java.util.*;
public class Majority_n_two_optimized{
    public static int Majority_Element(int[] arr){
        int count=0;
        int candidate=0;
        for(int num:arr){
            if(candidate==0){
               candidate= num;
            }
            count+=(num==candidate)?1:-1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println("Majority Element: " + Majority_Element(arr));
}
}