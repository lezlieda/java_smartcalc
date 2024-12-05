package edu.school21.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JPanel tab_calc;
    private JPanel tab_credit;
    private JPanel panel_buttons;
    private JButton button_plot;
    private JButton button_x;
    private JButton button_backspace;
    private JButton button_erase;
    private JButton button_bracket_right;
    private JButton button_bracket_left;
    private JSpinner zero_spinner;
    private JTextField display_main;
    private JButton button7;
    private JButton button8;
    private JEditorPane display_history;
    private JPanel panel_calc_left;
    private JPanel panel_zeroes;
    private JPanel panel_display;
    private JPanel panel_calc_right;
    private JButton button_div;
    private JButton button_pow;
    private JButton button_sqrt;
    private JButton button_mod;
    private JButton button_pi;
    private JButton button_e;
    private JButton button_sin;
    private JButton button_asin;
    private JButton button_7;
    private JButton button_8;
    private JButton button_9;
    private JButton button_mul;
    private JButton button_sub;
    private JButton button_sum;
    private JButton button_equals;
    private JButton button_dot;
    private JButton button_3;
    private JButton button_6;
    private JButton button_5;
    private JButton button_4;
    private JButton button_1;
    private JButton button_2;
    private JButton button_0;
    private JButton button_E;
    private JButton button_log;
    private JButton button_ln;
    private JButton button_tan;
    private JButton button_atan;
    private JButton button_acos;
    private JButton button_cos;
    private JScrollPane scrollpane_1;
    private JLabel zero_label;
    private JCheckBox zero_checkbox;
    private JScrollPane scrollpane2;

    public MainWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();

        ActionListener typeSymbol = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = ((JButton) e.getSource()).getText();
                display_main.setText(display_main.getText() + input);
                String[] br = {"sin", "cos", "tan", "asin", "acos", "atan", "ln", "log", "√"};
                for (String b : br) {
                    if (input.equals(b)) {
                        display_main.setText(display_main.getText() + "(");
                    }
                }

            }
        };
        button_x.addActionListener(typeSymbol);
        button_E.addActionListener(typeSymbol);
        button_bracket_right.addActionListener(typeSymbol);
        button_bracket_left.addActionListener(typeSymbol);
        button_e.addActionListener(typeSymbol);
        button_pi.addActionListener(typeSymbol);
        button_div.addActionListener(typeSymbol);
        button_pow.addActionListener(typeSymbol);
        button_sqrt.addActionListener(typeSymbol);
        button_mod.addActionListener(typeSymbol);
        button_ln.addActionListener(typeSymbol);
        button_log.addActionListener(typeSymbol);
        button_dot.addActionListener(typeSymbol);
        button_0.addActionListener(typeSymbol);
        button_tan.addActionListener(typeSymbol);
        button_atan.addActionListener(typeSymbol);
        button_sum.addActionListener(typeSymbol);
        button_3.addActionListener(typeSymbol);
        button_2.addActionListener(typeSymbol);
        button_1.addActionListener(typeSymbol);
        button_cos.addActionListener(typeSymbol);
        button_acos.addActionListener(typeSymbol);
        button_sub.addActionListener(typeSymbol);
        button_6.addActionListener(typeSymbol);
        button_5.addActionListener(typeSymbol);
        button_4.addActionListener(typeSymbol);
        button_sin.addActionListener(typeSymbol);
        button_asin.addActionListener(typeSymbol);
        button_mul.addActionListener(typeSymbol);
        button_9.addActionListener(typeSymbol);
        button_8.addActionListener(typeSymbol);
        button_7.addActionListener(typeSymbol);
        button_backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = display_main.getText();
                if (str.length() > 0) {
                    if (str.endsWith("asin(") || str.endsWith("acos(") || str.endsWith("atan(")) {
                        display_main.setText(str.substring(0, str.length() - 5));
                    } else if (str.endsWith("sin(") || str.endsWith("cos(") || str.endsWith("tan(") || str.endsWith("log(")) {
                        display_main.setText(str.substring(0, str.length() - 4));
                    } else if (str.endsWith("ln(") || str.endsWith("Mod")) {
                        display_main.setText(str.substring(0, str.length() - 3));
                    } else if (str.endsWith("√(")) {
                        display_main.setText(str.substring(0, str.length() - 2));
                    } else {
                        display_main.setText(str.substring(0, str.length() - 1));
                    }
                }
            }
        });
        button_erase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display_main.setText("");
            }
        });
        button_equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeBrackets();
            }
        });


    }

    private void closeBrackets() {
        String str = display_main.getText();
        int l = 0, r = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') l++;
            if (str.charAt(i) == ')') r++;
        }
        for (int i = 0; i < l - r; i++) {
            display_main.setText(display_main.getText() + ")");
        }
    }
}
