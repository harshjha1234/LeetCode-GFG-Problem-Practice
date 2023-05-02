class MyCalendarThree {
    TreeMap<Integer, Integer> tm;
    public MyCalendarThree() {
        tm = new TreeMap<>();
    }
    public int book(int s, int e) {
        tm.put(s, tm.getOrDefault(s, 0)+1);
        tm.put(e, tm.getOrDefault(e, 0)-1);
        int max = 0, count = 0;
        for(int val: tm.values()){
            max = Math.max(max, count += val);
        }
        return max;
    }
}
/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */