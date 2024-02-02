package xyz.refinedev.phoenix.menu.api.pagination.filter;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.menu.api.Button;
import xyz.refinedev.phoenix.menu.api.pagination.PaginatedMenu;

import java.util.List;
import java.util.Map;

public abstract class FilterablePaginatedMenu<T> extends PaginatedMenu {

    @Override
    public Map<Integer, Button> getGlobalButtons(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public Map<Integer, Button> getAllPagesButtons(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }


    public boolean passesFilter(T t) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public abstract Map<Integer, Button> getFilteredButtons(Player player);

    public abstract List<PageFilter<T>> generateFilters();

    public List<PageFilter<T>> getFilters() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getScrollIndex() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setScrollIndex(int scrollIndex) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
