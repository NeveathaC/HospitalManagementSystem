<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Patient Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css">
div {
margin-left: 30%;
margin-right: 30%;
padding: 1px;
}

.header {
background-color: skyblue;
color: white;
text-align: center;
font-weight: bold;
font-size: 20px;
}

.body {
background-color: lightgray;
}

.footer {
background-color: skyblue;
/* margin-left: 30%;
margin-right: 30%; */

}
label
{
margin-left: 2%;
font-family: calibri;
font-weight: bold;
}
input, select {
margin: 2%;
width: 95%;
padding: 12px 20px;
margin: 8px;
box-sizing: border-box;
}

input[type="radio"] {
width: 5%;
}

input[type="submit"],input[type="reset"] {
width: 45%;
}
button {
background-color: skyblue;
border: none;
color: white;
padding: 15px 15px;
text-align: center;
text-decoration: none;
font-size: 16px;
font-weight: bold;
width: 100%;
}
</style>
</head>
<body>
<div class="header">
<h3>Add Patient Details</h3>
</div>
<form:form  method="POST" action="DoEnroll" modelAttribute="PatientBean">  
<div class="body">
<label>Enter the First Name</label><br> 
<form:input path="firstName" autofocus="true" placeholder=" Enter First Name" required="true"
pattern="^^[a-zA-Z\\s]*$" title="Name should only contain Alphabets"></form:input>
<br>
<label>Enter the Last Name</label><br> 
<form:input path="lastName" required="true" placeholder=" Enter Last Name" pattern="^^[a-zA-Z\\s]*$"
        title="Name should only contain Alphabets"></form:input>
<br>

<label>Enter Password</label><br> 
<form:password path="password"  placeholder="Enter Password" required="true"  pattern="^[a-zA-Z]\w{3,8}$"  title="password can be alphanumeric with minimum 3 to maximum 8 characters"/>
<br>

<label>Enter DOB</label><br> 
<form:input type="date" path="dob" title="select correct date" required="true"></form:input>
<br>
<label>Enter Email ID</label><br> 
<form:input type="email"  placeholder="Enter email" path="email" required="true" title="enter email id of correct format"></form:input>
<br>
<label>Enter Contact Number</label><br> 
<form:input path="contactNumber" placeholder=" Enter contactnumber"  required="true" pattern="(\\+91|0)[0-9]{10}" title="Contact number should contain 10 numbers"></form:input>
<br>
<label>Enter state</label><br> 
<form:select path="state" required="true">  
        <form:option value="Tamilnadu" label="Tamilnadu"/>  
        <form:option value="kerala" label="kerala"/>  
        <form:option value="Karanataka" label="Karanataka"/>  
        <form:option value="Andra Pradesh" label="Andra Pradesh"/>  
         <form:option value="uttra Pradesh" label="uttra Pradesh"/>
          <form:option value="Madhaya Pradesh" label="Madhaya Pradesh"/>
           <form:option value="Maharashtra" label="Maharashtra"/>
        </form:select>
<br>

<label>Enter Insurance plan</label><br> 
<form:select path="insurancePlan" required="true">  
     <form:option value="Bharti AXA Health Insurance" label="Bharti AXA Health Insurance"/>  
        <form:option value="HDFC ERGO Health Insurance" label="HDFC ERGO Health Insurance"/>  
        <form:option value="National Health Insurance" label="National Health Insurance"/>  
        <form:option value="Universal Sompo General Health Insurance" label="Universal Sompo General Health Insurance"/>
         <form:option value="Religare Health Insurance" label="Religare Health Insurance"/>
         <form:option value="Star Health Insurance" label="Star Health Insurance"/>
        </form:select>
<br> 
</div>
<div class="footer">
<input type="submit" name="Submit" value="Submit" />
<input type="reset" name="Reset" value="Reset" />
</div>
</form:form>
</body>
</html>