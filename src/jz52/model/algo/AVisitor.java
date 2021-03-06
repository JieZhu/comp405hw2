package jz52.model.algo;

import java.util.Hashtable;
import java.util.Map;

import jz52.model.Game;

/**
 * Abstract visitor class. 
 * has a function to add command in the visitor.
 * @author jz52@rice.edu
 *
 */
public abstract class AVisitor implements IVisitor {
	
	private Map<Class<?>, IVisitorCommand> commands = new Hashtable<Class<?>, IVisitorCommand>();
	private IVisitorCommand defaultCommand;
	
	

	/**
	 * constructor
	 */
	public AVisitor() {
		super();
		this.defaultCommand = new IVisitorCommand() {
			
			@Override
			public Object apply(Class<?> id, Game game, Object[] ps) {
				throw new UnsupportedOperationException();
			}
		};
	}

	/**
	 * constructor with a default command
	 * @param defaultCommand	--- default command when no right command found
	 */
	public AVisitor(IVisitorCommand defaultCommand) {
		super();
		this.defaultCommand = defaultCommand;
	}

	@Override
	public Object caseAt(Class<?> id, Game game, Object... ps) {
		if(commands.containsKey(id)){
			return commands.get(id).apply(id, game, ps);
		}else{
			return defaultCommand.apply(id, game, ps);
		}
	}
	
	/**
	 * add a command in visitor
	 * @param id	--- the key to find the key	
	 * @param cmd	--- the command
	 */
	public void addCommand(Class<?> id, IVisitorCommand cmd){
		commands.put(id, cmd);
	}
}
