/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-04-28 02:09:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.manage.talent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rmsTalentWorkUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar", Long.valueOf(1524464919000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1524464918000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/opt/www/webserver/wbm-rms-admin/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1500522006000L));
    _jspx_dependants.put("/WEB-INF/lib/shiro-web-1.3.2.jar", Long.valueOf(1524464919000L));
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
      out.write("<style>\r\n");
      out.write("\ttr {\r\n");
      out.write("\t\tborder-spacing:3px;\r\n");
      out.write("\t}\r\n");
      out.write("\tlabel {\r\n");
      out.write("\t\tfont-size:16px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<div id=\"updateDialog\" class=\"crudDialog\" style=\"width: 86%\">\r\n");
      out.write("\t<h3>\r\n");
      out.write("\t\t工作经验\r\n");
      out.write("\t</h3>\r\n");
      out.write("\t<hr style=\"height:1px;background:#000;margin-bottom: 0px; margin-top: 5px;\"/>\r\n");
      out.write("\r\n");
      out.write("\t<table id=\"table\"></table>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar work = null;\r\n");
      out.write("    var $table = $('#table');\r\n");
      out.write("    $(function() {\r\n");
      out.write("        // bootstrap table初始化\r\n");
      out.write("        $table.bootstrapTable({\r\n");
      out.write("            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/talent/rmsTalentWork/list',\r\n");
      out.write("            striped: true,\r\n");
      out.write("            detailView: true,\r\n");
      out.write("            detailFormatter: function (index, row) {\r\n");
      out.write("                var postDescribe = row['postDescribe'];\r\n");
      out.write("                if(postDescribe == null){\r\n");
      out.write("                    postDescribe = \"\";\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                var divStr = '<div><output><b>工作描述：</b></output><output>'+postDescribe+'</output></div>';\r\n");
      out.write("                return divStr;\r\n");
      out.write("            },\r\n");
      out.write("            queryParams: queryParams, //参数\r\n");
      out.write("            queryParamsType: \"limit\", //参数格式,发送标准的RESTFul类型的参数请求\r\n");
      out.write("            sidePagination: 'server',\r\n");
      out.write("            escape: true,\r\n");
      out.write("            idField: 'workId',\r\n");
      out.write("            toolbar: '#toolbar',\r\n");
      out.write("            columns: [\r\n");
      out.write("\t\t\t\t\t{field: 'beginDate', title: '开始时间', align: 'center', with: 10,\r\n");
      out.write("\t\t\t\t\t\t//——修改——获取日期列的值进行转换\r\n");
      out.write("\t\t\t\t\t\tformatter: function (value, row, index) {\r\n");
      out.write("\t\t\t\t\t\t\treturn dateFormat_1(value)\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("                    {field: 'endDate', title: '结束时间', align: 'center', with: '10%',\r\n");
      out.write("                        //——修改——获取日期列的值进行转换\r\n");
      out.write("                        formatter: function (value, row, index) {\r\n");
      out.write("                            return dateFormat_1(value)\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                \t{field: 'companyName', title: '公司名称', align: 'center', with: '10%'},\r\n");
      out.write("                \t{field: 'companyPost', title: '职务名称', align: 'center', with: '10%'},\r\n");
      out.write("                \t{field: 'companySalary', title: '工薪', align: 'center', with: '10%',\r\n");
      out.write("                        formatter: function (value, row, index) {\r\n");
      out.write("                            return dictFormatSalary(value)\r\n");
      out.write("                        }\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("//                    {\r\n");
      out.write("//                        title: '操作',\r\n");
      out.write("//                        field: 'action',\r\n");
      out.write("//                        align: 'center',\r\n");
      out.write("//                        with: '10%',\r\n");
      out.write("//                        formatter:function(value,row,index){\r\n");
      out.write("//                            var e = '<button type=\"button\" class=\"RoleOfdelete btn btn-primary  btn-sm\" style=\"margin-right:15px;\">查看</button>';\r\n");
      out.write("//                            var d = '<button type=\"button\" class=\"RoleOfedit btn btn-primary  btn-sm\" style=\"margin-right:15px;\">修改</button>';\r\n");
      out.write("//                            return d;\r\n");
      out.write("//                        },\r\n");
      out.write("//                        events: 'operateEvents'\r\n");
      out.write("//                    }\r\n");
      out.write("            \t]\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //开始时间\r\n");
      out.write("        $('#datetimepicker1').datetimepicker({\r\n");
      out.write("            language:  'zh-CN',\r\n");
      out.write("            format: 'yyyy-mm',\r\n");
      out.write("            startView: 3,\r\n");
      out.write("            minView: 3,\r\n");
      out.write("            weekStart: 1,\r\n");
      out.write("            autoclose:true,\r\n");
      out.write("            forceParse: true\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //结束时间\r\n");
      out.write("        $('#datetimepicker2').datetimepicker({\r\n");
      out.write("            language:  'zh-CN',\r\n");
      out.write("            format: 'yyyy-mm',\r\n");
      out.write("            startView: 3,\r\n");
      out.write("            minView: 3,\r\n");
      out.write("            weekStart: 1,\r\n");
      out.write("            autoclose:true,\r\n");
      out.write("            forceParse: true\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function queryParams(params) {  //配置参数\r\n");
      out.write("        var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的\r\n");
      out.write("            order: 'ace',\r\n");
      out.write("\t\t\ttalentId: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${talentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        };\r\n");
      out.write("        return temp;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function dictFormatSalary(id){\r\n");
      out.write("        var dictMap = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${salaryMap}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("        var dictStrs = dictMap.replace(\"{\", \"\").replace(\"}\",\"\").split(\",\");\r\n");
      out.write("        for(var key in dictStrs){\r\n");
      out.write("\t\t\tif(id == dictStrs[key].split(\"=\")[0]){\r\n");
      out.write("\t\t\t    return dictStrs[key].split(\"=\")[1];\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function dateFormat_1(longTypeDate){\r\n");
      out.write("        var dateType = \"\";\r\n");
      out.write("        var date = new Date();\r\n");
      out.write("        date.setTime(longTypeDate);\r\n");
      out.write("        dateType += date.getFullYear();   //年\r\n");
      out.write("        dateType += \"-\" + getMonth(date); //月\r\n");
      out.write("        return dateType;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //返回 01-12 的月份值\r\n");
      out.write("    function getMonth(date){\r\n");
      out.write("        var month = \"\";\r\n");
      out.write("        month = date.getMonth() + 1; //getMonth()得到的月份是0-11\r\n");
      out.write("        if(month<10){\r\n");
      out.write("            month = \"0\" + month;\r\n");
      out.write("        }\r\n");
      out.write("        return month;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //返回01-30的日期\r\n");
      out.write("    function getDay(date){\r\n");
      out.write("        var day = \"\";\r\n");
      out.write("        day = date.getDate();\r\n");
      out.write("        if(day<10){\r\n");
      out.write("            day = \"0\" + day;\r\n");
      out.write("        }\r\n");
      out.write("        return day;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //table按钮添加点击事件\r\n");
      out.write("    window.operateEvents = {\r\n");
      out.write("        'click .RoleOfedit': function (e, value, row, index) {\r\n");
      out.write("            getWork(row.workId);\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    function getWork(workId) {\r\n");
      out.write("        var arr = $('#updateForm').serialize();\r\n");
      out.write("        $.param(arr);\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: 'get',\r\n");
      out.write("            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/talent/rmsTalentWork/update/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${talentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/'+workId,\r\n");
      out.write("            data: null,\r\n");
      out.write("            success: function(result) {\r\n");
      out.write("                work = result;\r\n");
      out.write("\r\n");
      out.write("                var beginDate = dateFormat_1(work.beginDate);\r\n");
      out.write("                $('#datetimepicker1').val(beginDate);\r\n");
      out.write("\r\n");
      out.write("                var endDate = dateFormat_1(work.endDate);\r\n");
      out.write("                $('#datetimepicker2').val(endDate);\r\n");
      out.write("\r\n");
      out.write("                $('#companyName').val(work.companyName);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("            error: function(XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("                alert(XMLHttpRequest.status);\r\n");
      out.write("                alert(XMLHttpRequest.readyState);\r\n");
      out.write("                $.confirm({\r\n");
      out.write("                    theme: 'dark',\r\n");
      out.write("                    animation: 'rotateX',\r\n");
      out.write("                    closeAnimation: 'rotateX',\r\n");
      out.write("                    title: false,\r\n");
      out.write("                    content: textStatus,\r\n");
      out.write("                    buttons: {\r\n");
      out.write("                        confirm: {\r\n");
      out.write("                            text: '确认',\r\n");
      out.write("                            btnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //新增\r\n");
      out.write("    document.getElementById(\"buttonNewId\").onclick=function () {\r\n");
      out.write("        updateSubmit(\"new\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //更新\r\n");
      out.write("    document.getElementById(\"buttonId\").onclick=function () {\r\n");
      out.write("        updateSubmit(\"edit\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateSubmit(where) {\r\n");
      out.write("        var workId = 0;\r\n");
      out.write("        if('edit' == where){\r\n");
      out.write("            if(null == work){\r\n");
      out.write("                alert(\"请点击保存并新增！\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("            workId = work.workId;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("        var beginlong = new Date(Date.parse($('#datetimepicker1').val().replace(/-/g,  \"/\"))).getTime();\r\n");
      out.write("        var endlong = new Date(Date.parse($('#datetimepicker1').val().replace(/-/g,  \"/\"))).getTime();\r\n");
      out.write("\r\n");
      out.write("        var arr = $('#updateForm').serialize();\r\n");
      out.write("        $.param(arr);\r\n");
      out.write("        arr = arr + \"&beginDate=\" + beginlong + \"&endDate=\" + endlong;\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: 'post',\r\n");
      out.write("\t\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/talent/rmsTalentWork/update/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${talentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/'+workId,\r\n");
      out.write("\t \t\tdata: arr,\r\n");
      out.write("\t\t\tsuccess: function(result) {\r\n");
      out.write("\t\t\t\tif (result.code != 1) {\r\n");
      out.write("\t\t\t\t\tif (result.data instanceof Array) {\r\n");
      out.write("\t\t\t\t\t\t$.each(result.data, function(index, value) {\r\n");
      out.write("\t\t\t\t\t\t\t$.confirm({\r\n");
      out.write("\t\t\t\t\t\t\t\ttheme: 'dark',\r\n");
      out.write("\t\t\t\t\t\t\t\tanimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle: false,\r\n");
      out.write("\t\t\t\t\t\t\t\tcontent: value.errorMsg,\r\n");
      out.write("\t\t\t\t\t\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$.confirm({\r\n");
      out.write("\t\t\t\t\t\t\ttheme: 'dark',\r\n");
      out.write("\t\t\t\t\t\t\tanimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\t\t\ttitle: false,\r\n");
      out.write("\t\t\t\t\t\t\tcontent: result.data.errorMsg,\r\n");
      out.write("\t\t\t\t\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("                    $table.bootstrapTable(\"refresh\",\r\n");
      out.write("                        {\r\n");
      out.write("                            url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/talent/rmsTalentWork/list'\r\n");
      out.write("                        }\r\n");
      out.write("                \t);\r\n");
      out.write("\r\n");
      out.write("                    $(\"#datetimepicker1\").val(\"\");\r\n");
      out.write("                    $(\"#datetimepicker2\").val(\"\");\r\n");
      out.write("                    $(\"#companyName\").val(\"\");\r\n");
      out.write("\r\n");
      out.write("                    work = null;\r\n");
      out.write("\r\n");
      out.write("        \t\t\t$.confirm({\r\n");
      out.write("                        title: false,\r\n");
      out.write("                        content: '成功！',\r\n");
      out.write("                        autoClose: 'cancel|3000',\r\n");
      out.write("                        backgroundDismiss: true,\r\n");
      out.write("                        buttons: {\r\n");
      out.write("                            cancel: {\r\n");
      out.write("                                text: '确认',\r\n");
      out.write("                                btnClass: 'waves-effect waves-button'\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function(XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("                alert(XMLHttpRequest.status);\r\n");
      out.write("                alert(XMLHttpRequest.readyState);\r\n");
      out.write("\t\t\t\t$.confirm({\r\n");
      out.write("\t\t\t\t\ttheme: 'dark',\r\n");
      out.write("\t\t\t\t\tanimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\tcloseAnimation: 'rotateX',\r\n");
      out.write("\t\t\t\t\ttitle: false,\r\n");
      out.write("\t\t\t\t\tcontent: textStatus,\r\n");
      out.write("\t\t\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t\t\tconfirm: {\r\n");
      out.write("\t\t\t\t\t\t\ttext: '确认',\r\n");
      out.write("\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script> ");
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
      // /WEB-INF/jsp/manage/talent/rmsTalentWorkUpdate.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("basePath");
      // /WEB-INF/jsp/manage/talent/rmsTalentWorkUpdate.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
