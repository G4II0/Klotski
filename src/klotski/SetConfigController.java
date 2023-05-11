package klotski;

import klotski.Board;
import klotski.KlotskiApp;

public class SetConfigController
{
	KlotskiApp app;
	Board b;
	
	public SetConfigController(KlotskiApp app, Board b)
	{
		this.app = app;
		this.b = b;
	}
	
	public void setConfig(int number)
	{
		b.setConfig(number);
		b.reset();
		app.getPuzzleView().refresh();
		app.getMovesCounter().setText(Integer.toString(b.getMoves()));
	}
}
