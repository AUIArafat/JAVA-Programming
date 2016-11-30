import java.util.*;
import java.util.Map.Entry;
 
public class MyMeritPosition {
 
    public static void main(String args[]){
    	int N;
    	int count;
    	String name = null;
    	double value = 0;
    	Scanner in = new Scanner(System.in);
    	N = in.nextInt();
    	count = N;
    	Map<String, Double> map = new HashMap<String, Double>();;
    	Set<Entry<String, Double>> set = null;
    	List<Entry<String, Double>> list = null;
    	while(N!=0){
    		name = in.next();
    		value = in.nextDouble();
	        map.put(name, value);
	        --N;
    	}
    	set = map.entrySet();
        list = new ArrayList<Entry<String, Double>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Double>>()
        {
			public int compare(Entry<String, Double> o1,Entry<String, Double> o2) {
				// TODO Auto-generated method stub
				return (o2.getValue()).compareTo( o1.getValue() );
			}
        } );
        int i = 1;
        while(i<count){
        	for(Entry<String, Double> entry:list){
        		System.out.println(i + "."+entry.getKey());
        		++i;
        }
        }
    }
}