package co.binarylife.invtest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import us.legioncraft.inventorygui.InventoryGUI;
import us.legioncraft.inventorygui.inventory.InventoryManager;

public class ExampleCommand implements CommandExecutor{
	private ExampleMain plugin;
	
		public ExampleCommand(ExampleMain plugin){
		this.plugin = plugin;
	}
	
	// Creates command that utilizes the Inventory Manager, and opens a predefined inventory
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		plugin.getServer();
		if(sender instanceof Player){
			Player player = (Player) sender;
			InventoryManager im = InventoryGUI.getManager();
			
			// Opens the "EXAMPLE_INVENTORY"
			player.openInventory(im.getInventory("EXAMPLE_INVENTORY").getInventory());
		}
		
		return true;
	}
}

