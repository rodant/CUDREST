package de.itasesor.client.local;

import com.google.gwt.view.client.AbstractDataProvider;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.TreeViewModel;
import de.itasesor.client.local.model.AppNode;
import de.itasesor.client.local.model.LeafResourceAppNode;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by
 * User: antonio
 * Date: 20.01.13
 * Time: 17:13
 *
 * @author Antonio Rodriguez
 */
public class AppTreeModel implements TreeViewModel {
    private final ServiceFacadeImpl serviceFacade;

    @Inject
    public AppTreeModel(ServiceFacadeImpl serviceFacade) {
        this.serviceFacade = serviceFacade;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> NodeInfo<AppNode> getNodeInfo(T value) {
        if (!(value instanceof AppNode)) {
            throw new IllegalArgumentException("Unexpected value type. Only instances of AppNode allowed.");
        }
        final AppNode appNode = (AppNode) value;
        final List<? extends AppNode> nodes = serviceFacade.getChildNodes(appNode);
        AbstractDataProvider<AppNode> dataProvider = new ListDataProvider<AppNode>((List<AppNode>) nodes, AppNode.KEY_PROVIDER);
        return new DefaultNodeInfo<AppNode>(dataProvider, new AppNodeCellRenderer());
    }

    @Override
    public boolean isLeaf(Object value) {
        return value instanceof LeafResourceAppNode;
    }
}
