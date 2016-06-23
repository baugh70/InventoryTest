package co.binarylife.invtest;

import org.bukkit.plugin.java.JavaPlugin;

import us.legioncraft.inventorygui.InventoryGUI;

public class ExampleMain extends JavaPlugin{
	
	// Adds GUIS and enables command
	public void onEnable(){
			
	    getCommand("invexample").setExecutor(new ExampleCommand(this));
	    InventoryGUI.getManager().addGUI(new ExampleGUI(this));
	}
	
}
