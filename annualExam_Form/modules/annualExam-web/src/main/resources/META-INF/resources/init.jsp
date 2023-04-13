


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>


<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>



<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay" %>
<%@ taglib prefix="liferay-item-selector" uri="http://liferay.com/tld/item-selector" %>
<%@ taglib prefix="liferay-frontend" uri="http://liferay.com/tld/frontend" %>


<%@ page import="javax.portlet.WindowState"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil"%>


<%@ page import = "com.liferay.portal.kernel.model.Country" %>
<%@ page import = "com.liferay.portal.kernel.service.CountryServiceUtil" %>


<%@page import = "com.liferay.training.annualForm.model.Annualform" %>
<%@page import = "com.liferay.training.annualForm.service.AnnualformLocalServiceUtil" %>

<%@ page import="java.util.List"%>
<script type="text/javascript"><%@include file="javascript.js" %></script>


<liferay-frontend:defineObjects />
<liferay-theme:defineObjects />
<portlet:defineObjects />