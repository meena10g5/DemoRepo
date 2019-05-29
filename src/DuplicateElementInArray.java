import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementInArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[]= {"java", "python","ruby", "java","Ruby"};
		
		Set<String> hs =new HashSet<String>();
		for(String name:names)
		{
			if(hs.add(name)==false) {
System.out.println("duplicate element is - "+name);			}
		}
		Iterator it= hs.iterator();
		System.out.println(it.next());
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("**************************************");
	Map<String, Integer> storeMap= new HashMap<String, Integer>();
	for(String name: names) {
		Integer count =storeMap.get(name);
		if(count==null)
		{
			storeMap.put(name, 1);
		}
		else {
			
			storeMap.put(name, ++count);
		}
	}
	
	//get the values from this hashmap object
	//to get the value of hashmap you have to use entry set
	Set <Entry<String,Integer>> entrySet=storeMap.entrySet();
	for(Entry<String,Integer> entry:entrySet)
	{
		if(entry.getValue()>1) {
			System.out.println("Duplicate element is - "+ entry.getKey());
		}
		
	}
	}

}
