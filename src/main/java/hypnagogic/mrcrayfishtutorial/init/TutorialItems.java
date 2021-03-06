package hypnagogic.mrcrayfishtutorial.init;

import hypnagogic.mrcrayfishtutorial.Reference;
import hypnagogic.mrcrayfishtutorial.TutorialMod;
import hypnagogic.mrcrayfishtutorial.item.ItemCloudCrusher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialItems {
	
	public static Item test_item;
	public static Item cloud_crusher;
	public static Item itemCheese;
	public static Item cheeseSandwich;
	public static Item grilledCheese;
	public static Item superEgg;
	
	public static final Item.ToolMaterial cloudCrusherMaterial = EnumHelper.addToolMaterial("cloudCrusherMaterial", 
			4, 2000, 20.0F, 5.0F, 10);
	
	public static void init() {
		test_item = new Item().setUnlocalizedName("test_item");
		cloud_crusher = new ItemCloudCrusher(cloudCrusherMaterial).setUnlocalizedName("cloud_crusher").setCreativeTab(CreativeTabs.tabCombat) ;
		itemCheese = new ItemFood(2, 1.0F, true).setUnlocalizedName("itemCheese").setCreativeTab(CreativeTabs.tabFood) ;
		cheeseSandwich = new ItemFood(5, 1.0F, true).setUnlocalizedName("cheeseSandwich").setCreativeTab(CreativeTabs.tabFood) ;
		grilledCheese = new ItemFood(2, 1.0F, true).setUnlocalizedName("grilledCheese").setCreativeTab(CreativeTabs.tabFood) ;
		superEgg = new Item().setUnlocalizedName("superEgg");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cloud_crusher, cloud_crusher.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemCheese, itemCheese.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cheeseSandwich, cheeseSandwich.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(grilledCheese, grilledCheese.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(superEgg, superEgg.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(test_item);
		registerRender(cloud_crusher);
		registerRender(itemCheese);
		registerRender(cheeseSandwich);
		registerRender(grilledCheese);
		registerRender(superEgg);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerRecipe()
	{
		GameRegistry.addRecipe(new ItemStack(cloud_crusher),"TFB"," D ","GET",
				'T', Blocks.tnt, 
				'F', Items.flint_and_steel,
				'B', Blocks.bedrock,
				'D', Items.diamond_sword,
				'G', Blocks.glowstone,
				'E', Items.ender_eye);
		
		GameRegistry.addRecipe(new ItemStack(itemCheese, 8),"MMM"," G ","   ",
				'M', Items.milk_bucket ,
				'G', Items.wheat_seeds);
		
		GameRegistry.addRecipe(new ItemStack(superEgg, 1),"ABC","DEF","GHI",
				'A', new ItemStack(Items.spawn_egg, 1, 57),
				'B', new ItemStack(Items.spawn_egg, 1, 54),
				'C', new ItemStack(Items.spawn_egg, 1, 50),
				'D', new ItemStack(Items.spawn_egg, 1, 61),
				'E', new ItemStack(Items.spawn_egg, 1, 56),
				'F', new ItemStack(Items.spawn_egg, 1, 62),
				'G', new ItemStack(Items.spawn_egg, 1, 52),
				'H', new ItemStack(Items.spawn_egg, 1, 60),
				'I', new ItemStack(Items.spawn_egg, 1, 58)
		);
		
		GameRegistry.addRecipe(new ItemStack(cheeseSandwich, 4)," M "," C ","   ",
				'M', Items.bread ,
				'C', TutorialItems.itemCheese);
		
		GameRegistry.addSmelting(new ItemStack(cheeseSandwich), new ItemStack(grilledCheese), 0.2F);
		
	}
}
