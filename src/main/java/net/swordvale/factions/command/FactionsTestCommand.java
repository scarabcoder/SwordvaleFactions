package net.swordvale.factions.command;

import com.massivecraft.factions.cmd.FactionsCommand;
import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.type.primitive.TypeString;

public class FactionsTestCommand extends FactionsCommand {

    public FactionsTestCommand(){
        this.addAliases("test");
        this.addAliases("t");

        this.addParameter(TypeString.get(), "amount");


    }

    @Override
    public void perform() throws MassiveException {
        System.out.println(this.readArg());
    }

}
