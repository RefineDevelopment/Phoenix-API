package xyz.refinedev.phoenix.notification;

import java.util.List;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 2/5/2023
 */

public interface INotification {
    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    String getId();

    UUID getCreatedBy();

    long getCreatedOn();

    String getTitle();

    List<String> getDescription();

    void setTitle(String title);

    void setDescription(List<String> description);
}
