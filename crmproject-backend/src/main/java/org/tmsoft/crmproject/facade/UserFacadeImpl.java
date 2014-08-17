package org.tmsoft.crmproject.facade;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.tmsoft.crmproject.api.facade.UserFacade;

/**
 * Created by tomasmrianek on 17.08.14.
 */
@Service(value = "userFacade")
public class UserFacadeImpl implements UserFacade {
	@Override
	public String getMessage() {
		return "FUCK OFF";
	}
}
