package klotski;

import klotski.Board;
import klotski.KlotskiApp;

public class ResetPuzzleController
{
	final KlotskiApp app;
	final Board b;
	
	public ResetPuzzleController(KlotskiApp app, Board b)
	{
		this.app = app;
		this.b = b;
	}

	public void reset()
	{
		b.reset();
		app.getMovesCounter().setText(Integer.toString(b.getMoves()));
		app.getPuzzleView().refresh();
	}
}
