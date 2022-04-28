<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>							<!-- 4) add isELIgnored = "false" -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 	<!--Im HERE  -->													<!-- 2) -->
 	
 	<!-- Result is : <%= request.getAttribute("result") %>	 -->		<!-- 3) -->
 	
 	Result is : ${result}												<!-- 4) also add isELIgnored="false" at the top -->

</body>
</html>