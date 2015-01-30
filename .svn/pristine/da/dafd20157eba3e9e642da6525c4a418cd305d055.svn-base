package jz52.model;

import jz52.model.Game;
import jz52.model.algo.IVisitor;

/**
 * Main menu state is the state when first entering the game.
 * throw UnsupportedOperationException when the operation is not supported.
 * @author jz52@rice.edu	
 *
 */
public class MainMenuState implements IGameState {
	
	/**
	 * singleton
	 */
	public static MainMenuState Singleton = new MainMenuState();

	public MainMenuState() {

	}
	
	@Override
	public String toString() {
		return "Main Menu State";
	}
	
	@Override
	public Object execute(Game game, IVisitor algo, Object[] ps) {
		return algo.caseAt(this.getClass(), game, ps);
	}
}
