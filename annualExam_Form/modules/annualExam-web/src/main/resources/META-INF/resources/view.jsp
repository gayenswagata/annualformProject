<%@ include file="init.jsp" %>


<p>
	<b><liferay-ui:message key="annualexam.caption"/></b>
</p>


<portlet:renderURL var = "create">
	<portlet:param name="mvcPath" value="/addEntry.jsp"/>
</portlet:renderURL>

<div class="mb-5">
    <a href="<%= create %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add
    </a>
</div>

<%-- the table to show the data --%>


<table class="table table-striped">
	<thead>
	<tr>
		<th>id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>About</th>
		<th>Gender</th>
		<th>Country</th>
		<th>Action</th>
	</tr>
	</thead>
	<tbody>
	 <c:forEach items="${details}" var="annualform">
	 
	 	<portlet:renderURL var="updateEntryRenderURL">
           <portlet:param name="mvcPath" value="/updateEntry.jsp"/>
           <portlet:param name="annualformId" value = "${annualform.annualformId}"/>
           <portlet:param name="firstname" value = "${annualform.firstName}"/>
           <portlet:param name="lastname" value = "${annualform.lastName}"/>
           <portlet:param name="about" value = "${annualform.about}"/>
           <portlet:param name="gender" value = "${annualform.gender}"/>
           <portlet:param name="country" value = "${annualform.country}"/>
     </portlet:renderURL>
        
     <portlet:actionURL name="deleteEntry" var="deleteEntryActionURL">
           <portlet:param name="annualformId" value = "${annualform.getAnnualformId()}"/>
     </portlet:actionURL>
        
        
	 <tr>
	 <td>${annualform.getAnnualformId()}</td>
	 <td>${annualform.getFirstName()}</td>
	 <td>${annualform.getLastName()}</td>
	 <td>${annualform.getAbout()}</td>
	 <td>${annualform.getGender()}</td>
	 <td>${annualform.getCountry()}</td>
	 
	 <td class="text-center" style="width: 50px">
         <a href="<%=updateEntryRenderURL%>" class="btn  btn-primary btn-default " >
          <i class ="glyphicon glyphicon-edit">Edit</i>
          </a>
     </td> 
            
     <td class="text-center" style="width:50px" >
      <a  href="<%=deleteEntryActionURL%>" 
        class="btn  btn-primary btn-default"> 
         <i class ="glyphicon glyphicon-remove"  onclick="return confirm('Are you sure you want to delete this item?');" >
           Delete</i>
      </a>
      </td>
	 </tr>
	  </c:forEach>
	</tbody>
</table>



