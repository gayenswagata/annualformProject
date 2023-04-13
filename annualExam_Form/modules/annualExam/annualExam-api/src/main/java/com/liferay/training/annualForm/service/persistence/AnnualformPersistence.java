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

package com.liferay.training.annualForm.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.annualForm.exception.NoSuchAnnualformException;
import com.liferay.training.annualForm.model.Annualform;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the annualform service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnnualformUtil
 * @generated
 */
@ProviderType
public interface AnnualformPersistence extends BasePersistence<Annualform> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AnnualformUtil} to access the annualform persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the annualforms where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching annualforms
	 */
	public java.util.List<Annualform> findByGroupId(long groupId);

	/**
	 * Returns a range of all the annualforms where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnnualformModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of annualforms
	 * @param end the upper bound of the range of annualforms (not inclusive)
	 * @return the range of matching annualforms
	 */
	public java.util.List<Annualform> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the annualforms where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnnualformModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of annualforms
	 * @param end the upper bound of the range of annualforms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching annualforms
	 */
	public java.util.List<Annualform> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Annualform>
			orderByComparator);

	/**
	 * Returns an ordered range of all the annualforms where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnnualformModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of annualforms
	 * @param end the upper bound of the range of annualforms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching annualforms
	 */
	public java.util.List<Annualform> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Annualform>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annualform
	 * @throws NoSuchAnnualformException if a matching annualform could not be found
	 */
	public Annualform findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Annualform>
				orderByComparator)
		throws NoSuchAnnualformException;

	/**
	 * Returns the first annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annualform, or <code>null</code> if a matching annualform could not be found
	 */
	public Annualform fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Annualform>
			orderByComparator);

	/**
	 * Returns the last annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annualform
	 * @throws NoSuchAnnualformException if a matching annualform could not be found
	 */
	public Annualform findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Annualform>
				orderByComparator)
		throws NoSuchAnnualformException;

	/**
	 * Returns the last annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annualform, or <code>null</code> if a matching annualform could not be found
	 */
	public Annualform fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Annualform>
			orderByComparator);

	/**
	 * Returns the annualforms before and after the current annualform in the ordered set where groupId = &#63;.
	 *
	 * @param annualformId the primary key of the current annualform
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next annualform
	 * @throws NoSuchAnnualformException if a annualform with the primary key could not be found
	 */
	public Annualform[] findByGroupId_PrevAndNext(
			long annualformId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Annualform>
				orderByComparator)
		throws NoSuchAnnualformException;

	/**
	 * Removes all the annualforms where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of annualforms where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching annualforms
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the annualform in the entity cache if it is enabled.
	 *
	 * @param annualform the annualform
	 */
	public void cacheResult(Annualform annualform);

	/**
	 * Caches the annualforms in the entity cache if it is enabled.
	 *
	 * @param annualforms the annualforms
	 */
	public void cacheResult(java.util.List<Annualform> annualforms);

	/**
	 * Creates a new annualform with the primary key. Does not add the annualform to the database.
	 *
	 * @param annualformId the primary key for the new annualform
	 * @return the new annualform
	 */
	public Annualform create(long annualformId);

	/**
	 * Removes the annualform with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform that was removed
	 * @throws NoSuchAnnualformException if a annualform with the primary key could not be found
	 */
	public Annualform remove(long annualformId)
		throws NoSuchAnnualformException;

	public Annualform updateImpl(Annualform annualform);

	/**
	 * Returns the annualform with the primary key or throws a <code>NoSuchAnnualformException</code> if it could not be found.
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform
	 * @throws NoSuchAnnualformException if a annualform with the primary key could not be found
	 */
	public Annualform findByPrimaryKey(long annualformId)
		throws NoSuchAnnualformException;

	/**
	 * Returns the annualform with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform, or <code>null</code> if a annualform with the primary key could not be found
	 */
	public Annualform fetchByPrimaryKey(long annualformId);

	/**
	 * Returns all the annualforms.
	 *
	 * @return the annualforms
	 */
	public java.util.List<Annualform> findAll();

	/**
	 * Returns a range of all the annualforms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnnualformModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of annualforms
	 * @param end the upper bound of the range of annualforms (not inclusive)
	 * @return the range of annualforms
	 */
	public java.util.List<Annualform> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the annualforms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnnualformModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of annualforms
	 * @param end the upper bound of the range of annualforms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of annualforms
	 */
	public java.util.List<Annualform> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Annualform>
			orderByComparator);

	/**
	 * Returns an ordered range of all the annualforms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AnnualformModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of annualforms
	 * @param end the upper bound of the range of annualforms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of annualforms
	 */
	public java.util.List<Annualform> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Annualform>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the annualforms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of annualforms.
	 *
	 * @return the number of annualforms
	 */
	public int countAll();

}