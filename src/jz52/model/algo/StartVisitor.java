package jz52.model.algo;

import jz52.model.Game;
import jz52.model.MainMenuState;
import jz52.model.PlayState;

/**
 * the visitor for the game when Starting the game.
 * @author jz52@rice.edu
 *
 */
public class StartVisitor extends AVisitor {

	/**
	 * constructor
	 */
	public StartVisitor() {
		super();
		addCommand(MainMenuState.class, new IVisitorCommand() {
			
			@Override
			public Object apply(Class<?> id, Game game, Object[] ps) {
				return game.setState(new PlayState());
			}
		});
	}
	
	

}
