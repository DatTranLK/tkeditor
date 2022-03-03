/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dattt.tkeditor;

import java.io.Serializable;

/**
 *
 * @author jike
 */
public class TKEditorDTO implements Serializable{
    private String content;
    private String added_on;

    public TKEditorDTO() {
    }

    public TKEditorDTO(String content, String added_on) {
        this.content = content;
        this.added_on = added_on;
    }
    
    
    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the added_on
     */
    public String getAdded_on() {
        return added_on;
    }

    /**
     * @param added_on the added_on to set
     */
    public void setAdded_on(String added_on) {
        this.added_on = added_on;
    }
    
}
