/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UG.Proyecto.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
 
@ManagedBean
@SessionScoped
public class beans implements Serializable {
 
private static final long serialVersionUID = 1L;
 
private String name;
 
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
}