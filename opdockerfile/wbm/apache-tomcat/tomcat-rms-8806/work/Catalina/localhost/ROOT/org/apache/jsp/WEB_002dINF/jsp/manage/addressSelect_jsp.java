/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-05-07 11:12:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addressSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1500522006000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/shiro-web-1.3.2.jar!/META-INF/shiro.tld", Long.valueOf(1473414826000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar", Long.valueOf(1525689930000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1525689929000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1500522006000L));
    _jspx_dependants.put("/WEB-INF/lib/shiro-web-1.3.2.jar", Long.valueOf(1525689930000L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<div id=\"createDialog\" class=\"crudDialog\">\r\n");
      out.write("\t<form id=\"queryForm\" method=\"post\">\r\n");
      out.write("\t\t<table id=\"tab\" width=\"100%\">\r\n");
      out.write("\t\t\t<tr id=\"tr_1\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr style=\"height: 15px;\"></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var addressMap;\r\n");
      out.write("$(function () {\r\n");
      out.write("    addressMap = null;\r\n");
      out.write("});\r\n");
      out.write("function queryArea(id, name, index) {\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype: 'get',\r\n");
      out.write("\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/area/querySon/'+id,\r\n");
      out.write("\t\tdata: null,\r\n");
      out.write("\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\tvar htmlStr = '';\r\n");
      out.write("\t\t\thtmlStr += '<tr id=\"addTr\">';\r\n");
      out.write("\t\t\thtmlStr += '<td colspan=\"5\" >';\r\n");
      out.write("\t\t\thtmlStr += '<div style=\"border:0.3px #000000 solid; background-color: #EDEDED; width:100%;\">';\r\n");
      out.write("\t\t\thtmlStr += '<table width=\"100%\">';\r\n");
      out.write("\t\t\thtmlStr += '<tr>';\r\n");
      out.write("            htmlStr += '<td>';\r\n");
      out.write("            htmlStr += '<a href=\"###\" onclick=\"createSubmit('+id+')\" style=\"display:inline-block; color: #0044cc;\" ><b>'+name+'</b></a>';\r\n");
      out.write("            htmlStr += '</td>';\r\n");
      out.write("\t\t\tvar s = 2;\r\n");
      out.write("\t\t\tfor (var key in result) {\r\n");
      out.write("\t\t\t\thtmlStr += '<td>';\r\n");
      out.write("\t\t\t\thtmlStr += '<a href=\"###\" onclick=\"createSubmit('+key+')\" style=\"display:inline-block; color: #0044cc;\" >'+result[key]+'</a>';\r\n");
      out.write("\t\t\t\thtmlStr += '</td>';\r\n");
      out.write("\t\t\t\tif(s%5==0){\r\n");
      out.write("\t\t\t\t\thtmlStr += '</tr>';\r\n");
      out.write("\t\t\t\t\thtmlStr += '<tr>';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\ts++;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\thtmlStr += '</tr>';\r\n");
      out.write("\t\t\thtmlStr += '</table>';\r\n");
      out.write("\t\t\thtmlStr += '</div>';\r\n");
      out.write("\t\t\thtmlStr += '</td>';\r\n");
      out.write("\t\t\thtmlStr += '</tr>';\r\n");
      out.write("\r\n");
      out.write("            if(addressMap == null){\r\n");
      out.write("                //展开\r\n");
      out.write("                spreadArea(id, index);\r\n");
      out.write("                var x = Math.ceil(index/5)-1;\r\n");
      out.write("                $(\"#tab tr:eq(\"+x+\")\").after(htmlStr);\r\n");
      out.write("            }else{\r\n");
      out.write("                var oldId;\r\n");
      out.write("                //展开新省级城市\r\n");
      out.write("                if(addressMap[id] == null) {\r\n");
      out.write("                    for (var k in addressMap) {\r\n");
      out.write("                        //删除原来展开\r\n");
      out.write("                        oldId = k;\r\n");
      out.write("                        var y = Math.ceil(addressMap[k] / 5);\r\n");
      out.write("                        document.getElementById('tab').deleteRow(y);\r\n");
      out.write("\r\n");
      out.write("                        //新增展开\r\n");
      out.write("                        var x = Math.ceil(index/5)-1;\r\n");
      out.write("                        $(\"#tab tr:eq(\"+x+\")\").after(htmlStr);\r\n");
      out.write("                    }\r\n");
      out.write("                    //删除原来展开\r\n");
      out.write("                    delete addressMap[oldId];\r\n");
      out.write("                    //新增展开\r\n");
      out.write("                    addressMap[id] = index;\r\n");
      out.write("                }else{\r\n");
      out.write("                    //关闭已选省级城市\r\n");
      out.write("                    for (var k in addressMap) {\r\n");
      out.write("                        //删除当前展开\r\n");
      out.write("                        oldId = k;\r\n");
      out.write("                        var y = Math.ceil(addressMap[k] / 5);\r\n");
      out.write("                        document.getElementById('tab').deleteRow(y);\r\n");
      out.write("                    }\r\n");
      out.write("                    //重置\r\n");
      out.write("                    addressMap = null;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror: function(XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("\t\t\talert(XMLHttpRequest.status);\r\n");
      out.write("\t\t\talert(XMLHttpRequest.readyState);\r\n");
      out.write("\t\t\t$.confirm({\r\n");
      out.write("\t\t\t\ttheme: 'dark',\r\n");
      out.write("\t\t\t\tanimation: 'rotateX',\r\n");
      out.write("\t\t\t\tcloseAnimation: 'rotateX',\r\n");
      out.write("\t\t\t\ttitle: false,\r\n");
      out.write("\t\t\t\tcontent: textStatus,\r\n");
      out.write("\t\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function spreadArea(id, index) {\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        type: 'get',\r\n");
      out.write("        url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/area/spread/'+id +\"/\"+ index,\r\n");
      out.write("        data: null,\r\n");
      out.write("        success: function(result) {\r\n");
      out.write("            addressMap = result;\r\n");
      out.write("        },\r\n");
      out.write("        error: function(XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("            alert(XMLHttpRequest.status);\r\n");
      out.write("            alert(XMLHttpRequest.readyState);\r\n");
      out.write("            $.confirm({\r\n");
      out.write("                theme: 'dark',\r\n");
      out.write("                animation: 'rotateX',\r\n");
      out.write("                closeAnimation: 'rotateX',\r\n");
      out.write("                title: false,\r\n");
      out.write("                content: textStatus,\r\n");
      out.write("                buttons: {\r\n");
      out.write("                    confirm: {\r\n");
      out.write("                        text: '确认',\r\n");
      out.write("                        btnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function createSubmit(id) {\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        type: 'get',\r\n");
      out.write("        url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/area/query/'+ id,\r\n");
      out.write("        data: null,\r\n");
      out.write("        success: function(result) {\r\n");
      out.write("            addressId = id;\r\n");
      out.write("            $(\"#address\").val(result);\r\n");
      out.write("            if(document.getElementById(\"addressName\") != null){\r\n");
      out.write("                document.getElementById(\"addressName\").innerHTML = result;\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        error: function(XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("            alert(XMLHttpRequest.status);\r\n");
      out.write("            alert(XMLHttpRequest.readyState);\r\n");
      out.write("            $.confirm({\r\n");
      out.write("                theme: 'dark',\r\n");
      out.write("                animation: 'rotateX',\r\n");
      out.write("                closeAnimation: 'rotateX',\r\n");
      out.write("                title: false,\r\n");
      out.write("                content: textStatus,\r\n");
      out.write("                buttons: {\r\n");
      out.write("                    confirm: {\r\n");
      out.write("                        text: '确认',\r\n");
      out.write("                        btnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    addressDialog.close();\r\n");
      out.write("}\r\n");
      out.write("</script>  ");
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
      // /WEB-INF/jsp/manage/addressSelect.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("basePath");
      // /WEB-INF/jsp/manage/addressSelect.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/jsp/manage/addressSelect.jsp(13,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${proAreaMap}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/jsp/manage/addressSelect.jsp(13,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      // /WEB-INF/jsp/manage/addressSelect.jsp(13,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("status");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<td>\r\n");
            out.write("\t\t\t\t\t<a href=\"###\" onclick=\"queryArea('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.key}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("', '");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("', '");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("')\" style=\"display:inline-block; color: #0044cc;\" >");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a>\r\n");
            out.write("\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/jsp/manage/addressSelect.jsp(17,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(status.index+1)%5==0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
