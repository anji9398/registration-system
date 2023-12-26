<%@page import="com.anji.stu.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Student Registered Course</title>
</head>
<style>
body {
	background: rgb(2, 0, 36);
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(44, 78, 108, 1) 29%, rgba(0, 212, 255, 1) 100%);
		text-align: center;
}

table {
	 
	width: 30%;
	margin: 10%;
	margin-left:35%;
	
}

th, td {
	text-align: left;
	padding: 8px;
}

tr {
	background-color: #f2f2f2
}

th {
	background-color: #04AA6D;
	color: white;
}

 input[type="submit"] {
            background-color: #62529c;
            border: none;
            color: #fff;
            padding: 5px 30px;
            text-decoration: none;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 5px;
            
        }
        a{color: red;}

</style>

<body>
	<a href="home.html">Home</a>
	<div>
		<table>
			<tr>
				<th>Course Name</th>
				<th>Remove</th>
			</tr>

			<%
			ArrayList<StudentBean> al = (ArrayList<StudentBean>) session.getAttribute("al1");
			%>
			<%
			for (StudentBean sb : al) {
				out.print("<tr><td>" + sb.getRegCourse() + "</td><td><a href='delete?course=" + sb.getRegCourse() + "&code="
				+ sb.getId() + "'><input type=submit value='Delete'></a></td></tr>");
			}
			%>

		</table>
	</div>
</body>

</html>