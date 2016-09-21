<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery.js"></script>
<script>
$(function(){
	alert("대원정보를 입력하세요");
	$('form').submit(function(){
		if(this.id.value==""){
			alert("id를 입력하세요");
			this.id.focus();
			return false;
		}
		if(this.name.value==""){
			alert("이름을 입력하세요");
			this.name.focus();
			return false;
		}
		if(this.age.value==""){
			alert("나이를 입력하세요");
			this.age.focus();
			return false;
		}
		if(this.addr.value==""){
			alert("주소를 입력하세요");
			this.addr.focus();
			return false;
		}
		if(this.division.value==""){
			alert("부서를 입력하세요");
			this.division.focus();
			return false;
		}
		if(this.class_no.value==""){
			alert("직급을 입력하세요");
			this.class_no.focus();
			return false;
		}
		this.method="post";
		this.action="input.agent";
	})
})
</script>
</head>
<body>
<form>
	<label for="id">ID:</label><input id="id" name ="id"><br>
	<label for="name">이름:</label><input id="name" name="name"><br>
	<label for="age">나이:</label><input id="age" name="age"><br>
	<label for="addr">주소:</label><input id="addr" name="addr"><br>
	<label for="division">부서:</label><input id="division" name="division"><br>
	<label for="class_no">직급:</label><input id="class_no" name="class_no"><br>
	<input type="submit" value="입력하기">
</form>
</body>
</html>