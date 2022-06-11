package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Renaldo
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String edit = request.getParameter("edit");
        System.out.println(edit);
        
 
        if(edit == null) {
           
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            
            String content = br.readLine();
            
            String title = br.readLine();
            
        
            Note note = new Note(title, content);
            
            request.setAttribute("note", note);
            
            
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        }
        
                
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
}
} 