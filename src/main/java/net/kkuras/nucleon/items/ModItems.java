package net.kkuras.nucleon.items;

import net.kkuras.nucleon.NucleOn;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NucleOn.MOD_ID);


    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE = ITEMS.register("adamantite",
            () -> new Item(new Item.Properties()));








    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}

}
