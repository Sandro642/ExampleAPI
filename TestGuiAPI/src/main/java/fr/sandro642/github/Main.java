package fr.sandro642.github;

import fr.sandro642.github.GuiAPI.GuiAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static GuiAPI guiAPI;
    public static Player player = Bukkit.getPlayer("Sandro642");

    @Override
    public void onEnable() {
        System.out.println("Plugin enabled");
        guiAPI.createinv("Test", 54);
        guiAPI.setItem(Material.HEART_OF_THE_SEA, 2, "TestItem");
        if (player != null) {
            guiAPI.openInv(player, "Test");
        }
    }
}
