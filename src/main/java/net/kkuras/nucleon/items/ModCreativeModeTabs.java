package net.kkuras.nucleon.items;


import net.kkuras.nucleon.NucleOn;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab>CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NucleOn.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NUCLEON_ITEMS_TAB = CREATIVE_MODE_TABS.register("nucleon_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_URANIUM.get()))
                    .title(Component.translatable("creativetab.nucleon.nucleon_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_URANIUM.get());



                    }).build());







    public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
    }
}
