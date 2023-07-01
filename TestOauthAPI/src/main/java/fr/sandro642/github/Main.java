package fr.sandro642.github;

import fr.sandro642.github.OauthAPI.OauthAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class Main extends JavaPlugin {

    public static Player player = Bukkit.getPlayer("Sandro642"); // Get player (for example) or Bukkit.getOnlinePlayers, etc...

    @Override
    public void onEnable() {
        System.out.println( "Plugin enabled");

        OauthAPI.getOauth().setStatus(true);
        try {
            OauthAPI.getOauth().launchData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        OauthAPI.getOauth().oauthGui(player);

        /**
         * @Todo first example
         */
        OauthAPI.getOauth().callMethod(sout());

        /**
         * @Todo second example
         */
        OauthAPI.getOauth().callMethod(allResources());
    }

    public void sout() {
        System.out.println("Test method");
    }

    // Second example

    public void allResources() {
        firstResources();
        secondResources();
    }

    public void firstResources() {
        System.out.println("dzqhidqz");

    }

    public void secondResources() {
        System.out.println("dzquodzq");
    }
}
