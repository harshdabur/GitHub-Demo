import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
    private JTextField emailField;
    private JPanel panelMain;
    private JPasswordField passwordField;
    private JButton loginButton;


    public LoginPage() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());


                if (isValid(email, password)) {
                    JOptionPane.showMessageDialog(LoginPage.this, "Successful login!");
                } else {
                    JOptionPane.showMessageDialog(LoginPage.this, "Invalid email or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
            }
    private boolean isValid(String email, String password) {

        return email.equals("harsh@pures.ca") && password.equals("Pures@123");
    }


    public static void main(String[] args) {
        LoginPage gui = new LoginPage();
        gui.setContentPane(gui.panelMain);
        gui.setTitle("Login Page");
        gui.setSize(500,500);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
