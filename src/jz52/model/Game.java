package jz52.model;

import jz52.model.algo.IVisitor;

/**
 * simulated-game class. The game can be started, exit, 
 * paused, resumed and restarted.
 * @author jz52@rice.edu
 */
public class Game {
	
	/**
	 * game state.
	 */
	private IGameState _state;

	/**
	 * Constructor: instantiate the game state with the Main menu state.
	 */
	public Game() {
		super();
		this._state = MainMenuState.Singleton;
	}
	
	@Override
	public String toString() {
		return _state.toString();
	}
	
	/**
	 * get the current game state
	 * @return the game state
	 */
	public IGameState getState() {
		return _state;
	}

	/**
	 * set the state of the game
	 * @param _state --- new state to be set
	 * @return current game state
	 */
	public IGameState setState(IGameState _state) {
		this._state = _state;
		return _state;
	}

	public Object execute(IVisitor algo, Object... ps){
		return this._state.execute(this, algo, ps);
	}
}
