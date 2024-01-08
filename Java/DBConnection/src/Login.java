import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
    public static void main(String[] args) {
        String vRespuesta;
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        Object[] message = {
            "Username:", username,
            "Password:", password
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (username.getText().toString().length()>0){
                if (password.getText().toString().length()>0){
                    vRespuesta = LoginBD.Login(username.getText(), password.getText());
                    JOptionPane.showMessageDialog(null, vRespuesta, "info", 0);
                }
            }
        } else {
            System.out.println("Login canceled");
        }
    }
}