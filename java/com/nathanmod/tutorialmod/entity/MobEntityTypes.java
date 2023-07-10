package com.nathanmod.tutorialmod.entity;

import com.nathanmod.tutorialmod.TutorialMod;
import com.nathanmod.tutorialmod.entity.custom.BearEntity;
import com.nathanmod.tutorialmod.entity.custom.GiraffeEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;

public class MobEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, TutorialMod.MOD_ID);

    public static final RegistryObject<EntityType<GiraffeEntity>> GIRAFFE_ENTITY = ENTITY_TYPES.register("giraffe", () -> EntityType.Builder.create(GiraffeEntity::new,
            EntityClassification.CREATURE).size(1f, 2f).build(new ResourceLocation(TutorialMod.MOD_ID, "giraffe").toString()));

    public static final RegistryObject<EntityType<BearEntity>> BEAR_ENTITY = ENTITY_TYPES.register("bear", () -> EntityType.Builder.create(BearEntity::new,
            EntityClassification.CREATURE).size(1.4f, 1.4f).build(new ResourceLocation(TutorialMod.MOD_ID, "bear").toString()));



    public static void register(IEventBus eventbus) {
        ENTITY_TYPES.register(eventbus);
    }
}
