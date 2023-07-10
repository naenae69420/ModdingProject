package com.nathanmod.tutorialmod.entity.render;

import com.nathanmod.tutorialmod.TutorialMod;
import com.nathanmod.tutorialmod.entity.custom.GiraffeEntity;
import com.nathanmod.tutorialmod.entity.model.GiraffeEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GiraffeEntityRender extends MobRenderer<GiraffeEntity, GiraffeEntityModel<GiraffeEntity>> {

    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/giraffe.png");

    public GiraffeEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GiraffeEntityModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(GiraffeEntity entity) {
        return TEXTURE;
    }
}
