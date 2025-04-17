package com.cbozan.view.helper;

import com.cbozan.view.component.RecordTextField;
import com.cbozan.view.component.TextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Utility class containing common functions for UI components
 */
public class ComponentHelper {
    
    /**
     * Resets all edit buttons to their default state and makes all text fields non-editable
     * @param panel The JPanel containing the components to reset
     */
    public static void resetEditButtons(JPanel panel) {
        for(int i = 2; i < panel.getComponentCount(); i += 3) {
            if(panel.getComponent(i - 1) instanceof RecordTextField)
                ((RecordTextField)panel.getComponent(i - 1)).setEditable(false);
            else if(panel.getComponent(i - 1) instanceof TextArea)
                ((TextArea)panel.getComponent(i - 1)).setEditable(false);
            
            ((JButton)panel.getComponent(i)).setIcon(new ImageIcon("src\\icon\\text_edit.png"));
        }
    }
}