package co.binarylife.invtest;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;
import us.legioncraft.inventorygui.inventory.event.InvEvent;

public class ExampleEvent implements InvEvent{
	private String invName;
	private int slot;
	private InventoryClickEvent event;
	private ItemStack stack;
	private Player player;
	ExampleEvent(String name, int slot){
		invName = name;
		this.slot = slot;
	}
	
	public void react(InventoryClickEvent event, ItemStack stack, Player player){
		this.event = event;
		this.player = player;
		
		player.sendMessage(ChatColor.AQUA + "hi");
	}
	
	public int getSlot(){
		return slot;
	}

	public String getInventoryName(){
		return invName;
	}

	public ItemStack getStack() {
		return stack;
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public InventoryClickEvent getEvent(){
		return event;
	}
}