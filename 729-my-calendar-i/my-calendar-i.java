class MyCalendar {
    TreeMap<Integer,Integer>m;
    public MyCalendar() {
        m=new TreeMap<>();
    }
    
    public boolean book(int s, int e) {
        if(m.isEmpty()){
            m.put(s,e);
            return true;
        }
        Map.Entry<Integer,Integer>f=m.floorEntry(s);
        if(f!=null&&f.getValue()>s){
            return false;
        }
        Map.Entry<Integer,Integer>c=m.ceilingEntry(s);
        if(c!=null&&c.getKey()<e){
            return false;
        }
        m.put(s,e);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */