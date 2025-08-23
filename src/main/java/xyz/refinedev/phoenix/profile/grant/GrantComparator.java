package xyz.refinedev.phoenix.profile.grant;

import java.util.Comparator;

/**
 * @author Creaxx
 * Created At: 18/06/2023
 */
public class GrantComparator implements Comparator<IGrant> {
    @Override
    public int compare(IGrant o1, IGrant o2) {
        if (o1.isActiveOnOneScope() == o2.isActiveOnOneScope()) {
            return o1.getIssuedAt() > o2.getIssuedAt() ? -1 : 1;
        } else if (o1.isActiveOnOneScope() && !o2.isActiveOnOneScope()) {
            return -1;
        } else if (!o1.isActiveOnOneScope() && o2.isActiveOnOneScope()) {
            return 1;
        }

        return 0;
    }
}
