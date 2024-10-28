import javax.swing.JOptionPane;
//This is for GUI in Java
public class GUI {
    public static void main(String[] args) {

        String student = JOptionPane.showInputDialog("Enter student name: ");
        JOptionPane.showMessageDialog(null, student);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age: "));
        JOptionPane.showMessageDialog(null, age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height: "));
        JOptionPane.showMessageDialog(null, height);
    }


}
