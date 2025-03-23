package net.babyshaq.deepseamod.item;

import net.babyshaq.deepseamod.DeepSeaMod;
import net.babyshaq.deepseamod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DeepSeaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOONSTONE_ITEMS_TAB = CREATIVE_MODE_TABS.register("moonstone_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOONSTONE.get()))
                    .title(Component.translatable("creativetab.deepseamod.moonstone_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MOONSTONE.get());
                        output.accept(ModBlocks.MOONSTONE_BLOCK.get());
                        output.accept(ModBlocks.METEORITE_BLOCK.get());
                        output.accept(ModBlocks.METEORITE_IRON_ORE.get());
                        output.accept(ModBlocks.METEORITE_MOONSTONE_ORE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}