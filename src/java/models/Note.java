
package models;

import java.io.Serializable;

/**
 *
 * @author Renaldo
 */
public class Note implements Serializable {
    
   private String title;
   private String content;
    
    public Note() {
        setTitle("");
        setContent("");
    }


    public Note(String title, String content) {
        setTitle(title);
        setContent(content);
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
