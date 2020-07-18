class Solution {
public:
    bool topoCycle(int src, vector<vector<int>> &graph, vector<bool> &vis, vector<bool> &myPath, vector<int> &ans)
{
    vis[src] = myPath[src] = true;
    bool isCycle = false;
    for (int e : graph[src])
    {
        if (!vis[e])
            isCycle = isCycle || topoCycle(e, graph, vis, myPath, ans);
        else if (myPath[e])
            return true;
    }

    myPath[src] = false;
    ans.push_back(src);
    return isCycle;
}

vector<int> findOrder(int numCourses, vector<vector<int>> &prerequisites)
{

    int N = numCourses;
    vector<vector<int>> graph(N, vector<int>());

    for (vector<int> &ar : prerequisites)
        graph[ar[0]].push_back(ar[1]);

    vector<bool> vis(N, false);
    vector<bool> myPath(N, false);
    vector<int> ans;

    bool isCycle = false;
    for (int i = 0; i < N; i++)
        if (!vis[i])
            isCycle = isCycle || topoCycle(i, graph, vis, myPath, ans);

    if (isCycle)
        ans.clear();

    return ans;
}
};
