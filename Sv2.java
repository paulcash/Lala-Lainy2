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
	
	
	
	
	
	public void onEnable(){
	getLogger().info("ServerCore2 Enabled");
	getLogger().info("Sv2 Enabled!");
	
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

	
	
	
	
	

	
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("sv2")) {
			if(sender instanceof Player){
				

				sender.sendMessage(ChatColor.BLUE + "ServerCore2");
				sender.sendMessage("Developed By: Paulcash");
				sender.sendMessage("Servercore2 is a plugin made for everything, its meant to be the core of your server");
				sender.sendMessage("Stage: Alpha");
				sender.sendMessage("Core Version: 2.5.2");
				
				
				
				
				
				
				
				
			}else{
				
				getLogger().info("Full Debugging Info For SV2");
				getLogger().info("Version: 2.5.1");
				getLogger().info("Spigot Build: 1.10.2");
				getLogger().info("Compiled?: Yes");
				getLogger().info("Patched?: No");
				getLogger().info("API Version: 2.5.1.00");
				getLogger().info("Required: NONE");
				getLogger().info("Optional?: NONE");
				getLogger().info("Built For: Testing Purposes - early alpha");
				getLogger().info("PROTOCOL: 1.10.2");
				getLogger().info("Backend?: NO SUPPORT");
				getLogger().info("Build #?: 26");
				getLogger().info("BuiltFor: PaulCraft6");
				
				
				
			}
		}

			
			if (cmd.getName().equalsIgnoreCase("playerinfo")) {
				if(sender instanceof Player){
				
					sender.sendMessage(ChatColor.RED + "Health: " + player.getHealth());
					sender.sendMessage(ChatColor.RED + "Custom Name: " + player.getCustomName());
					sender.sendMessage(ChatColor.RED + "Display Name: " + player.getCustomName());
					sender.sendMessage(ChatColor.RED + "Your Exp: " + player.getExp());
					sender.sendMessage(ChatColor.RED + "You Need: " + player.getExpToLevel() + " Exp To level up");
					sender.sendMessage(ChatColor.RED + "Your On Fire for: " + player.getFireTicks() + " Ticks");
					sender.sendMessage(ChatColor.RED + "You First Played: " + player.getFirstPlayed());
					sender.sendMessage(ChatColor.RED + "Foodlevel: " + player.getFoodLevel());
					sender.sendMessage(ChatColor.RED + "Level: " + player.getLevel());
					sender.sendMessage(ChatColor.RED + "Fly Speed: " + player.getFlySpeed());
					sender.sendMessage(ChatColor.RED + "Max Health: " + player.getMaxHealth());
					sender.sendMessage(ChatColor.RED + "Saturation:" + player.getSaturation());
					sender.sendMessage(ChatColor.RED + "Your Flight Perms: " + player.getAllowFlight());
					sender.sendMessage(ChatColor.RED + "Item in hand: " + player.getItemInHand());
					sender.sendMessage(ChatColor.RED + "Your Killer: " + player.getKiller());
					sender.sendMessage(ChatColor.RED + "Your gamemode: " + player.getGameMode());
					sender.sendMessage(ChatColor.RED + "Your Location: " + player.getLocation());
					sender.sendMessage(ChatColor.RED + "World Your In: " + player.getWorld());
					sender.sendMessage(ChatColor.RED + "Divide This: " + player.getTicksLived() + "By 20 to get how many seconds youve lived");
					sender.sendMessage(ChatColor.RED + "Dev: Paulcash");
					
					
				
				
		
	
				}else{
					getLogger().info("Error. Execute In Game");
			
			
				}
			}
			if (cmd.getName().equalsIgnoreCase("serverinfo")) {
				if(sender instanceof Player){
					
					sender.sendMessage(ChatColor.RED + "Animal Spawn limit: " + server.getAnimalSpawnLimit());
					sender.sendMessage(ChatColor.RED + "Ambient Spawn Limit: " + server.getAmbientSpawnLimit());
					sender.sendMessage(ChatColor.RED + "Bukkit Version: " + server.getBukkitVersion());
					sender.sendMessage(ChatColor.RED + "Connection Throttle: " + server.getConnectionThrottle());
					sender.sendMessage(ChatColor.RED + "Max Players: " + server.getMaxPlayers());
					sender.sendMessage(ChatColor.RED + "IP: " + server.getIp());
					sender.sendMessage(ChatColor.RED + "Monster Spawn Limit: " + server.getMonsterSpawnLimit());
					sender.sendMessage(ChatColor.RED + "Motd: " + server.getMotd());
					sender.sendMessage(ChatColor.RED + "Your connected on: " + server.getPort());
					sender.sendMessage(ChatColor.RED + "SID: " + server.getServerId());
					sender.sendMessage(ChatColor.RED + "Version: " + server.getVersion());
					sender.sendMessage(ChatColor.RED + "Ticks Per Animal Spawn: " + server.getTicksPerAnimalSpawns());
					sender.sendMessage(ChatColor.RED + "View Distance:" + server.getViewDistance());
					sender.sendMessage(ChatColor.RED + "World Type: " + server.getWorldType());
					sender.sendMessage(ChatColor.RED + "Default gamemode: " + server.getDefaultGameMode());
					sender.sendMessage(ChatColor.RED + "Online Mode?: " + server.getOnlineMode());
					sender.sendMessage(ChatColor.RED + "Built By: Paulcash");
					
					
					
					
					
					
					
					
				}else{
					
					
					getLogger().info("Error. Execute In Game");
					
					
					
				}
			}
			
			
			if (cmd.getName().equalsIgnoreCase("clearchat")) {
				if(sender instanceof Player){

					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					server.getConsoleSender().sendRawMessage("");
					
					
				
					
					
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
					
					
					
					
					
					
	
										return true;
	}
	
		return false;
	

								
									
						
			
	
	}
			return false;
}
}
	


						
		
						
					
		
