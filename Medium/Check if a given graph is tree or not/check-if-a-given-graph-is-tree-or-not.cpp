//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


class Matrix
{
public:
    template <class T>
    static void input(vector<vector<T>> &A,int n,int m)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                scanf("%d ",&A[i][j]);
            }
        }
    }
 
    template <class T>
    static void print(vector<vector<T>> &A)
    {
        for (int i = 0; i < A.size(); i++)
        {
            for (int j = 0; j < A[i].size(); j++)
            {
                cout << A[i][j] << " ";
            }
            cout << endl;
        }
    }
};


// } Driver Code Ends
class Solution {
  public:
    void dfs(int i,int vis[],vector<int>adj[]){
        if(vis[i]==1){
            return ;
        }
        vis[i] =1;
        for(auto it:adj[i]){
            dfs(it,vis,adj);
        }
        
    }
    int isTree(int n, int m, vector<vector<int>> &adj) {
        int vis[n]={0};
        vector<int>adj2[n];
        for(int i=0;i<m;i++){
            adj2[adj[i][0]].push_back(adj[i][1]);
            adj2[adj[i][1]].push_back(adj[i][0]);
        }
        int ct =0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                ct++;
                dfs(i,vis,adj2);
            }
        }
        if(ct>1){
            return 0;
        }
        return n-1==m;
    }
};


//{ Driver Code Starts.

int main(){
    int t;
    scanf("%d ",&t);
    while(t--){
        
        int n; 
        scanf("%d",&n);
        
        
        int m; 
        scanf("%d",&m);
        
        
        vector<vector<int>> edges(m, vector<int>(2));
        Matrix::input(edges,m,2);
        
        Solution obj;
        int res = obj.isTree(n, m, edges);
        
        cout<<res<<endl;
        
    }
}

// } Driver Code Ends