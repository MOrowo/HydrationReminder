package com.morowo.mormod.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class InfoCommand {

    public static final String MESSAGE = TextFormatting.GREEN + "Creator:" + TextFormatting.AQUA +" MOrowo\n";

    public static void infoCommand(CommandDispatcher<CommandSource> dispatcher){
        dispatcher.register(
                Commands.literal("info")
                        .executes(c -> {
                            Minecraft.getInstance().player.sendMessage(new StringTextComponent(MESSAGE), null);
                            return 1;
                        })
        );
    }
}
