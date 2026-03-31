class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int num: nums)
        {
            int feq = map.getOrDefault(num, 0)+1;
            if(feq>1)
            {
                return true;
            }
            map.put(num,feq);
        }
        return false;
    }
    public void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i =0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(hasDuplicate(nums));
    }
}