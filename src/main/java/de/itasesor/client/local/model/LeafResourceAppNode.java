/**
 *
 * Created 31.01.13
 *
 * @author rodriguez
 */

package de.itasesor.client.local.model;

import java.util.List;

/**
 *
 */
public class LeafResourceAppNode extends ResourceAppNode {
    public LeafResourceAppNode(String name, String url, String credential, List<AppNode> parents) {
        super(name, url, credential, parents);
    }

    @Override
    public String toString() {
        return "LeafResourceAppNode{} " + super.toString();
    }
}
