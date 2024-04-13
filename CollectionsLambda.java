package Lamdba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;
class Emp{
	private int id;
	private String name;
	private double sal;
	
	public Emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
public class CollectionsLambda {

	public static void main(String[] args) {

		Integer [] arr= {1,5,3,7,2};
		
		List<Integer> al= Arrays.asList(arr);
		
//		al.forEach((num)->{
//			System.out.println(num);
//		}
//		);
		
//		List<Emp> l=new ArrayList<Emp>();
//		l.add(new Emp(1,"nag",25000));
//		l.add(new Emp(2,"om",35000));
//		l.add(new Emp(3,"vijay",30000));
//		l.add(new Emp(4,"vardan",35000));
//		l.add(new Emp(5,"koti",33000));
////		
//		Collections.sort(l,(o1,o2) -> (int)(o1.getSal()-o2.getSal()));
//		l.sort((e1,e2)-> (int)(e1.getSal() - e2.getSal()));
//
//		l.forEach((e)->{
//		System.out.println(e);
//		});
//		Queue<Emp> l=new PriorityQueue<Emp>((o1,o2)-> (int)(o1.getSal()-o2.getSal()));
//		l.add(new Emp(1,"nag",25000));
//		l.add(new Emp(2,"om",35000));
//		l.add(new Emp(3,"vijay",30000));
//		l.add(new Emp(4,"vardan",35000));
//		l.add(new Emp(5,"koti",33000));
		
//		Collections.sort((l) -> (int)(l.getSal()-l.getSal()));
		
//		TreeSet<Emp> l=new TreeSet<Emp>(((o1,o2)-> (int)(o1.getSal()-o2.getSal())));
//		l.add(new Emp(1,"nag",25000));
//		l.add(new Emp(2,"om",35000));
//		l.add(new Emp(3,"vijay",30000));
//		l.add(new Emp(4,"vardan",35000));
//		l.add(new Emp(5,"koti",33000));
//		l.forEach((e)->{
//			System.out.println(e);
//		});
	}

}
