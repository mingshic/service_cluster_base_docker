/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-01-09 08:04:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.manage.organization;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/spring-webmvc-4.3.7.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1488328488000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/spring-webmvc-4.3.7.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1488328488000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.7.RELEASE.jar", Long.valueOf(1515484763000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1515484757000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/shiro-web-1.3.2.jar!/META-INF/shiro.tld", Long.valueOf(1473414826000L));
    _jspx_dependants.put("/WEB-INF/lib/shiro-web-1.3.2.jar", Long.valueOf(1515484760000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.release();
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<title>组织管理</title>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/inc/head.jsp", out, true);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("\t<div id=\"toolbar\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_shiro_005fhasPermission_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_shiro_005fhasPermission_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_shiro_005fhasPermission_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table id=\"table\"></table>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/inc/footer.jsp", out, true);
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var $table = $('#table');\r\n");
      out.write("$(function() {\r\n");
      out.write("\t// bootstrap table初始化\r\n");
      out.write("\t$table.bootstrapTable({\r\n");
      out.write("\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/organization/list',\r\n");
      out.write("\t\theight: getHeight(),\r\n");
      out.write("\t\tstriped: true,\r\n");
      out.write("\t\tsearch: true,\r\n");
      out.write("\t\tshowRefresh: true,\r\n");
      out.write("\t\tshowColumns: true,\r\n");
      out.write("\t\tminimumCountColumns: 2,\r\n");
      out.write("\t\tclickToSelect: true,\r\n");
      out.write("\t\tdetailView: true,\r\n");
      out.write("\t\tdetailFormatter: 'detailFormatter',\r\n");
      out.write("\t\tpagination: true,\r\n");
      out.write("\t\tpaginationLoop: false,\r\n");
      out.write("\t\tsidePagination: 'server',\r\n");
      out.write("\t\tsilentSort: false,\r\n");
      out.write("\t\tsmartDisplay: false,\r\n");
      out.write("\t\tescape: true,\r\n");
      out.write("\t\tsearchOnEnterKey: true,\r\n");
      out.write("\t\tidField: 'organizationId',\r\n");
      out.write("\t\tmaintainSelected: true,\r\n");
      out.write("\t\ttoolbar: '#toolbar',\r\n");
      out.write("\t\tcolumns: [\r\n");
      out.write("\t\t\t{field: 'ck', checkbox: true},\r\n");
      out.write("\t\t\t{field: 'organizationId', title: '编号', sortable: true, align: 'center'},\r\n");
      out.write("\t\t\t{field: 'name', title: '组织名称'},\r\n");
      out.write("            {field: 'description', title: '组织描述'},\r\n");
      out.write("\t\t\t{field: 'action', title: '操作', align: 'center', formatter: 'actionFormatter', events: 'actionEvents', clickToSelect: false}\r\n");
      out.write("\t\t]\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("// 格式化操作按钮\r\n");
      out.write("function actionFormatter(value, row, index) {\r\n");
      out.write("    return [\r\n");
      out.write("\t\t'<a class=\"update\" href=\"javascript:;\" onclick=\"updateAction()\" data-toggle=\"tooltip\" title=\"Edit\"><i class=\"glyphicon glyphicon-edit\"></i></a>　',\r\n");
      out.write("\t\t'<a class=\"delete\" href=\"javascript:;\" onclick=\"deleteAction()\" data-toggle=\"tooltip\" title=\"Remove\"><i class=\"glyphicon glyphicon-remove\"></i></a>'\r\n");
      out.write("    ].join('');\r\n");
      out.write("}\r\n");
      out.write("// 新增\r\n");
      out.write("var createDialog;\r\n");
      out.write("function createAction() {\r\n");
      out.write("\tcreateDialog = $.dialog({\r\n");
      out.write("\t\tanimationSpeed: 300,\r\n");
      out.write("\t\ttitle: '新增组织',\r\n");
      out.write("\t\tcontent: 'url:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/organization/create',\r\n");
      out.write("\t\tonContentReady: function () {\r\n");
      out.write("\t\t\tinitMaterialInput();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("// 编辑\r\n");
      out.write("var updateDialog;\r\n");
      out.write("function updateAction() {\r\n");
      out.write("\tvar rows = $table.bootstrapTable('getSelections');\r\n");
      out.write("\tif (rows.length != 1) {\r\n");
      out.write("\t\t$.confirm({\r\n");
      out.write("\t\t\ttitle: false,\r\n");
      out.write("\t\t\tcontent: '请选择一条记录！',\r\n");
      out.write("\t\t\tautoClose: 'cancel|3000',\r\n");
      out.write("\t\t\tbackgroundDismiss: true,\r\n");
      out.write("\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\tcancel: {\r\n");
      out.write("\t\t\t\t\ttext: '取消',\r\n");
      out.write("\t\t\t\t\tbtnClass: 'waves-effect waves-button'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\tupdateDialog = $.dialog({\r\n");
      out.write("\t\t\tanimationSpeed: 300,\r\n");
      out.write("\t\t\ttitle: '编辑组织',\r\n");
      out.write("\t\t\tcontent: 'url:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/organization/update/' + rows[0].organizationId,\r\n");
      out.write("\t\t\tonContentReady: function () {\r\n");
      out.write("\t\t\t\tinitMaterialInput();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("// 删除\r\n");
      out.write("var deleteDialog;\r\n");
      out.write("function deleteAction() {\r\n");
      out.write("\tvar rows = $table.bootstrapTable('getSelections');\r\n");
      out.write("\tif (rows.length == 0) {\r\n");
      out.write("\t\t$.confirm({\r\n");
      out.write("\t\t\ttitle: false,\r\n");
      out.write("\t\t\tcontent: '请至少选择一条记录！',\r\n");
      out.write("\t\t\tautoClose: 'cancel|3000',\r\n");
      out.write("\t\t\tbackgroundDismiss: true,\r\n");
      out.write("\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\tcancel: {\r\n");
      out.write("\t\t\t\t\ttext: '取消',\r\n");
      out.write("\t\t\t\t\tbtnClass: 'waves-effect waves-button'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\tdeleteDialog = $.confirm({\r\n");
      out.write("\t\t\ttype: 'red',\r\n");
      out.write("\t\t\tanimationSpeed: 300,\r\n");
      out.write("\t\t\ttitle: false,\r\n");
      out.write("\t\t\tcontent: '确认删除该组织吗？',\r\n");
      out.write("\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\tbtnClass: 'waves-effect waves-button',\r\n");
      out.write("\t\t\t\t\taction: function () {\r\n");
      out.write("\t\t\t\t\t\tvar ids = new Array();\r\n");
      out.write("\t\t\t\t\t\tfor (var i in rows) {\r\n");
      out.write("\t\t\t\t\t\t\tids.push(rows[i].organizationId);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\ttype: 'get',\r\n");
      out.write("\t\t\t\t\t\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/organization/delete/' + ids.join(\"-\"),\r\n");
      out.write("\t\t\t\t\t\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\t\t\t\t\t\tif (result.code != 1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif (result.data instanceof Array) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$.each(result.data, function(index, value) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$.confirm({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttheme: 'dark',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tanimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttitle: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcontent: value.errorMsg,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$.confirm({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttheme: 'dark',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tanimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttitle: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcontent: result.data.errorMsg,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdeleteDialog.close();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$table.bootstrapTable('refresh');\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\terror: function(XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.confirm({\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttheme: 'dark',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tanimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle: false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcontent: textStatus,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcancel: {\r\n");
      out.write("\t\t\t\t\ttext: '取消',\r\n");
      out.write("\t\t\t\t\tbtnClass: 'waves-effect waves-button'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/jsp/manage/organization/index.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("basePath");
      // /WEB-INF/jsp/manage/organization/index.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f0 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    boolean _jspx_th_shiro_005fhasPermission_005f0_reused = false;
    try {
      _jspx_th_shiro_005fhasPermission_005f0.setPageContext(_jspx_page_context);
      _jspx_th_shiro_005fhasPermission_005f0.setParent(null);
      // /WEB-INF/jsp/manage/organization/index.jsp(21,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_shiro_005fhasPermission_005f0.setName("upms:organization:create");
      int _jspx_eval_shiro_005fhasPermission_005f0 = _jspx_th_shiro_005fhasPermission_005f0.doStartTag();
      if (_jspx_eval_shiro_005fhasPermission_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<a class=\"waves-effect waves-button\" href=\"javascript:;\" onclick=\"createAction()\"><i class=\"zmdi zmdi-plus\"></i> 新增组织</a>");
          int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_shiro_005fhasPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
      _jspx_th_shiro_005fhasPermission_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_shiro_005fhasPermission_005f0, _jsp_getInstanceManager(), _jspx_th_shiro_005fhasPermission_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f1 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    boolean _jspx_th_shiro_005fhasPermission_005f1_reused = false;
    try {
      _jspx_th_shiro_005fhasPermission_005f1.setPageContext(_jspx_page_context);
      _jspx_th_shiro_005fhasPermission_005f1.setParent(null);
      // /WEB-INF/jsp/manage/organization/index.jsp(22,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_shiro_005fhasPermission_005f1.setName("upms:organization:update");
      int _jspx_eval_shiro_005fhasPermission_005f1 = _jspx_th_shiro_005fhasPermission_005f1.doStartTag();
      if (_jspx_eval_shiro_005fhasPermission_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<a class=\"waves-effect waves-button\" href=\"javascript:;\" onclick=\"updateAction()\"><i class=\"zmdi zmdi-edit\"></i> 编辑组织</a>");
          int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_shiro_005fhasPermission_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f1);
      _jspx_th_shiro_005fhasPermission_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_shiro_005fhasPermission_005f1, _jsp_getInstanceManager(), _jspx_th_shiro_005fhasPermission_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f2 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    boolean _jspx_th_shiro_005fhasPermission_005f2_reused = false;
    try {
      _jspx_th_shiro_005fhasPermission_005f2.setPageContext(_jspx_page_context);
      _jspx_th_shiro_005fhasPermission_005f2.setParent(null);
      // /WEB-INF/jsp/manage/organization/index.jsp(23,2) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_shiro_005fhasPermission_005f2.setName("upms:organization:delete");
      int _jspx_eval_shiro_005fhasPermission_005f2 = _jspx_th_shiro_005fhasPermission_005f2.doStartTag();
      if (_jspx_eval_shiro_005fhasPermission_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<a class=\"waves-effect waves-button\" href=\"javascript:;\" onclick=\"deleteAction()\"><i class=\"zmdi zmdi-close\"></i> 删除组织</a>");
          int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_shiro_005fhasPermission_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f2);
      _jspx_th_shiro_005fhasPermission_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_shiro_005fhasPermission_005f2, _jsp_getInstanceManager(), _jspx_th_shiro_005fhasPermission_005f2_reused);
    }
    return false;
  }
}
