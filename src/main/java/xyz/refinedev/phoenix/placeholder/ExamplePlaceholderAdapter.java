package xyz.refinedev.phoenix.placeholder;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 06/10/2023
 */
public class ExamplePlaceholderAdapter implements PlaceholderAdapter {
    @Override
    public String getIdentifier() {
        return "cosmetics";
    }

    @Override
    public String getPlaceholder(UUID uuid, String s) {
        switch (s) {
            // would be <cosmetics_color> in chat format
            case "color": {
                return "this is a test";
            }
            // would be <cosmetics_chatcolor> in chat format
            case "chatcolor": {
                return "this is a test";
            }
        }

        return "";
    }
}
