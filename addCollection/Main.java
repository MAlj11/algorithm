package addCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 给你两个集合，要求{A} + {B}。 注：同一个集合中不会有两个相同的元素。 
 * @author MA
 *
 */
public class Main {

	public static Set<Integer> collectionAdd(List<Integer> a,List<Integer> b){
		Set<Integer> result = new TreeSet<>();
		
		for(int i=0;i<a.size(); i++){
			result.add(a.get(i));
		}
		for(int i=0;i<b.size();i++){
			result.add(b.get(i));
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		String s1 = sc1.nextLine();
		String s2 = sc2.nextLine();
		String s3 = sc3.nextLine();
		
		String[] s22 = s2.trim().split(" ");
		String[] s33 = s3.trim().split(" ");
		
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		for(int i=0;i<s22.length;i++){
			a.add(Integer.parseInt(s22[i]));
		}
		for(int i=0;i<s33.length;i++){
			b.add(Integer.parseInt(s33[i]));
		}
		Set<Integer> result = collectionAdd(a,b);
		for(Integer s:result){
			System.out.print(s+" ");
		}
	}
}
