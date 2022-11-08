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
		<input type="text" name="Fid" placeholder="Fid"/><br/><br/>
		<input type="text" name="Studentname" placeholder="Studentname"/><br/><br/>
		<label for ="Lt Col Pankaj Verma">Lt Col Pankaj Verma</label>
	    <select id="Lt Col Pankaj Verma" >
		<option value="PC Architecture">PC Architecture</option>
		<option value="PC Hardware 1">PC Hardware 1</option>
		<option value="Networking">Networking</option>		
		</select><br/><br/>
				Select Subject:
		<select name="Maj Abhishek Rai" onchange="myFunction()">
		<option value="PC Hardware 2">PC Hardware 2</option>
		<option value="Value Added Services">Value Added Services</option>
		</select><br/><br/>
				Select Subject:
		<select name="Maj Dinesh Dahiya" >
		<option value="Microprocessor Interfacing devices & Embedded System">Microprocessor Interfacing devices & Embedded System</option>
		</select><br/><br/>
				Select Subject:
		<select name="NIIT Instr" >
		<option value="C#">C#</option>
		<option value="SQL Server">SQL Server</option>
		</select><br/><br/>
				Select Subject:
		<select name="Lt Col Ajay Kacker" >
		<option value="Data Structures">Data Structures</option>
		<option value="Advance Computer Concept & Data Security">Advance Computer Concept & Data Security</option>
		</select><br/><br/>
				Select Subject:
		<select name="Lt Col KP Krishna Kumar" >
		<option value="Operating System">Operating System</option>
		</select><br/><br/>
		Select FbValue:
		<br/><br/>
		
		<input type="radio"  value="Average" > 2 <br/>
		<input type="radio"  value="BelowAverage" > 1 <br/>
		<input type="radio" value="Satisfactory" > 3 <br/>
		<input type="radio" value="Good" > 4 <br/>
		<input type="radio" value="Excellent" > 5 <br/><br/>
</form>
</body>
</html>