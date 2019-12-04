<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Patient</title>
<style>
    .error 
    {
        color: #ff0000;
        font-weight: bold;
    } 
    td{
height: 30px;
}
input{
height: 30px;
}
    </style>
</head>
<body>
<h2 align="center">Add Patient Details</h2>
 <a href="index.jsp">Home</a>
<form:form  method="POST" action="DoEnroll" modelAttribute="PatientBean">  
 <table align="center" class="table">
 <tr>
  <td><form:label path="firstName">First Name</form:label></td>
  <td><form:input path="firstName" autofocus="true" placeholder=" Enter First Name" required="true"
pattern="[A-Za-z]{1,15}"
        title="Name should only contain Alphabets"></form:input></td>
  <%-- <td><form:errors path="firstName" cssClass="error" /></td> --%>
 </tr>
 <tr>
  <td><form:label path="lastName">Last Name</form:label></td>
  <td><form:input path="lastName" required="true" placeholder=" Enter Last Name" pattern="[A-Za-z]{1,15}"
        title="Name should only contain Alphabets"></form:input></td>
  <%-- <td><form:errors path="lastName" cssClass="error" /></td> --%>
 </tr>
 <tr>
    <td><form:label path="password">Password</form:label></td>
    <td><form:password path="password"  placeholder="Enter Password" required="true"  pattern="[a-zA-Z0-9]{8}"  title="password can be alphanumeric with minimum 5 characters"/></td>
    <%-- <td><form:errors path="password" cssClass="error" /></td> --%>
 </tr>
 <tr>
  <td><form:label path="dob">DOB</form:label></td>
  <td><form:input type="date" path="dob" title="select correct date" required="true"></form:input></td>
   <%-- <td><form:errors path="dob" cssClass="error" /></td>  --%>
 </tr>
 <tr>
  <td><form:label path="email">Email</form:label></td>
  <td><form:input type="email"  placeholder="Enter email" path="email" ></form:input></td>
 <%--  <td><form:errors path="email" cssClass="error" /></td> --%>
 </tr>
 <tr>
  <td><form:label path="contactNumber">Contact Number</form:label></td>
  <td><form:input path="contactNumber" placeholder=" Enter contactnumber" pattern="(\\+91|0)[0-9]{10}"
        title="Contact number should contain 10 numbers"></form:input></td>
 <%-- <td><form:errors path="contactNumber" cssClass="error" /></td>  --%>
 </tr>
 <tr>
         <td>State:</td>
         <td> <form:select path="state" required="true">  
        <form:option value="Tamilnadu" label="Tamilnadu"/>  
        <form:option value="kerala" label="kerala"/>  
        <form:option value="Andra pradesh" label="Andra pradesh"/>  
        <form:option value="Karnataka" label="Karnataka"/>  
         <form:option value="Delhi" label="Delhi"/>
          <form:option value="Mumbai" label="Mumbai"/>
           <form:option value="Bihar" label="Bihar"/>
        </form:select></td> 
        <td><form:errors path="state" cssClass="error" /></td> 
 </tr>    
 <tr>    
          <td> Insurance plan</td>
          <td> <form:select path="insurancePlan" required="true">  
     <form:option value="Scheme A" label="Scheme A"/>  
        <form:option value="Scheme B" label="Scheme B"/>  
        <form:option value="Scheme C" label="Scheme C"/>  
        <form:option value="Scheme D" label="Scheme D"/>
        <td><form:errors path="insurancePlan" cssClass="error" />
        </form:select> </td> 
        <td><form:errors path="insurancePlan" cssClass="error" /></td>
          <tr>
 <tr>
    <td colspan="1">
       <input type="submit" value="EnrollPatient"/>
       </td>
       <td colspan="1">
       <input type="reset" value="Reset"/>
       </td>
       </tr>
</table>
</form:form>
</body>
</html>