class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] sol = twoSum(nums, t);
        for(int i = 0;i<sol.length;i++)
        {
            System.out.println(sol[i]);
        }
    }

}
