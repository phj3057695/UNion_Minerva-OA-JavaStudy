<%@page import="org.union.minerva.agent.R.R"%>
<%@page import="org.union.minerva.agent.dto.AgentDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	#result_tbl, tr, th, td{
		border : 1px solid red;
	}
</style>
<script src="http://code.jquery.com/jquery.js"></script>
<script>
$(document).ready(function(){
	$("#result_tbl").fadeIn(3000);
});
</script>
<body>
<%ArrayList<AgentDTO> dtolst = (ArrayList<AgentDTO>)request.getAttribute("LIST");%>
<table id="result_tbl">
<tr>
<%for(int i=0;i<R.col_title.length;i++){
	out.println("<th>");
	out.println(R.col_title[i]);
	out.println("</th>");
}%>
<th colspan=2>삭제/수정</th>
</tr>
<%
	for(int i=0;i<dtolst.size();i++){
		out.println("<tr>");
		out.println(dtolst.get(i).toString());
		out.println("<td><a href=delete.agent?id="+dtolst.get(i).getId()+">"+"삭제 "+"</a>");
		out.println("<td><a href=update.agent?id="+dtolst.get(i).getId()+">"+"수정 "+"</a>");
		out.println("</tr>");
	}
%>
</table>
</body>
</html>