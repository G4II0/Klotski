package klotski;

import klotski.Board;
import klotski.KlotskiApp;

public class Main
{
	public static void main(String[] args)
	{
		Board b = new Board();

		KlotskiApp app = new KlotskiApp(b);
		
		app.setVisible(true);
	}
}
