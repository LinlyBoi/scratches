import javax.swing.JOptionPane;
class Scratch {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        if(age>=18)
        {
            JOptionPane.showMessageDialog(null,"You can do the fuck");
        }

    else {
            JOptionPane.showMessageDialog(null,"No no no No FUCKING!!!");
        }
    }
}