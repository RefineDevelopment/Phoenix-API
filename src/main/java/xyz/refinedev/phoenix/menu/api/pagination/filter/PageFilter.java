package xyz.refinedev.phoenix.menu.api.pagination.filter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.function.Predicate;

@RequiredArgsConstructor
public class PageFilter<T> {

	@Getter private final String name;
	private final Predicate<T> predicate;
	@Getter @Setter private boolean enabled;

	public boolean test(T t) {
		throw new IllegalPluginAccessException("You need to install the plugin.");
	}

}
