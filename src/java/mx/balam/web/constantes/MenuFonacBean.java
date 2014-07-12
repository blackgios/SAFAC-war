/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.balam.web.constantes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Hector Rodriguez
 */
@ManagedBean
@RequestScoped
public class MenuFonacBean {
    public String menu1 = "Inicio de Ciclos";
    public String menu2 = "Proceso Quincenal";
    public String menu3 = "Escrutinio";
    public String menu4 = "Liquidacion";
    public String menu5 = "Fin de Ciclo";
    public String menu6 = "SALIR";

    /**
     * Creates a new instance of MenuFonacBean
     */
    public MenuFonacBean() {
    }

    public String getMenu1() {
        return menu1;
    }

    public String getMenu2() {
        return menu2;
    }

    public String getMenu3() {
        return menu3;
    }

    public String getMenu4() {
        return menu4;
    }

    public String getMenu5() {
        return menu5;
    }

    public String getMenu6() {
        return menu6;
    }
    
}
