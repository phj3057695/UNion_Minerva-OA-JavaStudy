<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="http://code.jquery.com/jquery.js"></script>
<script>

<%String greet = "greetings";%>

$(function(){
	
	var hi = "<%=greet%>";
	confirm(hi);
	console.log(hi);	
});
</script>
<body>
<h1>대원 관리 시스템</h1>
<a href="input.agent">대원 정보 입력</a>
<a href="list.agent">대원 정보 조회</a>
</body>
</html>