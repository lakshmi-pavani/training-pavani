package com.jnit;
class Sample<E>{
	//void show(int a) {
	//	System.out.println(a);
      //}
	//void show(float a) {
	//	System.out.println(a);
	//}
	//void show(long a) {
		//System.out.println(a);
	//}
	//void show(String a) {
		//System.out.println(a);
	//}
	//instead of writing the same logic repeated number of time we can directly reuse the generic
	void show(E a) {
		System.out.println(a);
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sample<Integer> s=new Sample<Integer>();
		s.show(100);
		Sample<Double> k=new Sample<Double>();
		k.show(14.3);
		Sample<String> n=new Sample<String>();
		n.show("Hello world");
		Sample x=new Sample();
		x.show(100);
		x.show(12.3);
		x.show("bye");		
	}

}
