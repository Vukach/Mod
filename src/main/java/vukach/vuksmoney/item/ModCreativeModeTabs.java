package vukach.vuksmoney.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static net.minecraft.text.Text.translatable;
import static vukach.vuksmoney.VukachsMoney.MOD_ID;

public class ModCreativeModeTabs {
	public static String modTab1 = "tab." + MOD_ID + ".tab1";
	public static ItemGroup CREDITCARD;

	public static void registerModTabs() {

		CREDITCARD = FabricItemGroup.builder( new Identifier(MOD_ID, "creditcard"))
				.displayName(translatable(modTab1))
				.icon( () -> new ItemStack(ModItems.CREDITCARD)).build();

		ItemGroupEvents.modifyEntriesEvent(CREDITCARD).register(entries -> {
			entries.add(ModItems.CREDITCARD);
			entries.add(ModItems.HOPS);
		});
	}
}
