package jz52.model.algo;

import jz52.model.Game;
import jz52.model.PauseMenuState;
import jz52.model.PlayState;

/**
 * the visitor for the game when pausing the game.
 * @author jz52@rice.edu
 *
 */
public class PauseVisitor extends AVisitor {

	/**
	 * constructor
	 */
	public PauseVisitor() {
		super();
		addCommand(PlayState.class, new IVisitorCommand() {
			
			@Override
			public Object apply(Class<?> id, Game game, Object[] ps) {
				return game.setState(new PauseMenuState(game.getState()));
			}
		});
	}
	
	
	

}
