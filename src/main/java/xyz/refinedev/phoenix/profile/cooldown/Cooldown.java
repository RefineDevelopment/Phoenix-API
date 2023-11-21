package xyz.refinedev.phoenix.profile.cooldown;

import lombok.Getter;
import lombok.Setter;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * @since 07/12/2022
 * Project: pxCore
 */

@Getter
@Setter
public class Cooldown {

    private long start = System.currentTimeMillis();
    private long expire;
    private String name;

    public Cooldown(long ms, String name) {
        this.expire = this.start + ms;
        this.name = name;
    }

    public long getPassed() {
        return System.currentTimeMillis() - this.start;
    }

    public long getRemaining() {
        return this.expire - System.currentTimeMillis();
    }

    public boolean hasExpired() {
        return System.currentTimeMillis() - this.expire >= 1;
    }

    public int getSecondsLeft() {
        return (int) getRemaining() / 1000;
    }

    public void cancel() {
        this.expire = 0;
    }
}
