package net.swordvale.factions.nms;

import com.massivecraft.factions.entity.Faction;
import com.massivecraft.factions.entity.MPlayer;
import net.minecraft.server.v1_8_R3.*;
import net.swordvale.factions.Util;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.List;

public class EntityFactionBoss extends EntityWither {

    private Faction faction;

    public EntityFactionBoss(World world, Faction faction) {
        super(world);
        List goalB = (List) Util.getPrivateField("b", PathfinderGoalSelector.class, goalSelector); goalB.clear();
        List goalC = (List)Util.getPrivateField("c", PathfinderGoalSelector.class, goalSelector); goalC.clear();
        List targetB = (List)Util.getPrivateField("b", PathfinderGoalSelector.class, targetSelector); targetB.clear();
        List targetC = (List)Util.getPrivateField("c", PathfinderGoalSelector.class, targetSelector); targetC.clear();

        PathfinderGoalRandomStroll bossMovement = new PathfinderGoalRandomStroll(this, 1.0D);



        this.goalSelector.a(5, new PathfinderGoalRandomStroll(this, 1.0D));
        this.goalSelector.a(6, new PathfinderGoalMoveTowardsTarget(this, 1.0D, 150));

    }

    public Faction getFaction(){
        return this.faction;
    }

    @Override
    public double h(Entity target){
        if(target.getBukkitEntity() instanceof CraftPlayer){
            MPlayer p = MPlayer.get((Player) target.getBukkitEntity());

            if(p.getFaction() != null && p.getFaction().getId().equals(this.getFaction().getId())){
                return 901;
            }

        }else{
            return 901;
        }
        return 800;
    }




}
