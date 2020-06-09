package generics;

public class PairUse {

	public static void main(String[] args) {

		Pair<String> p=new Pair<String>("ab","cd");
		p.setFirst("PPP");
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		
		Pair<Integer> q=new Pair<>(1,2);
		System.out.println(q.getFirst());
		System.out.println(q.getSecond()); 
	}

}
