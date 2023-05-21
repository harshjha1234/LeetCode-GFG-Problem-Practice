class Solution {
    public String frequencySort(String s) {
        int ht[][] = new int[300][2];
        for(int i=0;i<300;i++) ht[i][1]=i;
        char str[] = s.toCharArray();
        for(char ch : str){
            ht[(int)ch][0]++;
        }
        Arrays.sort(ht,(a,b)->b[0]-a[0]);
        int i=0,j=0;
        for(int[] f : ht){
            while(f[0]>0){
                f[0]--;
                str[i++]=(char)(f[1]);
            }
        }
        return new String(str);
    }
}