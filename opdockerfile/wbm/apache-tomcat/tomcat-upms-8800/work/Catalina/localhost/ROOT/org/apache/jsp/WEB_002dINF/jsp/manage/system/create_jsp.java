/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-04-02 03:08:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.manage.system;

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
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1500522006000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar", Long.valueOf(1522216416000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1500522006000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1522216330000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/zheng-upms-server/WEB-INF/lib/shiro-web-1.3.2.jar!/META-INF/shiro.tld", Long.valueOf(1473414826000L));
    _jspx_dependants.put("/WEB-INF/lib/shiro-web-1.3.2.jar", Long.valueOf(1522216352000L));
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
      out.write("\n");
      out.write("<div id=\"createDialog\" class=\"crudDialog\">\n");
      out.write("\t<form id=\"createForm\" method=\"post\">\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"theme\"></label>\n");
      out.write("\t\t\t<input id=\"theme\" type=\"color\" class=\"form-control\" name=\"theme\" maxlength=\"50\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"icon\">图标</label>\n");
      out.write("\t\t\t<input id=\"icon\" type=\"text\" class=\"form-control\" name=\"icon\" maxlength=\"20\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"title\">标题</label>\n");
      out.write("\t\t\t<input id=\"title\" type=\"text\" class=\"form-control\" name=\"title\" maxlength=\"20\" required=\"true\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"name\">名称</label>\n");
      out.write("\t\t\t<input id=\"name\" type=\"text\" class=\"form-control\" name=\"name\" maxlength=\"20\" required=\"true\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-8 form-group\">\n");
      out.write("\t\t\t\t<label for=\"name\">背景图</label>\n");
      out.write("\t\t\t\t<input id=\"banner\" type=\"text\" class=\"form-control\" name=\"banner\" maxlength=\"150\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4\">\n");
      out.write("\t\t\t\t<div id=\"picker\">上传背景图</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"description\">描述</label>\n");
      out.write("\t\t\t<input id=\"description\" type=\"text\" class=\"form-control\" name=\"description\" maxlength=\"300\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"basepath\">根目录</label>\n");
      out.write("\t\t\t<input id=\"basepath\" type=\"text\" class=\"form-control\" name=\"basepath\" maxlength=\"100\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"radio\">\n");
      out.write("\t\t\t<div class=\"radio radio-inline radio-success\">\n");
      out.write("\t\t\t\t<input id=\"status_1\" type=\"radio\" name=\"status\" value=\"1\" checked>\n");
      out.write("\t\t\t\t<label for=\"status_1\">正常 </label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"radio radio-inline\">\n");
      out.write("\t\t\t\t<input id=\"status_0\" type=\"radio\" name=\"status\" value=\"-1\">\n");
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
      out.write("function initUploader() {\n");
      out.write("    //百度上传按钮\n");
      out.write("    var uploader = WebUploader.create({\n");
      out.write("        // swf文件路径\n");
      out.write("        swf: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/zheng-admin/plugins/webuploader-0.1.5/Uploader.swf',\n");
      out.write("        // 文件接收服务端\n");
      out.write("        method: 'POST',\n");
      out.write("        // 选择文件的按钮。可选。\n");
      out.write("        // 内部根据当前运行是创建，可能是input元素，也可能是flash.\n");
      out.write("        pick: {\n");
      out.write("            \"id\": '#picker',\n");
      out.write("            \"multiple\": false\n");
      out.write("        },\n");
      out.write("        // 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！\n");
      out.write("        resize: false,\n");
      out.write("        // 选完文件后，是否自动上传。\n");
      out.write("        auto: false,\n");
      out.write("        // 只允许选择图片文件\n");
      out.write("        accept: {\n");
      out.write("            title: '图片文件',\n");
      out.write("            extensions: 'gif,jpg,jpeg,bmp,png',\n");
      out.write("            mimeTypes: 'image/*'\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("    uploader.on( 'fileQueued', function(file) {\n");
      out.write("        $.ajax({\n");
      out.write("            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ZHENG_OSS_ALIYUN_OSS_POLICY}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\n");
      out.write("            type: 'GET',\n");
      out.write("            dataType: 'jsonp',\n");
      out.write("            jsonp: 'callback',\n");
      out.write("            success: function(result) {\n");
      out.write("                var suffix = get_suffix(file.name);\n");
      out.write("                var random_name = random_string();\n");
      out.write("                uploader.options.formData.key = result.dir + '/' + random_name + suffix;\n");
      out.write("                uploader.options.formData.policy = result.policy;\n");
      out.write("                uploader.options.formData.OSSAccessKeyId = result.OSSAccessKeyId;\n");
      out.write("                uploader.options.formData.success_action_status = 200;\n");
      out.write("                uploader.options.formData.callback = result.callback;\n");
      out.write("                uploader.options.formData.signature = result.signature;\n");
      out.write("                uploader.options.server = result.action;\n");
      out.write("                uploader.upload();\n");
      out.write("            },\n");
      out.write("            error: function(msg) {\n");
      out.write("                console.log(msg);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    uploader.on( 'uploadSuccess', function(file, response) {\n");
      out.write("        $('#banner').val(response.data.filename).focus();\n");
      out.write("    });\n");
      out.write("    uploader.on( 'uploadError', function(file) {\n");
      out.write("        console.log('uploadError', file);\n");
      out.write("    });\n");
      out.write("}\n");
      out.write("// 根据路径获取后缀\n");
      out.write("function get_suffix(filename) {\n");
      out.write("    var pos = filename.lastIndexOf('.');\n");
      out.write("    var suffix = '';\n");
      out.write("    if (pos != -1) {\n");
      out.write("        suffix = filename.substring(pos);\n");
      out.write("    }\n");
      out.write("    return suffix;\n");
      out.write("}\n");
      out.write("// 随机字符串\n");
      out.write("function random_string(len) {\n");
      out.write("    len = len || 32;\n");
      out.write("    var chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';\n");
      out.write("    var maxPos = chars.length;\n");
      out.write("    var pwd = '';\n");
      out.write("    for (i = 0; i < len; i++) {\n");
      out.write("        pwd += chars.charAt(Math.floor(Math.random() * maxPos));\n");
      out.write("    }\n");
      out.write("    return pwd;\n");
      out.write("}\n");
      out.write("function createSubmit() {\n");
      out.write("    $.ajax({\n");
      out.write("        type: 'post',\n");
      out.write("        url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/system/create',\n");
      out.write("        data: $('#createForm').serialize(),\n");
      out.write("        beforeSend: function() {\n");
      out.write("            if ($('#title').val() == '') {\n");
      out.write("                $('#title').focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if ($('#name').val() == '') {\n");
      out.write("                $('#name').focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
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
      // /WEB-INF/jsp/manage/system/create.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("basePath");
      // /WEB-INF/jsp/manage/system/create.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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