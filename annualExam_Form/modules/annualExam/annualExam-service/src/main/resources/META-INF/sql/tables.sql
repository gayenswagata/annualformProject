create table annualform (
	annualformId LONG not null primary key,
	groupId LONG,
	userId LONG,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	about VARCHAR(75) null,
	gender VARCHAR(75) null,
	country VARCHAR(75) null
);