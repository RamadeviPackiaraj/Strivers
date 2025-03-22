import java.util.*;
public class Permutations{
    public static void main(String[] args){
        int[] nums={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        generatePermutations(nums,0,result);
        
        for(List<Integer> perm:result){
            System.out.println(perm);
        }
    }//recursive function
    private static void generatePermutations(int[] nums,int index,List<List<Integer>> result){
        if(index==nums.length){
            List<Integer> perm=new ArrayList<>();
            for(int num:nums){
                perm.add(num);
            }
            result.add(perm);
            return;
    
    } 
    //generating Permutations
    for(int i=index;i<nums.length;i++){
        swap(nums,index,i);//swap current element
        generatePermutations(nums,index+1,result);//recur with next index
        swap(nums,index,i);//Backtrack(undo swap)
    }
    }//backtrack add all permutations result
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}