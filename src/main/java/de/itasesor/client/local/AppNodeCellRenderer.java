/**
 *
 * Created 01.02.13
 *
 * @author rodriguez
 */

package de.itasesor.client.local;

import com.google.gwt.cell.client.AbstractEditableCell;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import de.itasesor.client.local.model.AppNode;

/**
 *
 */
public class AppNodeCellRenderer extends AbstractEditableCell<AppNode, AppNode> {
    @Override
    public boolean isEditing(Context context, Element parent, AppNode value) {
        return false;
    }

    @Override
    public void render(Context context, AppNode value, SafeHtmlBuilder sb) {
        sb.appendEscaped(value.getName());
    }
}
