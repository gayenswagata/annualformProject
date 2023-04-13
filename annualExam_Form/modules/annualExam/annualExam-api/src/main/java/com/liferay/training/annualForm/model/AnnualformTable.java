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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;annualform&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Annualform
 * @generated
 */
public class AnnualformTable extends BaseTable<AnnualformTable> {

	public static final AnnualformTable INSTANCE = new AnnualformTable();

	public final Column<AnnualformTable, Long> annualformId = createColumn(
		"annualformId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AnnualformTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AnnualformTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AnnualformTable, String> firstName = createColumn(
		"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AnnualformTable, String> lastName = createColumn(
		"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AnnualformTable, String> about = createColumn(
		"about", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AnnualformTable, String> gender = createColumn(
		"gender", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AnnualformTable, String> country = createColumn(
		"country", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AnnualformTable() {
		super("annualform", AnnualformTable::new);
	}

}