interface inter1{
	public void interfacefun1();
}
interface inter2{
	public void interfacefun2();
}

abstract class ImplementInterface implements inter1,inter2{
	public void interfacefun1(){
		System.out.println("message from interface method 1");
	}
	public void interfacefun2(){
		System.out.println("message from interface method 2");
	}
	public void fun(){
		System.out.println("message from fun method");
	}
}

public class Interface extends ImplementInterface{
	public static void main(String args[]){
		Interface ii=new Interface();
		ii.interfacefun1();
		ii.interfacefun2();
		ii.fun();
	}
}