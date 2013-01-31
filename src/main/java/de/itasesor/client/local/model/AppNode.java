
package de.itasesor.client.local.model;

import com.google.gwt.view.client.ProvidesKey;

import javax.validation.constraints.NotNull;

/**
 * Created by User: antonio Date: 20.01.13 Time: 17:15
 *
 * @author Antonio Rodriguez
 */
public class AppNode {
    public static final ProvidesKey<AppNode> KEY_PROVIDER = new ProvidesKey<AppNode>() {
        @Override
        public Object getKey(AppNode item) {
            return item != null ? item.getName() : null;
        }
    };

    @NotNull
    private final String name;

    private final AppNode parentNode;

    public AppNode(String name, AppNode parentNode) {
        this.parentNode = parentNode;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AppNode getParentNode() {
        return parentNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppNode appNode = (AppNode) o;

        if (!name.equals(appNode.name)) return false;
        if (parentNode != null ? !parentNode.equals(appNode.parentNode) : appNode.parentNode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (parentNode != null ? parentNode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AppNode{" +
                "name='" + name + '\'' +
                ", parentNode=" + parentNode +
                '}';
    }
}
