interface A
{
	void test(int i, String s1);
}
class M9
{
	public static void main(String[] args) 
	{
		A a1 = (x, y) -> {
							System.out.println("from test:" + x);
							System.out.println("from test:" + y);
						 };
		a1.test(10, "abc");
		System.out.println("done");
	}
}
