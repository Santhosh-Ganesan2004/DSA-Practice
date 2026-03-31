class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        for(int i: nums)
        {
            set.add(i);
        }

        for(int num : set)
        {
            if(!set.contains(num-1))
            {
                int n = num;
                int streak =1;
                while(set.contains(n+1))
                {
                    n++;
                    streak++;
                }
                l= Math.max(l,streak);
            }
            
        }
        return l;
        
    }
}
