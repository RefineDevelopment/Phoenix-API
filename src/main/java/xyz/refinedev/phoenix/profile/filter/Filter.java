package xyz.refinedev.phoenix.profile.filter;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

@Setter
@Getter
@RequiredArgsConstructor
public class Filter {

    @SerializedName("_id")
    private final String name;
    private final String filter;

    private FilterType filterType;
    private boolean hard;

    public Filter(String name, String filter, FilterType filterType) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
