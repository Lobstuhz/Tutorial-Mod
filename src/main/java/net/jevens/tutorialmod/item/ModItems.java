package net.jevens.tutorialmod.item;

import net.jevens.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> XYLITE = ITEMS.register("xylite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHILOSOPHERS_STONE = ITEMS.register(
            "philosophers_stone",
            () -> new Item(new Item.Properties()));

}
