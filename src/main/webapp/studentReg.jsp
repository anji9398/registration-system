<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student Registration</title>
</head>
<style>

   body{
		 background: rgb(2,0,36);
         background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(44,78,108,1) 29%, rgba(0,212,255,1) 100%);
	     color: yellow;
	 }
	 
	 div{
	  margin-top: 5%;
	  margin-left:20%;
	  margin-right:20%;
	  padding : 5%;
	   background-color :blueviolet;
	   box-shadow: rgba(0, 0, 0, 0.4) 0px 2px 4px, rgba(0, 0, 0, 0.3) 0px 7px 13px -3px, rgba(0, 0, 0, 0.2) 0px -3px 0px inset;
	 }
	 input {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
        }
        
         input[type="submit"],button {
            background-color: #4caf50;
            color: #fff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
	
</style>
<body>
   <form action="dis1" method="post">
   <div>
     <h1> Register Course</h1>
      <label>Student ID </label><input type="text" name="id" required><br>
      <label>Student Name </label><input type="text" name="name" required><br>
      <label>Registered Course</label><input type="text" value="<%=request.getParameter("name") %>" name="course" required><br>
      <input type="submit" value="Register"> 
    </div>
   </form>
</body>

</html>