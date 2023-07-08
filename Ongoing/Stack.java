import java.util.Arrays;

class Stack{
	
	int size;
	int top;
	int[] stack;

	Stack(int size){
		this.size = size;
		stack = new int[size];
		top = -1;
	}

	public void push(int number){
		if(top > size-2){
			System.out.println("Stack Overflow");
		}
		else{
			top = top + 1;
			stack[top] = number;
		}
	}

	public String toString(){
		return Arrays.toString(stack);
	}
}