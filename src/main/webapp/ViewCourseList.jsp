<%@page import="com.anji.stu.CourseBean"%>
<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
  body{
		 margin-top: 2%;
		 background: rgb(2,0,36);
         background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(44,78,108,1) 29%, rgba(0,212,255,1) 100%);
	 }
 
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
  
}

tr{background-color: #f2f2f2}

th{
  background-color: #04AA6D;
  color: white;
}

input[type=submit]{
		 background-color: rgb(4, 210, 221); /* Green */
         border: none;
         color: white;
         padding: 5px 32px;
         border-radius: 5px; 	
	 }
	 
	 input[type=submit]:hover {
   
        box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px;
        transition-duration: 0.5s;
      }

</style>
<body>
<% ArrayList<CourseBean> al = (ArrayList<CourseBean>)session.getAttribute("al");%>
  <table border="1">
     <tr>
       <th>Code</th>
       <th>Title</th>
       <th>Description</th>
       <th>Capacity</th>
       <th>Schedule</th>
       <th>Register</th>
       
     </tr>
<%
  for(CourseBean bb : al)
  {	   
     out.print("<tr><td>"+bb.getCouCode()+"</td><td>"+bb.getCouTitle()+"</td><td>"+bb.getCouDescription()+"</td><td>"+bb.getCapacity()+"</td><td>"+bb.getCouSchedule()+"</td><td><a href='studentReg.jsp?name="+bb.getCouTitle()+"'><input type='submit' value='Register'></a></td></tr>"); 
  }
  %>
</table>
</body>
</html>