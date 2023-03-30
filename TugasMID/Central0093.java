interface A{ public void aaa();}
interface B extends A{
	public void aaa();
}
class Central0093 implement A,B{
	public void aaa(){
		System.out.println("aaa");

}
public static void main(String[] args){
		System.out.println("main");
		this.aaa();
	}

}