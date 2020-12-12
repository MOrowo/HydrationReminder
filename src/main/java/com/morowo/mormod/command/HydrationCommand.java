package com.morowo.mormod.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class HydrationCommand {
    public static void hydrateCommand(CommandDispatcher<CommandSource> dispatcher){
//        CommandDispatcher<CommandSource> dispatcher = new CommandDispatcher<>();
        dispatcher.register(
                Commands.literal("hydrate")
                    .executes(c -> {
                        Minecraft.getInstance().player.sendMessage(new StringTextComponent("Hydrate!"), null);
                        return 1;
                    })
        );
    }

    public static void sendMessage() {
        String HydrationMessage = TextFormatting.RED + "This is a hydration reminder!\n" + TextFormatting.GOLD + "Grab your water and take a sip";
        assert Minecraft.getInstance().player != null;
        Minecraft.getInstance().player.sendMessage(new StringTextComponent(HydrationMessage), null);
    }
}
