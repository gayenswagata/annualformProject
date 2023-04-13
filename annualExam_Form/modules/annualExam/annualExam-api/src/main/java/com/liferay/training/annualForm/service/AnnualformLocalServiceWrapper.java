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

package com.liferay.training.annualForm.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AnnualformLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AnnualformLocalService
 * @generated
 */
public class AnnualformLocalServiceWrapper
	implements AnnualformLocalService, ServiceWrapper<AnnualformLocalService> {

	public AnnualformLocalServiceWrapper() {
		this(null);
	}

	public AnnualformLocalServiceWrapper(
		AnnualformLocalService annualformLocalService) {

		_annualformLocalService = annualformLocalService;
	}

	/**
	 * Adds the annualform to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AnnualformLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param annualform the annualform
	 * @return the annualform that was added
	 */
	@Override
	public com.liferay.training.annualForm.model.Annualform addAnnualform(
		com.liferay.training.annualForm.model.Annualform annualform) {

		return _annualformLocalService.addAnnualform(annualform);
	}

	/**
	 * Creates a new annualform with the primary key. Does not add the annualform to the database.
	 *
	 * @param annualformId the primary key for the new annualform
	 * @return the new annualform
	 */
	@Override
	public com.liferay.training.annualForm.model.Annualform createAnnualform(
		long annualformId) {

		return _annualformLocalService.createAnnualform(annualformId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _annualformLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the annualform from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AnnualformLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param annualform the annualform
	 * @return the annualform that was removed
	 */
	@Override
	public com.liferay.training.annualForm.model.Annualform deleteAnnualform(
		com.liferay.training.annualForm.model.Annualform annualform) {

		return _annualformLocalService.deleteAnnualform(annualform);
	}

	/**
	 * Deletes the annualform with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AnnualformLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform that was removed
	 * @throws PortalException if a annualform with the primary key could not be found
	 */
	@Override
	public com.liferay.training.annualForm.model.Annualform deleteAnnualform(
			long annualformId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _annualformLocalService.deleteAnnualform(annualformId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _annualformLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _annualformLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _annualformLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _annualformLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _annualformLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.annualForm.model.impl.AnnualformModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _annualformLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.annualForm.model.impl.AnnualformModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _annualformLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _annualformLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _annualformLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.annualForm.model.Annualform fetchAnnualform(
		long annualformId) {

		return _annualformLocalService.fetchAnnualform(annualformId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _annualformLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the annualform with the primary key.
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform
	 * @throws PortalException if a annualform with the primary key could not be found
	 */
	@Override
	public com.liferay.training.annualForm.model.Annualform getAnnualform(
			long annualformId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _annualformLocalService.getAnnualform(annualformId);
	}

	/**
	 * Returns a range of all the annualforms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.annualForm.model.impl.AnnualformModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of annualforms
	 * @param end the upper bound of the range of annualforms (not inclusive)
	 * @return the range of annualforms
	 */
	@Override
	public java.util.List<com.liferay.training.annualForm.model.Annualform>
		getAnnualforms(int start, int end) {

		return _annualformLocalService.getAnnualforms(start, end);
	}

	/**
	 * Returns the number of annualforms.
	 *
	 * @return the number of annualforms
	 */
	@Override
	public int getAnnualformsCount() {
		return _annualformLocalService.getAnnualformsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _annualformLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _annualformLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _annualformLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the annualform in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AnnualformLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param annualform the annualform
	 * @return the annualform that was updated
	 */
	@Override
	public com.liferay.training.annualForm.model.Annualform updateAnnualform(
		com.liferay.training.annualForm.model.Annualform annualform) {

		return _annualformLocalService.updateAnnualform(annualform);
	}

	@Override
	public AnnualformLocalService getWrappedService() {
		return _annualformLocalService;
	}

	@Override
	public void setWrappedService(
		AnnualformLocalService annualformLocalService) {

		_annualformLocalService = annualformLocalService;
	}

	private AnnualformLocalService _annualformLocalService;

}