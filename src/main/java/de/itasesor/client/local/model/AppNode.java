
package de.itasesor.client.local.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.google.gwt.view.client.ProvidesKey;

/**
 * Created by User: antonio Date: 20.01.13 Time: 17:15
 *
 * @author Antonio Rodriguez
 */
public class AppNode implements Comparable<AppNode> {
    public static final ProvidesKey<AppNode> KEY_PROVIDER = new ProvidesKey<AppNode>() {
        @Override
        public Object getKey(AppNode item) {
            return item != null ? item.getName() : null;
        }
    };

    public static final AppNode ROOT_NODE = new AppNode("ROOT", null);

    @NotNull
    private final String name;

    private final List<AppNode> parents;

    public AppNode(String name, List<AppNode> parents) {
        this.name = name;
        this.parents = parents;
    }

    public String getName() {
        return name;
    }

    public List<AppNode> getParents() {
        return parents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof AppNode))
            return false;

        AppNode appNode = (AppNode) o;

        return name.equals(appNode.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AppNode");
        sb.append("{name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(AppNode appNode) {
        return this.name.compareTo(appNode.getName());
    }
}
