import javax.swing.*;
import java.awt.*;

public class App {
    final static private int widthTextBox = 465;
    final static private int heightText = 44;
    final static private int smallFontSize = 24;
    final static private int handingFontSize = 36;
    final static private int lblBoundsWidth = 200;
    final static private int lblBoundsHeight = 29;
    final static private int textAlign = 462;
    final static private int textTopMargin = 41;

    public static void main(String[] args) throws Exception {
        JFrame f=new JFrame();//creating instance of JFrame

        JButton btnRegister = new JButton("Register");

        JLabel lblRegister = new JLabel("Commuter Registration Form");
        JLabel lblName= new JLabel("Name");
        JLabel lblSurname = new JLabel("Surname");
        JLabel lblDateOfBirth = new JLabel("Date Of Birth");
        JLabel lblGender = new JLabel("Gender");
        JLabel lblEmail = new JLabel("Email");
        JLabel lblCommuter = new JLabel("Commuter");

        JTextField txtName = new JTextField();
        JTextField txtSurname = new JTextField();
        JTextField txtDateOfBirth = new JTextField();
        JTextField txtEmail = new JTextField();

        Font defaultFont = lblRegister.getFont();
        Font smallFont = new Font(defaultFont.getName(), Font.PLAIN, smallFontSize);
        Font handingFont = new Font(defaultFont.getName(),Font.PLAIN,handingFontSize);

        DefaultComboBoxModel<String> cbxmGender = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> cbxmCommuter = new DefaultComboBoxModel<>();

        // Add items to the ComboBoxModel
        cbxmGender.addElement("Male");
        cbxmGender.addElement("Female");
        cbxmGender.addElement("Other");

        JComboBox<String> cbxGender = new JComboBox<>(cbxmGender);

        // Add items to the ComboBoxModel
        cbxmCommuter.addElement("Adult");
        cbxmCommuter.addElement("Scholar");
        cbxmCommuter.addElement("Pensioner");
        cbxmCommuter.addElement("Disabled");
        cbxmCommuter.addElement("Children");

        // Create a JComboBox with the ComboBoxModel
        JComboBox<String> cbxCommuter = new JComboBox<>(cbxmCommuter);

        f.setSize(1440,878);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblRegister.setBounds(466,40,600,64);
        lblRegister.setFont(handingFont);
//        lblRegister.setHorizontalAlignment(JLabel.CENTER);

        lblName.setBounds(textAlign,104,lblBoundsWidth,lblBoundsHeight);
        lblName.setFont(smallFont);

        txtName.setBounds(textAlign,104 + textTopMargin,widthTextBox, heightText);
        txtName.setFont(smallFont);

        lblSurname.setBounds(textAlign,204,lblBoundsWidth,lblBoundsHeight);
        lblSurname.setFont(smallFont);

        txtSurname.setBounds(textAlign,204 + textTopMargin,widthTextBox, heightText);
        txtSurname.setFont(smallFont);

        lblDateOfBirth.setBounds(textAlign,319,lblBoundsWidth,lblBoundsHeight);
        lblDateOfBirth.setFont(smallFont);

        txtDateOfBirth.setBounds(textAlign,319+ textTopMargin,widthTextBox,heightText);
        txtDateOfBirth.setFont(smallFont);

        lblGender.setBounds(textAlign,418,lblBoundsWidth,lblBoundsHeight);
        lblGender.setFont(smallFont);

        cbxGender.setBounds(textAlign,418 + textTopMargin,widthTextBox, heightText);
        cbxGender.setFont(smallFont);

        lblEmail.setBounds(textAlign,517,lblBoundsWidth,lblBoundsHeight);
        lblEmail.setFont(smallFont);

        txtEmail.setBounds(textAlign,517 + textTopMargin,widthTextBox, heightText);
        txtEmail.setFont(smallFont);

        lblCommuter.setBounds(textAlign,618,lblBoundsWidth,lblBoundsHeight);
        lblCommuter.setFont(smallFont);

        cbxCommuter.setBounds(textAlign,618 + textTopMargin,widthTextBox, heightText);
        cbxCommuter.setFont(smallFont);

        btnRegister.setBounds(594,758,209,49);

        f.setVisible(true);//making the frame visible

        f.add(lblRegister);
        f.add(lblName);
        f.add(lblSurname);
        f.add(lblDateOfBirth);
        f.add(lblGender);
        f.add(lblEmail);
        f.add(lblCommuter);

        f.add(txtName);
        f.add(txtSurname);
        f.add(txtDateOfBirth);
        f.add(cbxGender);
        f.add(txtEmail);
        f.add(cbxCommuter);

        f.add(btnRegister);


    }
}
