package reviewday6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DuplicateInteger {
    /*
     * Write a code that returns the duplicate numbers in an int array
     * e.g.
     * int nums[]={12,3,3,4,5,6,1,2,7,12,14,12,1,1,1};
     * Output: 1  3  12
     */
    public static void main(String[] args) {
        int nums[]={12,7,3,3,1,2,12,12,1,1};
        //i will sort this array 1,1,1,3,3,7,12,12,12
        Arrays.sort(nums);
        //Creating List of Integer
        List<Integer> uniqueInteger=new ArrayList<>();
        
        for(int i=0;i<nums.length-1;i++) {
//          System.out.print(nums[i] + " ");
            if(nums[i]==nums[i+1]&&!uniqueInteger.contains(nums[i])) {
                uniqueInteger.add(nums[i]);
            }
        
        }
        
        System.out.println(uniqueInteger);
        
        for(Integer num:uniqueInteger) {
            System.out.print(num+" ");
        }

	}

}
