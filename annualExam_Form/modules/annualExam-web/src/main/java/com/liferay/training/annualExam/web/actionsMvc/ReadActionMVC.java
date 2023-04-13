//package com.liferay.training.annualExam.web.actionsMvc;
//
//import com.liferay.portal.kernel.dao.orm.QueryUtil;
//import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
//import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
//import com.liferay.training.annualExam.web.constants.AnnualExamPortletKeys;
//import com.liferay.training.annualForm.model.Annualform;
//import com.liferay.training.annualForm.service.AnnualformLocalServiceUtil;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.portlet.PortletException;
//import javax.portlet.RenderRequest;
//import javax.portlet.RenderResponse;
//
//import org.osgi.service.component.annotations.Component;
//
//
//@Component(
//		immediate=true,
//		property= {
//				"javax.portlet.name=" + AnnualExamPortletKeys.ANNUALEXAM,
//				"mvc.command.name=/addEntry"
//		},
//		service = MVCActionCommand.class)
//
//public class ReadActionMVC implements MVCRenderCommand {
//
//	
//	public void read(RenderRequest renderRequest) {
//		List<Annualform> details = AnnualformLocalServiceUtil.getAnnualforms(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
//		renderRequest.setAttribute("details", details);
//	}
//	
//	@Override
//	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
//		read(renderRequest);
//		super.render(renderRequest, renderResponse);
//	}
//
//}
