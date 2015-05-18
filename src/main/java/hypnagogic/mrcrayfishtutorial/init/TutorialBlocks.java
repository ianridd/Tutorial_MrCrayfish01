package hypnagogic.mrcrayfishtutorial.init;

import hypnagogic.mrcrayfishtutorial.Reference;
import hypnagogic.mrcrayfishtutorial.blocks.BlockTest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialBlocks {
	
	public static Block test_block;
	public static Block invisibilityTest;
	
	public static void init()
	{
		test_block = new BlockTest(Material.rock).setUnlocalizedName("test_block").setCreativeTab(CreativeTabs.tabBlock);
		invisibilityTest = new BlockTest(Material.rock).setUnlocalizedName("invisibilityTest").setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(test_block, test_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(invisibilityTest, invisibilityTest.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(test_block);
		registerRender(invisibilityTest);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerRecipe()
	{
		GameRegistry.addRecipe(new ItemStack(test_block),"WWW"," W "," W ", 'W', Blocks.planks);
	}
}
