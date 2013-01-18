package de.itasesor.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTree;

/**
 * Created with IntelliJ IDEA.
 * User: rodriguez
 * Date: 18.01.13
 * Time: 14:19
 * To change this template use File | Settings | File Templates.
 */
public class AppView {
    interface AppViewUiBinder extends UiBinder<DivElement, AppView> {
    }

    private static AppViewUiBinder ourUiBinder = GWT.create(AppViewUiBinder.class);
    @UiField
    CellTree tree;

    public AppView() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);

    }
}