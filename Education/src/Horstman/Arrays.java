package Horstman;

public class Arrays {
	public static void main(String... args){
		/*
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++){
			a[i] = i;
			System.out.println(a[i]);
		}
		
		String[] cities = new String[5];
		*/
		
		//array initialization + fill
		int[] numbers = {0, 3, 4, 7, 12, 8};
		
		//anonymous array for re-initialization
		numbers = new int[] {1, 3, 5, 7, 9};
		
		for(int j : numbers){
			System.out.println(j);
		}

	}

}
