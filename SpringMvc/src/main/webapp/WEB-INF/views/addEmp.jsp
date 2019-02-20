<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration</title>
</head>

<body>

	<form:form method="post" action="submit" modelAttribute="employee">
	 <table>
	 	 <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Id:</td>
            <td><form:input path="id"/></td>
        </tr>
         <tr>
        	<td>Department:</td>
            <td><form:input path="dept"/></td>
        </tr>
         <tr>
        	<td>Address:</td>
            <td><form:input path="address"/></td>
         </tr>
         <tr>
            <td colspan="2">
                <input type="submit" value="Submit Details"/>
            </td>
         </tr>
    	</table>
	  </form:form>

	</body>
</html>
