package fr.sandro642.github;

import fr.sandro642.github.WebhookAPI.WebhookAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Hello World!");

        WebhookAPI.EmbedObject embed = new WebhookAPI.EmbedObject();

        embed.setTitle("Hello World!");
        embed.addField("Field 1", "Value 1", true);
        embed.addField("Field 2", "Value 2", true);
        embed.addField("Field 3", "Value 3", true);
        embed.setAuthor("Sandro", null, null);
    }
}
