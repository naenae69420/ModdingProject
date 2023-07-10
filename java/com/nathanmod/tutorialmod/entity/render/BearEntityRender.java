package com.nathanmod.tutorialmod.entity.render;

import com.nathanmod.tutorialmod.TutorialMod;
import com.nathanmod.tutorialmod.entity.custom.BearEntity;
import com.nathanmod.tutorialmod.entity.custom.GiraffeEntity;
import com.nathanmod.tutorialmod.entity.model.BearEntityModel;
import com.nathanmod.tutorialmod.entity.model.GiraffeEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BearEntityRender extends MobRenderer<BearEntity, BearEntityModel<BearEntity>> {

    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/bear.png");

    public BearEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BearEntityModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(BearEntity entity) {
        return TEXTURE;
    }
}
