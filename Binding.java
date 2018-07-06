
public class Binding{
	static class classA{
		public void display(){
			System.out.println("from classA");
		}
	}
	static class classB extends classA{
		public void display(){
			System.out.println("from classB");
		}
	}
	public static void main(String args[]){
		classA a=new classA();
		classB b=new classB();
		a.display();
		b.display();
	}
}