import java.util.*;
class arraycopy{
    public static void main(String[]args){
        int[] nums={10,3,4,5};
        int[] num1=Arrays.copyOf(nums,nums.length);
        System.out.println(Arrays.toString(num1));
    }
}