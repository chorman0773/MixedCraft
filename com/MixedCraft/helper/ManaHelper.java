package com.MixedCraft.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;

public class ManaHelper implements IPlayerTracker {

        public static HashMap<String, Integer> bars = new HashMap<String, Integer>();
        public static HashMap<String, Integer> delays = new HashMap<String, Integer>();
        private static ArrayList manaList = new ArrayList(0);
        public static String playerID;
        private static int mana = 0;
        private static int regenDelay = 0;

        public static void add(String username) {        
                playerID = username;
                manaList.ensureCapacity(manaList.size() + 1);
                bars.put(username, 200);
                delays.put(username, 200);
        }

        public static void remove(String par1) {
                bars.remove(par1);
                delays.remove(par1);
        }

        public static void updateAllBars(List<EntityPlayer> players) {
                for (int l = 0; l < players.size(); l++) {
                        String user = players.get(l).username;
                        if(user == null) {
                                continue;
                        }
                        if (delays.get(user) == 0) {
                                bars.put(user, bars.get(user) + 1);
                                if(mana != 200){
                                        regen(1);
                                }else{
                                        regen(0);
                                }
                        }                
                        else if (delays.containsKey(user)) {
                                delays.put(user, delays.get(user) - 1);
                        } else {
                                add(user);
                        }

                }
        }

        public static boolean useBar(EntityPlayer par1, int amount) {
                if (mana < amount) {
                        regenDelay = 30;
                        return false;
                }

                mana -= amount;
                regenDelay = 30;
                return true;
        }

        public static void regen(int par1) {
                if (regenDelay == 0) {
              mana += par1;
            } else {
              regenDelay -= 1;
            }
        }

        public static float getBarValue() {
                return mana;
        }

        @Override
        public void onPlayerLogin(EntityPlayer player) {
                add(player.username);
        }

        @Override
        public void onPlayerLogout(EntityPlayer player) {
                remove(player.username);
        }

        @Override
        public void onPlayerChangedDimension(EntityPlayer player) { 
                add(player.username);
        }

        @Override
        public void onPlayerRespawn(EntityPlayer player) {
                add(player.username);
        }
}