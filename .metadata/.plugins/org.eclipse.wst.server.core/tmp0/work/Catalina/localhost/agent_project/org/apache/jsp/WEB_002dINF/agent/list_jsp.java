/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M10
 * Generated at: 2016-09-23 07:31:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.agent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.union.minerva.agent.R.R;
import org.union.minerva.agent.dto.AgentDTO;
import java.util.ArrayList;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.union.minerva.agent.dto.AgentDTO");
    _jspx_imports_classes.add("org.union.minerva.agent.R.R");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html ng-app=\"routeApp\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\t#result_tbl, tr, th, td{\r\n");
      out.write("\t\tborder : 1px solid red;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery.js\"></script>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.0/angular-route.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("var idlst=[];\r\n");
ArrayList<AgentDTO> dtolst = (ArrayList<AgentDTO>)request.getAttribute("LIST");
      out.write('\r');
      out.write('\n');
for(int i=0;i<dtolst.size();i++){
      out.write('\r');
      out.write('\n');
String lst = dtolst.get(i).toStringList();
      out.write("\r\n");
      out.write("\t\tvar lst_from_db = ");
      out.print(lst);
      out.write("\r\n");
      out.write("\t\tidlst.push(lst_from_db);\r\n");
}
      out.write("\r\n");
      out.write("console.log(idlst);\r\n");
      out.write("var app=angular.module('routeApp',['ngRoute']);\r\n");
      out.write("app.config(function($routeProvider){\r\n");
      out.write("\t$routeProvider.when('/profile/:id',{\r\n");
      out.write("        templateUrl:\"detail.agent\",\r\n");
      out.write("        controller:\"detailCtrl\"\r\n");
      out.write("    })\r\n");
      out.write("app.controller('detailCtrl',['$scope','$routeParams',function($scope,$routeParams){\r\n");
      out.write("\t$scope.obj = idlst[$routeParams.id];\r\n");
      out.write("}]);\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table id=\"result_tbl\">\r\n");
      out.write("<tr>\r\n");
for(int i=0;i<R.col_title.length;i++){
	out.println("<th>");
	out.println(R.col_title[i]);
	out.println("</th>");
}
      out.write("\r\n");
      out.write("<th colspan=3>삭제/수정/상세정보</th>\r\n");
      out.write("</tr>\r\n");

	for(int i=0;i<dtolst.size();i++){
		out.println("<tr>");
		out.println(dtolst.get(i).toString());
		out.println("<td><a href=delete.agent?id="+dtolst.get(i).getId()+">"+"삭제 "+"</a>");
		out.println("<td><a href=update.agent?id="+dtolst.get(i).getId()+">"+"수정 "+"</a>");
		out.println("<td><a href=#profile/"+i+">"+"상세정보 "+"</a>");		
		out.println("</tr>");
	}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<div id =\"content\" >\r\n");
      out.write("\t<ng-view>\r\n");
      out.write("\t</ng-view>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
