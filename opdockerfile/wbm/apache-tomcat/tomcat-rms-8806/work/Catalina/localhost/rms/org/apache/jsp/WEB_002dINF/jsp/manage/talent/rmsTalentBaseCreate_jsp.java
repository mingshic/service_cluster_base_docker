/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-12-18 16:19:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.manage.talent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rmsTalentBaseCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/spring-webmvc-4.3.20.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1539563356000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.20.RELEASE.jar", Long.valueOf(1541076044000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/shiro-web-1.3.2.jar!/META-INF/shiro.tld", Long.valueOf(1473414826000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1528799796000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/shiro-web-1.3.2.jar", Long.valueOf(1528799788000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/spring-webmvc-4.3.20.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1539563356000L));
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
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/inc/head.jsp", out, true);
      out.write("\n");
      out.write("<div id=\"createDialog\" class=\"crudDialog\" style=\"margin-left: 20px;\">\n");
      out.write("    <h3>\n");
      out.write("        基本信息\n");
      out.write("    </h3>\n");
      out.write("    <hr style=\"height:1px;background:#000;margin-bottom: 5px; margin-top: 5px;\"/>\n");
      out.write("    <div>\n");
      out.write("        填写基本信息（<span style=\"color:red;\">*</span>为必填项）\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <form id=\"createForm\" method=\"post\" style=\"margin-top: 5px;\">\n");
      out.write("        <table width=\"75%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"table1_found\">\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"talentName\" style=\"font-size: 16px;\">姓名<span style=\"color:red;\">&nbsp;&nbsp;*</span></label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"talentName\" class=\"form-control\" type=\"text\" name=\"talentName\" maxlength=\"30\" style=\"width:200px; height: 25px;\">\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"idCard\" style=\"font-size: 16px;\">身份证<span style=\"color:red;\">&nbsp;&nbsp;*</span></label>\n");
      out.write("                </td>\n");
      out.write("                <td colspan=\"3\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"idCard\" class=\"form-control\" type=\"text\" name=\"idCard\" maxlength=\"18\" style=\"width:200px; height: 25px;\">\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label style=\"font-size: 16px;\">性别<span style=\"color:red;\">&nbsp;&nbsp;*</span></label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"radio\">\n");
      out.write("                        <div class=\"radio radio-inline radio-info\">\n");
      out.write("                            <input id=\"sex_1\" type=\"radio\" name=\"sex\" value=\"1\" checked>\n");
      out.write("                            <label for=\"sex_1\">男 </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"radio radio-inline radio-danger\">\n");
      out.write("                            <input id=\"sex_0\" type=\"radio\" name=\"sex\" value=\"0\">\n");
      out.write("                            <label for=\"sex_0\">女 </label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label style=\"font-size: 16px;\">出生日期<span style=\"color:red;\">&nbsp;&nbsp;*</span></label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <div class='input-group date form_date' id='datetimepicker1' style=\"width: 210px;\">\n");
      out.write("                        <input type='text' class=\"form-control input-sm\" />\n");
      out.write("                        <span class=\"input-group-addon input-sm\">\n");
      out.write("                          <span class=\"glyphicon glyphicon-calendar\"></span>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"censusType\" style=\"font-size: 16px;\">户口所在地<span style=\"color:red;\">&nbsp;&nbsp;*</span></label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"censusType\" class=\"form-control\" type=\"text\" name=\"censusType\" maxlength=\"4\" style=\"width:200px; height: 25px;\" >\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"address\" style=\"font-size: 16px;\">现居住地<span style=\"color:red;\">&nbsp;&nbsp;*</span></label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"address\" class=\"form-control\" type=\"text\" name=\"address\" maxlength=\"4\" style=\"width:200px; height: 25px;\">\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"mobilePhone\" style=\"font-size: 16px;\">手机<span style=\"color:red;\">&nbsp;&nbsp;*</span></label>\n");
      out.write("                </td>\n");
      out.write("                <td colspan=\"3\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"mobilePhone\" class=\"form-control\" type=\"text\" name=\"mobilePhone\" maxlength=\"30\" style=\"width:200px; height: 25px;\">\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"email\" style=\"font-size: 16px;\">邮箱<span style=\"color:red;\">&nbsp;&nbsp;*</span></label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"email\" class=\"form-control\" type=\"text\" name=\"email\" maxlength=\"60\" style=\"width:200px; height: 25px;\">\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"qqCode\" style=\"font-size: 16px;\">QQ号</label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"qqCode\" class=\"form-control\" type=\"text\" name=\"qqCode\" maxlength=\"30\" style=\"width:200px; height: 25px;\">\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label for=\"wechatCode\" style=\"font-size: 16px;\">微信号</label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"wechatCode\" class=\"form-control\" type=\"text\" name=\"wechatCode\" maxlength=\"60\" style=\"width:200px; height: 25px;\">\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border-spacing:5px;\">\n");
      out.write("                <td>\n");
      out.write("                    <label style=\"font-size: 16px;\">婚姻状况</label>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"radio\">\n");
      out.write("                        <div class=\"radio radio-inline radio-info\">\n");
      out.write("                            <input id=\"marriage_0\" type=\"radio\" name=\"marriage\" value=\"0\" checked>\n");
      out.write("                            <label for=\"marriage_0\">未婚</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"radio radio-inline radio-danger\">\n");
      out.write("                            <input id=\"marriage_1\" type=\"radio\" name=\"marriage\" value=\"1\">\n");
      out.write("                            <label for=\"marriage_1\">已婚</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"radio radio-inline radio-success\">\n");
      out.write("                            <input id=\"marriage_2\" type=\"radio\" name=\"marriage\" value=\"2\">\n");
      out.write("                            <label for=\"marriage_2\">离异</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <div style=\"margin-top: 10px;\">\n");
      out.write("            <a class=\"btn btn-primary\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/talent/rmsTalentIntention/create\">\n");
      out.write("                下一步\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/inc/footer.jsp", out, true);
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(function () {\n");
      out.write("        $('#datetimepicker1').datetimepicker({\n");
      out.write("            language:  'zh-CN',\n");
      out.write("            format: 'yyyy-mm',\n");
      out.write("            startView: 3,\n");
      out.write("            minView: 3,\n");
      out.write("            weekStart: 1,\n");
      out.write("            autoclose: true,\n");
      out.write("            forceParse: true\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    document.getElementById(\"buttonId\").onclick=function () {\n");
      out.write("        alert(\"123\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function createSubmit() {\n");
      out.write("        var arr = $('#createForm').serialize();\n");
      out.write("        $.param(arr);\n");
      out.write("        alert(\"表单序列化==============\"+arr);\n");
      out.write("\n");
      out.write("        $.ajax({\n");
      out.write("            type: 'post',\n");
      out.write("            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/talent/rmsTalentBase/create',\n");
      out.write("            data: $('#createForm').serialize(),\n");
      out.write("            beforeSend: function() {\n");
      out.write("                if ($('#idCard').val() == '') {\n");
      out.write("                    $('#idCard').focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            success: function(result) {\n");
      out.write("                if (result.code != 1) {\n");
      out.write("                    if (result.data instanceof Array) {\n");
      out.write("                        $.each(result.data, function(index, value) {\n");
      out.write("                            $.confirm({\n");
      out.write("                                theme: 'dark',\n");
      out.write("                                animation: 'rotateX',\n");
      out.write("                                closeAnimation: 'rotateX',\n");
      out.write("                                title: false,\n");
      out.write("                                content: value.errorMsg,\n");
      out.write("                                buttons: {\n");
      out.write("                                    confirm: {\n");
      out.write("                                        text: '确认',\n");
      out.write("                                        btnClass: 'waves-effect waves-button waves-light'\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                    } else {\n");
      out.write("                            $.confirm({\n");
      out.write("                                theme: 'dark',\n");
      out.write("                                animation: 'rotateX',\n");
      out.write("                                closeAnimation: 'rotateX',\n");
      out.write("                                title: false,\n");
      out.write("                                content: result.data.errorMsg,\n");
      out.write("                                buttons: {\n");
      out.write("                                    confirm: {\n");
      out.write("                                        text: '确认',\n");
      out.write("                                        btnClass: 'waves-effect waves-button waves-light'\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                    }\n");
      out.write("                } else {\n");
      out.write("                    createDialog.close();\n");
      out.write("                    $table.bootstrapTable('refresh');\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            error: function(XMLHttpRequest, textStatus, errorThrown) {\n");
      out.write("                alert(\":::\"+XMLHttpRequest+\":::\"+textStatus+\":::\"+errorThrown);\n");
      out.write("                alert(XMLHttpRequest.status);\n");
      out.write("                alert(XMLHttpRequest.readyState);\n");
      out.write("                alert(textStatus);\n");
      out.write("\n");
      out.write("                $.confirm({\n");
      out.write("                    theme: 'dark',\n");
      out.write("                    animation: 'rotateX',\n");
      out.write("                    closeAnimation: 'rotateX',\n");
      out.write("                    title: false,\n");
      out.write("                    content: textStatus,\n");
      out.write("                    buttons: {\n");
      out.write("                        confirm: {\n");
      out.write("                            text: '确认',\n");
      out.write("                            btnClass: 'waves-effect waves-button waves-light'\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
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
      // /WEB-INF/jsp/manage/talent/rmsTalentBaseCreate.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("basePath");
      // /WEB-INF/jsp/manage/talent/rmsTalentBaseCreate.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
}
