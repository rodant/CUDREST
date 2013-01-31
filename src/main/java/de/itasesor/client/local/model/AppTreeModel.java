package de.itasesor.client.local.model;

import com.google.common.collect.Lists;
import com.google.gwt.cell.client.AbstractEditableCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.view.client.AbstractDataProvider;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.TreeViewModel;

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
    @Override
    public <T> NodeInfo<?> getNodeInfo(T value) {
        AppNode firstChild = new AppNode("1st Child", null);
        AppNode secondChild = new AppNode("2nd Child", null);
        List<AppNode> values = Lists.newArrayList(firstChild, secondChild);
        AbstractDataProvider<AppNode> dataProvider = new ListDataProvider<AppNode>(values, AppNode.KEY_PROVIDER);
        Cell<AppNode> cell = new AbstractEditableCell<AppNode, AppNode>() {
            @Override
            public boolean isEditing(Context context, Element parent, AppNode value) {
                return false;
            }

            @Override
            public void render(Context context, AppNode value, SafeHtmlBuilder sb) {
                sb.appendEscaped(value.getName());
            }
        };
        return new DefaultNodeInfo<AppNode>(dataProvider, cell);
    }

    @Override
    public boolean isLeaf(Object value) {
        return false;
    }
}
