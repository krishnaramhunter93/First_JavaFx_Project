package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class StudentManagementApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Management System");

        TabPane tabPane = new TabPane();

        // Creating tabs for each functionality
        Tab studentTab = new Tab("Student Management", StudentManagementView.getView());
        Tab courseTab = new Tab("Course Enrollment", CourseEnrollmentView.getView());
        Tab gradeTab = new Tab("Grade Management", GradeManagementView.getView());

        tabPane.getTabs().addAll(studentTab, courseTab, gradeTab);

        Scene scene = new Scene(tabPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Example of using the input methods for course enrollment
        String selectedCourse = CourseEnrollmentView.getSelectedCourse();
        String selectedStudent = CourseEnrollmentView.getSelectedStudent();

        System.out.println("Selected Course: " + selectedCourse);
        System.out.println("Selected Student: " + selectedStudent);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
 * public class StudentManagementApp extends Application {
 * 
 * @Override public void start(Stage primaryStage) {
 * primaryStage.setTitle("Student Management System");
 * 
 * TabPane tabPane = new TabPane();
 * 
 * // Creating tabs for each functionality Tab studentTab = new
 * Tab("Student Management", StudentManagementView.getView()); Tab courseTab =
 * new Tab("Course Enrollment", CourseEnrollmentView.getView()); Tab gradeTab =
 * new Tab("Grade Management", GradeManagementView.getView());
 * 
 * tabPane.getTabs().addAll(studentTab, courseTab, gradeTab);
 * 
 * Scene scene = new Scene(tabPane, 800, 600); primaryStage.setScene(scene);
 * primaryStage.show();
 * 
 * // Example of using the input methods String studentName =
 * StudentManagementView.getNameInput(); try { int studentAge =
 * StudentManagementView.getAgeInput(); System.out.println("Student Name: " +
 * studentName + ", Age: " + studentAge); } catch (NumberFormatException e) {
 * System.out.println("Invalid age input"); }
 * 
 * String updateName = StudentManagementView.getUpdateNameInput();
 * System.out.println("Update Name: " + updateName);
 * 
 * Student selectedStudent = StudentManagementView.getSelectedStudent(); if
 * (selectedStudent != null) { System.out.println("Selected Student: " +
 * selectedStudent.getName() + ", Age: " + selectedStudent.getAge()); } else {
 * System.out.println("No student selected"); } }
 * 
 * public static void main(String[] args) { launch(args); } }
 */
/*
 * public class StudentManagementApp extends Application {
 * 
 * @Override public void start(Stage primaryStage) {
 * primaryStage.setTitle("Student Management System");
 * 
 * TabPane tabPane = new TabPane();
 * 
 * // Creating tabs for each functionality Tab studentTab = new
 * Tab("Student Management", StudentManagementView.getView()); Tab courseTab =
 * new Tab("Course Enrollment", CourseEnrollmentView.getView()); Tab gradeTab =
 * new Tab("Grade Management", GradeManagementView.getView());
 * 
 * tabPane.getTabs().addAll(studentTab, courseTab, gradeTab);
 * 
 * Scene scene = new Scene(tabPane, 800, 600); primaryStage.setScene(scene);
 * primaryStage.show(); }
 * 
 * public static void main(String[] args) { launch(args); } }
 */
/*
 * public class StudentManagementApp extends Application {
 * 
 * @Override public void start(Stage primaryStage) {
 * primaryStage.setTitle("Student Management System");
 * 
 * TabPane tabPane = new TabPane();
 * 
 * // Creating tabs for each functionality Tab studentTab = new
 * Tab("Student Management", StudentManagementView.getView()); Tab courseTab =
 * new Tab("Course Enrollment", CourseEnrollmentView.getView()); Tab gradeTab =
 * new Tab("Grade Management", GradeManagementView.getView());
 * 
 * tabPane.getTabs().addAll(studentTab, courseTab, gradeTab);
 * 
 * Scene scene = new Scene(tabPane, 800, 600); primaryStage.setScene(scene);
 * primaryStage.show(); }
 * 
 * public static void main(String[] args) { launch(args); } }
 */

/*
 * public class Main extends Application {
 * 
 * @Override public void start(Stage primaryStage) { try { BorderPane root = new
 * BorderPane(); Scene scene = new Scene(root,400,400);
 * scene.getStylesheets().add(getClass().getResource("application.css").
 * toExternalForm()); primaryStage.setScene(scene); primaryStage.show(); }
 * catch(Exception e) { e.printStackTrace(); } }
 * 
 * public static void main(String[] args) { launch(args); } }
 */
