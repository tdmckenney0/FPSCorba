import FPSCorba.*;
import org.omg.CosNaming.*;
import org.omg.PortableServer.*;
import org.omg.CORBA.*;
import java.util.ArrayList;

/**
 * FPSCorba Group Project Server Implementation
 * @author Dan Herold
 * @version 2014.5.6
 */
 public class ServerImpl extends ServerPOA{
	//list of connected clients
	private ArrayList<Listener> clients;
	//maybe we need a control thread?
	
	/**
	 * Constructor for the implementation of the server methods
	 */
	public ServerImpl(){
		clients = new ArrayList<>();
	}
	
	/**
	 * Process incoming requests for a game
	 *	@param l the listener for the players, signaling a new player connecting
	 */
	public void requestConnect(Listener l){
		System.out.println("A player has connected...");
		clients.add(l);
	}
	
	/**
	 * Update player health table
	 */
	public void updateTables(){
		
	}
	
	/**
	 * Send the weapon pool to players
	 */
	public ArrayList<String> sendWeapPool(){
		
	}
	
	/**
	 * Send the shield pool to players
	 */
	public ArrayList<String> sendShieldPool(){
		
	}
	
	/**
	 * When a player chooses a weapon, this weapon will be taken away from all other
	 * players
	 */
	public String removeWeapon(){
		
	}
	
	/**
	 * When a player chooses a shield, this shield will be taken away from all other
	 * players
	 */
	 public String removeShield(){
		
	 }
 }