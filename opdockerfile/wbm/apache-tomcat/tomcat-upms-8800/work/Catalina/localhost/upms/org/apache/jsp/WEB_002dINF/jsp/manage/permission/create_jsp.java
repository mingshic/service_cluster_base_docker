/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-11-06 06:42:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.manage.permission;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/spring-webmvc-4.3.20.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1539563356000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/spring-webmvc-4.3.20.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1539563356000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.20.RELEASE.jar", Long.valueOf(1541076044000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1528799796000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/shiro-web-1.3.2.jar!/META-INF/shiro.tld", Long.valueOf(1473414826000L));
    _jspx_dependants.put("/WEB-INF/lib/shiro-web-1.3.2.jar", Long.valueOf(1528799788000L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<div id=\"createDialog\" class=\"crudDialog\">\n");
      out.write("\t<form id=\"createForm\" method=\"post\">\n");
      out.write("\t\t<div class=\"radio\">\n");
      out.write("\t\t\t<div class=\"radio radio-inline radio-success\">\n");
      out.write("\t\t\t\t<input id=\"type_1\" type=\"radio\" name=\"type\" value=\"1\" checked>\n");
      out.write("\t\t\t\t<label for=\"type_1\">目录 </label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"radio radio-inline radio-info\">\n");
      out.write("\t\t\t\t<input id=\"type_2\" type=\"radio\" name=\"type\" value=\"2\">\n");
      out.write("\t\t\t\t<label for=\"type_2\">菜单 </label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"radio radio-inline radio-warning\">\n");
      out.write("\t\t\t\t<input id=\"type_3\" type=\"radio\" name=\"type\" value=\"3\">\n");
      out.write("\t\t\t\t<label for=\"type_3\">按钮 </label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<span class=\"type1 type2 type3\">\n");
      out.write("\t\t\t\t<select id=\"systemId\" name=\"systemId\">\n");
      out.write("\t\t\t\t\t<option value=\"0\">请选择系统</option>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t\t<span class=\"type2 type3\" hidden>\n");
      out.write("\t\t\t\t<select id=\"pid\" name=\"pid\">\n");
      out.write("\t\t\t\t\t<option value=\"0\">请选择上级</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"name\">名称</label>\n");
      out.write("\t\t\t<input id=\"name\" type=\"text\" class=\"form-control\" name=\"name\" maxlength=\"20\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group type2 type3\" hidden>\n");
      out.write("\t\t\t<label for=\"permissionValue\">权限值</label>\n");
      out.write("\t\t\t<input id=\"permissionValue\" type=\"text\" class=\"form-control\" name=\"permissionValue\" maxlength=\"50\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group type2 type3\" hidden>\n");
      out.write("\t\t\t<label for=\"uri\">路径</label>\n");
      out.write("\t\t\t<input id=\"uri\" type=\"text\" class=\"form-control\" name=\"uri\" maxlength=\"100\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group type1 type3\">\n");
      out.write("\t\t\t<label for=\"icon\">图标</label>\n");
      out.write("\t\t\t<input id=\"icon\" type=\"text\" class=\"form-control\" name=\"icon\" maxlength=\"50\" value=\"zmdi zmdi-widgets\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"radio\">\n");
      out.write("\t\t\t<div class=\"radio radio-inline radio-success\">\n");
      out.write("\t\t\t\t<input id=\"status_1\" type=\"radio\" name=\"status\" value=\"1\" checked>\n");
      out.write("\t\t\t\t<label for=\"status_1\">正常 </label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"radio radio-inline\">\n");
      out.write("\t\t\t\t<input id=\"status_0\" type=\"radio\" name=\"status\" value=\"0\">\n");
      out.write("\t\t\t\t<label for=\"status_0\">锁定 </label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group text-right dialog-buttons\">\n");
      out.write("\t\t\t<a class=\"waves-effect waves-button\" href=\"javascript:;\" onclick=\"createSubmit();\">保存</a>\n");
      out.write("\t\t\t<a class=\"waves-effect waves-button\" href=\"javascript:;\" onclick=\"createDialog.close();\">取消</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("var pidType = 0;\n");
      out.write("var systemId = 0;\n");
      out.write("var type = 1;\n");
      out.write("$(function() {\n");
      out.write("\t// 选择分类\n");
      out.write("\t$('input:radio[name=\"type\"]').change(function() {\n");
      out.write("\t\ttype = $(this).val();\n");
      out.write("\t\tinitType();\n");
      out.write("\t});\n");
      out.write("\t// 选择系统\n");
      out.write("\t$('#systemId').change(function() {\n");
      out.write("\t\tsystemId = $(this).val();\n");
      out.write("\t\tinitPid();\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("function initType() {\n");
      out.write("\t// 显示对应必填项\n");
      out.write("\t$('.type1,.type2,.type3').hide(0, function () {\n");
      out.write("\t\t$('.type' + type).show();\n");
      out.write("\t});\n");
      out.write("\t// 级联菜单\n");
      out.write("\tif (type == 2) {\n");
      out.write("\t\tpidType = 1;\n");
      out.write("\t\tinitPid();\n");
      out.write("\t}\n");
      out.write("\tif (type == 3) {\n");
      out.write("\t\tpidType = 2\n");
      out.write("\t\tinitPid();\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function initPid() {\n");
      out.write("\tif (systemId != 0) {\n");
      out.write("\t\t$.getJSON('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/permission/list', {systemId: systemId, type: pidType, limit: 10000}, function(json) {\n");
      out.write("\t\t\tvar datas = [{id: 0, text: '请选择上级'}];\n");
      out.write("\t\t\tfor (var i = 0; i < json.rows.length; i ++) {\n");
      out.write("\t\t\t\tvar data = {};\n");
      out.write("\t\t\t\tdata.id = json.rows[i].permissionId;\n");
      out.write("\t\t\t\tdata.text = json.rows[i].name;\n");
      out.write("\t\t\t\tdatas.push(data);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$('#pid').empty();\n");
      out.write("\t\t\t$('#pid').select2({\n");
      out.write("\t\t\t\tdata : datas\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t} else {\n");
      out.write("\t\t$('#pid').empty();\n");
      out.write("\t\t$('#pid').select2({\n");
      out.write("\t\t\tdata : [{id: 0, text: '请选择上级'}]\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function createSubmit() {\n");
      out.write("    $.ajax({\n");
      out.write("        type: 'post',\n");
      out.write("        url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/permission/create',\n");
      out.write("        data: $('#createForm').serialize(),\n");
      out.write("        beforeSend: function() {\n");
      out.write("\t\t\tif ($('#systemId').val() == 0) {\n");
      out.write("\t\t\t\t$.confirm({\n");
      out.write("\t\t\t\t\ttitle: false,\n");
      out.write("\t\t\t\t\tcontent: '请选择系统！',\n");
      out.write("\t\t\t\t\tautoClose: 'cancel|3000',\n");
      out.write("\t\t\t\t\tbackgroundDismiss: true,\n");
      out.write("\t\t\t\t\tbuttons: {\n");
      out.write("\t\t\t\t\t\tcancel: {\n");
      out.write("\t\t\t\t\t\t\ttext: '取消',\n");
      out.write("\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button'\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif (type == 1) {\n");
      out.write("\t\t\t\tif ($('#name').val() == '') {\n");
      out.write("\t\t\t\t\t$('#name').focus();\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif (type == 2 || type == 3) {\n");
      out.write("\t\t\t\tif ($('#pid').val() == 0) {\n");
      out.write("\t\t\t\t\t$.confirm({\n");
      out.write("\t\t\t\t\t\ttitle: false,\n");
      out.write("\t\t\t\t\t\tcontent: '请选择上级！',\n");
      out.write("\t\t\t\t\t\tautoClose: 'cancel|3000',\n");
      out.write("\t\t\t\t\t\tbackgroundDismiss: true,\n");
      out.write("\t\t\t\t\t\tbuttons: {\n");
      out.write("\t\t\t\t\t\t\tcancel: {\n");
      out.write("\t\t\t\t\t\t\t\ttext: '取消',\n");
      out.write("\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button'\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif ($('#name').val() == '') {\n");
      out.write("\t\t\t\t\t$('#name').focus();\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif ($('#permissionValue').val() == '') {\n");
      out.write("\t\t\t\t\t$('#permissionValue').focus();\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif ($('#uri').val() == '') {\n");
      out.write("\t\t\t\t\t$('#uri').focus();\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("        },\n");
      out.write("        success: function(result) {\n");
      out.write("\t\t\tif (result.code != 1) {\n");
      out.write("\t\t\t\tif (result.data instanceof Array) {\n");
      out.write("\t\t\t\t\t$.each(result.data, function(index, value) {\n");
      out.write("\t\t\t\t\t\t$.confirm({\n");
      out.write("\t\t\t\t\t\t\ttheme: 'dark',\n");
      out.write("\t\t\t\t\t\t\tanimation: 'rotateX',\n");
      out.write("\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\n");
      out.write("\t\t\t\t\t\t\ttitle: false,\n");
      out.write("\t\t\t\t\t\t\tcontent: value.errorMsg,\n");
      out.write("\t\t\t\t\t\t\tbuttons: {\n");
      out.write("\t\t\t\t\t\t\t\tconfirm: {\n");
      out.write("\t\t\t\t\t\t\t\t\ttext: '确认',\n");
      out.write("\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t$.confirm({\n");
      out.write("\t\t\t\t\t\t\ttheme: 'dark',\n");
      out.write("\t\t\t\t\t\t\tanimation: 'rotateX',\n");
      out.write("\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\n");
      out.write("\t\t\t\t\t\t\ttitle: false,\n");
      out.write("\t\t\t\t\t\t\tcontent: result.data.errorMsg,\n");
      out.write("\t\t\t\t\t\t\tbuttons: {\n");
      out.write("\t\t\t\t\t\t\t\tconfirm: {\n");
      out.write("\t\t\t\t\t\t\t\t\ttext: '确认',\n");
      out.write("\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tcreateDialog.close();\n");
      out.write("\t\t\t\t$table.bootstrapTable('refresh');\n");
      out.write("\t\t\t}\n");
      out.write("        },\n");
      out.write("        error: function(XMLHttpRequest, textStatus, errorThrown) {\n");
      out.write("\t\t\t$.confirm({\n");
      out.write("\t\t\t\ttheme: 'dark',\n");
      out.write("\t\t\t\tanimation: 'rotateX',\n");
      out.write("\t\t\t\tcloseAnimation: 'rotateX',\n");
      out.write("\t\t\t\ttitle: false,\n");
      out.write("\t\t\t\tcontent: textStatus,\n");
      out.write("\t\t\t\tbuttons: {\n");
      out.write("\t\t\t\t\tconfirm: {\n");
      out.write("\t\t\t\t\t\ttext: '确认',\n");
      out.write("\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("</script>");
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
      // /WEB-INF/jsp/manage/permission/create.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("basePath");
      // /WEB-INF/jsp/manage/permission/create.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/jsp/manage/permission/create.jsp(29,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("upmsSystem");
      // /WEB-INF/jsp/manage/permission/create.jsp(29,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upmsSystems}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upmsSystem.systemId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${upmsSystem.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
