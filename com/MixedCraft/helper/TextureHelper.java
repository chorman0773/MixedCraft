package com.MixedCraft.helper;


import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class TextureHelper {
    public static Icon getIconFromTextureName(IconRegister iconRegister, String name) {
        return iconRegister.registerIcon(Utils.RESOURCE_FOLDER + ":" + name);
    }

}
