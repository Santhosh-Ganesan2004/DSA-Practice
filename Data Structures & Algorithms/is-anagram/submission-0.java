class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] feq = new int[26];
        for(int i =0;i<s.length();i++)
        {
            feq[s.charAt(i) - 'a']++;
            feq[t.charAt(i) - 'a']--;
        }

        for(int c: feq)
        {
            if(c != 0)
            {
                return false;
            }
        }
        return true;
    }

    public void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(isAnagram(s,t));
    }
}
