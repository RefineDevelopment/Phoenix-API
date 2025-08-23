package xyz.refinedev.phoenix.profile.tag;

import java.util.List;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx (@Creaxx#0001)
 * 09-Oct-21 / 15:46
 * Phoenix / xyz.refinedev.core.bukkit.profile.tags
 */

public interface ITagCategory {
    /**
     * Get the tags list as {@link ITag} Objects
     *
     * @return {@link List<ITag>}
     */
    public List<ITag> getAsTags();

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object o);

    public String getName();

    public int getPriority();

    public List<String> getTags();

    public boolean isDef();

    public boolean isVisible();

    public void setPriority(int priority);

    public void setTags(List<String> tags);

    public void setDef(boolean def);

    public void setVisible(boolean visible);
}