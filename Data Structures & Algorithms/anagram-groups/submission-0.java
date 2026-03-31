class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs)
        {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String ans = new String(chars);

            if(!map.containsKey(ans))
            {
                map.put(ans, new ArrayList<>());
            }
            map.get(ans).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String[] strs = new String[l];
        for(int i=0;i<l;i++)
        {
            strs[i] = sc.nextLine();
        }

        List<List<String>> ans = groupAnagrams(strs);
        for(List<String> s: ans)
        {
            System.out.print(s);
        }
    }
}
