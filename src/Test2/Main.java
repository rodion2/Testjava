package Test2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		HashSet<Integer> mySet = new HashSet<>();
		HashSet <Integer> mySet2 = new HashSet<>();
		
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		addingMethod(x,mySet);
		int y=in.nextInt();
		addingMethod(y,mySet2);
		
		System.out.println(union(mySet,mySet2));
		
		System.out.println(interception(mySet,mySet2));
		

	}
	
	public static void addingMethod(int x,Set<Integer> a){
			while(x > 0){
						a.add(x%10);
						x/=10;
						} 
	}
	
	public static Set<Integer> union(Set<Integer> a, Set<Integer> b)
	{
		Set<Integer> union = new HashSet<>();
		union.addAll(a);
		union.addAll(b);
		return (union);
	}
	
	public static HashSet<Integer> interception(HashSet<Integer> a, HashSet<Integer> b)
	{
		HashSet<Integer> interceptor = new HashSet<>();
		
		Iterator <Integer>iter = a.iterator();
		
		while (iter.hasNext())
		{
			Integer temp =iter.next(); 
			if(b.contains(temp))
			{
				interceptor.add(temp);
			}
		}
		
		return (interceptor);
	}

}
