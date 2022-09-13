import java.util.ArrayList;
import java.util.Iterator;


	public class Demo2 {
		 public static void main(String []args)
		 {
			ArrayList al = new ArrayList(); 
			 al.add(11);
			 al.add(22);
			 al.add("ganesh");
			 al.add("raut");
			 
			 Iterator itr = al.iterator();
			 while(itr.hasNext())
			 {
				System.out.println(itr.next()) ;
				 
			 }
			  System.out.println(al);
			 
			 
		 }
		}


