/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-11-10 02:37:29 UTC
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
      out.write("\n");
      out.write("<style>\n");
      out.write("\ttr {\n");
      out.write("\t\tborder-spacing:3px;\n");
      out.write("\t}\n");
      out.write("\tlabel {\n");
      out.write("\t\tfont-size:16px;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("<div id=\"updateDialog\" class=\"crudDialog\" style=\"width: 86%\">\n");
      out.write("\t<h3>\n");
      out.write("\t\t工作经验\n");
      out.write("\t</h3>\n");
      out.write("\t<hr style=\"height:1px;background:#000;margin-bottom: 0px; margin-top: 5px;\"/>\n");
      out.write("\n");
      out.write("\t<table id=\"table\"></table>\n");
      out.write("\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tvar work = null;\n");
      out.write("    var $table = $('#table');\n");
      out.write("    $(function() {\n");
      out.write("        // bootstrap table初始化\n");
      out.write("        $table.bootstrapTable({\n");
      out.write("            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/talent/rmsTalentWork/list',\n");
      out.write("            striped: true,\n");
      out.write("            detailView: true,\n");
      out.write("            detailFormatter: function (index, row) {\n");
      out.write("                var postDescribe = row['postDescribe'];\n");
      out.write("                if(postDescribe == null){\n");
      out.write("                    postDescribe = \"\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var divStr = '<div><output><b>工作描述：</b></output><output>'+postDescribe+'</output></div>';\n");
      out.write("                return divStr;\n");
      out.write("            },\n");
      out.write("            queryParams: queryParams, //参数\n");
      out.write("            queryParamsType: \"limit\", //参数格式,发送标准的RESTFul类型的参数请求\n");
      out.write("            sidePagination: 'server',\n");
      out.write("            escape: true,\n");
      out.write("            idField: 'workId',\n");
      out.write("            toolbar: '#toolbar',\n");
      out.write("            columns: [\n");
      out.write("\t\t\t\t\t{field: 'beginDate', title: '开始时间', align: 'center', with: 10,\n");
      out.write("\t\t\t\t\t\t//——修改——获取日期列的值进行转换\n");
      out.write("\t\t\t\t\t\tformatter: function (value, row, index) {\n");
      out.write("\t\t\t\t\t\t\treturn dateFormat_1(value)\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t},\n");
      out.write("                    {field: 'endDate', title: '结束时间', align: 'center', with: '10%',\n");
      out.write("                        //——修改——获取日期列的值进行转换\n");
      out.write("                        formatter: function (value, row, index) {\n");
      out.write("                            return dateFormat_1(value)\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                \t{field: 'companyName', title: '公司名称', align: 'center', with: '10%'},\n");
      out.write("                \t{field: 'companyPost', title: '职务名称', align: 'center', with: '10%'},\n");
      out.write("                \t{field: 'companySalary', title: '工薪', align: 'center', with: '10%',\n");
      out.write("                        formatter: function (value, row, index) {\n");
      out.write("                            return dictFormatSalary(value)\n");
      out.write("                        }\n");
      out.write("\t\t\t\t\t}\n");
      out.write("//                    {\n");
      out.write("//                        title: '操作',\n");
      out.write("//                        field: 'action',\n");
      out.write("//                        align: 'center',\n");
      out.write("//                        with: '10%',\n");
      out.write("//                        formatter:function(value,row,index){\n");
      out.write("//                            var e = '<button type=\"button\" class=\"RoleOfdelete btn btn-primary  btn-sm\" style=\"margin-right:15px;\">查看</button>';\n");
      out.write("//                            var d = '<button type=\"button\" class=\"RoleOfedit btn btn-primary  btn-sm\" style=\"margin-right:15px;\">修改</button>';\n");
      out.write("//                            return d;\n");
      out.write("//                        },\n");
      out.write("//                        events: 'operateEvents'\n");
      out.write("//                    }\n");
      out.write("            \t]\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        //开始时间\n");
      out.write("        $('#datetimepicker1').datetimepicker({\n");
      out.write("            language:  'zh-CN',\n");
      out.write("            format: 'yyyy-mm',\n");
      out.write("            startView: 3,\n");
      out.write("            minView: 3,\n");
      out.write("            weekStart: 1,\n");
      out.write("            autoclose:true,\n");
      out.write("            forceParse: true\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        //结束时间\n");
      out.write("        $('#datetimepicker2').datetimepicker({\n");
      out.write("            language:  'zh-CN',\n");
      out.write("            format: 'yyyy-mm',\n");
      out.write("            startView: 3,\n");
      out.write("            minView: 3,\n");
      out.write("            weekStart: 1,\n");
      out.write("            autoclose:true,\n");
      out.write("            forceParse: true\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function queryParams(params) {  //配置参数\n");
      out.write("        var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的\n");
      out.write("            order: 'ace',\n");
      out.write("\t\t\ttalentId: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${talentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        };\n");
      out.write("        return temp;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function dictFormatSalary(id){\n");
      out.write("        var dictMap = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${salaryMap}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("        var dictStrs = dictMap.replace(\"{\", \"\").replace(\"}\",\"\").split(\",\");\n");
      out.write("        for(var key in dictStrs){\n");
      out.write("\t\t\tif(id == dictStrs[key].split(\"=\")[0]){\n");
      out.write("\t\t\t    return dictStrs[key].split(\"=\")[1];\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function dateFormat_1(longTypeDate){\n");
      out.write("        var dateType = \"\";\n");
      out.write("        var date = new Date();\n");
      out.write("        date.setTime(longTypeDate);\n");
      out.write("        dateType += date.getFullYear();   //年\n");
      out.write("        dateType += \"-\" + getMonth(date); //月\n");
      out.write("        return dateType;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //返回 01-12 的月份值\n");
      out.write("    function getMonth(date){\n");
      out.write("        var month = \"\";\n");
      out.write("        month = date.getMonth() + 1; //getMonth()得到的月份是0-11\n");
      out.write("        if(month<10){\n");
      out.write("            month = \"0\" + month;\n");
      out.write("        }\n");
      out.write("        return month;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //返回01-30的日期\n");
      out.write("    function getDay(date){\n");
      out.write("        var day = \"\";\n");
      out.write("        day = date.getDate();\n");
      out.write("        if(day<10){\n");
      out.write("            day = \"0\" + day;\n");
      out.write("        }\n");
      out.write("        return day;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //table按钮添加点击事件\n");
      out.write("    window.operateEvents = {\n");
      out.write("        'click .RoleOfedit': function (e, value, row, index) {\n");
      out.write("            getWork(row.workId);\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    function getWork(workId) {\n");
      out.write("        var arr = $('#updateForm').serialize();\n");
      out.write("        $.param(arr);\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        $.ajax({\n");
      out.write("            type: 'get',\n");
      out.write("            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/talent/rmsTalentWork/update/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${talentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/'+workId,\n");
      out.write("            data: null,\n");
      out.write("            success: function(result) {\n");
      out.write("                work = result;\n");
      out.write("\n");
      out.write("                var beginDate = dateFormat_1(work.beginDate);\n");
      out.write("                $('#datetimepicker1').val(beginDate);\n");
      out.write("\n");
      out.write("                var endDate = dateFormat_1(work.endDate);\n");
      out.write("                $('#datetimepicker2').val(endDate);\n");
      out.write("\n");
      out.write("                $('#companyName').val(work.companyName);\n");
      out.write("\t\t\t},\n");
      out.write("            error: function(XMLHttpRequest, textStatus, errorThrown) {\n");
      out.write("                alert(XMLHttpRequest.status);\n");
      out.write("                alert(XMLHttpRequest.readyState);\n");
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
      out.write("\n");
      out.write("    //新增\n");
      out.write("    document.getElementById(\"buttonNewId\").onclick=function () {\n");
      out.write("        updateSubmit(\"new\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //更新\n");
      out.write("    document.getElementById(\"buttonId\").onclick=function () {\n");
      out.write("        updateSubmit(\"edit\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function updateSubmit(where) {\n");
      out.write("        var workId = 0;\n");
      out.write("        if('edit' == where){\n");
      out.write("            if(null == work){\n");
      out.write("                alert(\"请点击保存并新增！\");\n");
      out.write("\t\t\t}\n");
      out.write("            workId = work.workId;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("        var beginlong = new Date(Date.parse($('#datetimepicker1').val().replace(/-/g,  \"/\"))).getTime();\n");
      out.write("        var endlong = new Date(Date.parse($('#datetimepicker1').val().replace(/-/g,  \"/\"))).getTime();\n");
      out.write("\n");
      out.write("        var arr = $('#updateForm').serialize();\n");
      out.write("        $.param(arr);\n");
      out.write("        arr = arr + \"&beginDate=\" + beginlong + \"&endDate=\" + endlong;\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\ttype: 'post',\n");
      out.write("\t\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/talent/rmsTalentWork/update/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${talentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/'+workId,\n");
      out.write("\t \t\tdata: arr,\n");
      out.write("\t\t\tsuccess: function(result) {\n");
      out.write("\t\t\t\tif (result.code != 1) {\n");
      out.write("\t\t\t\t\tif (result.data instanceof Array) {\n");
      out.write("\t\t\t\t\t\t$.each(result.data, function(index, value) {\n");
      out.write("\t\t\t\t\t\t\t$.confirm({\n");
      out.write("\t\t\t\t\t\t\t\ttheme: 'dark',\n");
      out.write("\t\t\t\t\t\t\t\tanimation: 'rotateX',\n");
      out.write("\t\t\t\t\t\t\t\tcloseAnimation: 'rotateX',\n");
      out.write("\t\t\t\t\t\t\t\ttitle: false,\n");
      out.write("\t\t\t\t\t\t\t\tcontent: value.errorMsg,\n");
      out.write("\t\t\t\t\t\t\t\tbuttons: {\n");
      out.write("\t\t\t\t\t\t\t\t\tconfirm: {\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttext: '确认',\n");
      out.write("\t\t\t\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t} else {\n");
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
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t} else {\n");
      out.write("                    $table.bootstrapTable(\"refresh\",\n");
      out.write("                        {\n");
      out.write("                            url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/manage/talent/rmsTalentWork/list'\n");
      out.write("                        }\n");
      out.write("                \t);\n");
      out.write("\n");
      out.write("                    $(\"#datetimepicker1\").val(\"\");\n");
      out.write("                    $(\"#datetimepicker2\").val(\"\");\n");
      out.write("                    $(\"#companyName\").val(\"\");\n");
      out.write("\n");
      out.write("                    work = null;\n");
      out.write("\n");
      out.write("        \t\t\t$.confirm({\n");
      out.write("                        title: false,\n");
      out.write("                        content: '成功！',\n");
      out.write("                        autoClose: 'cancel|3000',\n");
      out.write("                        backgroundDismiss: true,\n");
      out.write("                        buttons: {\n");
      out.write("                            cancel: {\n");
      out.write("                                text: '确认',\n");
      out.write("                                btnClass: 'waves-effect waves-button'\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terror: function(XMLHttpRequest, textStatus, errorThrown) {\n");
      out.write("                alert(XMLHttpRequest.status);\n");
      out.write("                alert(XMLHttpRequest.readyState);\n");
      out.write("\t\t\t\t$.confirm({\n");
      out.write("\t\t\t\t\ttheme: 'dark',\n");
      out.write("\t\t\t\t\tanimation: 'rotateX',\n");
      out.write("\t\t\t\t\tcloseAnimation: 'rotateX',\n");
      out.write("\t\t\t\t\ttitle: false,\n");
      out.write("\t\t\t\t\tcontent: textStatus,\n");
      out.write("\t\t\t\t\tbuttons: {\n");
      out.write("\t\t\t\t\t\tconfirm: {\n");
      out.write("\t\t\t\t\t\t\ttext: '确认',\n");
      out.write("\t\t\t\t\t\t\tbtnClass: 'waves-effect waves-button waves-light'\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
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
