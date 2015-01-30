package jz52.model;

import jz52.model.algo.IVisitor;

/**
 * Game Over Menu State implementing IGameState.
 * throw UnsupportedOperationException when the operation is not supported.
 * @author jz52@rice.edu	
 */
public class GameOverMenuState implements IGameState {

	@Override
	public String toString() {
		return "Game Over Menu State";
	}


	@Override
	public Object execute(Game game, IVisitor algo, Object[] ps) {
		return algo.caseAt(this.getClass(), game, ps);
	}
	
	

}
