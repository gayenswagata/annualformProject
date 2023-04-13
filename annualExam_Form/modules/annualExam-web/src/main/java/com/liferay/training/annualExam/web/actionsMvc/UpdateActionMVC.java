package com.liferay.training.annualExam.web.actionsMvc;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.training.annualExam.web.constants.AnnualExamPortletKeys;
import com.liferay.training.annualForm.model.Annualform;
import com.liferay.training.annualForm.service.AnnualformLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;


@Component(
		immediate=true,
		property= {
				"javax.portlet.name=" + AnnualExamPortletKeys.ANNUALEXAM,
				"mvc.command.name=updateForm"
		},
		service = MVCActionCommand.class)


public class UpdateActionMVC extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub

		Long annualformId =  ParamUtil.getLong(actionRequest, "annualformId", GetterUtil.DEFAULT_LONG);
		String firstname = ParamUtil.getString(actionRequest, "firstname", GetterUtil.DEFAULT_STRING);
		String lastname = ParamUtil.getString(actionRequest, "lastname",GetterUtil.DEFAULT_STRING);
		String about = ParamUtil.getString(actionRequest, "about",GetterUtil.DEFAULT_STRING);
		String gender = ParamUtil.getString(actionRequest, "gender",GetterUtil.DEFAULT_STRING);
		String country = ParamUtil.getString(actionRequest, "country",GetterUtil.DEFAULT_STRING);
		
		Annualform annualform = null;
//		System.out.println(annualformId);
		
		try {
			annualform = AnnualformLocalServiceUtil.getAnnualform(annualformId);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		if(Validator.isNotNull(annualform)) {
			annualform.setFirstName(firstname);
			annualform.setLastName(lastname);
			annualform.setAbout(about);
			annualform.setGender(gender);
			annualform.setCountry(country);
			
			AnnualformLocalServiceUtil.updateAnnualform(annualform);
		}
	}

}
