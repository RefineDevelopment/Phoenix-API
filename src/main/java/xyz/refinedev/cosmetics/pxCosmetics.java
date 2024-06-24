package xyz.refinedev.cosmetics;

import lombok.Getter;
import org.bukkit.entity.Player;
import xyz.refinedev.cosmetics.cosmetics.killeffect.KillEffectType;
import xyz.refinedev.cosmetics.handler.CosmeticProfileHandler;
import xyz.refinedev.cosmetics.profile.CosmeticProfile;

@Getter
public class pxCosmetics {

    @Getter
    public static pxCosmetics instance;

    private CosmeticProfileHandler profileHandler;

    public void playKillEffect(Player player) {
        CosmeticProfile data = profileHandler.getProfile(player.getUniqueId());
        KillEffectType effect = data.getKillEffectType();
        if (effect != KillEffectType.NONE && effect.getCallable() != null) {
            effect.getCallable().call(player.getLocation().clone().add(0.0D, 1.0D, 0.0D));
        }
    }
}
