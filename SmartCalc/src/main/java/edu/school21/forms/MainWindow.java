package edu.school21.forms;

import javax.swing.*;
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
    }
}
