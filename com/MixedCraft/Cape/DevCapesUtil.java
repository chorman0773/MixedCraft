package com.MixedCraft.Cape;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public class DevCapesUtil {

    /**
     * Wrapper for getting the DevCapes singleton.
     */
    @Deprecated
    public static DevCapes getInstance() {
        if(FMLCommonHandler.instance().getSide().equals(Side.CLIENT))
            return DevCapes.getInstance();
        else {
            System.out.println("[SEVERE] [DevCapes] **Someone tried to call DevCapesUtil.getInstance() on a server! If you are attempting to add a file url then use DevCapesUtil.addFileUrl().**");
            return null;
        }
    }

    public static void addFileUrl(String parTxtUrl) {
        if(FMLCommonHandler.instance().getSide().equals(Side.CLIENT))
            getInstance().addFileUrl(parTxtUrl);
    }
}
