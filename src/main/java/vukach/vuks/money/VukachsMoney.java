package vukach.vuks.money;
import net.fabricmc.api.ModInitializer;
import vukach.vuks.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VukachsMoney implements ModInitializer 
{
	
	public static final String MOD_ID = "vuksmoney";

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	@Override
	public void onInitialize() 
	{
		ModItems.registerModItems();
	}
}
