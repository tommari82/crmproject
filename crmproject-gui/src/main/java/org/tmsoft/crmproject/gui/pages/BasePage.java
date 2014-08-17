package org.tmsoft.crmproject.gui.pages;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.tmsoft.crmproject.gui.panels.MainMenuPanel;

/**
 * Created by tomasmrianek on 17.08.14.
 */
public class BasePage extends WebPage {


	public BasePage() {
		super();
		add(new MainMenuPanel("mainMenu"));
	}

	public BasePage(final PageParameters params) {
		super(params);

		add(new MainMenuPanel("mainMenu"));
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);

		response.render(CssHeaderItem.forUrl("css/bootplus.min.css"));
		response.render(CssHeaderItem.forUrl("css/bootplus-responsive.css"));
		response.render(CssHeaderItem.forUrl("css/docs.css"));

	}
}
