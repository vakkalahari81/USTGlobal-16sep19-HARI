package linkedlist;

public class Linkedlist {
	
	private Node first=null;
	private int c=0;
   public void add(Object e)
   {
	  if(first==null)
	  {
		first=new Node(e,null);
		c++;
		System.out.println(c);
	  }
		Node last=first;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=new Node(e,null);
		c++;
  }
public void display()
{
	if(c==0)
	{
		System.out.println("List is Empty");
		System.out.println(first);
	}
	else
	{
		Node t=first;
		while(t!=null)
		{
			System.out.println(t.e);
			t=t.next;
		}
	}
}
public void Add(Object e,int pos)
{
	if(pos==0)
	{
		first=new Node(e,first);
		c++;
	}
	else
		
	{
		Node p=first;
		for(int i=1;i<pos;i++)
		{
			p=p.next;
		}
		p.next=new Node(e,p.next);
		c++;
	}
	
}
public int size()
{
	return c;
}
public void remove(int pos)
{
	if(pos>=size())throw new IndexOutOfBoundsException();
	if(pos==0)
	{
		first=first.next;
		c--;
	}
	else
	{
		Node n=first;
		for(int i=1;i<pos;i++)
		{
			n=n.next;
		}
		n.next=n.next.next;
	}
}
public void clear()
{
	first=null;
	c=0;
}
public String toString()
{
	if(size()==0)
		return "[]";
	
	String s="["+first.e;
		Node n=first;
		while(n.next!=null)
		{
			n=n.next;
			 
			s+=","+n.e;
		}
		s+="]";
		return s;
}
}
