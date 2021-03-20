class UndergroundSystem {
    HashMap<Integer,Event> arrivals;
    HashMap<String,Avaerage> averages;
    public UndergroundSystem() {
       arrivals=new HashMap<>();
        averages=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        arrivals.put(id,new Event(id,stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Event arrivalEvent=arrivals.get(id);
        arrivals.remove(id);
        
        int diff=t-arrivalEvent.t;
        String key=arrivalEvent.stationName+","+stationName;
        
        Avaerage average=averages.getOrDefault(key,new Avaerage());
        // averages.containsKey(key)?averages.get(key):new Avaerage();
        average.updateAvaerage(diff);
        
        averages.put(key,average);
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key= startStation+","+endStation;
        return averages.get(key).getAvaerage();
    }
    class Event{
        public int id;
        public String stationName;
        public int t;
        public Event(int id, String stationName, int t){
            this.id=id;
            this.stationName=stationName;
            this.t=t;
        }
    }
    class Avaerage{
        public double totle=0;
        public int count=0;
        public void updateAvaerage(int diff){
            ++count;
            totle+=diff;
        }
        public double getAvaerage(){
            return totle/count;
        }
        
    } 
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */