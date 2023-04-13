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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.annualForm.model.Annualform;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Annualform in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AnnualformCacheModel
	implements CacheModel<Annualform>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AnnualformCacheModel)) {
			return false;
		}

		AnnualformCacheModel annualformCacheModel =
			(AnnualformCacheModel)object;

		if (annualformId == annualformCacheModel.annualformId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, annualformId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{annualformId=");
		sb.append(annualformId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", about=");
		sb.append(about);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", country=");
		sb.append(country);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Annualform toEntityModel() {
		AnnualformImpl annualformImpl = new AnnualformImpl();

		annualformImpl.setAnnualformId(annualformId);
		annualformImpl.setGroupId(groupId);
		annualformImpl.setUserId(userId);

		if (firstName == null) {
			annualformImpl.setFirstName("");
		}
		else {
			annualformImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			annualformImpl.setLastName("");
		}
		else {
			annualformImpl.setLastName(lastName);
		}

		if (about == null) {
			annualformImpl.setAbout("");
		}
		else {
			annualformImpl.setAbout(about);
		}

		if (gender == null) {
			annualformImpl.setGender("");
		}
		else {
			annualformImpl.setGender(gender);
		}

		if (country == null) {
			annualformImpl.setCountry("");
		}
		else {
			annualformImpl.setCountry(country);
		}

		annualformImpl.resetOriginalValues();

		return annualformImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		annualformId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		about = objectInput.readUTF();
		gender = objectInput.readUTF();
		country = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(annualformId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (about == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(about);
		}

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}
	}

	public long annualformId;
	public long groupId;
	public long userId;
	public String firstName;
	public String lastName;
	public String about;
	public String gender;
	public String country;

}