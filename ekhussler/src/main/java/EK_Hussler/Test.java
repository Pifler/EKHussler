package EK_Hussler;

public class Test {

	public static void main(String[] args) {
		Hussler H1 = new Hussler("bernhard-pitsch@web.de","Sonne101");
		Website wb = new Website();
		H1.getChromeDriver().get(wb.getUrl());
	}
}
