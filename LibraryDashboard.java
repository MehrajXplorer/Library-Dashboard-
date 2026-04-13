// Simple example (Servlet)
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LibraryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Library Backend Connected</h2>");
    }
}
