package fr.sandro642.github;

import fr.sandro642.github.ChannelzAPI.ChannelzAPI;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public ChannelzAPI channelzAPI;

    public static Player player;

    public static Player player1;

    public static int integer = 12;

    @Override
    public void onEnable() {
        System.out.println("Hello World");
        channelzAPI.setStatus(true);
        channelzAPI.setChannels("Test");
        channelzAPI.setSubChannels("test2");
        channelzAPI.launchData();



        // Set data

        channelzAPI.setPlayer(player.toString());
        channelzAPI.setInteger(12);


        // getData

        ChannelzAPI.Channelz().getPlayer(player1.toString());
        ChannelzAPI.Channelz().getInteger(integer);
    }
}
