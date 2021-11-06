import javax.swing.JOptionPane;
class Scratch {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your mental age"));
        JOptionPane.showMessageDialog(null,"Your mental age is "+age);
    }
}