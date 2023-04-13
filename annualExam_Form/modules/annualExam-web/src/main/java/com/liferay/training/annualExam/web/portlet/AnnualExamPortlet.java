package com.liferay.training.annualExam.web.portlet;


import com.liferay.training.annualExam.web.constants.AnnualExamPortletKeys;
import com.liferay.training.annualForm.model.Annualform;
import com.liferay.training.annualForm.service.AnnualformLocalService;
import com.liferay.training.annualForm.service.AnnualformLocalServiceUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


import com.liferay.portal.kernel.model.Country;
import com.liferay.portal.kernel.service.CountryServiceUtil;

/**
 * @author me
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=AnnualExam",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AnnualExamPortletKeys.ANNUALEXAM,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AnnualExamPortlet extends MVCPortlet {
	
//	@ProcessAction(name = "addForm")
//	public void addForm(ActionRequest actionRequest, ActionResponse actionResponse) {
//		
//		long annualformId = _counterLocalService.increment();
//		String firstname = ParamUtil.getString(actionRequest, "firstname");
//		String lastname = ParamUtil.getString(actionRequest, "lastname");
//		String about = ParamUtil.getString(actionRequest, "about");
//		String gender = ParamUtil.getString(actionRequest, "gender");
//		String country = ParamUtil.getString(actionRequest, "country");
//		
//		Annualform annualform =  _annualformLocalService.createAnnualform(annualformId);
//		try {
//			annualform.setFirstName(firstname);
//			annualform.setLastName(lastname);
//			annualform.setAbout(about);
//			annualform.setGender(gender);
//			annualform.setCountry(country);
//			
//			_annualformLocalService.addAnnualform(annualform);
//		}
//		catch (Exception e){
//			System.out.println("Something went wrong.");
//		}
//	}
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		read(renderRequest);
		super.render(renderRequest, renderResponse);
	}
	
	public void read(RenderRequest renderRequest) {
		List<Annualform> details = AnnualformLocalServiceUtil.getAnnualforms(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		renderRequest.setAttribute("details", details);
//		System.out.println("abc"+details);
		
		List<Country> data = CountryServiceUtil.getCountries();
		renderRequest.setAttribute("data",data);
//		System.out.println(data+"xyz");
	}
	
	
//	public void countryread(RenderRequest renderRequest) {
//		
//	}
	
	
//	@ProcessAction(name = "deleteEntry")
//	public void deleteEntry(ActionRequest actionRequest, ActionResponse actionResponse) {
//		
//		Long annualformId =  ParamUtil.getLong(actionRequest, "annualformId");
//		
//		try {
//			_annualformLocalService.deleteAnnualform(annualformId);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
	
//	@ProcessAction(name = "updateForm")
//	public void updateForm(ActionRequest actionRequest, ActionResponse actionResponse) {
//		
//		Long annualformId =  ParamUtil.getLong(actionRequest, "annualformId", GetterUtil.DEFAULT_LONG);
//		String firstname = ParamUtil.getString(actionRequest, "firstname", GetterUtil.DEFAULT_STRING);
//		String lastname = ParamUtil.getString(actionRequest, "lastname",GetterUtil.DEFAULT_STRING);
//		String about = ParamUtil.getString(actionRequest, "about",GetterUtil.DEFAULT_STRING);
//		String gender = ParamUtil.getString(actionRequest, "gender",GetterUtil.DEFAULT_STRING);
//		String country = ParamUtil.getString(actionRequest, "country",GetterUtil.DEFAULT_STRING);
//		
//		Annualform annualform = null;
////		System.out.println(annualformId);
//		
//		try {
//			annualform = AnnualformLocalServiceUtil.getAnnualform(annualformId);
//		}
//		catch (Exception e){
//			e.printStackTrace();
//		}
//		
//		if(Validator.isNotNull(annualform)) {
//			annualform.setFirstName(firstname);
//			annualform.setLastName(lastname);
//			annualform.setAbout(about);
//			annualform.setGender(gender);
//			annualform.setCountry(country);
//			
//			AnnualformLocalServiceUtil.updateAnnualform(annualform);
//		}
//	}
	
		
	
//	@Override
//	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException,PortletException{
//		super.doView(renderRequest, renderResponse);
//	}
	
	@Reference
	private AnnualformLocalService _annualformLocalService;
	
	@Reference
	private CounterLocalService _counterLocalService;
}