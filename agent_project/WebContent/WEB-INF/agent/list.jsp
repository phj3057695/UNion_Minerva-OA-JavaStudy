<%@page import="org.union.minerva.agent.R.R"%>
<%@page import="org.union.minerva.agent.dto.AgentDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="routeApp">
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
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.0/angular-route.min.js"></script>
<script>
var idlst=[];
<%ArrayList<AgentDTO> dtolst = (ArrayList<AgentDTO>)request.getAttribute("LIST");%>
<%for(int i=0;i<dtolst.size();i++){%>
<%String lst = dtolst.get(i).toStringList();%>
		var lst_from_db = <%=lst%>
		idlst.push(lst_from_db);
<%}%>
console.log(idlst);
var app=angular.module('routeApp',['ngRoute']);
app.config(function($routeProvider){
	$routeProvider.when('/profile/:id',{
        templateUrl:"detail.agent",
        controller:"detailCtrl"
    });
app.controller('detailCtrl',['$scope','$routeParams',function($scope,$routeParams){
	$scope.obj = idlst[$routeParams.id];
}]);
})

</script>
<body>

<table id="result_tbl">
<tr>
<%for(int i=0;i<R.col_title.length;i++){
	out.println("<th>");
	out.println(R.col_title[i]);
	out.println("</th>");
}%>
<th colspan=3>삭제/수정/상세정보</th>
</tr>
<%
	for(int i=0;i<dtolst.size();i++){
		out.println("<tr>");
		out.println(dtolst.get(i).toString());
		out.println("<td><a href=delete.agent?id="+dtolst.get(i).getId()+">"+"삭제 "+"</a>");
		out.println("<td><a href=update.agent?id="+dtolst.get(i).getId()+">"+"수정 "+"</a>");
		out.println("<td><a href=#profile/"+i+">"+"상세정보 "+"</a>");		
		out.println("</tr>");
	}
%>
</table>
<div id ="content" >
	<ng-view>
	</ng-view>
</div>
</body>
</html>