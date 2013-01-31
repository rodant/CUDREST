package de.itasesor.client.local.model;

import java.util.List;

/**
 * Created by
 * User: antonio
 * Date: 29.01.13
 * Time: 15:48
 *
 * @author Antonio Rodriguez
 */
public class ResourceAppNode extends AppNode {

    private final String url;

    private final String credential;

    public ResourceAppNode(String name, String url, String credential, List<AppNode> parents) {
        super(name, parents);
        this.url = url;
        this.credential = credential;
    }

    public String getUrl() {
        return url;
    }

    public String getCredential() {
        return credential;
    }

    @Override
    public String toString() {
        return "ResourceAppNode{" +
                "url='" + url + '\'' +
                "} " + super.toString();
    }
}
