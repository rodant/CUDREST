package de.itasesor.client.local;

import com.google.common.collect.Lists;
import com.google.gwt.cell.client.AbstractEditableCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.view.client.AbstractDataProvider;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.TreeViewModel;
import de.itasesor.client.local.AppNodeCellRenderer;
import de.itasesor.client.local.ServiceFacade;
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
    private final ServiceFacade serviceFacade;

    @Inject
    public AppTreeModel(ServiceFacade serviceFacade) {
        this.serviceFacade = serviceFacade;
    }

    @Override
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
