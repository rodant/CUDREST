/**
 *
 * Created 01.02.13
 *
 * @author rodriguez
 */

package de.itasesor.client.local;

import com.google.common.collect.Lists;
import de.itasesor.client.local.model.AppNode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class KeyValueDatabase {
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

    public AppNode getAppNode(String name) {
        return nodeNameToNode.get(name);
    }
}
