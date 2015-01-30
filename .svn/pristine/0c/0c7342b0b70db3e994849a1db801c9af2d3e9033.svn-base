package jz52.model;

import jz52.model.algo.IVisitor;

/**
 * Pause Menu State. 
 * throw UnsupportedOperationException when the operation is not supported.
 * @author jz52@rice.edu	
 *
 */
public class PauseMenuState implements IGameState {
	
	/**
	 * previous state before pausing the game
	 */
	private IGameState _pre;
	
	/**
	 * constructor: give the previous state as a parameter.
	 * @param _pre
	 */
	public PauseMenuState(IGameState _pre) {
		this._pre = _pre;
	}

	public IGameState getPre() {
		return _pre;
	}

	@Override
	public String toString() {
		return "Pause Menu State";
	}
	
	@Override
	public Object execute(Game game, IVisitor algo, Object[] ps) {
		return algo.caseAt(this.getClass(), game, ps);
	}
	

}
