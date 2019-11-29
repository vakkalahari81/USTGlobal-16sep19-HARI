package array.collections.com;

public class ArrayList2 {
	
	private Object[]a=new Object[5];
	private int p=0;
	public void add(Object e)
	{
		if(p>a.length)throw new IndexOutOfBoundsException();
			Capacity();
	
		a[p++]=e;
	}
	public void display()
	{
		for(int i=0;i<p;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void Capacity()
	{
		Object b[]=new Object[a.length+5];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		a=b;
	}
	public void Add(int pos,Object ele)
	{
		//if(pos>size())throw new IndexOutOfBoundsException();
		
		if(p>=a.length)
			Capacity();
			
		for(int i=size()-1;i>=pos;i--)
		{
			a[i++]=a[i];
		}
		a[pos]=ele;
	}
	public Object get(int pos)
	{
		if(pos>=size())throw new ArrayIndexOutOfBoundsException();
		
		return a[pos];
	}
	
	
	public int size()
	{
		return p;
	}
}
