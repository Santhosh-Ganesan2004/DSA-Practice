class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1= s1.length();
        int n2=s2.length();
        if(n1>n2) return false;
        int left =0;
        int[] fcount = new int[26];
        int[] s2count = new int[26];
        for(int i =0;i<n1;i++)
        {
            fcount[s1.charAt(i)-'a']++;
        }

        for(int right=0;right<n2;right++)
        {
            s2count[s2.charAt(right)-'a']++;
            if(right-left+1>n1)
            {
                s2count[s2.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(s2count,fcount))
            {
                return true;
            }
            

        }
        return false;
          
    }
}
