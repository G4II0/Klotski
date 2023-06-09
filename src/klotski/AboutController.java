package klotski;

import javax.swing.JOptionPane;

import klotski.KlotskiApp;

public class AboutController
{
	final KlotskiApp app;
	 AboutController(KlotskiApp app)
	 {
		this.app = app;
	}
	public void about()
	{
		JOptionPane.showMessageDialog(app, 
			/* Message */
			"This application is a simple puzzle game implemented in Java.\n" +
			"The goal is to release the large 2x2 tile from the board\n" +
			"through the opening centered at the bottom of the board. To\n" +
			"select a piece, click on it. Then it can be moved in any\n" +
			"direction with the arroy keys, WASD, HJKL, or the arrow\n" +
			"buttons. You can also move pieces by dragging them across the\n" +
			"board with the mouse.\n" +
			"\n" +
			"Only the large 2x2 tile can leave the board, so you must plan\n" +
			"carefully to complete the puzzle in the fewest moves.\n" +
			"\n" +
			"Author: Joseph Petitti (jppetitti@wpi.edu)\n" + 
			"Date: 2018",

			/* Title */
			"About Klotski Application",

			/* Type. */
			JOptionPane.INFORMATION_MESSAGE);
	}
}
