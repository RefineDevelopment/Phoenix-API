package xyz.refinedev.phoenix.placeholder;

import java.util.UUID;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @since 5/20/2023
 */
public interface PlaceholderAdapter {

    String getIdentifier();
    String getPlaceholder(UUID uuid, String placeholder);

}
