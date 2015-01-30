package jz52.model.algo;

import jz52.model.Game;
import jz52.model.PlayState;
import jz52.model.VictoryState;

/**
 * the visitor for the game when successfully finishing the game.
 * @author jz52@rice.edu
 *
 */
public class WinVisitor extends AVisitor {

	/**
	 * constructor
	 */
	public WinVisitor() {
		super();
		addCommand(PlayState.class, new IVisitorCommand() {
			
			@Override
			public Object apply(Class<?> id, Game game, Object[] ps) {
				return game.setState(new VictoryState());
			}
		});
	}
	

}
