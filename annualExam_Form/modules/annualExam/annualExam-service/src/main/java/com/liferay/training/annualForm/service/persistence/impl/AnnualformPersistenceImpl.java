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

package com.liferay.training.annualForm.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.training.annualForm.exception.NoSuchAnnualformException;
import com.liferay.training.annualForm.model.Annualform;
import com.liferay.training.annualForm.model.AnnualformTable;
import com.liferay.training.annualForm.model.impl.AnnualformImpl;
import com.liferay.training.annualForm.model.impl.AnnualformModelImpl;
import com.liferay.training.annualForm.service.persistence.AnnualformPersistence;
import com.liferay.training.annualForm.service.persistence.AnnualformUtil;
import com.liferay.training.annualForm.service.persistence.impl.constants.AnnualformPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the annualform service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AnnualformPersistence.class)
public class AnnualformPersistenceImpl
	extends BasePersistenceImpl<Annualform> implements AnnualformPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AnnualformUtil</code> to access the annualform persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AnnualformImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByGroupId;
	private FinderPath _finderPathWithoutPaginationFindByGroupId;
	private FinderPath _finderPathCountByGroupId;

	/**
	 * Returns all the annualforms where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching annualforms
	 */
	@Override
	public List<Annualform> findByGroupId(long groupId) {
		return findByGroupId(
			groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Annualform> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<Annualform> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Annualform> orderByComparator) {

		return findByGroupId(groupId, start, end, orderByComparator, true);
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
	@Override
	public List<Annualform> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Annualform> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByGroupId;
				finderArgs = new Object[] {groupId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByGroupId;
			finderArgs = new Object[] {groupId, start, end, orderByComparator};
		}

		List<Annualform> list = null;

		if (useFinderCache) {
			list = (List<Annualform>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Annualform annualform : list) {
					if (groupId != annualform.getGroupId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_ANNUALFORM_WHERE);

			sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AnnualformModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				list = (List<Annualform>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annualform
	 * @throws NoSuchAnnualformException if a matching annualform could not be found
	 */
	@Override
	public Annualform findByGroupId_First(
			long groupId, OrderByComparator<Annualform> orderByComparator)
		throws NoSuchAnnualformException {

		Annualform annualform = fetchByGroupId_First(
			groupId, orderByComparator);

		if (annualform != null) {
			return annualform;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchAnnualformException(sb.toString());
	}

	/**
	 * Returns the first annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annualform, or <code>null</code> if a matching annualform could not be found
	 */
	@Override
	public Annualform fetchByGroupId_First(
		long groupId, OrderByComparator<Annualform> orderByComparator) {

		List<Annualform> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annualform
	 * @throws NoSuchAnnualformException if a matching annualform could not be found
	 */
	@Override
	public Annualform findByGroupId_Last(
			long groupId, OrderByComparator<Annualform> orderByComparator)
		throws NoSuchAnnualformException {

		Annualform annualform = fetchByGroupId_Last(groupId, orderByComparator);

		if (annualform != null) {
			return annualform;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchAnnualformException(sb.toString());
	}

	/**
	 * Returns the last annualform in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annualform, or <code>null</code> if a matching annualform could not be found
	 */
	@Override
	public Annualform fetchByGroupId_Last(
		long groupId, OrderByComparator<Annualform> orderByComparator) {

		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Annualform> list = findByGroupId(
			groupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Annualform[] findByGroupId_PrevAndNext(
			long annualformId, long groupId,
			OrderByComparator<Annualform> orderByComparator)
		throws NoSuchAnnualformException {

		Annualform annualform = findByPrimaryKey(annualformId);

		Session session = null;

		try {
			session = openSession();

			Annualform[] array = new AnnualformImpl[3];

			array[0] = getByGroupId_PrevAndNext(
				session, annualform, groupId, orderByComparator, true);

			array[1] = annualform;

			array[2] = getByGroupId_PrevAndNext(
				session, annualform, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Annualform getByGroupId_PrevAndNext(
		Session session, Annualform annualform, long groupId,
		OrderByComparator<Annualform> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ANNUALFORM_WHERE);

		sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AnnualformModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(annualform)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Annualform> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the annualforms where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (Annualform annualform :
				findByGroupId(
					groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(annualform);
		}
	}

	/**
	 * Returns the number of annualforms where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching annualforms
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = _finderPathCountByGroupId;

		Object[] finderArgs = new Object[] {groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ANNUALFORM_WHERE);

			sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 =
		"annualform.groupId = ?";

	public AnnualformPersistenceImpl() {
		setModelClass(Annualform.class);

		setModelImplClass(AnnualformImpl.class);
		setModelPKClass(long.class);

		setTable(AnnualformTable.INSTANCE);
	}

	/**
	 * Caches the annualform in the entity cache if it is enabled.
	 *
	 * @param annualform the annualform
	 */
	@Override
	public void cacheResult(Annualform annualform) {
		entityCache.putResult(
			AnnualformImpl.class, annualform.getPrimaryKey(), annualform);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the annualforms in the entity cache if it is enabled.
	 *
	 * @param annualforms the annualforms
	 */
	@Override
	public void cacheResult(List<Annualform> annualforms) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (annualforms.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Annualform annualform : annualforms) {
			if (entityCache.getResult(
					AnnualformImpl.class, annualform.getPrimaryKey()) == null) {

				cacheResult(annualform);
			}
		}
	}

	/**
	 * Clears the cache for all annualforms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AnnualformImpl.class);

		finderCache.clearCache(AnnualformImpl.class);
	}

	/**
	 * Clears the cache for the annualform.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Annualform annualform) {
		entityCache.removeResult(AnnualformImpl.class, annualform);
	}

	@Override
	public void clearCache(List<Annualform> annualforms) {
		for (Annualform annualform : annualforms) {
			entityCache.removeResult(AnnualformImpl.class, annualform);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AnnualformImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AnnualformImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new annualform with the primary key. Does not add the annualform to the database.
	 *
	 * @param annualformId the primary key for the new annualform
	 * @return the new annualform
	 */
	@Override
	public Annualform create(long annualformId) {
		Annualform annualform = new AnnualformImpl();

		annualform.setNew(true);
		annualform.setPrimaryKey(annualformId);

		return annualform;
	}

	/**
	 * Removes the annualform with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform that was removed
	 * @throws NoSuchAnnualformException if a annualform with the primary key could not be found
	 */
	@Override
	public Annualform remove(long annualformId)
		throws NoSuchAnnualformException {

		return remove((Serializable)annualformId);
	}

	/**
	 * Removes the annualform with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the annualform
	 * @return the annualform that was removed
	 * @throws NoSuchAnnualformException if a annualform with the primary key could not be found
	 */
	@Override
	public Annualform remove(Serializable primaryKey)
		throws NoSuchAnnualformException {

		Session session = null;

		try {
			session = openSession();

			Annualform annualform = (Annualform)session.get(
				AnnualformImpl.class, primaryKey);

			if (annualform == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAnnualformException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(annualform);
		}
		catch (NoSuchAnnualformException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Annualform removeImpl(Annualform annualform) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(annualform)) {
				annualform = (Annualform)session.get(
					AnnualformImpl.class, annualform.getPrimaryKeyObj());
			}

			if (annualform != null) {
				session.delete(annualform);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (annualform != null) {
			clearCache(annualform);
		}

		return annualform;
	}

	@Override
	public Annualform updateImpl(Annualform annualform) {
		boolean isNew = annualform.isNew();

		if (!(annualform instanceof AnnualformModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(annualform.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(annualform);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in annualform proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Annualform implementation " +
					annualform.getClass());
		}

		AnnualformModelImpl annualformModelImpl =
			(AnnualformModelImpl)annualform;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(annualform);
			}
			else {
				annualform = (Annualform)session.merge(annualform);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AnnualformImpl.class, annualformModelImpl, false, true);

		if (isNew) {
			annualform.setNew(false);
		}

		annualform.resetOriginalValues();

		return annualform;
	}

	/**
	 * Returns the annualform with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the annualform
	 * @return the annualform
	 * @throws NoSuchAnnualformException if a annualform with the primary key could not be found
	 */
	@Override
	public Annualform findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAnnualformException {

		Annualform annualform = fetchByPrimaryKey(primaryKey);

		if (annualform == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAnnualformException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return annualform;
	}

	/**
	 * Returns the annualform with the primary key or throws a <code>NoSuchAnnualformException</code> if it could not be found.
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform
	 * @throws NoSuchAnnualformException if a annualform with the primary key could not be found
	 */
	@Override
	public Annualform findByPrimaryKey(long annualformId)
		throws NoSuchAnnualformException {

		return findByPrimaryKey((Serializable)annualformId);
	}

	/**
	 * Returns the annualform with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param annualformId the primary key of the annualform
	 * @return the annualform, or <code>null</code> if a annualform with the primary key could not be found
	 */
	@Override
	public Annualform fetchByPrimaryKey(long annualformId) {
		return fetchByPrimaryKey((Serializable)annualformId);
	}

	/**
	 * Returns all the annualforms.
	 *
	 * @return the annualforms
	 */
	@Override
	public List<Annualform> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Annualform> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Annualform> findAll(
		int start, int end, OrderByComparator<Annualform> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Annualform> findAll(
		int start, int end, OrderByComparator<Annualform> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Annualform> list = null;

		if (useFinderCache) {
			list = (List<Annualform>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ANNUALFORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ANNUALFORM;

				sql = sql.concat(AnnualformModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Annualform>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the annualforms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Annualform annualform : findAll()) {
			remove(annualform);
		}
	}

	/**
	 * Returns the number of annualforms.
	 *
	 * @return the number of annualforms
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ANNUALFORM);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "annualformId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ANNUALFORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AnnualformModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the annualform persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByGroupId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"groupId"}, true);

		_finderPathWithoutPaginationFindByGroupId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] {Long.class.getName()}, new String[] {"groupId"},
			true);

		_finderPathCountByGroupId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] {Long.class.getName()}, new String[] {"groupId"},
			false);

		_setAnnualformUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAnnualformUtilPersistence(null);

		entityCache.removeCache(AnnualformImpl.class.getName());
	}

	private void _setAnnualformUtilPersistence(
		AnnualformPersistence annualformPersistence) {

		try {
			Field field = AnnualformUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, annualformPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = AnnualformPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = AnnualformPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = AnnualformPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ANNUALFORM =
		"SELECT annualform FROM Annualform annualform";

	private static final String _SQL_SELECT_ANNUALFORM_WHERE =
		"SELECT annualform FROM Annualform annualform WHERE ";

	private static final String _SQL_COUNT_ANNUALFORM =
		"SELECT COUNT(annualform) FROM Annualform annualform";

	private static final String _SQL_COUNT_ANNUALFORM_WHERE =
		"SELECT COUNT(annualform) FROM Annualform annualform WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "annualform.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Annualform exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Annualform exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AnnualformPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}