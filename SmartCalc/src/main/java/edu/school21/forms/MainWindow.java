package edu.school21.forms;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

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

        ActionListener typeSymbol = e -> {
            String input = ((JButton) e.getSource()).getText();
            display_main.setText(display_main.getText() + input);
            String[] br = {"sin", "cos", "tan", "asin", "acos", "atan", "ln", "log", "√"};
            for (String b : br) {
                if (input.equals(b)) {
                    display_main.setText(display_main.getText() + "(");
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
        button_backspace.addActionListener(e -> {
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
        });
        button_erase.addActionListener(e -> display_main.setText(""));
        button_equals.addActionListener(e -> closeBrackets());


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

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setMaximumSize(new Dimension(640, 325));
        panel1.setMinimumSize(new Dimension(640, 325));
        panel1.setOpaque(true);
        panel1.setPreferredSize(new Dimension(640, 325));
        tabbedPane1 = new JTabbedPane();
        panel1.add(tabbedPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        tab_calc = new JPanel();
        tab_calc.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        tab_calc.setMaximumSize(new Dimension(-1, -1));
        tab_calc.setMinimumSize(new Dimension(-1, -1));
        tab_calc.setPreferredSize(new Dimension(-1, -1));
        tabbedPane1.addTab("Calculator", tab_calc);
        panel_calc_left = new JPanel();
        panel_calc_left.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        tab_calc.add(panel_calc_left, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel_buttons = new JPanel();
        panel_buttons.setLayout(new GridLayoutManager(6, 6, new Insets(0, 0, 0, 0), -1, -1));
        panel_calc_left.add(panel_buttons, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button_plot = new JButton();
        button_plot.setAlignmentY(0.0f);
        Font button_plotFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_plot.getFont());
        if (button_plotFont != null) button_plot.setFont(button_plotFont);
        button_plot.setMargin(new Insets(0, 0, 0, 0));
        button_plot.setText("PLOT");
        panel_buttons.add(button_plot, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_x = new JButton();
        button_x.setAlignmentY(0.0f);
        Font button_xFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_x.getFont());
        if (button_xFont != null) button_x.setFont(button_xFont);
        button_x.setText("x");
        panel_buttons.add(button_x, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_backspace = new JButton();
        button_backspace.setAlignmentY(0.0f);
        Font button_backspaceFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_backspace.getFont());
        if (button_backspaceFont != null) button_backspace.setFont(button_backspaceFont);
        button_backspace.setText("<--");
        panel_buttons.add(button_backspace, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_erase = new JButton();
        button_erase.setAlignmentY(0.0f);
        Font button_eraseFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_erase.getFont());
        if (button_eraseFont != null) button_erase.setFont(button_eraseFont);
        button_erase.setText("C");
        panel_buttons.add(button_erase, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_bracket_right = new JButton();
        button_bracket_right.setAlignmentY(0.0f);
        Font button_bracket_rightFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_bracket_right.getFont());
        if (button_bracket_rightFont != null) button_bracket_right.setFont(button_bracket_rightFont);
        button_bracket_right.setText(")");
        panel_buttons.add(button_bracket_right, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_bracket_left = new JButton();
        button_bracket_left.setAlignmentY(0.0f);
        Font button_bracket_leftFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_bracket_left.getFont());
        if (button_bracket_leftFont != null) button_bracket_left.setFont(button_bracket_leftFont);
        button_bracket_left.setText("(");
        panel_buttons.add(button_bracket_left, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_e = new JButton();
        button_e.setAlignmentY(0.0f);
        Font button_eFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_e.getFont());
        if (button_eFont != null) button_e.setFont(button_eFont);
        button_e.setText("e");
        panel_buttons.add(button_e, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_pi = new JButton();
        button_pi.setAlignmentY(0.0f);
        Font button_piFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_pi.getFont());
        if (button_piFont != null) button_pi.setFont(button_piFont);
        button_pi.setText("π");
        panel_buttons.add(button_pi, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_div = new JButton();
        button_div.setAlignmentY(0.0f);
        Font button_divFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_div.getFont());
        if (button_divFont != null) button_div.setFont(button_divFont);
        button_div.setText("÷");
        panel_buttons.add(button_div, new GridConstraints(1, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_pow = new JButton();
        button_pow.setAlignmentY(0.0f);
        Font button_powFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_pow.getFont());
        if (button_powFont != null) button_pow.setFont(button_powFont);
        button_pow.setText("^");
        panel_buttons.add(button_pow, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_sqrt = new JButton();
        button_sqrt.setAlignmentY(0.0f);
        Font button_sqrtFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_sqrt.getFont());
        if (button_sqrtFont != null) button_sqrt.setFont(button_sqrtFont);
        button_sqrt.setText("√");
        panel_buttons.add(button_sqrt, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_mod = new JButton();
        button_mod.setAlignmentY(0.0f);
        Font button_modFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_mod.getFont());
        if (button_modFont != null) button_mod.setFont(button_modFont);
        button_mod.setText("Mod");
        panel_buttons.add(button_mod, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_ln = new JButton();
        button_ln.setAlignmentY(0.0f);
        Font button_lnFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_ln.getFont());
        if (button_lnFont != null) button_ln.setFont(button_lnFont);
        button_ln.setText("ln");
        panel_buttons.add(button_ln, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_log = new JButton();
        button_log.setAlignmentY(0.0f);
        Font button_logFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_log.getFont());
        if (button_logFont != null) button_log.setFont(button_logFont);
        button_log.setText("log");
        panel_buttons.add(button_log, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_equals = new JButton();
        button_equals.setAlignmentY(0.0f);
        Font button_equalsFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_equals.getFont());
        if (button_equalsFont != null) button_equals.setFont(button_equalsFont);
        button_equals.setText("=");
        panel_buttons.add(button_equals, new GridConstraints(5, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_dot = new JButton();
        button_dot.setAlignmentY(0.0f);
        Font button_dotFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_dot.getFont());
        if (button_dotFont != null) button_dot.setFont(button_dotFont);
        button_dot.setText(".");
        panel_buttons.add(button_dot, new GridConstraints(5, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_0 = new JButton();
        button_0.setAlignmentY(0.0f);
        Font button_0Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_0.getFont());
        if (button_0Font != null) button_0.setFont(button_0Font);
        button_0.setText("0");
        panel_buttons.add(button_0, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_E = new JButton();
        button_E.setAlignmentY(0.0f);
        Font button_EFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_E.getFont());
        if (button_EFont != null) button_E.setFont(button_EFont);
        button_E.setText("E");
        panel_buttons.add(button_E, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_tan = new JButton();
        button_tan.setAlignmentY(0.0f);
        Font button_tanFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_tan.getFont());
        if (button_tanFont != null) button_tan.setFont(button_tanFont);
        button_tan.setText("tan");
        panel_buttons.add(button_tan, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_atan = new JButton();
        button_atan.setAlignmentY(0.0f);
        Font button_atanFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_atan.getFont());
        if (button_atanFont != null) button_atan.setFont(button_atanFont);
        button_atan.setText("atan");
        panel_buttons.add(button_atan, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_sum = new JButton();
        button_sum.setAlignmentY(0.0f);
        Font button_sumFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_sum.getFont());
        if (button_sumFont != null) button_sum.setFont(button_sumFont);
        button_sum.setText("+");
        panel_buttons.add(button_sum, new GridConstraints(4, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_3 = new JButton();
        button_3.setAlignmentY(0.0f);
        Font button_3Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_3.getFont());
        if (button_3Font != null) button_3.setFont(button_3Font);
        button_3.setText("3");
        panel_buttons.add(button_3, new GridConstraints(4, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_2 = new JButton();
        button_2.setAlignmentY(0.0f);
        Font button_2Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_2.getFont());
        if (button_2Font != null) button_2.setFont(button_2Font);
        button_2.setText("2");
        panel_buttons.add(button_2, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_1 = new JButton();
        button_1.setAlignmentY(0.0f);
        Font button_1Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_1.getFont());
        if (button_1Font != null) button_1.setFont(button_1Font);
        button_1.setText("1");
        panel_buttons.add(button_1, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_cos = new JButton();
        button_cos.setAlignmentY(0.0f);
        Font button_cosFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_cos.getFont());
        if (button_cosFont != null) button_cos.setFont(button_cosFont);
        button_cos.setText("cos");
        panel_buttons.add(button_cos, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_acos = new JButton();
        button_acos.setAlignmentY(0.0f);
        Font button_acosFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_acos.getFont());
        if (button_acosFont != null) button_acos.setFont(button_acosFont);
        button_acos.setText("acos");
        panel_buttons.add(button_acos, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_sub = new JButton();
        button_sub.setAlignmentY(0.0f);
        Font button_subFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_sub.getFont());
        if (button_subFont != null) button_sub.setFont(button_subFont);
        button_sub.setText("-");
        panel_buttons.add(button_sub, new GridConstraints(3, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_6 = new JButton();
        button_6.setAlignmentY(0.0f);
        Font button_6Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_6.getFont());
        if (button_6Font != null) button_6.setFont(button_6Font);
        button_6.setText("6");
        panel_buttons.add(button_6, new GridConstraints(3, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_5 = new JButton();
        button_5.setAlignmentY(0.0f);
        Font button_5Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_5.getFont());
        if (button_5Font != null) button_5.setFont(button_5Font);
        button_5.setText("5");
        panel_buttons.add(button_5, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_4 = new JButton();
        button_4.setAlignmentY(0.0f);
        Font button_4Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_4.getFont());
        if (button_4Font != null) button_4.setFont(button_4Font);
        button_4.setText("4");
        panel_buttons.add(button_4, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_sin = new JButton();
        button_sin.setAlignmentY(0.0f);
        Font button_sinFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_sin.getFont());
        if (button_sinFont != null) button_sin.setFont(button_sinFont);
        button_sin.setText("sin");
        panel_buttons.add(button_sin, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_asin = new JButton();
        button_asin.setAlignmentY(0.0f);
        Font button_asinFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_asin.getFont());
        if (button_asinFont != null) button_asin.setFont(button_asinFont);
        button_asin.setText("asin");
        panel_buttons.add(button_asin, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_mul = new JButton();
        button_mul.setAlignmentY(0.0f);
        Font button_mulFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_mul.getFont());
        if (button_mulFont != null) button_mul.setFont(button_mulFont);
        button_mul.setText("×");
        panel_buttons.add(button_mul, new GridConstraints(2, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_9 = new JButton();
        button_9.setAlignmentY(0.0f);
        Font button_9Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_9.getFont());
        if (button_9Font != null) button_9.setFont(button_9Font);
        button_9.setText("9");
        panel_buttons.add(button_9, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_8 = new JButton();
        button_8.setAlignmentY(0.0f);
        Font button_8Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_8.getFont());
        if (button_8Font != null) button_8.setFont(button_8Font);
        button_8.setText("8");
        panel_buttons.add(button_8, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        button_7 = new JButton();
        button_7.setAlignmentY(0.0f);
        Font button_7Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button_7.getFont());
        if (button_7Font != null) button_7.setFont(button_7Font);
        button_7.setText("7");
        panel_buttons.add(button_7, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        panel_display = new JPanel();
        panel_display.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel_calc_left.add(panel_display, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(430, 50), new Dimension(430, 50), new Dimension(430, 50), 0, false));
        scrollpane_1 = new JScrollPane();
        scrollpane_1.setHorizontalScrollBarPolicy(32);
        panel_display.add(scrollpane_1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(430, 50), new Dimension(430, 50), new Dimension(430, 50), 0, false));
        display_main = new JTextField();
        display_main.setAutoscrolls(false);
        Font display_mainFont = this.$$$getFont$$$("JetBrains Mono NL", Font.BOLD, 16, display_main.getFont());
        if (display_mainFont != null) display_main.setFont(display_mainFont);
        scrollpane_1.setViewportView(display_main);
        panel_zeroes = new JPanel();
        panel_zeroes.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel_calc_left.add(panel_zeroes, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        zero_label = new JLabel();
        zero_label.setText("Number of decimal places");
        panel_zeroes.add(zero_label, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        zero_spinner = new JSpinner();
        panel_zeroes.add(zero_spinner, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(120, -1), new Dimension(120, -1), new Dimension(120, -1), 0, false));
        zero_checkbox = new JCheckBox();
        zero_checkbox.setText("Show trailing zeroes");
        panel_zeroes.add(zero_checkbox, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel_calc_right = new JPanel();
        panel_calc_right.setLayout(new GridLayoutManager(2, 3, new Insets(0, 0, 0, 0), -1, -1));
        tab_calc.add(panel_calc_right, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button7 = new JButton();
        Font button7Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button7.getFont());
        if (button7Font != null) button7.setFont(button7Font);
        button7.setText("Button");
        panel_calc_right.add(button7, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        final Spacer spacer1 = new Spacer();
        panel_calc_right.add(spacer1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        button8 = new JButton();
        Font button8Font = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 12, button8.getFont());
        if (button8Font != null) button8.setFont(button8Font);
        button8.setText("Button");
        panel_calc_right.add(button8, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(62, 30), new Dimension(62, 30), new Dimension(62, 30), 0, false));
        scrollpane2 = new JScrollPane();
        scrollpane2.setHorizontalScrollBarPolicy(31);
        scrollpane2.setVerticalScrollBarPolicy(22);
        panel_calc_right.add(scrollpane2, new GridConstraints(0, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(192, 260), new Dimension(192, 260), new Dimension(192, 260), 0, false));
        display_history = new JEditorPane();
        scrollpane2.setViewportView(display_history);
        tab_credit = new JPanel();
        tab_credit.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1.addTab("Credit calculator", tab_credit);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
