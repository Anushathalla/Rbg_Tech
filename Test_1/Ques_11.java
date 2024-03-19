package Test_1;

public class Ques_11 
{
	int i = 10;

	public static void main(String[] args) 
	{
		Ques_11  t1 = new Ques_11 ();
		t1.funA();
		System.out.println(t1.i);
	}
	void funA()
	{
		System.out.println(i);
		i=5;
	}

}
