package ai.jobiak.multithread;

public class ExceptionDemo {
		void stringException(){
		try{
			String a=null;
			System.out.println(a.length());
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
		void intException(){
		try{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	
		void indexException(){
		try{
			String sentence="I am good";
			System.out.println(sentence.charAt(9));
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	

		public static void main(String args[]){
		ExceptionDemo obj=new ExceptionDemo();
		obj.stringException();
		obj.intException();
		obj.indexException();
	}
}
