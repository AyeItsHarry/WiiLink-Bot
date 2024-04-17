package com.wiilink24.bot.commands.misc;

import com.wiilink24.bot.Database;
import io.sentry.Sentry;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.sql.SQLException;

public class WiiNumber {

    private final Database database;

    public WiiNumber() {
        this.database = new Database();
    }

    public void deleteNumber(SlashCommandInteractionEvent event) {
        try {
            String num = event.getOption("wiino").getAsString();
            database.deleteWiiNumber(num);
            event.reply("Successfully deleted Wii Number " + num).queue();
        } catch (SQLException e) {
            event.reply("Unable to delete Wii Number.").queue();
            System.out.println(e.getMessage());
            Sentry.captureException(e);
        }
    }
}
