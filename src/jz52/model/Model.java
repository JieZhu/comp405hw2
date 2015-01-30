package jz52.model;

import jz52.model.algo.ExitGameVisitor;
import jz52.model.algo.PauseVisitor;
import jz52.model.algo.RestartVisitor;
import jz52.model.algo.ResumeVisitor;
import jz52.model.algo.StartVisitor;
import jz52.model.algo.WinVisitor;

/**
 * the model class of the system. Model can start game, exit
 * game, pause game, resume game and restart game, in addition to
 * let the view to update the display text.
 * @author jz52@rice.edu
 */
public class Model {
	
	/**
	 * model to view adaptor.
	 */
	private IModel2ViewAdaptor _view;
	
	/**
	 * game instance. initiate a game object.
	 */
	private Game game = new Game();

	/**
	 * constructor of Model. take a model-to-view adaptor as 
	 * an input parameter.
	 * @param _view	--- model-to-view adaptor.
	 */
	public Model(IModel2ViewAdaptor _view) {
		this._view = _view;
	}

	/**
	 * start the model.
	 */
	public void start() {
		
	}

	/**
	 * start the game.
	 */
	public void startGame() {
		game.execute(new StartVisitor());
		updateState();
	}

	/**
	 * exit the game
	 */
	public void exitGame() {
		game.execute(new ExitGameVisitor());
		updateState();
	}

	/**
	 * pause the game when playing
	 */
	public void pauseGame() {
		game.execute(new PauseVisitor());
		updateState();
	}

	/**
	 * resume the game from pause game menu
	 */
	public void resumeGame() {
		game.execute(new ResumeVisitor());
		updateState();
	}

	/**
	 * restart the game from game over menu
	 */
	public void restartGame() {
		game.execute(new RestartVisitor());
		updateState();
	}
	
	/**
	 * win the game when playing game
	 */
	public void winGame() {
		game.execute(new WinVisitor());
		updateState();
	}
	
	/**
	 * uodate the display label in view
	 */
	public void updateState(){
		_view.update(game.toString());
	}

	
}
