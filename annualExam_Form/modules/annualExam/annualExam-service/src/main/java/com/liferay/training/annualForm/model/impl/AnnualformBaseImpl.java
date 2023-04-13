/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.annualForm.model.impl;

import com.liferay.training.annualForm.model.Annualform;
import com.liferay.training.annualForm.service.AnnualformLocalServiceUtil;

/**
 * The extended model base implementation for the Annualform service. Represents a row in the &quot;annualform&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AnnualformImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnnualformImpl
 * @see Annualform
 * @generated
 */
public abstract class AnnualformBaseImpl
	extends AnnualformModelImpl implements Annualform {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a annualform model instance should use the <code>Annualform</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AnnualformLocalServiceUtil.addAnnualform(this);
		}
		else {
			AnnualformLocalServiceUtil.updateAnnualform(this);
		}
	}

}