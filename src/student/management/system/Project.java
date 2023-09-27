package student.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame implements ActionListener {

    Project(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(screenSize.width,screenSize.height, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.GRAY);
        setJMenuBar(mb);

        //  New Info
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.ORANGE);
        mb.add(newInformation);

        JMenuItem facultyInformation = new JMenuItem("Add New Faculty Information");
        facultyInformation.setBackground(Color.WHITE);
        facultyInformation.addActionListener(this);
        newInformation.add(facultyInformation);


        JMenuItem studentInformation = new JMenuItem("Add New Student Information");
        studentInformation.setBackground(Color.WHITE);
        studentInformation.addActionListener(this);
        newInformation.add(studentInformation);

        //  View Details
        JMenu viewDetails = new JMenu("View Details");
        viewDetails.setForeground(Color.YELLOW);
        mb.add(viewDetails);


        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
        facultyDetails.addActionListener(this);
        viewDetails.add(facultyDetails);


        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.WHITE);
        studentDetails.addActionListener(this);
        viewDetails.add(studentDetails);

        // Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.ORANGE);
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);

        // Leave Details
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.YELLOW);
        mb.add(leaveDetails);

        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);

        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);

        // Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.ORANGE);
        mb.add(exam);

        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);

        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);

        // UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.YELLOW);
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);

        // fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.ORANGE);
        mb.add(fee);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);

        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);

        // Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.YELLOW);
        mb.add(utility);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);

        // about
        JMenu about = new JMenu("About");
        about.setForeground(Color.ORANGE);
        mb.add(about);

        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);

        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.YELLOW);
        mb.add(exit);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Project();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {

            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {

            }
        } else if (msg.equals("Add New Faculty Information")) {
            new addFaculty();
        } else if (msg.equals("Add New Student Information")) {
            new addStudent();
        } else if (msg.equals("View Faculty Details")) {
            new facultyDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        } else if (msg.equals("Faculty Leave")) {
            new FacultyLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty Leave Details")) {
            new FacultyLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Update Faculty Details")) {
            new UpdateFaculty();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        } else if (msg.equals("Enter Marks")) {
            //new EnterMarks();
        } else if (msg.equals("Examination Results")) {
            //new ExaminationDetails();
        } else if (msg.equals("Fee Structure")) {
            //new FeeStructure();
        } else if (msg.equals("About")) {
            //new About();
        } else if (msg.equals("Student Fee Form")) {
            //new StudentFeeForm();
        }
    }
}
