package de.itasesor.client.local;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTree;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import de.itasesor.client.local.model.AppNode;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: rodriguez
 * Date: 18.01.13
 * Time: 14:19
 *
 * @author Antonio Rodriguez
 */
public class AppView extends Composite {
    interface AppViewUiBinder extends UiBinder<HTMLPanel, AppView> {
    }

    private static AppViewUiBinder ourUiBinder = GWT.create(AppViewUiBinder.class);

    @UiField(provided = true)
    CellTree tree;

    @Inject
    public AppView(AppTreeModel treeModel) {
        CellTree.Resources res = GWT.create(CellTree.BasicResources.class);
        tree = new CellTree(treeModel, AppNode.ROOT_NODE, res);

        HTMLPanel rootElement = ourUiBinder.createAndBindUi(this);

        initWidget(rootElement);
    }
}