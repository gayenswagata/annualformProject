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

package com.liferay.training.annualForm.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Annualform}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Annualform
 * @generated
 */
public class AnnualformWrapper
	extends BaseModelWrapper<Annualform>
	implements Annualform, ModelWrapper<Annualform> {

	public AnnualformWrapper(Annualform annualform) {
		super(annualform);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("annualformId", getAnnualformId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("about", getAbout());
		attributes.put("gender", getGender());
		attributes.put("country", getCountry());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long annualformId = (Long)attributes.get("annualformId");

		if (annualformId != null) {
			setAnnualformId(annualformId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String about = (String)attributes.get("about");

		if (about != null) {
			setAbout(about);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}
	}

	@Override
	public Annualform cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the about of this annualform.
	 *
	 * @return the about of this annualform
	 */
	@Override
	public String getAbout() {
		return model.getAbout();
	}

	/**
	 * Returns the annualform ID of this annualform.
	 *
	 * @return the annualform ID of this annualform
	 */
	@Override
	public long getAnnualformId() {
		return model.getAnnualformId();
	}

	/**
	 * Returns the country of this annualform.
	 *
	 * @return the country of this annualform
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the first name of this annualform.
	 *
	 * @return the first name of this annualform
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the gender of this annualform.
	 *
	 * @return the gender of this annualform
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the group ID of this annualform.
	 *
	 * @return the group ID of this annualform
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last name of this annualform.
	 *
	 * @return the last name of this annualform
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the primary key of this annualform.
	 *
	 * @return the primary key of this annualform
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this annualform.
	 *
	 * @return the user ID of this annualform
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this annualform.
	 *
	 * @return the user uuid of this annualform
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the about of this annualform.
	 *
	 * @param about the about of this annualform
	 */
	@Override
	public void setAbout(String about) {
		model.setAbout(about);
	}

	/**
	 * Sets the annualform ID of this annualform.
	 *
	 * @param annualformId the annualform ID of this annualform
	 */
	@Override
	public void setAnnualformId(long annualformId) {
		model.setAnnualformId(annualformId);
	}

	/**
	 * Sets the country of this annualform.
	 *
	 * @param country the country of this annualform
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the first name of this annualform.
	 *
	 * @param firstName the first name of this annualform
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the gender of this annualform.
	 *
	 * @param gender the gender of this annualform
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the group ID of this annualform.
	 *
	 * @param groupId the group ID of this annualform
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last name of this annualform.
	 *
	 * @param lastName the last name of this annualform
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the primary key of this annualform.
	 *
	 * @param primaryKey the primary key of this annualform
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this annualform.
	 *
	 * @param userId the user ID of this annualform
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this annualform.
	 *
	 * @param userUuid the user uuid of this annualform
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AnnualformWrapper wrap(Annualform annualform) {
		return new AnnualformWrapper(annualform);
	}

}