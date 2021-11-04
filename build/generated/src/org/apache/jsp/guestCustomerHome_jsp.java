package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guestCustomerHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Home page</title>\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"css/style_2.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.min.css\"/>\r\n");
      out.write("        <script src=\"//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("            <section class=\"jumbotron text-center\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h1 class=\"jumbotron-heading\">In a World of Technology, People Make the Difference.</h1>\r\n");
      out.write("                    <p class=\"lead text-muted mb-0\">We’re in IT Business since 1999</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${homeLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Home</a></li>\r\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">Category</a></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-9\">\r\n");
      out.write("                        <div id=\"content\" class=\"row\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"text-align: center;\">\r\n");
      out.write("                        <button onclick=\"loadMore()\" class=\"btn btn-primary\" style=\"margin-bottom: 30px;\">Load more</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("            <script>\r\n");
      out.write("                            function loadMore() {\r\n");
      out.write("                                var amount = document.getElementsByClassName(\"product\").length;\r\n");
      out.write("                                $.ajax({\r\n");
      out.write("                                    url: \"/SWD_TechnologyProduct/MainController?action=load_more\",\r\n");
      out.write("                                    type: \"get\", //send it through get method\r\n");
      out.write("                                    data: {\r\n");
      out.write("                                        exits: amount\r\n");
      out.write("                                    },\r\n");
      out.write("                                    success: function (data) {\r\n");
      out.write("                                        var row = document.getElementById(\"content\");\r\n");
      out.write("                                        row.innerHTML += data;\r\n");
      out.write("                                    },\r\n");
      out.write("                                    error: function (xhr) {\r\n");
      out.write("                                        //Do Something to handle error\r\n");
      out.write("                                    }\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("                            function searchByName(param) {\r\n");
      out.write("                                var txtSearch = param.value;\r\n");
      out.write("                                $.ajax({\r\n");
      out.write("                                    url: \"/SWD_TechnologyProduct/MainController?action=searchAjax\",\r\n");
      out.write("                                    type: \"get\", //send it through get method\r\n");
      out.write("                                    data: {\r\n");
      out.write("                                        txt: txtSearch\r\n");
      out.write("                                    },\r\n");
      out.write("                                    success: function (data) {\r\n");
      out.write("                                        var row = document.getElementById(\"content\");\r\n");
      out.write("                                        row.innerHTML = data;\r\n");
      out.write("                                    },\r\n");
      out.write("                                    error: function (xhr) {\r\n");
      out.write("                                        //Do Something to handle error\r\n");
      out.write("                                    }\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("            </script>  \r\n");
      out.write("        </body>\r\n");
      out.write("    </html>\r\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setVar("homeLink");
    _jspx_th_c_url_0.setValue("MainController");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_0);
    _jspx_th_c_param_0.setName("action");
    _jspx_th_c_param_0.setValue("Search");
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <div class=\"product col-12 col-md-6 col-lg-4\" style=\"padding: 20px;\">\r\n");
          out.write("                                <div class=\"card\" >\r\n");
          out.write("                                    <img class=\"card-img-top\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Card image cap\" style=\"object-fit: cover;width: 200px;\r\n");
          out.write("                                         height: 150px;\">\r\n");
          out.write("                                    <div class=\"card-body\">\r\n");
          out.write("                                        ");
          if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${viewDetail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\r\n");
          out.write("                                        <p class=\"card-text show_txt\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                        <div class=\"row\">\r\n");
          out.write("                                            <div class=\"col\" style=\"text-align: center;\">\r\n");
          out.write("                                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("$</p>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <div class=\"col\">\r\n");
          out.write("                                                <div class=\"center\">\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    <a class=\"btn btn-primary\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${addToCartLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Add to Cart</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        ");
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

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_url_1.setVar("viewDetail");
    _jspx_th_c_url_1.setValue("MainController");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_c_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_url_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_1.setPageContext(_jspx_page_context);
    _jspx_th_c_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_1.setName("action");
    _jspx_th_c_param_1.setValue("ViewProductDetail");
    int _jspx_eval_c_param_1 = _jspx_th_c_param_1.doStartTag();
    if (_jspx_th_c_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
    return false;
  }

  private boolean _jspx_meth_c_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_2 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_2.setPageContext(_jspx_page_context);
    _jspx_th_c_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_2.setName("id");
    _jspx_th_c_param_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_2 = _jspx_th_c_param_2.doStartTag();
    if (_jspx_th_c_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
    return false;
  }

  private boolean _jspx_meth_c_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_url_2.setVar("addToCartLink");
    _jspx_th_c_url_2.setValue("MainController");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_c_url_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_param_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_url_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_3 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_3.setPageContext(_jspx_page_context);
    _jspx_th_c_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_3.setName("action");
    _jspx_th_c_param_3.setValue("AddToCart");
    int _jspx_eval_c_param_3 = _jspx_th_c_param_3.doStartTag();
    if (_jspx_th_c_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
    return false;
  }

  private boolean _jspx_meth_c_param_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_4 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_4.setPageContext(_jspx_page_context);
    _jspx_th_c_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_4.setName("id");
    _jspx_th_c_param_4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_4 = _jspx_th_c_param_4.doStartTag();
    if (_jspx_th_c_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.ADDSUCESS eq 'true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <script>\r\n");
        out.write("        alertify.set('notifier', 'position', 'bottom-right');\r\n");
        out.write("        alertify.success('Add Successfully!');\r\n");
        out.write("    </script>\r\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.SUCCESS eq 'Order Successfully!'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <script>\r\n");
        out.write("        alertify.set('notifier', 'position', 'bottom-right');\r\n");
        out.write("        alertify.success('Order Successfully!');\r\n");
        out.write("    </script>\r\n");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
