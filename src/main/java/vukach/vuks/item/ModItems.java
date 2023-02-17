package vukach.vuks.item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import vukach.vuks.money.VukachsMoney;

public class ModItems
{
    public static final Item CREDITCARD = registerItem("creditcard", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(VukachsMoney.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup()
    {
        addToItemGroup( ItemGroups.INGREDIENTS, CREDITCARD);
    }

    private static void addToItemGroup(ItemGroup group, Item item)
    {
        ItemGroupEvents.modifyEntriesEvent(group).register(enteries -> enteries.add(item));
    }

    public static void registerModItems()
    {
        VukachsMoney.LOGGER.info("Registering Mod Items for "+ VukachsMoney.MOD_ID);
    
        addItemsToItemGroup();
    }
}