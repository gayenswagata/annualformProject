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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.annualForm.model.Annualform;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the annualform service. This utility wraps <code>com.liferay.training.annualForm.service.persistence.impl.AnnualformPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnnualformPersistence
 * @generated
 */
public class AnnualformUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Annualform annualform) {
		getPersistence().clearCache(annualform);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Annualform> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Annualform> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Annualform> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Annualform> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Annualform> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Annualform update(Annualform annualform) {
		return getPersistence().update(annualform);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Annualform update(
		Annualform annualform, ServiceContext serviceContext) {

		return getPersistence().update(annualform, serviceContext);
	}

	/**
	 * Returns all the annualforms where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching annualforms
	 */
	public static List<Annualform> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<Annualform> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<Annualform> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Annualform> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

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
	public static List<Annualform> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Annualform> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annualform
	 * @throws NoSuchAnnualformException if a matching annualform could not be found
	 */
	public static Annualform findByGroupId_First(
			long groupId, OrderByComparator<Annualform> orderByComparator)
		throws com.liferay.training.annualForm.exception.
			NoSuchAnnualformException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annualform, or <code>null</code> if a matching annualform could not be found
	 */
	public static Annualform fetchByGroupId_First(
		long groupId, OrderByComparator<Annualform> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annualform
	 * @throws NoSuchAnnualformException if a matching annualform could not be found
	 */
	public static Annualform findByGroupId_Last(
			long groupId, OrderByComparator<Annualform> orderByComparator)
		throws com.liferay.training.annualForm.exception.
			NoSuchAnnualformException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annualform, or <code>null</code> if a matching annualform could not be found
	 */
	public static Annualform fetchByGroupId_Last(
		long groupId, OrderByComparator<Annualform> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the annualforms before and after the current annualform in the ordered set where groupId = &#63;.
	 *
	 * @param annualformId the primary key of the current annualform
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next annualform
	 * @throws NoSuchAnnualformException if a annualform with the primary key could not be found
	 */
	public static Annualform[] findByGroupId_PrevAndNext(
			long annualformId, long groupId,
			OrderByComparator<Annualform> orderByComparator)
		throws com.liferay.training.annualForm.exception.
			NoSuchAnnualformException {

		return getPersistence().findByGroupId_PrevAndNext(
			annualformId, groupId, orderByComparator);
	}

	/**
	 * Removes all the annualforms where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of annualforms where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching annualforms
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Caches the annualform in the entity cache if it is enabled.
	 *
	 * @param annualform the annualform
	 */
	public static void cacheResult(Annualform annualform) {
		getPersistence().cacheResult(annualform);
	}

	/**
	 * Caches the annualforms in the entity cache if it is enabled.
	 *
	 * @param annualforms the annualforms
	 */
	public static void cacheResult(List<Annualform> annualforms) {
		getPersistence().cacheResult(annualforms);
	}

	/**
	 * Creates a new annualform with the primary key. Does not add the annualform to the database.
	 *
	 * @param annualformId the primary key for the new annualform
	 * @return the new annualform
	 */
	public static Annualform create(long annualformId) {
		return getPersistence().create(annualformId);
	}

	/**
	 * Removes the annualform with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform that was removed
	 * @throws NoSuchAnnualformException if a annualform with the primary key could not be found
	 */
	public static Annualform remove(long annualformId)
		throws com.liferay.training.annualForm.exception.
			NoSuchAnnualformException {

		return getPersistence().remove(annualformId);
	}

	public static Annualform updateImpl(Annualform annualform) {
		return getPersistence().updateImpl(annualform);
	}

	/**
	 * Returns the annualform with the primary key or throws a <code>NoSuchAnnualformException</code> if it could not be found.
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform
	 * @throws NoSuchAnnualformException if a annualform with the primary key could not be found
	 */
	public static Annualform findByPrimaryKey(long annualformId)
		throws com.liferay.training.annualForm.exception.
			NoSuchAnnualformException {

		return getPersistence().findByPrimaryKey(annualformId);
	}

	/**
	 * Returns the annualform with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform, or <code>null</code> if a annualform with the primary key could not be found
	 */
	public static Annualform fetchByPrimaryKey(long annualformId) {
		return getPersistence().fetchByPrimaryKey(annualformId);
	}

	/**
	 * Returns all the annualforms.
	 *
	 * @return the annualforms
	 */
	public static List<Annualform> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Annualform> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Annualform> findAll(
		int start, int end, OrderByComparator<Annualform> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Annualform> findAll(
		int start, int end, OrderByComparator<Annualform> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the annualforms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of annualforms.
	 *
	 * @return the number of annualforms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AnnualformPersistence getPersistence() {
		return _persistence;
	}

	private static volatile AnnualformPersistence _persistence;

}