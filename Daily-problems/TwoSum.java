import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for (int i=0;i<nums.length;i++) {
            if (!map.containsKey(target-nums[i])) {
                map.put(nums[i],i);
            } else {
                result[0] = i;
                result[1] = map.get(target-nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4};
        int target = 3;
        int[] res = twoSum(nums,target);
        for (int i : res) {
            System.out.println(i);
        }
    }

}
