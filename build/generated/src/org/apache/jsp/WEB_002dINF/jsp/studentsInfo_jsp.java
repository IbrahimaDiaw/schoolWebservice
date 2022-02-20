package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentsInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsp/taglib_includes.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_spring_url_var_value_nobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            * {box-sizing: border-box;}\n");
      out.write("            ul {list-style-type: none;}\n");
      out.write("            body {font-family: Verdana, sans-serif;}\n");
      out.write("\n");
      out.write("            .month {\n");
      out.write("                padding: 25px 25px;\n");
      out.write("                width: 100%;\n");
      out.write("                background: #1087dd;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .month ul {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .month ul li {\n");
      out.write("                color: white;\n");
      out.write("                font-size: 15px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                letter-spacing: 3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .month .prev {\n");
      out.write("                float: left;\n");
      out.write("                padding-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .month .next {\n");
      out.write("                float: right;\n");
      out.write("                padding-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .weekdays {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 10px 0;\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .weekdays li {\n");
      out.write("                display: inline-block;\n");
      out.write("                width: 13.6%;\n");
      out.write("                color: #666;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .days {\n");
      out.write("                padding: 10px 0;\n");
      out.write("                background: #eee;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .days li {\n");
      out.write("                list-style-type: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                width: 13.6%;\n");
      out.write("                text-align: center;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("                font-size:12px;\n");
      out.write("                color: #777;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .days li .active {\n");
      out.write("                padding: 5px;\n");
      out.write("                background: #1087dd;\n");
      out.write("                color: white !important\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add media queries for smaller screens */\n");
      out.write("            @media screen and (max-width:720px) {\n");
      out.write("                .weekdays li, .days li {width: 13.1%;}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 420px) {\n");
      out.write("                .weekdays li, .days li {width: 12.5%;}\n");
      out.write("                .days li .active {padding: 2px;}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 290px) {\n");
      out.write("                .weekdays li, .days li {width: 12.2%;}\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!--nav bar-->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.htm\">Navbar</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"index.htm\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    ");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <form class=\"form-inline\">\n");
      out.write("                        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                        <button class=\"btn btn-outline-success my-2 mr-sm-2\" type=\"submit\">Search</button>\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url_logout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >Logout</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!--jambutan-->\n");
      out.write("            <div class=\"jumbotron jumbotron-fluid\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1 class=\"display-4\">Teacher Dashboard</h1>\n");
      out.write("                    <p class=\"lead\">This is a modified jumbotron that occupies the entire horizontal space of its parent.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--body-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-2 col-md-2\">\n");
      out.write("\n");
      out.write("                    <div class=\"list-group\">\n");
      out.write("                        <a href=\"teacherHome.htm\" class=\"list-group-item list-group-item-action \">Teacher Home</a>\n");
      out.write("                        <a href=\"noticeBoard.htm\" class=\"list-group-item list-group-item-action \">Notice</a>                                       \n");
      out.write("                        <a href=\"attendance.htm\" class=\"list-group-item list-group-item-action\">Attendance</a>\n");
      out.write("                        <a href=\"result.htm\" class=\"list-group-item list-group-item-action\">Result</a>\n");
      out.write("                        <a href=\"studentsInfo.htm\" class=\"list-group-item list-group-item-action active\">Students Information</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--calender--><br/>\n");
      out.write("                    <div class=\"month\">      \n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"prev\">&#10094;</li>\n");
      out.write("                            <li class=\"next\">&#10095;</li>\n");
      out.write("                            <li>\n");
      out.write("                                August<br>\n");
      out.write("                                <span style=\"font-size:13px\">2018</span>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <ul class=\"weekdays\">\n");
      out.write("                        <li>Mo</li>\n");
      out.write("                        <li>Tu</li>\n");
      out.write("                        <li>We</li>\n");
      out.write("                        <li>Th</li>\n");
      out.write("                        <li>Fr</li>\n");
      out.write("                        <li>Sa</li>\n");
      out.write("                        <li>Su</li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul class=\"days\">  \n");
      out.write("                        <li>1</li>\n");
      out.write("                        <li>2</li>\n");
      out.write("                        <li>3</li>\n");
      out.write("                        <li>4</li>\n");
      out.write("                        <li>5</li>\n");
      out.write("                        <li>6</li>\n");
      out.write("                        <li>7</li>\n");
      out.write("                        <li>8</li>\n");
      out.write("                        <li>9</li>\n");
      out.write("                        <li><span class=\"active\">10</span></li>\n");
      out.write("                        <li>11</li>\n");
      out.write("                        <li>12</li>\n");
      out.write("                        <li>13</li>\n");
      out.write("                        <li>14</li>\n");
      out.write("                        <li>15</li>\n");
      out.write("                        <li>16</li>\n");
      out.write("                        <li>17</li>\n");
      out.write("                        <li>18</li>\n");
      out.write("                        <li>19</li>\n");
      out.write("                        <li>20</li>\n");
      out.write("                        <li>21</li>\n");
      out.write("                        <li>22</li>\n");
      out.write("                        <li>23</li>\n");
      out.write("                        <li>24</li>\n");
      out.write("                        <li>25</li>\n");
      out.write("                        <li>26</li>\n");
      out.write("                        <li>27</li>\n");
      out.write("                        <li>28</li>\n");
      out.write("                        <li>29</li>\n");
      out.write("                        <li>30</li>\n");
      out.write("                        <li>31</li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-8 col-md-8\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <div class=\"card text-center\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    Total Student\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h1 class=\"card-title\">200</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer text-muted\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <div class=\"card text-center\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    Total Teachers\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h1 class=\"card-title\">25</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer text-muted\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("                            <div class=\"card text-center\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    Total Employee\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h1 class=\"card-title\">5</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer text-muted\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br/>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!--<div class=\"col-1\"></div>-->\n");
      out.write("                        <div class=\"col-12\">                          \n");
      out.write("                            <br/>\n");
      out.write("                            <div  class=\"container \">\n");
      out.write("                                <br/>\n");
      out.write("                                <h3>All Students: </h3>\n");
      out.write("                                <table class=\"table table-striped\">\n");
      out.write("                                    <thead class=\"thead-dark\"> \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"col\">Student Name</th>\n");
      out.write("                                            <th scope=\"col\">Gender</th>\n");
      out.write("                                            <th scope=\"col\">DOB</th>\n");
      out.write("                                            <th scope=\"col\">Mobile</th>\n");
      out.write("                                            <th scope=\"col\">Address</th>\n");
      out.write("                                            <th scope=\"col\">Image</th>\n");
      out.write("                                            <th ></th>\n");
      out.write("\n");
      out.write("                                        </tr> \n");
      out.write("                                    </thead>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-2 col-md-2\">\n");
      out.write("                    <!--clock-->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <!--<div class=\"col-2\"></div>-->\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <canvas  id=\"canvas\" width=\"150\" height=\"150\"\n");
      out.write("                                         style=\"background-color:#1087dd;\">\n");
      out.write("                                </canvas>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br/>\n");
      out.write("                    <!--notice board-->\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary btn-lg btn-block\">Notice Board</button>\n");
      out.write("                    <div class=\"list-group\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                        <a class=\"list-group-item list-group-item-action \" href=\"noticeBoard.htm\">\n");
      out.write("                            <div>\n");
      out.write("                                <small style=\"padding-left: 40%\">See More..</small>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var canvas = document.getElementById(\"canvas\");\n");
      out.write("            var ctx = canvas.getContext(\"2d\");\n");
      out.write("            var radius = canvas.height / 2;\n");
      out.write("            ctx.translate(radius, radius);\n");
      out.write("            radius = radius * 0.90\n");
      out.write("            setInterval(drawClock, 1000);\n");
      out.write("\n");
      out.write("            function drawClock() {\n");
      out.write("                drawFace(ctx, radius);\n");
      out.write("                drawNumbers(ctx, radius);\n");
      out.write("                drawTime(ctx, radius);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function drawFace(ctx, radius) {\n");
      out.write("                var grad;\n");
      out.write("                ctx.beginPath();\n");
      out.write("                ctx.arc(0, 0, radius, 0, 2 * Math.PI);\n");
      out.write("                ctx.fillStyle = 'white';\n");
      out.write("                ctx.fill();\n");
      out.write("                grad = ctx.createRadialGradient(0, 0, radius * 0.95, 0, 0, radius * 1.05);\n");
      out.write("                grad.addColorStop(0, '#333');\n");
      out.write("                grad.addColorStop(0.5, 'white');\n");
      out.write("                grad.addColorStop(1, '#333');\n");
      out.write("                ctx.strokeStyle = grad;\n");
      out.write("                ctx.lineWidth = radius * 0.1;\n");
      out.write("                ctx.stroke();\n");
      out.write("                ctx.beginPath();\n");
      out.write("                ctx.arc(0, 0, radius * 0.1, 0, 2 * Math.PI);\n");
      out.write("                ctx.fillStyle = '#333';\n");
      out.write("                ctx.fill();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function drawNumbers(ctx, radius) {\n");
      out.write("                var ang;\n");
      out.write("                var num;\n");
      out.write("                ctx.font = radius * 0.15 + \"px arial\";\n");
      out.write("                ctx.textBaseline = \"middle\";\n");
      out.write("                ctx.textAlign = \"center\";\n");
      out.write("                for (num = 1; num < 13; num++) {\n");
      out.write("                    ang = num * Math.PI / 6;\n");
      out.write("                    ctx.rotate(ang);\n");
      out.write("                    ctx.translate(0, -radius * 0.85);\n");
      out.write("                    ctx.rotate(-ang);\n");
      out.write("                    ctx.fillText(num.toString(), 0, 0);\n");
      out.write("                    ctx.rotate(ang);\n");
      out.write("                    ctx.translate(0, radius * 0.85);\n");
      out.write("                    ctx.rotate(-ang);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function drawTime(ctx, radius) {\n");
      out.write("                var now = new Date();\n");
      out.write("                var hour = now.getHours();\n");
      out.write("                var minute = now.getMinutes();\n");
      out.write("                var second = now.getSeconds();\n");
      out.write("                //hour\n");
      out.write("                hour = hour % 12;\n");
      out.write("                hour = (hour * Math.PI / 6) +\n");
      out.write("                        (minute * Math.PI / (6 * 60)) +\n");
      out.write("                        (second * Math.PI / (360 * 60));\n");
      out.write("                drawHand(ctx, hour, radius * 0.5, radius * 0.07);\n");
      out.write("                //minute\n");
      out.write("                minute = (minute * Math.PI / 30) + (second * Math.PI / (30 * 60));\n");
      out.write("                drawHand(ctx, minute, radius * 0.8, radius * 0.07);\n");
      out.write("                // second\n");
      out.write("                second = (second * Math.PI / 30);\n");
      out.write("                drawHand(ctx, second, radius * 0.9, radius * 0.02);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function drawHand(ctx, pos, length, width) {\n");
      out.write("                ctx.beginPath();\n");
      out.write("                ctx.lineWidth = width;\n");
      out.write("                ctx.lineCap = \"round\";\n");
      out.write("                ctx.moveTo(0, 0);\n");
      out.write("                ctx.rotate(pos);\n");
      out.write("                ctx.lineTo(0, -length);\n");
      out.write("                ctx.stroke();\n");
      out.write("                ctx.rotate(-pos);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("//            $('#sandbox-container input').datepicker1({\n");
      out.write("//                format: \"yyyy/MM/dd\",\n");
      out.write("//                daysOfWeekDisabled: \"0\",\n");
      out.write("//                todayHighlight: true\n");
      out.write("//            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#datepicker\").datepicker();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue("/logout");
    _jspx_th_spring_url_0.setVar("url_logout");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("std");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${students}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \n");
          out.write("                                        <tr>\n");
          out.write("                                            <td scope=\"row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.s_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.mobile_no}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.present_address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>\n");
          out.write("                                                <img style=\"width:80px;height:80px\" class=\"img-thumbnail\" src=\"resource/images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.s_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.roll_no}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" \n");
          out.write("                                                     alt=\"resource/images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.s_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.roll_no}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\"/>                                                \n");
          out.write("                                            </td>\n");
          out.write("                                            <td>\n");
          out.write("                                                <button type=\"button\" class=\"btn\">\n");
          out.write("                                                    <a href=\"/OnlineSchoolManagementSystem/student_detail.htm?s_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${std.s_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> Details </a>\n");
          out.write("                                                </button>\n");
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("notices");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <a class=\"list-group-item list-group-item-action \">\n");
          out.write("                                <div>\n");
          out.write("                                    <h4>&Rrightarrow; ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notices.n_title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                    <small>Publish Date: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notices.publish_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("                                </div>\n");
          out.write("                            </a>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
