package jz52.model.algo;

import jz52.model.Game;
import jz52.model.GameOverMenuState;
import jz52.model.MainMenuState;
import jz52.model.PauseMenuState;
import jz52.model.PlayState;
import jz52.model.VictoryState;

/**
 * the visitor for the game when exiting the game.
 * @author jz52@rice.edu
 *
 */
public class ExitGameVisitor extends AVisitor {

	/**
	 * constructor
	 */
	public ExitGameVisitor() {
		super();
		IVisitorCommand cmd = new IVisitorCommand() {
			
			@Override
			public Object apply(Class<?> id, Game game, Object[] ps) {
				return game.setState(new GameOverMenuState());
			}
		};
		addCommand(PauseMenuState.class, cmd);
		addCommand(GameOverMenuState.class, cmd);
		addCommand(MainMenuState.class, cmd);
		addCommand(PlayState.class, cmd);
		addCommand(VictoryState.class, cmd);
	}

	
}
