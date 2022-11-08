<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
		<input type="text" name="Courseno" placeholder="Courseno"/><br/><br/>

		Select Duration:
		<select name="Duration" >
		<option value="2months">2months</option>
		<option value="3months">3months</option>
		<option value="6months">6months</option>		
		<option value="1 year">1 year</option>
		<option value="2 years">2 years</option>
		</select><br/><br/>
		
		<input name="startdate" type="date" placeholder="start Date (yyyy-MM-dd)"><br/><br/>
	    <input name="enddate" type="date" placeholder="End Date (yyyy-MM-dd)"><br/><br/>
	    Select HOD:
		<select name="HOD" >
		<option value="Murari Bhatt">Murari Bhatt</option>
		<option value="Krishnan">Krishnan</option>		
		<option value="Nagendra"> Nagendra</option>
		</select><br/><br/><br/>
				<input type="submit" value="SUBMIT">
				</form>
		<c:if test="${param.no != null }">
		<jsp:useBean id="courses" class="com.infinite.College.Course"/>
		<jsp:setProperty property="*" name="courses"/>
		
		<jsp:useBean id="beanDAO" class="com.infinite.College.CollegeDAO"/>
		<c:out value="${beanDAO.addcourseDAO(courses)}"/>
	</c:if>
</body>

</html>