package ai.jobiak.multithread;

public class Threads {
	
	String name;
	Threads(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i=1;i<5;i++)
			System.out.println(this.name+"#entered run()="+i);
	}
	public void start()
	{
		for(int j=1;j<5;j++)
			System.out.println(this.name+"  "+j);
	}
}
