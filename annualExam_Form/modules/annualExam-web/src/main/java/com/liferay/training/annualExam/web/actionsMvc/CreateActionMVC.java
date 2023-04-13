package com.liferay.training.annualExam.web.actionsMvc;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.annualExam.web.constants.AnnualExamPortletKeys;

import com.liferay.training.annualForm.model.Annualform;
import com.liferay.training.annualForm.service.AnnualformLocalService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
		immediate=true,
		property= {
				"javax.portlet.name=" + AnnualExamPortletKeys.ANNUALEXAM,
				"mvc.command.name=addForm"
		},
		service = MVCActionCommand.class)

public class CreateActionMVC extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		

		long annualformId = _counterLocalService.increment();
		String firstname = ParamUtil.getString(actionRequest, "firstname");
		String lastname = ParamUtil.getString(actionRequest, "lastname");
		String about = ParamUtil.getString(actionRequest, "about");
		String gender = ParamUtil.getString(actionRequest, "gender");
		String country = ParamUtil.getString(actionRequest, "country");
		
//		System.out.println(country);
		
		Annualform annualform =  _annualformLocalService.createAnnualform(annualformId);
		try {
			annualform.setFirstName(firstname);
			annualform.setLastName(lastname);
			annualform.setAbout(about);
			annualform.setGender(gender);
			annualform.setCountry(country);
			
			_annualformLocalService.addAnnualform(annualform);
		}
		catch (Exception e){
			System.out.println("Something went wrong.");
		}
		
	}
	
	@Reference
	private AnnualformLocalService _annualformLocalService;
	
	@Reference
	private CounterLocalService _counterLocalService;
	
}

