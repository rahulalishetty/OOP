class A{
	private int pnum;
	A(){
		this.pnum=0;
	}
}
class B extends A{
	
}

class Access{
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		System.out.println(b.pnum);
	}
}