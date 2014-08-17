package org.tmsoft.crmproject.gui.panels;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;
import org.tmsoft.crmproject.gui.pages.HomePage;
import org.tmsoft.crmproject.gui.pages.TasksListPage;

/**
 * Created by tomasmrianek on 17.08.14.
 */
public class MainMenuPanel extends Panel {

	public MainMenuPanel(String id) {
		super(id);

		Link<?> homePage = new Link("homePage") {

			private static final long serialVersionUID = 4842794607517095517L;

			@Override
			public void onClick() {
				redirectToInterceptPage(new HomePage(null));
			}
		};
		add(homePage);

		Link<?> tasksList = new Link("tasksList") {
			private static final long serialVersionUID = 4842794607517095517L;

			@Override
			public void onClick() {
				redirectToInterceptPage(new TasksListPage(null));
			}
		};

		add(tasksList);
	}
}
