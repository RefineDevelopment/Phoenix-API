package xyz.refinedev.phoenix.menu.api;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

@Getter
public abstract class Button {
    /**
     * Get itemStack of the Button
     *
     * @param player {@link Player} viewing the menu
     * @return {@link ItemStack}
     */
    public abstract ItemStack getItem(Player player);

    /**
     * This method is called upon clicking an
     * item on the menu
     *
     * @param player    {@link Player} clicking
     * @param clickType {@link ClickType}
     */
    public void clicked(Player player, ClickType clickType) {
    }

    /**
     * This method is called when the player clicks
     * on an item of a certain slot
     *
     * @param player     {@link Player} clicking
     * @param slot       {@link Integer} slot
     * @param clickType  {@link ClickType} clickType
     * @param hotbarSlot the hotbar slot of the player
     */
    public void clicked(Player player, int slot, ClickType clickType, int hotbarSlot) {
    }

    /**
     * Should the click cancel the event and do nothing
     *
     * @param player    The player clicking
     * @param clickType {@link ClickType}
     * @return {@link Boolean}
     */
    public boolean shouldCancel(Player player, ClickType clickType) {
        return true;
    }

    /**
     * Should the click update the menu
     *
     * @param player    The player clicking
     * @param clickType {@link ClickType}
     * @return {@link Boolean}
     */
    public boolean shouldUpdate(Player player, ClickType clickType) {
        return false;
    }

}