package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;
import org.eclipse.jdt.internal.compiler.lookup.InferenceContext18;

/**
 *
 * @author Renaldo
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        String edit = request.getParameter("edit");
        
      
      //if the edit link is not clicked, then display form in view mode
        if(edit == null) {
           
            //create a file object to hold the text file, and a scanner object to read from the file
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            
           
            //read lines from the text file in order
            String title = br.readLine();
            String content = br.readLine();    
            br.close();
            //create a note object, and pass in the variables storing the information from the text file
            Note note = new Note(title, content);
            
            //create an attribute called Note to hold the note object
            request.setAttribute("noteAttribute", note);
            
            //load the viewnote jsp which will display the the attributes held in the note object
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
            //display the form in edit mode
       }else{
             getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
           return;
        }
            
        
        
                
        }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //retrieve and store user input
        String title = request.getParameter("user_title");
        String content = request.getParameter("user_content");
    
        //write user input to file
             // to write to a file
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
            //writing to a file
        pw.println(title);
        pw.println(content);
        pw.close();
        //create and store note object
       // Note note = new Note(title, content);
        
       // request.setAttribute("noteAttribute", note);
        
        //display file back to the view jsp
       // getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }   
}