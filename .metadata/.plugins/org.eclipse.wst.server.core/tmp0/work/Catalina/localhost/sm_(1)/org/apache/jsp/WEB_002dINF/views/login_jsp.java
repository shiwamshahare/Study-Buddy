/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-10-14 09:26:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");


    String mesg=request.getParameter("msg");
    System.out.println(request.getAttribute("msg"));
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Sign-in</title>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("\r\n");
      out.write("        *{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            font-family:Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .signinmain{\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("            width: 100vw;\r\n");
      out.write("            /* background-image: linear-gradient(to right, rgba(107, 197, 222, 0.074),rgba(159, 211, 225, 0.189), rgba(181, 216, 224, 0.079),white , white ); */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .heading{\r\n");
      out.write("            height: 5rem;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            font-size: 36px;\r\n");
      out.write("            font-weight: 700;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            padding-top: 5rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .sectext{\r\n");
      out.write("            color: #007bff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .signincontainer{\r\n");
      out.write("            height: 80%;\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            display: flex;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .signleft{\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            width: 50%;\r\n");
      out.write("            margin-top: 1rem;\r\n");
      out.write("            display: flex;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .signleft>img{\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            object-fit: contain;\r\n");
      out.write("            padding-bottom: 4rem;\r\n");
      out.write("            padding-left: 7.6rem;\r\n");
      out.write("            margin-top: 1rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .signright{\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            width: 50%;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            margin-top: 1rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        form {\r\n");
      out.write("            margin-left: 34px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            width: 50%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        label {\r\n");
      out.write("            font-size: 1.2em;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        input {\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            width: 250px;\r\n");
      out.write("            font-size: 1em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-button {\r\n");
      out.write("            background-color: #007bff;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            font-size: 1.2em;\r\n");
      out.write("            width: 82%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-button:hover{\r\n");
      out.write("            background-color: #0359b5;            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-heading{\r\n");
      out.write("            font-size: 27px;\r\n");
      out.write("            color: rgb(51, 96, 209);\r\n");
      out.write("            padding-bottom: 1rem;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"signinmain\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"heading\">\r\n");
      out.write("                <span>Study</span><span class=\"sectext\">Buddy</span>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"signincontainer\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"signleft\">\r\n");
      out.write("                    <img src=\"https://img.freepik.com/free-vector/mobile-login-concept-illustration_114360-83.jpg?w=740&t=st=1709134298~exp=1709134898~hmac=51ddcda8203504b3b7f093cb459de6a0c6d67dfa8df487e61e89b951e9fcc988\" alt=\"signinimg\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"signright\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                    <form action=\"validate-student\" method=\"POST\">\r\n");
      out.write("                      	<div style=\"color: red;\">\r\n");
      out.write("                      	");
 if(request.getParameter("msg")!=null){
      out.write("\r\n");
      out.write("                      	 <h1>");
      out.print(mesg );
      out.write("</h1>\r\n");
      out.write("                      	");
}
                      	else if(request.getAttribute("msg")!=null) {
      out.write("\r\n");
      out.write("                      		 <h1>");
      out.print(request.getAttribute("msg") );
      out.write("</h1>	\r\n");
      out.write("                      ");
}
                      	
                      	
      out.write("\r\n");
      out.write("                      	\r\n");
      out.write("                \r\n");
      out.write("                	</div>\r\n");
      out.write("                        <label for=\"mail\">Email Address:</label>\r\n");
      out.write("                        <input type=\"email\" name=\"mail\" id=\"mail\" required>\r\n");
      out.write("            \r\n");
      out.write("                        <label for=\"pass\">Password:</label>\r\n");
      out.write("                        <input type=\"password\" name=\"pass\" id=\"pass\" required>\r\n");
      out.write("            \r\n");
      out.write("                        <button type=\"submit\" class=\"login-button\">Login</button>\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                	\r\n");
      out.write("              \r\n");
      out.write(" \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
