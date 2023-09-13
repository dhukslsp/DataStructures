class Listnode{
	int val;
	Listnode next;
	public Listnode(int val){
		this.val = val;
	}
}
public class linkedlist{
	public static void main(String args[]){
		Listnode obj = new Listnode(10);
		Listnode obj2 = new Listnode(15);
		obj.next = obj2;
		//traversing and printing the linkes list
		Listnode current = obj;
		while(current!=null){
			System.out.print(current.val);
			System.out.print(" ");
			current = current.next;
		}
	}
}