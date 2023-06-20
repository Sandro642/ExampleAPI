package fr.sandro642.github;

import fr.sandro642.github.GuiAPI.GuiAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Player player = Bukkit.getPlayer("Sandro642");

    @Override
    public void onEnable() {
        System.out.println("Hello World");

        GuiAPI.use().createInventory("Test", 54);
        GuiAPI.use().addItem("Test", 9, Material.ANDESITE, "Salut tout le monde");


        if (player.isOp()) {
            GuiAPI.use().openInventory(player, "Test");
        }
    }
}
