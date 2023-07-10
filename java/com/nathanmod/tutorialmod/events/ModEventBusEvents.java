package com.nathanmod.tutorialmod.events;

import com.nathanmod.tutorialmod.TutorialMod;
import com.nathanmod.tutorialmod.entity.MobEntityTypes;
import com.nathanmod.tutorialmod.entity.custom.BearEntity;
import com.nathanmod.tutorialmod.entity.custom.GiraffeEntity;
import com.nathanmod.tutorialmod.item.custom.MobSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(MobEntityTypes.GIRAFFE_ENTITY.get(), GiraffeEntity.setCustomAttributes().create());
        event.put(MobEntityTypes.BEAR_ENTITY.get(), BearEntity.setCustomAttributes().create());

    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        MobSpawnEggItem.initSpawnEggs();
    }

}
