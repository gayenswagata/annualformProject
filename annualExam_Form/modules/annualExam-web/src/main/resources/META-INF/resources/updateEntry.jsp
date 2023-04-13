<%@ include file="init.jsp"%>


<portlet:actionURL name="updateForm" var="updateDetailActionURL"/>

<aui:form action="<%=updateDetailActionURL %>" name="UpdateForm" method="POST">

<%
    String annualformId = renderRequest.getParameter("annualformId");
    String firstName = renderRequest.getParameter("firstName");
    String lastName = renderRequest.getParameter("lastName");
    String about = renderRequest.getParameter("about");
    String gender = renderRequest.getParameter("gender");
    String country = renderRequest.getParameter("country");
%>
    
    
	<aui:input name="annualformId" type="text" value="${annualformId}" readonly="true" />
    
	<aui:input name="firstname" type="text">
         <aui:validator name="required"/>
         <aui:validator name="alpha"/>
         
    </aui:input>
    
    <aui:input name="lastname" type="text">
         <aui:validator name="required"/>
         <aui:validator name="alpha"/>
        
    </aui:input>
    
     <aui:input name="about" type="textarea">
         
    </aui:input>
    
    
    <p>Gender</p>
    <aui:field-wrapper> 
    
    	<aui:input name="gender" type="radio" value="Male" label="Male" />
    		
    	<aui:input name="gender" type="radio" value="Female" label="Female"  />
    	 
    	<aui:input name="gender" type="radio" value="Other" label="Other"  /> 
    	
    </aui:field-wrapper>
	
    
    <aui:select name="country">
     
   		<c:forEach items="${data}" var="category">
        	<aui:option value="${category.nameCurrentValue}">${category.name}</aui:option>
    	</c:forEach>
	</aui:select>
    
    
    <aui:button type="submit" name="" value="Submit"></aui:button>
    
    
     <portlet:renderURL var = "cancel">
		<portlet:param name="mvcPath" value="/view.jsp"/>
	</portlet:renderURL>
   
    <a href="<%= cancel %>" >
    <aui:button name="cancel" type="button" value="Cancel"  />
    </a>
    
    
</aui:form>








