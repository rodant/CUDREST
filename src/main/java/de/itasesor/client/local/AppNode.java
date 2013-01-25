
package de.itasesor.client.local;

import com.google.gwt.view.client.ProvidesKey;

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
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
