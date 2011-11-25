package test;

public class HelloWorldTest01 {
	public static void main(String[] args) {
		new HelloWorldTest01().execute();
		new HelloWorldTest01().execute2();
	}

	private void execute() {
		System.out.println("Hello Git!");
	}

	private void execute2() {
		System.out.println("Hello Git2!");
	}
}
