package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alignment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Alignment</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:lightblue\" >\n");
      out.write("        <font face=\"Courier New\" size=\"5\">\n");
      out.write("        <div>\n");
      out.write("            <form name=\"DNA\" action=\"DNAdna\" method=\"POST\">\n");
      out.write("                \n");
      out.write("                  <table border=\"0\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th></th>\n");
      out.write("                            <th></th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>First Sequence</td>\n");
      out.write("                            <td>Second Sequence</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><textarea name=\"myDNAinput\" rows=\"10\" cols=\"40\" \n");
      out.write("                             font=\"Courier New\" spellcheck=\"false\" size=\"3\" ></textarea>\n");
      out.write("                 </td>\n");
      out.write("                            <td><textarea name=\"myDNAinput1\" rows=\"10\" cols=\"40\"\n");
      out.write("                              font=\"Courier New\" spellcheck=\"false\"size=\"3\" ></textarea>                             \n");
      out.write("                </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("              <!--  Minimum Match Expected:  <input type=\"text\" name=\"MinMatch\" value=\"0\" size=\"10\" /> -->\n");
      out.write("                           \n");
      out.write("             \n");
      out.write("              <input  type=\"submit\" value=\"calculate\" size=\"20*50\" font=\"Courier New\" size=\"5\"/>\n");
      out.write("                </font>\n");
      out.write("            </form></div>\n");
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
}
