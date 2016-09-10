package paul.mainplugin.carter;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.GameMode;
import org.bukkit.Server;
import org.bukkit.Server.Spigot;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class ServerCore extends JavaPlugin{

	
	
	
	private static final String uuid = null;
	Server server = Server (Bukkit.getServer());
	Player player = Player (Bukkit.getPlayer(""));
	Logger logger = Logger (Bukkit.getLogger());
	
	
	
	
	public void onEnable(){
	getLogger().info("ServerCore2 Enabled");
	getLogger().info("Sv2 Enabled!");
	
	}	
	
	private Logger Logger(Logger logger2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Player Player(Player player2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Server Server(Server server2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void onDisable(){
		getLogger().info("Servercore2 Disabled");
		getLogger().info("I told you! but you couldnt listen OH NO its just a harmless little rabbit!");
		
		
	}

	
	
	
	
	

	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("sv2")) {
			if(sender instanceof Player){
				

				sender.sendMessage(ChatColor.BLUE + "ServerCore2");
				sender.sendMessage("Developed By: Paulcash");
				sender.sendMessage("Servercore2 is a plugin made for everything, its meant to be the core of your server");
				sender.sendMessage("Stage: Alpha");
				sender.sendMessage("Core Version: 2.5.2");
				
				
			}else{
				
	logger.info("Error, Run In-Game");
	
	
				
				
	
			}
		}
		if (cmd.getName().equalsIgnoreCase("debug")) {
			if(sender instanceof Player){
				sender.sendMessage("Server DeBug-Info:");
				sender.sendMessage("ID: " + Bukkit.getServerId());
				sender.sendMessage("AMB Spawn Limit: " + server.getAmbientSpawnLimit());
				sender.sendMessage("Connection THROTTLE: " + server.getConnectionThrottle());
				sender.sendMessage("AML Spawn Limit: " + server.getAnimalSpawnLimit());
				sender.sendMessage("BUK/SPI Version: " + server.getBukkitVersion());
				sender.sendMessage("IDL Timeout: " + Bukkit.getIdleTimeout());
				sender.sendMessage("IP Address: " + Bukkit.getIp());
				sender.sendMessage("MAX Players: " + Bukkit.getMaxPlayers());
				sender.sendMessage("HOS Spawn Limit: " + Bukkit.getMonsterSpawnLimit());
				sender.sendMessage("NAME: " + Bukkit.getName());
				sender.sendMessage("Main port: " + Bukkit.getPort());
				sender.sendMessage("SHT Message: " + Bukkit.getShutdownMessage());
				sender.sendMessage("Game Version: " + Bukkit.getVersion()t);
				sender.sendMessage("WLD Type: " + Bukkit.getWorldType());
				sender.sendMessage("Allow Flight: " + Bukkit.getAllowFlight());
				sender.sendMessage("Allow End: " + Bukkit.getAllowEnd());
				sender.sendMessage("TPAS: " + Bukkit.getTicksPerAnimalSpawns());
				sender.sendMessage("Allow Nether: :" + Bukkit.getAllowNether());
				sender.sendMessage("DEF GM: " + Bukkit.getDefaultGameMode());
				sender.sendMessage("WARN State: " + Bukkit.getWarningState());
				sender.sendMessage("Worlds: " + Bukkit.getWorlds());
				sender.sendMessage("SV2 Debugging:");
				sender.sendMessage("Folder: /plugins");
				sender.sendMessage("State: True-" + server.getPluginManager().getPlugin("ServerCore"));
				sender.sendMessage("WARN State: 0 (1 is bad)");
				sender.sendMessage("SV2 Debugger Version: 1.0");
				sender.sendMessage("SV2 API Version: n/a");
				sender.sendMessage("SV2 Hookins: n/a");
				sender.sendMessage("SV2 Version: 2.54");
				sender.sendMessage("/debugraw for raw data");
				
			
			}else{
			
			
					logger.info("Error, Execute In-Game");
					
			}
		}
		
		if (cmd.getName().equalsIgnoreCase("banlist")) {
			if(sender instanceof Player){
		sender.sendMessage("" + server.getBannedPlayers());
		
			}else{
				logger.info("Error, Execute In-Game");
		
		
		
		
		
			}
		}
		
		if (cmd.getName().equalsIgnoreCase("ipbans")) {
			if(sender instanceof Player){
					
					sender.sendMessage("" + server.getIPBans());
			}else{
				logger.info("Error, Execute In-Game");
	
			}
		}
		if (cmd.getName().equalsIgnoreCase("info")) {
			if(sender instanceof Player){
				sender.sendMessage("TBW");
			}else{
				logger.info("Error, Execute In-Game");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
										return true;
	}
	
		return false;
	

								
									
						
			
	
	}
			return false;
}
}
	


						
		
						
					
		
