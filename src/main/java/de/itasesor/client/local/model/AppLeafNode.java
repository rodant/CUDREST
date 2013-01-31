package de.itasesor.client.local.model;

/**
 * Created by
 * User: antonio
 * Date: 29.01.13
 * Time: 15:48
 *
 * @author Antonio Rodriguez
 */
public class AppLeafNode extends AppNode {

    private final String url;

    private final String credential;

    public AppLeafNode(String name, String url, String credential, AppNode parentNode) {
        super(name, parentNode);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AppLeafNode that = (AppLeafNode) o;

        if (credential != null ? !credential.equals(that.credential) : that.credential != null) return false;
        if (!url.equals(that.url)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + url.hashCode();
        result = 31 * result + (credential != null ? credential.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AppLeafNode{" +
                "url='" + url + '\'' +
                ", credential='" + credential + '\'' +
                "} " + super.toString();
    }
}
