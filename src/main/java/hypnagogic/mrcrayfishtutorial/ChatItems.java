package hypnagogic.mrcrayfishtutorial;

import hypnagogic.mrcrayfishtutorial.init.TutorialBlocks;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatItems {
	@SubscribeEvent
	public void giveItems(ServerChatEvent event){
		if (event.message.contains("i want a dragon")) {
			event.player.inventory.addItemStackToInventory(new ItemStack(TutorialBlocks.test_block, 3));
			
		}
	}
}
