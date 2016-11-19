package _CH3.QueueUsingLinklist;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue<Integer> q = new Queue<>();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		
		System.out.println(q);
		
		System.out.println(q.deQueue().data);
		System.out.println(q.deQueue().data);
		System.out.println(q.deQueue().data);
	}

}
