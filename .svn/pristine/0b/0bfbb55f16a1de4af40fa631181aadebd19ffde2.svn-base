package jz52.model;

import jz52.model.algo.IVisitor;

/**
 * play state.
 * throw UnsupportedOperationException when the operation is not supported.
 * @author jz52@rice.edu
 */
public class PlayState implements IGameState {

	@Override
	public String toString() {
		return "Play State";
	}
	
	@Override
	public Object execute(Game game, IVisitor algo, Object[] ps) {
		return algo.caseAt(this.getClass(), game, ps);
	}

}
