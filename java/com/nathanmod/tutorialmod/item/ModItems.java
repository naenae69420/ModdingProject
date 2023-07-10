package com.nathanmod.tutorialmod.item;

import com.nathanmod.tutorialmod.TutorialMod;
import com.nathanmod.tutorialmod.entity.MobEntityTypes;
import com.nathanmod.tutorialmod.item.custom.MobSpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    //list that keeps track of all items, blocks, etc that we create
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    // most things held in registry object that we want to register in game so this registers our item and creates it
    public static final RegistryObject<Item> WALLET = ITEMS.register("wallet", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MONEY = ITEMS.register("money", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<MobSpawnEggItem> GIRAFFE_EGG = ITEMS.register("giraffe_spawn_egg", () -> new MobSpawnEggItem(MobEntityTypes.GIRAFFE_ENTITY, 0x5C3F0A, 0xB6811F,
            new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<MobSpawnEggItem> BEAR_EGG = ITEMS.register("bear_spawn_egg", () -> new MobSpawnEggItem(MobEntityTypes.BEAR_ENTITY, 0x964B00, 0xB6811F,
            new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    //register item for ModItems,
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


