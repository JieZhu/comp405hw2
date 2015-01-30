package jz52.model;

import jz52.model.algo.IVisitor;

/**
 * victory State.
 * throw UnsupportedOperationException when the operation is not supported.
 * @author jz52@rice.edu
 *
 */
public class VictoryState implements IGameState {

	@Override
	public String toString() {
		return "Victory State";
	}
	
	@Override
	public Object execute(Game game, IVisitor algo, Object[] ps) {
		return algo.caseAt(this.getClass(), game, ps);
	}
}
