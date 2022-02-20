package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_form_method_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_select_type_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_input_type_placeholder_path_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_form_method_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_select_type_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_input_type_placeholder_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_f_form_method_commandName_action.release();
    _jspx_tagPool_f_select_type_path.release();
    _jspx_tagPool_f_option_value.release();
    _jspx_tagPool_f_input_type_placeholder_path_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome to Spring Web MVC project</title>\n");
      out.write("        <style>\n");
      out.write("            @import url(http://fonts.googleapis.com/css?family=Roboto:400,100);\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background: url(https://dl.dropboxusercontent.com/u/23299152/Wallpapers/wallpaper-22705.jpg) no-repeat center center fixed; \n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                -moz-background-size: cover;\n");
      out.write("                -o-background-size: cover;\n");
      out.write("                background-size: cover;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card {\n");
      out.write("                padding: 40px;\n");
      out.write("                width: 274px;\n");
      out.write("                background-color: #F7F7F7;\n");
      out.write("                margin: 0 auto 10px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card h1 {\n");
      out.write("                font-weight: 100;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 2.3em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card input[type=submit] {\n");
      out.write("                width: 100%;\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card input[type=text], input[type=password] {\n");
      out.write("                height: 44px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                background: #fff;\n");
      out.write("                border: 1px solid #d9d9d9;\n");
      out.write("                border-top: 1px solid #c0c0c0;\n");
      out.write("                /* border-radius: 2px; */\n");
      out.write("                padding: 0 8px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("             .login-card select[type=text], input[type=password] {\n");
      out.write("                height: 44px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                background: #fff;\n");
      out.write("                border: 1px solid #d9d9d9;\n");
      out.write("                border-top: 1px solid #c0c0c0;\n");
      out.write("                /* border-radius: 2px; */\n");
      out.write("                padding: 0 8px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card input[type=text]:hover, input[type=password]:hover {\n");
      out.write("                border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .login-card select[type=text]:hover, select[type=password]:hover {\n");
      out.write("                border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login {\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-family: 'Arial', sans-serif;\n");
      out.write("                font-weight: 700;\n");
      out.write("                height: 36px;\n");
      out.write("                padding: 0 8px;\n");
      out.write("                /* border-radius: 3px; */\n");
      out.write("                /* -webkit-user-select: none;\n");
      out.write("                  user-select: none; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-submit {\n");
      out.write("                /* border: 1px solid #3079ed; */\n");
      out.write("                border: 0px;\n");
      out.write("                color: #fff;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.1); \n");
      out.write("                background-color: #4d90fe;\n");
      out.write("                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#4787ed)); */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-submit:hover {\n");
      out.write("                /* border: 1px solid #2f5bb7; */\n");
      out.write("                border: 0px;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.3);\n");
      out.write("                background-color: #357ae8;\n");
      out.write("                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#357ae8)); */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #666;\n");
      out.write("                font-weight: 400;\n");
      out.write("                text-align: center;\n");
      out.write("                display: inline-block;\n");
      out.write("                opacity: 0.6;\n");
      out.write("                transition: opacity ease 0.5s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card a:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-help {\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 12px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br/><br/><br/><br/>\n");
      out.write("        <div class=\"login-card\">\n");
      out.write("            <center> <small style=\" color: red\">Please Sine-up first </small> </center>\n");
      out.write("            <h1>Registration</h1><br>\n");
      out.write("            ");
      //  f:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_f_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_f_form_method_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_f_form_0.setPageContext(_jspx_page_context);
      _jspx_th_f_form_0.setParent(null);
      _jspx_th_f_form_0.setCommandName("user_registration");
      _jspx_th_f_form_0.setMethod("POST");
      _jspx_th_f_form_0.setAction("user_registration");
      int[] _jspx_push_body_count_f_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_f_form_0 = _jspx_th_f_form_0.doStartTag();
        if (_jspx_eval_f_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                ");
            if (_jspx_meth_f_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
              return;
            out.write("\n");
            out.write("                ");
            if (_jspx_meth_f_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
              return;
            out.write("\n");
            out.write("                ");
            if (_jspx_meth_f_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
              return;
            out.write("\n");
            out.write("                 ");
            if (_jspx_meth_f_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
              return;
            out.write("\n");
            out.write("                \n");
            out.write("                ");
            //  f:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_f_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_f_select_type_path.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_f_select_0.setPageContext(_jspx_page_context);
            _jspx_th_f_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
            _jspx_th_f_select_0.setDynamicAttribute(null, "type", new String("text"));
            _jspx_th_f_select_0.setPath("r_id");
            int[] _jspx_push_body_count_f_select_0 = new int[] { 0 };
            try {
              int _jspx_eval_f_select_0 = _jspx_th_f_select_0.doStartTag();
              if (_jspx_eval_f_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("                    <option value=\"\">Registration As</option>\n");
                  out.write("                    ");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
                  _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_select_0);
                  _jspx_th_c_forEach_0.setVar("role");
                  _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roles}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                  int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
                    if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("                        ");
                        //  f:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_f_option_0 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_f_option_value.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_f_option_0.setPageContext(_jspx_page_context);
                        _jspx_th_f_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                        _jspx_th_f_option_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.r_id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                        int[] _jspx_push_body_count_f_option_0 = new int[] { 0 };
                        try {
                          int _jspx_eval_f_option_0 = _jspx_th_f_option_0.doStartTag();
                          if (_jspx_eval_f_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_f_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_f_option_0[0]++;
                              _jspx_th_f_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_f_option_0.doInitBody();
                            }
                            do {
                              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.r_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                              out.write("\n");
                              out.write("                        ");
                              int evalDoAfterBody = _jspx_th_f_option_0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_f_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_f_option_0[0]--;
                          }
                          if (_jspx_th_f_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_f_option_0[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_f_option_0.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_f_option_0.doFinally();
                          _jspx_tagPool_f_option_value.reuse(_jspx_th_f_option_0);
                        }
                        out.write("\n");
                        out.write("                    ");
                        int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_forEach_0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_forEach_0.doFinally();
                    _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
                  }
                  out.write("\n");
                  out.write("                ");
                  int evalDoAfterBody = _jspx_th_f_select_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_f_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_f_select_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_f_select_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_f_select_0.doFinally();
              _jspx_tagPool_f_select_type_path.reuse(_jspx_th_f_select_0);
            }
            out.write("    \n");
            out.write("                <input type=\"submit\" name=\"regs\" class=\"login login-submit\" value=\"Registration\"/>\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_f_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_f_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_f_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_f_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_f_form_0.doFinally();
        _jspx_tagPool_f_form_method_commandName_action.reuse(_jspx_th_f_form_0);
      }
      out.write("\n");
      out.write("                <small style=\"padding-left: 80%\"><a href=\"login.htm\">Back</a></small>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- <div id=\"error\"><img src=\"https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png\" /> Your caps-lock is on.</div> -->\n");
      out.write("\n");
      out.write("        <script src='http://codepen.io/assets/libs/fullpage/jquery_and_jqueryui.js'></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_placeholder_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_0.setPageContext(_jspx_page_context);
    _jspx_th_f_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_0.setPath("u_name");
    _jspx_th_f_input_0.setDynamicAttribute(null, "placeholder", new String("Username"));
    int[] _jspx_push_body_count_f_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_0 = _jspx_th_f_input_0.doStartTag();
      if (_jspx_th_f_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_0.doFinally();
      _jspx_tagPool_f_input_type_placeholder_path_nobody.reuse(_jspx_th_f_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_placeholder_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_1.setPageContext(_jspx_page_context);
    _jspx_th_f_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_1.setDynamicAttribute(null, "type", new String("password"));
    _jspx_th_f_input_1.setPath("password");
    _jspx_th_f_input_1.setDynamicAttribute(null, "placeholder", new String("Password"));
    int[] _jspx_push_body_count_f_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_1 = _jspx_th_f_input_1.doStartTag();
      if (_jspx_th_f_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_1.doFinally();
      _jspx_tagPool_f_input_type_placeholder_path_nobody.reuse(_jspx_th_f_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_placeholder_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_2.setPageContext(_jspx_page_context);
    _jspx_th_f_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_2.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_2.setPath("email");
    _jspx_th_f_input_2.setDynamicAttribute(null, "placeholder", new String("E-mail"));
    int[] _jspx_push_body_count_f_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_2 = _jspx_th_f_input_2.doStartTag();
      if (_jspx_th_f_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_2.doFinally();
      _jspx_tagPool_f_input_type_placeholder_path_nobody.reuse(_jspx_th_f_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_placeholder_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_3.setPageContext(_jspx_page_context);
    _jspx_th_f_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_3.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_3.setPath("phone");
    _jspx_th_f_input_3.setDynamicAttribute(null, "placeholder", new String("Phone Number"));
    int[] _jspx_push_body_count_f_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_3 = _jspx_th_f_input_3.doStartTag();
      if (_jspx_th_f_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_3.doFinally();
      _jspx_tagPool_f_input_type_placeholder_path_nobody.reuse(_jspx_th_f_input_3);
    }
    return false;
  }
}
