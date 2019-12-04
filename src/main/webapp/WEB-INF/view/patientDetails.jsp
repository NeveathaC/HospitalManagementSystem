<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> --%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">


</style>
</head>
<body>
<h2>sucessfully added patient</h2>
<table border="1" style="width:50%" align: "center">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>PatientId</th><tr>
<tr>
        <td>${PatientBean.firstName}</td>
        <td>${PatientBean.lastName}</td>
        <td>${PatientBean.patientId}</td>
    </tr>

</table>
</body>
</html>