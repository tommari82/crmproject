package org.tmsoft.crmproject.gui.pages;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.tmsoft.crmproject.api.facade.UserFacade;

/**
 * Created by tomasmrianek on 17.08.14.
 */
public class HomePage extends BasePage {

	@SpringBean
	UserFacade userFacade;

	public HomePage(PageParameters parameters) {
		super(parameters);

		add(new Label("text", userFacade.getMessage()));
	}

}
