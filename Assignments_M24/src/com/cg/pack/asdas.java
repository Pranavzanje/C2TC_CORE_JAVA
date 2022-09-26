package com.cg.pack;

 public class asdas extends Exception{
	int detail;
	asdas(int a)
	{
		detail =a;
		
	}
	public String toString()
	{
		return "detail";
		}
}
	 class object{
		public static void compute (int a) throws asdas {
			throw new asdas(a);
		}
public static void main(String args[]) {
		try {
			compute(3);
			
			
		}
		catch(Exception e)
		{
			System.out.print("Exception");
		}
	
	}
}