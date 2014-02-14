package com.MixedCraft.helper;


public class ClientTickHandler
{
	private static boolean initialized = false;
/*
	Minecraft mc = Minecraft.getMinecraft();
	
	
	
	
	@Override
	public void tickStart(EnumSet var1, Object ... mc) {
	}

	@Override
	public void tickEnd(EnumSet var1, Object ... mc) {
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		World world = FMLClientHandler.instance().getClient().theWorld;
		if (!var1.equals(EnumSet.of(TickType.RENDER)) && var1.equals(EnumSet.of(TickType.CLIENT)) && FMLClientHandler.instance().getClient().currentScreen == null && !initialized) {
			initialized = true;
			FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage(EnumChatFormatting.GREEN + "Welcome " + player.username);
			//EntityCompanion entity = new EntityCompanion(world, player.username);
			//entity.setCanPickUpLoot(true);
			//entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0F, 0F);
			//world.spawnEntityInWorld(entity);
		}
		else if (var1.equals(EnumSet.of(TickType.RENDER))) {
			onRenderTick();
		}

	}


	@Override
	public EnumSet ticks() {
		return EnumSet.of(TickType.RENDER, TickType.CLIENT, TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		return "Mixedcraft Client Ticks";
	}
	
	public void onRenderTick() {
		if(mc.currentScreen == null) {
			String s = "MANA BAR";
			GuiIngame gig = mc.ingameGUI;
			EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		int var29;
		int var26;
		ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int k = scaledresolution.getScaledHeight();
		this.mc.getTextureManager().bindTexture(new ResourceLocation("MixedCraft:textures/gui/ManaBar.png"));
		var26 = k - 18;
		var29 = i - 220;
		gig.drawTexturedModalRect(var29, var26, 0, 0, 200 + 3, 10);
		gig.drawTexturedModalRect(var29, var26, 0, 10, (int) ManaHelper.getBarValue() + 1, 20);  
		}
	}*/
}