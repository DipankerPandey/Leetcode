class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        
        ArrayList<ArrayList<Integer>> adjList = createConnections(n,connections);
        List<List<Integer>> ans = new ArrayList<>();

        int[] disc = new int[n];
        int[] low = new int[n];
        int[] time =new int[n];

        dfs(0,-1,adjList, disc, low, time, ans);

        return ans;

    }

    private void dfs(int node, int parent, ArrayList<ArrayList<Integer>> adjList, int[] disc, int[] low, int[] time, List<List<Integer>> ans)
    {
        low[node]=disc[node]=time[0]++;

        for(int adj: adjList.get(node))
        {
            if(adj==parent) continue;

            if(disc[adj]==0)
                dfs(adj, node, adjList, disc, low, time, ans);

            low[node]=Math.min(low[node],low[adj]);
        }

        if(parent!=-1 && low[node] > disc[parent])
            ans.add(new ArrayList(){
                {
                    add(parent); 
                    add(node);
                }
            });
    }

    private ArrayList<ArrayList<Integer>> createConnections(int n, List<List<Integer>> edges)
    {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList();

        for(int i=0; i<n; i++)
            adjList.add(new ArrayList());

        for(List<Integer> edge: edges)
        {
            int u= edge.get(0);
            int v= edge.get(1);
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        return adjList;
    }

}