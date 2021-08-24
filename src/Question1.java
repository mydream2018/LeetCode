import java.util.HashMap;

public class Question1 {


    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1};
        System.out.println();
    }

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }

        for(int i=0;i<nums.length;i++){
            int num = target - nums[i];
            if(map.getOrDefault(num,-1)!=-1&&map.getOrDefault(num,-1)!=i){
                return new int[]{i, map.get(num)};
            }
        }
        return new int[]{-1,-1};
    }
}
