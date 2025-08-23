package xyz.refinedev.phoenix.profile.punishment;

import java.util.Comparator;

/**
 * @author Creaxx
 * Created At: 18/06/2023
 */
public class PunishmentComparator implements Comparator<IPunishment> {

    @Override
    public int compare(IPunishment o1, IPunishment o2) {
        if (o1.isActive() == o2.isActive()) {
            return o1.getIssuedAt() > o2.getIssuedAt() ? -1 : 1;
        } else if (o1.isActive() && !o2.isActive()) {
            return -1;
        } else if (!o1.isActive() && o2.isActive()) {
            return 1;
        }

        return 0;
    }
}
