package xyz.refinedev.phoenix.placeholder;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 5/20/2023
 */
public interface PlaceholderAdapter {

    String getIdentifier();
    String getPlaceholder(UUID uuid, String placeholder);

}
