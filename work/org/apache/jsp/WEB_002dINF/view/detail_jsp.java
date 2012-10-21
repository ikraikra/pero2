package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("f:url", org.seasar.struts.taglib.S2Functions.class, "url", new Class[] {java.lang.String.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("f:h", org.seasar.struts.taglib.S2Functions.class, "h", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/view/common/common.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005flink_0026_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ja\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>テンプレート{ページごとにテキストが変わります}</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t<meta name=\"description\" content=\"できるまとめサイトです。\">\r\n");
      out.write("\t<meta name=\"keywords\" content=\"閲覧\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url('/css/peroperoBase.css')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\" charset=\"utf-8\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url('/css/detailStyle.css')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\" charset=\"utf-8\" />\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t<!--[if lte IE 7]>\r\n");
      out.write("\t\t<link href=\"ie.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t");

	/*
	<script type="text/javascript" src="${f:url('/js/jquery.js')}"></script>
	<script type="text/javascript" src="${f:url('/js/toTop.js')}"></script>
	<script type="text/javascript" src="${f:url('/js/linkStyle.js')}"></script>
	<script type="text/javascript" src="${f:url('/js/missing.js')}"></script>
	 */
	 
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<div id=\"inner_header\">\r\n");
      out.write("\t\t\t\t<h1 id =\"tagline\">ヘアスタイルのまとめサイト|{テキストを変更します。}｜{テキストを変更します。}</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<p>ロゴ画像</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t<div id=\"inner_nav\">\r\n");
      out.write("\t\t\t\t<div id=\"naviDiv\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>");
      if (_jspx_meth_s_005flink_005f0(_jspx_page_context))
        return;
      out.write("|</li>\r\n");
      out.write("\t\t\t\t\t\t<li>");
      if (_jspx_meth_s_005flink_005f1(_jspx_page_context))
        return;
      out.write("|</li>\r\n");
      out.write("\t\t\t\t\t\t<li>");
      if (_jspx_meth_s_005flink_005f2(_jspx_page_context))
        return;
      out.write("|</li>\r\n");
      out.write("\t\t\t\t\t\t<li>");
      if (_jspx_meth_s_005flink_005f3(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"searchDiv\">\r\n");
      out.write("\t\t\t\t\t\t<form name=\"\" id=\"searchMovie\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"search_text\"  name=\"searchForm\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"search_btr\" name=\"toSearch\" value=\"検索\">\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<hr />\r\n");
      out.write("\t\t<article>\r\n");
      out.write("\t\t\t<div id=\"inner_content\">\r\n");
      out.write("\t\t\t\t<div id=\"path_list\">\r\n");
      out.write("\t\t\t\t\t<p>");
      if (_jspx_meth_s_005flink_005f4(_jspx_page_context))
        return;
      out.write('>');
      if (_jspx_meth_s_005flink_005f5(_jspx_page_context))
        return;
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:h(movieName)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"detailMain\">\r\n");
      out.write("\t\t\t\t\t<div id=\"detailMainBar\">\r\n");
      out.write("\t\t\t\t\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:h(movieName)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
      out.write("</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"similarStyle\">\r\n");
      out.write("\t\t\t\t\t<h2><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url('/img/similarStyle.png')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\" width=\"958\" height=\"29\" alt=\"似ているヘアスタイルを探す\"></h2>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"similarPhoto\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url('/img/sampleImage.jpg')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\"\" alt=\"ここにヘアスタイル名が入ります。\" width=\"120\" height=\"160\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url('/img/sampleImage2.jpg')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\"\" alt=\"ここにヘアスタイル名が入ります。\" width=\"120\" height=\"160\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url('/img/sampleImage3.jpg')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\"\" alt=\"ここにヘアスタイル名が入ります。\" width=\"120\" height=\"160\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url('/img/sampleImage.jpg')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\"\" alt=\"ここにヘアスタイル名が入ります。\" width=\"120\" height=\"160\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url('/img/sampleImage2.jpg')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\"\" alt=\"ここにヘアスタイル名が入ります。\" width=\"120\" height=\"160\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url('/img/sampleImage3.jpg')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\"\" alt=\"ここにヘアスタイル名が入ります。\" width=\"120\" height=\"160\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url('/img/sampleImage.jpg')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\"\" alt=\"ここにヘアスタイル名が入ります。\" width=\"120\" height=\"160\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<div id=\"inner_footer\">\r\n");
      out.write("\t\t\t\t<div id=\"footerLeftList\">\r\n");
      out.write("\t\t\t\t\t<h3><span class=\"footerDeco\">コンテンツ</span></h3>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f6(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f7(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f8(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"footerList\">\r\n");
      out.write("\t\t\t\t\t<h3><span class=\"footerDeco\">○○について</span></h3>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f9(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f10(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f11(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f12(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"footerList\">\r\n");
      out.write("\t\t\t\t\t<h3><span class=\"footerDeco\">おススメサイト</span></h3>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f13(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f14(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f15(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t<li>・");
      if (_jspx_meth_s_005flink_005f16(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"bottom\">\r\n");
      out.write("\t\t\t\t\t<p>このサイトはヘアスタルのカタログまとめサイトです。</p>\r\n");
      out.write("\t\t\t\t\t<address> Copyright(C)2012 ******  All Rights Reserved</address>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005flink_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f0 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f0.setParent(null);
    // /WEB-INF/view/detail.jsp(41,10) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f0.setHref("index");
    int _jspx_eval_s_005flink_005f0 = _jspx_th_s_005flink_005f0.doStartTag();
    if (_jspx_eval_s_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f0.doInitBody();
      }
      do {
        out.write("トップページ");
        int evalDoAfterBody = _jspx_th_s_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f1 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f1.setParent(null);
    // /WEB-INF/view/detail.jsp(42,10) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f1.setHref("./");
    int _jspx_eval_s_005flink_005f1 = _jspx_th_s_005flink_005f1.doStartTag();
    if (_jspx_eval_s_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f1.doInitBody();
      }
      do {
        out.write("このサイトについて");
        int evalDoAfterBody = _jspx_th_s_005flink_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f2 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f2.setParent(null);
    // /WEB-INF/view/detail.jsp(43,10) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f2.setHref("./");
    int _jspx_eval_s_005flink_005f2 = _jspx_th_s_005flink_005f2.doStartTag();
    if (_jspx_eval_s_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f2.doInitBody();
      }
      do {
        out.write('リ');
        out.write('ン');
        out.write('ク');
        int evalDoAfterBody = _jspx_th_s_005flink_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f3 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f3.setParent(null);
    // /WEB-INF/view/detail.jsp(44,10) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f3.setHref("./");
    int _jspx_eval_s_005flink_005f3 = _jspx_th_s_005flink_005f3.doStartTag();
    if (_jspx_eval_s_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f3.doInitBody();
      }
      do {
        out.write("サイトリンク");
        int evalDoAfterBody = _jspx_th_s_005flink_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f4 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f4.setParent(null);
    // /WEB-INF/view/detail.jsp(61,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f4.setHref("");
    int _jspx_eval_s_005flink_005f4 = _jspx_th_s_005flink_005f4.doStartTag();
    if (_jspx_eval_s_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f4.doInitBody();
      }
      do {
        out.write("トップページ");
        int evalDoAfterBody = _jspx_th_s_005flink_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f5 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f5.setParent(null);
    // /WEB-INF/view/detail.jsp(61,40) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f5.setHref("");
    int _jspx_eval_s_005flink_005f5 = _jspx_th_s_005flink_005f5.doStartTag();
    if (_jspx_eval_s_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f5.doInitBody();
      }
      do {
        out.write("お気に入り");
        int evalDoAfterBody = _jspx_th_s_005flink_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/view/detail.jsp(68,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("m");
    // /WEB-INF/view/detail.jsp(68,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movieSeriesList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/view/detail.jsp(68,5) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("mStatus");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"detailmovieContents\">\r\n");
          out.write("\t\t\t\t\t\t<iframe src=\"http://flashservice.xvideos.com/embedframe/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:h(m.mid)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
          out.write("\" frameborder=0 width=\"960\" height=\"640\" scrolling=no></iframe>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f6 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f6.setParent(null);
    // /WEB-INF/view/detail.jsp(100,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f6.setHref("./");
    int _jspx_eval_s_005flink_005f6 = _jspx_th_s_005flink_005f6.doStartTag();
    if (_jspx_eval_s_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f6.doInitBody();
      }
      do {
        out.write("サイトトップに戻る");
        int evalDoAfterBody = _jspx_th_s_005flink_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f7 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f7.setParent(null);
    // /WEB-INF/view/detail.jsp(101,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f7.setHref("./");
    int _jspx_eval_s_005flink_005f7 = _jspx_th_s_005flink_005f7.doStartTag();
    if (_jspx_eval_s_005flink_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f7.doInitBody();
      }
      do {
        out.write("お気に入りを見る");
        int evalDoAfterBody = _jspx_th_s_005flink_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f8 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f8.setParent(null);
    // /WEB-INF/view/detail.jsp(102,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f8.setHref("./");
    int _jspx_eval_s_005flink_005f8 = _jspx_th_s_005flink_005f8.doStartTag();
    if (_jspx_eval_s_005flink_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f8.doInitBody();
      }
      do {
        out.write("人気ランキング");
        int evalDoAfterBody = _jspx_th_s_005flink_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f9 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f9.setParent(null);
    // /WEB-INF/view/detail.jsp(110,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f9.setHref("./");
    int _jspx_eval_s_005flink_005f9 = _jspx_th_s_005flink_005f9.doStartTag();
    if (_jspx_eval_s_005flink_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f9.doInitBody();
      }
      do {
        out.write("本サイトについて");
        int evalDoAfterBody = _jspx_th_s_005flink_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f10 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f10.setParent(null);
    // /WEB-INF/view/detail.jsp(111,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f10.setHref("./");
    int _jspx_eval_s_005flink_005f10 = _jspx_th_s_005flink_005f10.doStartTag();
    if (_jspx_eval_s_005flink_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f10.doInitBody();
      }
      do {
        out.write("サイトポリシー");
        int evalDoAfterBody = _jspx_th_s_005flink_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f11 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f11.setParent(null);
    // /WEB-INF/view/detail.jsp(112,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f11.setHref("./");
    int _jspx_eval_s_005flink_005f11 = _jspx_th_s_005flink_005f11.doStartTag();
    if (_jspx_eval_s_005flink_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f11.doInitBody();
      }
      do {
        out.write("お問い合わせ");
        int evalDoAfterBody = _jspx_th_s_005flink_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f12 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f12.setParent(null);
    // /WEB-INF/view/detail.jsp(113,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f12.setHref("./");
    int _jspx_eval_s_005flink_005f12 = _jspx_th_s_005flink_005f12.doStartTag();
    if (_jspx_eval_s_005flink_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f12.doInitBody();
      }
      do {
        out.write("広告掲載について");
        int evalDoAfterBody = _jspx_th_s_005flink_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f13 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f13.setParent(null);
    // /WEB-INF/view/detail.jsp(121,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f13.setHref("./");
    int _jspx_eval_s_005flink_005f13 = _jspx_th_s_005flink_005f13.doStartTag();
    if (_jspx_eval_s_005flink_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f13.doInitBody();
      }
      do {
        out.write("相互サイトリンク");
        int evalDoAfterBody = _jspx_th_s_005flink_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f14 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f14.setParent(null);
    // /WEB-INF/view/detail.jsp(122,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f14.setHref("./");
    int _jspx_eval_s_005flink_005f14 = _jspx_th_s_005flink_005f14.doStartTag();
    if (_jspx_eval_s_005flink_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f14.doInitBody();
      }
      do {
        out.write("アクセスランキング");
        int evalDoAfterBody = _jspx_th_s_005flink_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f15 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f15.setParent(null);
    // /WEB-INF/view/detail.jsp(123,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f15.setHref("./");
    int _jspx_eval_s_005flink_005f15 = _jspx_th_s_005flink_005f15.doStartTag();
    if (_jspx_eval_s_005flink_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f15.doInitBody();
      }
      do {
        out.write("広告へのリンク１");
        int evalDoAfterBody = _jspx_th_s_005flink_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005flink_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    org.seasar.struts.taglib.S2LinkTag _jspx_th_s_005flink_005f16 = (org.seasar.struts.taglib.S2LinkTag) _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.get(org.seasar.struts.taglib.S2LinkTag.class);
    _jspx_th_s_005flink_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005flink_005f16.setParent(null);
    // /WEB-INF/view/detail.jsp(124,11) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flink_005f16.setHref("./");
    int _jspx_eval_s_005flink_005f16 = _jspx_th_s_005flink_005f16.doStartTag();
    if (_jspx_eval_s_005flink_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005flink_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005flink_005f16.doInitBody();
      }
      do {
        out.write("広告へのリンク２");
        int evalDoAfterBody = _jspx_th_s_005flink_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005flink_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flink_0026_005fhref.reuse(_jspx_th_s_005flink_005f16);
    return false;
  }
}
