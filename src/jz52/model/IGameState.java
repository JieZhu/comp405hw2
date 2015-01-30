package jz52.model;

import jz52.model.Game;
import jz52.model.algo.IVisitor;

/**
 * Game state interface can start the game, exit the game, pause the game, resume the game, restart the game and 
 * fail the game.
 * throw UnsupportedOperationException when the operation is not supported.
 * @author jz52@rice.edu	
 */
public interface IGameState {

	Object execute(Game game, IVisitor algo, Object[] ps);

}
