package com.jsmith.miscadd.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.WorldSettings;

import java.util.List;

/**
 * Created by JohnSmith0508 on 20/10/14 at 4:09 PM.
 */
public class CommandGM extends CommandBase
{
    public String getCommandName()
    {
        return "gmc";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 2;
    }

    public String getCommandUsage(ICommandSender p_71518_1_)
    {
        return "commands.gamemode.usage";
    }

    public void processCommand(ICommandSender commandSender, String[] params)
    {
            WorldSettings.GameType gametype = this.getGameModeFromCommand(commandSender, params[0]);
            EntityPlayerMP entityplayermp = params.length >= 2 ? getPlayer(commandSender, params[1]) : getCommandSenderAsPlayer(commandSender);
            entityplayermp.setGameType(gametype);
            entityplayermp.fallDistance = 0.0F;
            ChatComponentTranslation chatcomponenttranslation = new ChatComponentTranslation("gameMode." + gametype.getName(), new Object[0]);

            if (entityplayermp != commandSender)
            {
                func_152374_a(commandSender, this, 1, "commands.gamemode.success.other", new Object[] {entityplayermp.getCommandSenderName(), chatcomponenttranslation});
            }
            else {
                func_152374_a(commandSender, this, 1, "commands.gamemode.success.self", new Object[]{chatcomponenttranslation});
            }
    }

    /**
     * Gets the Game Mode specified in the command.
     */
    protected WorldSettings.GameType getGameModeFromCommand(ICommandSender p_71539_1_, String p_71539_2_)
    {
        return WorldSettings.GameType.CREATIVE;}

    /**
     * Adds the strings available in this command to the given list of tab completion options.
     */
    public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_)
    {
        return null;}

    /**
     * Returns String array containing all player usernames in the server.
     */
    protected String[] getListOfPlayerUsernames()
    {
        return MinecraftServer.getServer().getAllUsernames();
    }

    /**
     * Return whether the specified command parameter index is a username parameter.
     */
    public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_)
    {
        return p_82358_2_ == 1;
    }
}
