package vukach.vuksmoney;
import net.fabricmc.api.ModInitializer;
import vukach.vuksmoney.item.ModCreativeModeTabs;
import vukach.vuksmoney.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VukachsMoney implements ModInitializer {
	public static final String MOD_ID = "vuksmoney";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModCreativeModeTabs.registerModTabs();

	}
}
