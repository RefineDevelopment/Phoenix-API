package xyz.refinedev.phoenix.notification;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 2/5/2023
 */

@Getter
@RequiredArgsConstructor
public class Notification {

    @SerializedName("_id")
    private final String id;

    private final UUID createdBy;
    private final long createdOn = System.currentTimeMillis();

    @Setter private String title;
    @Setter private List<String> description = new ArrayList<>();
}
