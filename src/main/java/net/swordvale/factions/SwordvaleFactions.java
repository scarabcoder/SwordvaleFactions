package net.swordvale.factions;

import com.massivecraft.factions.Factions;
import com.massivecraft.factions.cmd.CmdFactions;
import com.massivecraft.factions.cmd.FactionsCommand;
import net.swordvale.factions.command.FactionsTestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class SwordvaleFactions extends JavaPlugin {

    public void onEnable(){

        CmdFactions.get().addChild(new FactionsTestCommand());

    }

}
