package jz52.model.algo;

import jz52.model.Game;

/**
 * visitor command for specific id.
 * @author jz52@rice.edu
 *
 */
public interface IVisitorCommand {

	/**
	 * apply the command( algorithm) to the game host
	 * @param id	--- the key of the game state.
	 * @param game	--- game host	
	 * @param ps	--- parameters
	 * @return object	---current state
	 */
	Object apply(Class<?> id, Game game, Object[] ps);
	
}
