class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())return false;
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<s1.length();i++)Arrays.fill(dp[i],-1);
        return f(0,0,0,s1,s2,s3,dp);
    }
    boolean f(int i,int j,int k,String s1, String s2, String s3,int[][] dp){
        if(i==s1.length() && j==s2.length() && k==s3.length())return true;
        if(i>=s1.length() && j>=s2.length() )return false;
        if(k>=s3.length())return false;
        if(i<s1.length() && j<s2.length() && dp[i][j]!=-1)return dp[i][j]==1;
        boolean ans=false;
        if(i<s1.length() && j<s2.length() && s1.charAt(i)==s3.charAt(k) && s2.charAt(j)==s3.charAt(k)){
            ans |= f(i+1,j,k+1,s1,s2,s3,dp) || f(i,j+1,k+1,s1,s2,s3,dp);
        }else if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
             ans |= f(i+1,j,k+1,s1,s2,s3,dp);
        }else if(j<s2.length() &&  s2.charAt(j)==s3.charAt(k)){
             ans |=  f(i,j+1,k+1,s1,s2,s3,dp);
        }
        if(i<s1.length() && j<s2.length() && ans){
            dp[i][j]=1;
        }else{
            dp[i][j]=0;
        }
        return ans;
    }
}