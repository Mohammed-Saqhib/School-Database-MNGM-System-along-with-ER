package awt_samples;
import java.awt.*;
import java.awt.event.*;

public class Lab12_AWT extends Frame implements ActionListener{
    Label nameLabel, ageLabel, genderLabel, courseLabel, infoLabel;
    TextField nameField, ageField;
    Checkbox male, female;
    CheckboxGroup cbg = new CheckboxGroup();
    Choice courseChoice;
    TextArea infoArea;
    Button submitButton;

    Lab12_AWT() {
        setTitle("Student Registration Form");
        setSize(400, 400);
        setLayout(null);
        setResizable(false);

        nameLabel = new Label("Name");
        nameField = new TextField(20);

        ageLabel = new Label("Age");
        ageField = new TextField(3);

        genderLabel = new Label("Gender");
        male = new Checkbox("Male", cbg, false);
        female = new Checkbox("Female", cbg, false);

        courseLabel = new Label("Course");
        courseChoice = new Choice();
        courseChoice.add("Computer Science");
        courseChoice.add("Information Technology");
        courseChoice.add("Electronics");
        courseChoice.add("Mechanical");

        infoLabel = new Label("Student Details");
        infoArea = new TextArea(5, 110);

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        add(nameLabel);
        nameLabel.setBounds(10, 75, 50, 20);
            add(nameField);
            nameField.setBounds(70, 75, 150, 20);
        add(ageLabel);
        ageLabel.setBounds(10, 100, 50, 20);
        add(ageField);
        ageField.setBounds(70, 100, 50, 20);
        add(genderLabel);
        genderLabel.setBounds(10, 120, 50, 20);
        add(male);
        male.setBounds(70, 120, 50, 20);
        add(female);
        female.setBounds(120, 120, 80, 20);
        add(courseLabel);
        courseLabel.setBounds(10, 150, 50, 20);
        add(courseChoice);
        courseChoice.setBounds(70, 150, 150, 20);

        add(submitButton);
        submitButton.setBounds(150, 180, 90, 40);
        add(infoLabel);
        infoLabel.setBounds(50, 250, 100, 20);
        add(infoArea);
        infoArea.setBounds(150, 250, 200, 80);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
        setLocation(300, 100);

    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String age = ageField.getText();
        String gender = male.getState() ? "Male" : female.getState() ? "Female" : "Not Specified";
        String course = courseChoice.getSelectedItem();
        infoArea.setText("Name:"+name+"\n"+"Age:"+age+"\n"+"Gender:"+gender+"\n"+"Course:"+course);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Lab12_AWT();
    }

}