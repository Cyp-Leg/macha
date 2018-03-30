/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.util.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import userinterface.*;

/**
 *
 * @author maximesoustelle
 */
public class Partner {
    private String name;
    private String info;
    
    private StringProperty nameProperty;
    private StringProperty infoProperty;
    
    public Partner(String name){
        this.name = name;
    }

    public Partner(String partnerName, String info) {
      this.nameProperty = new SimpleStringProperty(partnerName);
      this.infoProperty = new SimpleStringProperty(info);
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.nameProperty.get();
    }

    /**
     * @return the info
     */
    public String getInfo() {
         return this.infoProperty.get();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.nameProperty.set(name);
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
         this.infoProperty.set(info);
    }
    
   
    
    
    
}
