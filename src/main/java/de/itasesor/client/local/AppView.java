package de.itasesor.client.local;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTree;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.view.client.TreeViewModel;
import de.itasesor.client.local.model.AppTreeModel;

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

    public AppView() {
        TreeViewModel treeModel = new AppTreeModel();
        CellTree.Resources res = GWT.create(CellTree.BasicResources.class);
        tree = new CellTree(treeModel, null, res);

        HTMLPanel rootElement = ourUiBinder.createAndBindUi(this);

        initWidget(rootElement);
    }
}