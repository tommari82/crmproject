package org.tmsoft.crmproject.gui.application;

import org.apache.wicket.core.request.mapper.CryptoMapper;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.tmsoft.crmproject.gui.pages.HomePage;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 */
public class CrmProjectWicketApplication extends WebApplication {
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage() {
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init() {
		super.init();
		setRootRequestMapper(new CryptoMapper(getRootRequestMapper(), this));
		getComponentInstantiationListeners().add(new SpringComponentInjector(this));

		//mountPage("/", getHomePage());
		// add your configuration here
	}
}
