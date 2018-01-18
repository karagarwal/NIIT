/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIIT;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author Dev
 */
public class GroupButtonUtils {
    String getSelectedButtonText(ButtonGroup buttonGroup){
        for(Enumeration<AbstractButton> buttons = buttonGroup.getElements();buttons.hasMoreElements();){
            AbstractButton button = buttons.nextElement();
            
            if(button.isSelected())
                return button.getText();
        }
        return null;
    }
}
