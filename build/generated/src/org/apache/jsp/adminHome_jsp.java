package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/error.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_var_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_var_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_if_var_test.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_if_11(_jspx_page_context))
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER!=null&& sessionScope.USER.role eq 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_0.setVar("testRole");
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <html>\r\n");
        out.write("        <head>\r\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("            <title>Admin Hompage</title>\r\n");
        out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\"/>\r\n");
        out.write("            <link href=\"css/style_1.css\" rel=\"stylesheet\"/>\r\n");
        out.write("        </head>\r\n");
        out.write("        <body>\r\n");
        out.write("\r\n");
        out.write("            <div class=\"header_bottom\" style=\"background-color: #F0EEEE;\">\r\n");
        out.write("                <div class=\"container\">\r\n");
        out.write("                    <div class=\"row\" >\r\n");
        out.write("                        <div class=\"col-lg-3 col-md-12 col-sm-12 col-xs-12\">\r\n");
        out.write("                            <!-- logo start -->\r\n");
        out.write("                            <div class=\"logo\"> <a href=\"MainController\"><img src=\"img/logo.png\" alt=\"logo\" /></a> </div>\r\n");
        out.write("                            <!-- logo end -->\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div class=\"col-lg-9 col-md-12 col-sm-12 col-xs-12\">\r\n");
        out.write("                            <!-- menu start -->\r\n");
        out.write("                            <div class=\"menu_side\">\r\n");
        out.write("                                <div id=\"navbar_menu\">\r\n");
        out.write("                                    <ul class=\"first-ul\">\r\n");
        out.write("                                        <li> <a class=\"active\" href=\"MainController\">Home</a>\r\n");
        out.write("                                        </li>\r\n");
        out.write("                                        <li><a href=\"createForm.jsp\">Create new Product</a></li>\r\n");
        out.write("                                        <li><a href=\"createForm.jsp\">Customer Order</a></li>\r\n");
        out.write("                                        <li><a href=\"createForm.jsp\">Profile</a></li>\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logoutLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Logout</a></li>\r\n");
        out.write("                                </div>\r\n");
        out.write("                                <!-- menu end -->\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div class=\"center\"><font color=\"red\"><font color=\"red\">Welcome admin, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</font></font></div>\r\n");
        out.write("\r\n");
        out.write("            <div class=\"container\" style=\"padding-top: 50px;\">\r\n");
        out.write("                <div class=\"center\">\r\n");
        out.write("                    <form action=\"MainController\" method=\"POST\">\r\n");
        out.write("                        Search: <input name=\"txtSearch\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("                        Range of Money: <input name=\"txtFrom\" type=\"number\" step=\"any\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFrom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"width:60px;\"/>-<input name=\"txtTo\" type=\"number\" step=\"any\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtTo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"width:60px;\"/>\r\n");
        out.write("                        <select name=\"cboCategory\">\r\n");
        out.write("                            <option value=\"\">-Category-</option>\r\n");
        out.write("                            ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        </select>\r\n");
        out.write("                        <input type=\"submit\" value=\"Search\" name=\"action\" class=\"btn btn-primary\"/>\r\n");
        out.write("                    </form>\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div class=\"container\" style=\"margin-top: 50px;\">\r\n");
        out.write("                ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            </div>\r\n");
        out.write("        </body>\r\n");
        out.write("    </html>\r\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_url_0.setVar("logoutLink");
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
        out.write("                                                ");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
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
    _jspx_th_c_param_0.setValue("Logout");
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applicationScope.listCategories!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applicationScope.listCategories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("category");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cboCategory eq category.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"true\"");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listProduct!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.listProduct}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_4.setVar("testEmpty");
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <div class=\"center\">\r\n");
        out.write("                            <form action=\"MainController\" method=\"POST\">\r\n");
        out.write("                                <table border=\"1\" class=\"table table-bordered\" style=\"width: 1000px; margin-right: 50px; height: 400px;\">\r\n");
        out.write("                                    <thead>\r\n");
        out.write("                                        <tr>\r\n");
        out.write("                                            <th scope=\"col\">Name</th>\r\n");
        out.write("                                            <th scope=\"col\">Image</th>\r\n");
        out.write("                                            <th scope=\"col\">Price</th>\r\n");
        out.write("                                            <th scope=\"col\">Quantity</th>\r\n");
        out.write("                                            <th scope=\"col\"></th>\r\n");
        out.write("                                            <th scope=\"col\"></th>\r\n");
        out.write("                                        </tr>\r\n");
        out.write("                                    </thead>\r\n");
        out.write("                                    <tbody>\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        <tr>\r\n");
        out.write("                                            <td></td>\r\n");
        out.write("                                            <td></td>\r\n");
        out.write("                                            <td>\r\n");
        out.write("                                            </td>\r\n");
        out.write("                                            <td></td>\r\n");
        out.write("                                            <td>\r\n");
        out.write("                                                <div class=\"center\">\r\n");
        out.write("                                                    <input type=\"submit\" value=\"Delete\" name=\"action\" class=\"btn btn-large btn-primary\" onclick=\"return confirm('Are you sure to delete all selected items?')\"/>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                <input type=\"hidden\" name=\"page\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.page}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("                                                <input type=\"hidden\" name=\"txtSearch\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("                                                <input type=\"hidden\" name=\"txtFrom\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFrom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("                                                <input type=\"hidden\" name=\"txtTo\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtTo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("                                                <input type=\"hidden\" name=\"cboCategory\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cboCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("                                            </td>\r\n");
        out.write("                                            <td></td>\r\n");
        out.write("                                        </tr>\r\n");
        out.write("                                    </tbody>\r\n");
        out.write("                                </table>\r\n");
        out.write("                            </form>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        ");
        if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("product");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                            <tr>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>\r\n");
          out.write("                                                    <img alt=\"Food Image\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"100px\" height=\"100px\"/>\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                                <td>\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("$\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                                <td>\r\n");
          out.write("                                                    <div class=\"center\">\r\n");
          out.write("                                                        ");
          if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                        <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn\" style=\"background-color: #000\">Edit</a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                            </tr>\r\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.status eq 'Active'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <input type=\"checkbox\" id=\"chkDelete\" name=\"chkCheckDelete\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.status eq 'Inactive'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <font color=\"red\">\r\n");
        out.write("                                                            Disabled\r\n");
        out.write("                                                        </font>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_url_1.setVar("editLink");
    _jspx_th_c_url_1.setValue("MainController");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_c_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_param_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_url_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_1.setPageContext(_jspx_page_context);
    _jspx_th_c_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_1.setName("action");
    _jspx_th_c_param_1.setValue("Edit");
    int _jspx_eval_c_param_1 = _jspx_th_c_param_1.doStartTag();
    if (_jspx_th_c_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
    return false;
  }

  private boolean _jspx_meth_c_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_2 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_2.setPageContext(_jspx_page_context);
    _jspx_th_c_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_2.setName("id");
    _jspx_th_c_param_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_2 = _jspx_th_c_param_2.doStartTag();
    if (_jspx_th_c_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
    return false;
  }

  private boolean _jspx_meth_c_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_3 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_3.setPageContext(_jspx_page_context);
    _jspx_th_c_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_3.setName("page");
    _jspx_th_c_param_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.currentPage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_3 = _jspx_th_c_param_3.doStartTag();
    if (_jspx_th_c_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
    return false;
  }

  private boolean _jspx_meth_c_param_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_4 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_4.setPageContext(_jspx_page_context);
    _jspx_th_c_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_4.setName("txtSearch");
    _jspx_th_c_param_4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_4 = _jspx_th_c_param_4.doStartTag();
    if (_jspx_th_c_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_4);
    return false;
  }

  private boolean _jspx_meth_c_param_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_5 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_5.setPageContext(_jspx_page_context);
    _jspx_th_c_param_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_5.setName("txtFrom");
    _jspx_th_c_param_5.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFrom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_5 = _jspx_th_c_param_5.doStartTag();
    if (_jspx_th_c_param_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_5);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_5);
    return false;
  }

  private boolean _jspx_meth_c_param_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_6 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_6.setPageContext(_jspx_page_context);
    _jspx_th_c_param_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_6.setName("txtTo");
    _jspx_th_c_param_6.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtTo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_6 = _jspx_th_c_param_6.doStartTag();
    if (_jspx_th_c_param_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_6);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_6);
    return false;
  }

  private boolean _jspx_meth_c_param_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_7 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_7.setPageContext(_jspx_page_context);
    _jspx_th_c_param_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_7.setName("cboCategory");
    _jspx_th_c_param_7.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cboCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_7 = _jspx_th_c_param_7.doStartTag();
    if (_jspx_th_c_param_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_7);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_7);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.noOfPages>1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <div class=\"center\">\r\n");
        out.write("                                ");
        if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.currentPage>1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prevLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn btn-primary\" style=\"min-width: 50px\">Previous</a>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_url_2.setVar("prevLink");
    _jspx_th_c_url_2.setValue("MainController");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_url_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_param_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_8 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_8.setPageContext(_jspx_page_context);
    _jspx_th_c_param_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_8.setName("action");
    _jspx_th_c_param_8.setValue("Search");
    int _jspx_eval_c_param_8 = _jspx_th_c_param_8.doStartTag();
    if (_jspx_th_c_param_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_8);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_8);
    return false;
  }

  private boolean _jspx_meth_c_param_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_9 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_9.setPageContext(_jspx_page_context);
    _jspx_th_c_param_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_9.setName("page");
    _jspx_th_c_param_9.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.currentPage-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_9 = _jspx_th_c_param_9.doStartTag();
    if (_jspx_th_c_param_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_9);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_9);
    return false;
  }

  private boolean _jspx_meth_c_param_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_10 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_10.setPageContext(_jspx_page_context);
    _jspx_th_c_param_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_10.setName("txtSearch");
    _jspx_th_c_param_10.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_10 = _jspx_th_c_param_10.doStartTag();
    if (_jspx_th_c_param_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_10);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_10);
    return false;
  }

  private boolean _jspx_meth_c_param_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_11 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_11.setPageContext(_jspx_page_context);
    _jspx_th_c_param_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_11.setName("txtFrom");
    _jspx_th_c_param_11.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFrom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_11 = _jspx_th_c_param_11.doStartTag();
    if (_jspx_th_c_param_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_11);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_11);
    return false;
  }

  private boolean _jspx_meth_c_param_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_12 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_12.setPageContext(_jspx_page_context);
    _jspx_th_c_param_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_12.setName("txtTo");
    _jspx_th_c_param_12.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtTo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_12 = _jspx_th_c_param_12.doStartTag();
    if (_jspx_th_c_param_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_12);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_12);
    return false;
  }

  private boolean _jspx_meth_c_param_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_13 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_13.setPageContext(_jspx_page_context);
    _jspx_th_c_param_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_2);
    _jspx_th_c_param_13.setName("cboCategory");
    _jspx_th_c_param_13.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cboCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_13 = _jspx_th_c_param_13.doStartTag();
    if (_jspx_th_c_param_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_13);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_13);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_forEach_2.setBegin(1);
    _jspx_th_c_forEach_2.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.noOfPages}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    ");
          if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.currentPage eq i}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <a class=\"btn btn-primary\" style=\"background-color: #707070; min-width: 50px;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_url_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                            <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn btn-primary\" style=\"min-width: 50px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_url_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_url_3.setVar("pageLink");
    _jspx_th_c_url_3.setValue("MainController");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_2[0]++;
        _jspx_th_c_url_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_param_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_3, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_param_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_3, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_param_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_3, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_param_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_3, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_param_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_3, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_param_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_3, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_url_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_2[0]--;
    }
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_param_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_14 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_14.setPageContext(_jspx_page_context);
    _jspx_th_c_param_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
    _jspx_th_c_param_14.setName("action");
    _jspx_th_c_param_14.setValue("Search");
    int _jspx_eval_c_param_14 = _jspx_th_c_param_14.doStartTag();
    if (_jspx_th_c_param_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_14);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_14);
    return false;
  }

  private boolean _jspx_meth_c_param_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_15 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_15.setPageContext(_jspx_page_context);
    _jspx_th_c_param_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
    _jspx_th_c_param_15.setName("page");
    _jspx_th_c_param_15.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_15 = _jspx_th_c_param_15.doStartTag();
    if (_jspx_th_c_param_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_15);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_15);
    return false;
  }

  private boolean _jspx_meth_c_param_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_16 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_16.setPageContext(_jspx_page_context);
    _jspx_th_c_param_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
    _jspx_th_c_param_16.setName("txtSearch");
    _jspx_th_c_param_16.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_16 = _jspx_th_c_param_16.doStartTag();
    if (_jspx_th_c_param_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_16);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_16);
    return false;
  }

  private boolean _jspx_meth_c_param_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_17 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_17.setPageContext(_jspx_page_context);
    _jspx_th_c_param_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
    _jspx_th_c_param_17.setName("txtFrom");
    _jspx_th_c_param_17.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFrom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_17 = _jspx_th_c_param_17.doStartTag();
    if (_jspx_th_c_param_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_17);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_17);
    return false;
  }

  private boolean _jspx_meth_c_param_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_18 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_18.setPageContext(_jspx_page_context);
    _jspx_th_c_param_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
    _jspx_th_c_param_18.setName("txtTo");
    _jspx_th_c_param_18.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtTo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_18 = _jspx_th_c_param_18.doStartTag();
    if (_jspx_th_c_param_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_18);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_18);
    return false;
  }

  private boolean _jspx_meth_c_param_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_19 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_19.setPageContext(_jspx_page_context);
    _jspx_th_c_param_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_3);
    _jspx_th_c_param_19.setName("cboCategory");
    _jspx_th_c_param_19.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cboCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_19 = _jspx_th_c_param_19.doStartTag();
    if (_jspx_th_c_param_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_19);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_19);
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.currentPage<requestScope.noOfPages}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_url_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nextLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn btn-primary\" style=\"min-width: 50px\">Next</a>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_url_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_url_4.setVar("nextLink");
    _jspx_th_c_url_4.setValue("MainController");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_url_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_param_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_url_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_param_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_20 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_20.setPageContext(_jspx_page_context);
    _jspx_th_c_param_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_20.setName("action");
    _jspx_th_c_param_20.setValue("Search");
    int _jspx_eval_c_param_20 = _jspx_th_c_param_20.doStartTag();
    if (_jspx_th_c_param_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_20);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_20);
    return false;
  }

  private boolean _jspx_meth_c_param_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_21 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_21.setPageContext(_jspx_page_context);
    _jspx_th_c_param_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_21.setName("page");
    _jspx_th_c_param_21.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.currentPage+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_21 = _jspx_th_c_param_21.doStartTag();
    if (_jspx_th_c_param_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_21);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_21);
    return false;
  }

  private boolean _jspx_meth_c_param_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_22 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_22.setPageContext(_jspx_page_context);
    _jspx_th_c_param_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_22.setName("txtSearch");
    _jspx_th_c_param_22.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_22 = _jspx_th_c_param_22.doStartTag();
    if (_jspx_th_c_param_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_22);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_22);
    return false;
  }

  private boolean _jspx_meth_c_param_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_23 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_23.setPageContext(_jspx_page_context);
    _jspx_th_c_param_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_23.setName("txtFrom");
    _jspx_th_c_param_23.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFrom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_23 = _jspx_th_c_param_23.doStartTag();
    if (_jspx_th_c_param_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_23);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_23);
    return false;
  }

  private boolean _jspx_meth_c_param_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_24 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_24.setPageContext(_jspx_page_context);
    _jspx_th_c_param_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_24.setName("txtTo");
    _jspx_th_c_param_24.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtTo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_24 = _jspx_th_c_param_24.doStartTag();
    if (_jspx_th_c_param_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_24);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_24);
    return false;
  }

  private boolean _jspx_meth_c_param_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_25 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_25.setPageContext(_jspx_page_context);
    _jspx_th_c_param_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_4);
    _jspx_th_c_param_25.setName("cboCategory");
    _jspx_th_c_param_25.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cboCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_25 = _jspx_th_c_param_25.doStartTag();
    if (_jspx_th_c_param_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_25);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_25);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!testEmpty}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <h2>Not found any food!!!</h2>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent(null);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!testRole}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("        <title>JSP Page</title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <h1>Hello World!</h1>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_c_set_0.setVar("ERROR");
    _jspx_th_c_set_0.setValue(new String("You do not have permission to access this"));
    _jspx_th_c_set_0.setScope("request");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
