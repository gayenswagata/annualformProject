package com.liferay.training.annualExam.web.actionsMvc;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.annualExam.web.constants.AnnualExamPortletKeys;
import com.liferay.training.annualForm.service.AnnualformLocalService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
		immediate=true,
		property= {
				"javax.portlet.name=" + AnnualExamPortletKeys.ANNUALEXAM,
				"mvc.command.name=deleteEntry"
		},
		service = MVCActionCommand.class)

public class DeleteActionMVC extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		
Long annualformId =  ParamUtil.getLong(actionRequest, "annualformId");
		
		try {
			_annualformLocalService.deleteAnnualform(annualformId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Reference
	private AnnualformLocalService _annualformLocalService;

}
