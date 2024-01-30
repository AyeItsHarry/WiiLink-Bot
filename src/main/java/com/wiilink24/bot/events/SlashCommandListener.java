package com.wiilink24.bot.events;

import com.wiilink24.bot.Bot;
import com.wiilink24.bot.commands.misc.*;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.sql.SQLException;

public class SlashCommandListener extends ListenerAdapter {
    private final Bot bot;
    public SlashCommandListener(Bot bot) {this.bot = bot;}

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        /*
        General Listeners
         */
        if (event.getName().equals("apply")) {
            new Apply().apply(event);
        }
        else if (event.getName().equals("avatar")) {
            new Avatar().avatar(event);
        }
        else if (event.getName().equals("credits")) {
            new Credits().credits(event);
        }
        else if (event.getName().equals("card")) {
            new Digicard().card(event);
        }
        else if (event.getName().equals("dominos")) {
            new Dominos().dominos(event);
        }
        else if (event.getName().equals("error")) {
            new ErrorCodes().errorCode(event);
        }
        else if (event.getName().equals("gametdb")) {
            new GameTDB().gameTDB(event);
        }
        else if (event.getName().equals("mii")) {
            new Mii().mii(event);
        }
        else if (event.getName().equals("ping")) {
            new Ping().ping(event);
        }
        else if (event.getName().equals("riitag")) {
            new RiiTag().riiTag(event);
        }
        else if (event.getName().equals("serverinfo")) {
            new ServerInfo().serverInfo(event);
        }
        else if (event.getName().equals("userinfo")) {
            new Userinfo().userInfo(event);
        }
        else if (event.getName().equals("help")) {
            new Help().help(event);
        }
        else if (event.getName().equals("roleinfo")) {
            new RoleInfo().roleInfo(event);
        }
    }
}
