package fr.sandro642.github;

import fr.sandro642.github.LangAPI.LangAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static LangAPI langAPI;

    // Set player
    public static Player player = Bukkit.getPlayer("Sandro642"); // Get player (for example) or Bukkit.getOnlinePlayers, etc...

    // Set name for GUI
    public static String name = "§6§lLangAPI";

    @Override
    public void onEnable() {
        langAPI = new LangAPI(this);
        System.out.println("Plugin enabled");

        langAPI.setupMessages(true);

        //Setup message or
        langAPI.fr(); // langAPI.en(); langAPI.de(); langAPI.es(); langAPI.it(); langAPI.pt(); langAPI.ru(); langAPI.zh();

        //Init GUI for player
        //when a player join the server get GUI for player
        LangAPI.initGui(player, name);



    }

    // Set messages on resources folder or src...
    //when a player join the server get message for player

    //function for example
    public void onPlayerJoin() {
        if (player.isOp()) return;


        //get message in your yml file
        langAPI.getMessage("test.examplemessage");
    }
}
