package net.jevens.tutorialmod.item;

import net.jevens.tutorialmod.TutorialMod;
import net.jevens.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB =
            CREATIVE_MODE_TABS.register("tutorial_mod",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.XYLITE.get()))
                            .title(Component.translatable("creativetab.tutorial_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.XYLITE.get());
                                output.accept(ModItems.PHILOSOPHERS_STONE.get());
                                output.accept(ModBlocks.XYLITE_BLOCK.get());
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
