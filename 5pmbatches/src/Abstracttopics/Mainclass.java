package Abstracttopics;

abstract class Tester {
	abstract void cool();

	abstract void test();
}

abstract class Sample extends Tester {
	void cool() {
		System.out.println("Hey i am cool");
	}
}

class Sample1 extends Sample {
	void test() {
		System.out.println("Hey i am test");
	}
}

class Mainclass {
	public static void main(String[] args) 
	{
		Sample1 s1 = new Sample1();
		s1.cool();
		s1.test();
	}
	
	class Democlass
	{
		
	}
	
	class demo
	{
		public void dummy()
		{
			System.out.println("Hey i am test");
		}
	}
}
