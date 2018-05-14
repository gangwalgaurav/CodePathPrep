import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;


public class NextGreaterInteger {

	
	   public static ArrayList<Integer> nextGreater(ArrayList<Integer>input) {
	        Stack stack = new Stack();
	        int element, next;
	        ArrayList<Integer> output = new ArrayList<Integer>();
	 	        stack.push(input.get(0));
	        for (int i = 1; i < input.size(); i++) 
	        {
	            next = input.get(i);
	            if (!stack.isEmpty()) 
	            {
	                element = stack.pop();
	                while (element < next) 
	                {
	                	output.add(next);
	                	if (stack.isEmpty() == true)
	                        break;
	                    element = stack.pop();
	                }
	                if (element > next)
	                    stack.push(element);
	            }
	            stack.push(next);
	        }
	        while (!stack.isEmpty()) 
	        {
	            element = stack.pop();
	            next = -1;
            	output.add(next);
	        }
	        return output;
	    }


	
}
class Stack 
{
    int top = -1;
    ArrayList<Integer> items= new ArrayList<Integer>();
    public void push(int x) 
    {
        items.add(x);
        top++;
    }
    int peek() {
   	 if (top == -1) 
            return -1;
        return items.get(top);
   }
    int pop() 
    {
        if (top == -1) 
            return -1;
        return items.remove(top --);
    }
    boolean isEmpty() 
    {
        return top==-1 ? true : false;
    }
}