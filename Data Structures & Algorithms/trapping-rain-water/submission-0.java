class Solution {
    public int trap(int[] height) {
        int size = height.length;
        if(size == 0 || height == null) return -1;
        int left =0,right=size -1;
        int maxl=0,maxr=0,count=0;
        while(left<right)
        {
            if(height[left]<height[right])
            {
                if(height[left]>=maxl)
                {
                    maxl = height[left];
                }
                else
                {
                    count += maxl-height[left];
                }
                left++;
            }
            else
            {
                if(height[right]>=maxr)
                {
                    maxr=height[right];
                }
                else
                {
                    count += maxr-height[right];
                }
                right--;
            }
        }
        return count;
    }

}
