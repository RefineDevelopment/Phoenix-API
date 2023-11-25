package xyz.refinedev.phoenix;

import lombok.Getter;
import lombok.Setter;
import xyz.refinedev.phoenix.handler.ChatHandler;
import xyz.refinedev.phoenix.handler.RebootHandler;
import xyz.refinedev.phoenix.handler.VisibilityHandler;
import xyz.refinedev.phoenix.settings.api.PlayerSettings;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @since 03/01/2023
 * @version pxAPI
 */

@Getter
@Setter
public class Phoenix {

    @Getter
    public static Phoenix instance;

    private ChatHandler chatHandler;
    private RebootHandler rebootHandler;
    private VisibilityHandler visibilityHandler;

    private final List<PlayerSettings> playerSettings = new ArrayList<>();
}
