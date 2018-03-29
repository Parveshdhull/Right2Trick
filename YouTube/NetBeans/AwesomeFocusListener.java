/*
Copyright [2018] [Parvesh Monu]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.plate in the editor.
 */


import com.sun.java.swing.plaf.windows.WindowsBorders;
import java.awt.Color;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author parve
 */
public class AwesomeFocusListener implements java.awt.event.FocusListener {

    int red, green, blue;

    public AwesomeFocusListener(int Red, int Green, int Blue) {

        red = Red;
        green = Green;
        blue = Blue;

    }

    @Override
    public void focusGained(FocusEvent e) {

        Object obj = e.getSource();

        if (obj.getClass().isInstance(new javax.swing.JButton())) {

            Thread colorThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        int opac = 250;
                        while (opac > 0) {
                            opac = opac - 50;
                            ((JButton) e.getSource()).setBorder(new WindowsBorders.DashedBorder(new Color(red, green, blue, opac)));
                            Thread.sleep(150);
                        }
                    } catch (Exception ex) {
                    }
                }
            });
            colorThread.start();

        } else if (obj.getClass().isInstance(new javax.swing.JTextField())) {

            Thread colorThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        int opac = 250;
                        while (opac > 0) {
                            opac = opac - 50;
                            ((JTextField) e.getSource()).setBorder(new WindowsBorders.DashedBorder(new Color(red, green, blue, opac)));
                            Thread.sleep(150);
                        }
                    } catch (Exception ex) {
                    }
                }
            });
            colorThread.start();

        } else if (obj.getClass().isInstance(new javax.swing.JTable())) {

            Thread colorThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        int opac = 250;
                        while (opac > 0) {
                            opac = opac - 50;
                            ((JTable) e.getSource()).setBorder(new WindowsBorders.DashedBorder(new Color(red, green, blue, opac)));
                            Thread.sleep(150);
                        }
                    } catch (Exception ex) {
                    }
                }
            });
            colorThread.start();

        } else if (obj.getClass().isInstance(new javax.swing.JPasswordField())) {

            Thread colorThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        int opac = 250;
                        while (opac > 0) {
                            opac = opac - 50;
                            ((JPasswordField) e.getSource()).setBorder(new WindowsBorders.DashedBorder(new Color(red, green, blue, opac)));
                            Thread.sleep(150);
                        }
                    } catch (Exception ex) {
                    }
                }
            });
            colorThread.start();

        } else if (obj.getClass().isInstance(new javax.swing.JComboBox<>())) {

            Thread colorThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        int opac = 250;
                        while (opac > 0) {
                            opac = opac - 50;
                            ((JComboBox) e.getSource()).setBorder(new WindowsBorders.DashedBorder(new Color(red, green, blue, opac)));
                            Thread.sleep(150);
                        }
                    } catch (Exception ex) {
                    }
                }
            });
            colorThread.start();

        } else if (obj.getClass().isInstance(new javax.swing.JLabel())) {

            Thread colorThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        int opac = 250;
                        while (opac > 0) {
                            opac = opac - 50;
                            ((JLabel) e.getSource()).setBorder(new WindowsBorders.DashedBorder(new Color(red, green, blue, opac)));
                            Thread.sleep(150);
                        }
                    } catch (Exception ex) {
                    }
                }
            });
            colorThread.start();

        } else if (obj.getClass().isInstance(new javax.swing.JTextArea())) {

            Thread colorThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        int opac = 250;
                        while (opac > 0) {
                            opac = opac - 50;
                            ((JTextArea) e.getSource()).setBorder(new WindowsBorders.DashedBorder(new Color(red, green, blue, opac)));
                            Thread.sleep(150);
                        }
                    } catch (Exception ex) {
                    }
                }
            });
            colorThread.start();

        } else if (obj.getClass().isInstance(new javax.swing.JRadioButton())) {

            Thread colorThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        int opac = 250;
                        while (opac > 0) {
                            opac = opac - 50;
                            ((JRadioButton) e.getSource()).setBorder(new WindowsBorders.DashedBorder(new Color(red, green, blue, opac)));
                            Thread.sleep(150);
                        }
                    } catch (Exception ex) {
                    }
                }
            });
            colorThread.start();

        }

    }

    @Override
    public void focusLost(FocusEvent e) {
    }

}
