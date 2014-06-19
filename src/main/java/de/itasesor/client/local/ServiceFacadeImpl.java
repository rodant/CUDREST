/**
 *
 * Created 01.02.13
 *
 * @author rodriguez
 */

package de.itasesor.client.local;

import com.google.common.collect.Lists;
import de.itasesor.client.local.model.AppNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to encapsulate the data access services.
 */
public class ServiceFacadeImpl {
    private final KeyValueDatabase database;
    private static final Map<String, AppNode> nodeNameToNode = new HashMap<String, AppNode>();

    static {
        AppNode node1 = new AppNode("Node 1", Lists.newArrayList(AppNode.ROOT_NODE));
        AppNode node2 = new AppNode("Node 2", Lists.newArrayList(AppNode.ROOT_NODE));
        AppNode node3 = new AppNode("Node 3", Lists.newArrayList(AppNode.ROOT_NODE));
        nodeNameToNode.put("Node 1", node1);
        nodeNameToNode.put("Node 2", node2);
        nodeNameToNode.put("Node 3", node3);
        nodeNameToNode.put("Node 11", new AppNode("Node 11", Lists.newArrayList(node1, node3)));
    }

    public ServiceFacadeImpl(KeyValueDatabase database) {
        this.database = database;
    }

    public List<? extends AppNode> getChildNodes(AppNode node) {
        return new ArrayList<AppNode>();
    }
}
