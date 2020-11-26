package com.morowo.mormod.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class onPlayerJoin {
    private static boolean isTurnedOn = false;
    @SubscribeEvent
    public static void onEvent(EntityJoinWorldEvent event) {
        if ((event.getEntity() instanceof PlayerEntity)) {
            for (int i = 0; i < 2; i++)
            if (!isTurnedOn) {
                isTurnedOn = true;
            } else {
                Interval.doTask();
            }
        }
    }
}
