package de.itasesor.client.local;

import com.google.gwt.cell.client.AbstractEditableCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.view.client.AbstractDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.TreeViewModel;

/**
 * Created by
 * User: antonio
 * Date: 20.01.13
 * Time: 17:13
 *
 * @author Antonio Rodriguez
 */
public class AppNodeModel implements TreeViewModel {
    @Override
    public <T> NodeInfo<?> getNodeInfo(T value) {
        AbstractDataProvider<AppNode> dataProvider = new AbstractDataProvider<AppNode>() {
            @Override
            protected void onRangeChanged(HasData<AppNode> display) {
            }
        };
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
