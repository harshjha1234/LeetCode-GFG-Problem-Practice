class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return b[0]-a[0];
        });
        ArrayList<int[]> res= new ArrayList<>();
        for(int[] person: people){
            res.add(person[1], person);
        }
        return res.toArray(new int[people.length][2]);
    }
}