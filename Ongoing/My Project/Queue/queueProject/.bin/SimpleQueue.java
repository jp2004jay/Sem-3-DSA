//package queueProject;

import java.util.Scanner;

class SimpleQueueDemo{
	int front;
	int rare;
	int[] queue;

	SimpleQueueDemo(int size){
		queue = new int[size];
		front = 0;
		rare = -1;
	}

	public void enqueue(int number){
		if(isFull()){
			System.out.println("Queue is Full");
		}
		else{
			
			queue[++rare] = number;
		}
	}

	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return 0;
		}
		else{
			return queue[front++];
		}
	}

	public int peek(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return 0;
		}
		else{
			return queue[front];
		}
	}

	public boolean isFull(){
		if(front-1 == rare){
			front = 0;
			rare = -1;
		}
		return (queue.length-1 == rare);
	}

	public boolean isEmpty(){
		return (front-1 == rare);
	}

	public void printQueue(){
		System.out.print("\n[");
		for(int i=front; i<=rare; i++){
			System.out.print(queue[i]+" , ");
		}
		System.out.print("]\n");
	}

	public void reverse(){
		int dec = 0;
		for(int i=front; i<=rare/2; i++){
			int temp = queue[i];
			queue[i] = queue[rare-dec];
			queue[rare-dec] = temp;
			dec++;
		}
		printQueue();
	}
}

public class SimpleQueue{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of queue");
		int size = sc.nextInt();

		SimpleQueueDemo queue = new SimpleQueueDemo(size);

		while(true){
			
			System.out.println("A. For Enqueue \nB. For Dequeue \nC. For Print Queue \nE. For Exit");
			char check = sc.next().charAt(0);

			switch(check){
			case 'A':
			case 'a':
				System.out.println("Enter Data For Insert");
				int data = sc.nextInt();
				queue.enqueue(data);
				break;
			case 'B':
			case 'b':
				queue.dequeue();
				break;
			case 'C':
			case 'c':
				queue.printQueue();
				break;
			case 'E':
			case 'e':
				System.exit(0);
				break;
			default:
				System.out.println("Enter Valid Inputs");
			}
		}

	}
}