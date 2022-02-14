package controller;

import view.FramePrincipal;
import view.Login;

/**
 *
 * @author luis_
 */

public class Executor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FramePrincipal home = new FramePrincipal();
        Login l = new Login();
        
        l.setVisible(true);
        
        
    }
    
}
