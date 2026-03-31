class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        if(n<2) return -1;
        int left =0, right =n-1;
        int b = n-1;
        int area = Integer.MIN_VALUE;
        int h = Integer.MAX_VALUE;
        while(left<right)
        {
            h=Math.min(height[left],height[right]);
            area = Math.max(area, h*b);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right --;
            }
            b--;
        }
        return area;
        
    }
}
