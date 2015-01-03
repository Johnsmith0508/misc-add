package com.jsmith.miscadd.command;


import net.minecraft.command.CommandGameMode;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.WorldSettings;

/**
 * Created by JohnSmith0508 on 20/10/14 at 4:09 PM.
 */
public class CommandGM extends CommandGameMode
{

    @Override
    public void processCommand(ICommandSender sender, String[] arguments) {
        EntityPlayerMP entityplayermp = arguments.length >= 2 ? getPlayer(sender, arguments[1]) : getCommandSenderAsPlayer(sender);
        entityplayermp.setGameType(WorldSettings.GameType.CREATIVE);
        entityplayermp.fallDistance = 0.0f;
        ChatComponentTranslation chatComponentTranslation = new ChatComponentTranslation("Now Playing Creative", new Object[0]);
        //super.processCommand(sender, arguments);
    }
}
