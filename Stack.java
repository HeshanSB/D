\\Stack in java
import java.util.*;
class Stack{
	ArrayList al = new ArrayList();
	public void push(int num){
		al.add(0,num);
	}
	public void pop(){
		al.remove(0);
	}
	public void peek(){
		System.out.println(al.get(0));
	}
	public boolean isEmpty(){
		System.out.println(al.isEmpty());
		return al.isEmpty();
	}
	public void size(){
		System.out.println(al.size());
	}
	
	public static void main(String args[]){
		Stack s = new Stack();
		s.push(9);
		s.push(3);
		s.push(5);
		s.push(8);
		s.push(2);
		s.size();
		s.peek();
		s.isEmpty();
		s.pop();
		s.peek();
		s.size();
	}
}
