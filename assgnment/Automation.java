package week3.day1.assgnment;

public class Automation extends MultipleLanguage implements Language, TestTool {

	public void java() {
		System.out.println("Language Java");
	}

	public void selenium() {
		System.out.println("TestTool Selenium");

	}

	@Override
	public void ruby() {
		System.out.println("Language Ruby");
	}

	public static void main(String[] args) {

		Automation automation = new Automation();
		automation.java();
		automation.selenium();
		automation.ruby();
		automation.python();

	}
}
