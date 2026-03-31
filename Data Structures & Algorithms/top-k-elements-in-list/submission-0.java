class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
        {
            map.put(i,map.getOrDefault(i, 0) +1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() -b.getValue());
        for(Map.Entry<Integer, Integer> v: map.entrySet())
        {
            pq.offer(v);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }

        int [] sol = new int[k];
        int ind =0;
        while(!pq.isEmpty())
        {
            sol[ind++]=pq.poll().getKey();
        }

        return sol;
    }

    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int k = sc.nextInt();
        int[] sol = topKFrequent(arr, k);
        for(int i=0;i<sol.length;i++)
        {
            System.out.println(sol[i]);
        }
    }
}
