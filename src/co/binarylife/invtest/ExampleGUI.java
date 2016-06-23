package co.binarylife.invtest;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import us.legioncraft.inventorygui.inventory.GUI;

public class ExampleGUI extends GUI{
	
	public ExampleGUI(ExampleMain plugin){
		super("EXAMPLE_INVENTORY", 9, plugin.getServer().createInventory(null, 9), createItems());
		
		addEvent(new ExampleEvent("EXAMPLE_INVENTORY", 1));
	}
	
	public static HashMap<Integer, ItemStack> createItems(){
		HashMap<Integer, ItemStack> items = new HashMap<>();
		
		items.put(1, new ItemStack(Material.GRASS));
		items.put(2, new ItemStack(Material.AIR));
		items.put(3, new ItemStack(Material.AIR));
		items.put(4, new ItemStack(Material.AIR));
		items.put(5, new ItemStack(Material.AIR));
		items.put(6, new ItemStack(Material.AIR));
		items.put(7, new ItemStack(Material.AIR));
		
		return items;
	}
	
	
//	public void addEvents(){
//		events = new ArrayList<>();
//		
//		events.add(new ExampleEvent("EXAMPLE_INVENTORY", 1));
//	}
}

