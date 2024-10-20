package application;

import javafx.scene.layout.VBox;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class CourseEnrollmentView {
    private static ComboBox<String> courseComboBox = new ComboBox<>();
    private static ListView<String> studentListView = new ListView<>();
    private static ObservableList<String> students = FXCollections.observableArrayList("Student1", "Student2", "Student3");

    public static VBox getView() {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);

        // Course selection
        Label courseLabel = new Label("Select Course:");
        courseComboBox.getItems().addAll("Math", "Science", "History");

        // Student selection
        Label studentLabel = new Label("Select Student:");
        studentListView.setItems(students);

        Button enrollButton = new Button("Enroll");

        vbox.getChildren().addAll(courseLabel, courseComboBox, studentLabel, studentListView, enrollButton);

        enrollButton.setOnAction(e -> {
            String selectedCourse = courseComboBox.getValue();
            String selectedStudent = studentListView.getSelectionModel().getSelectedItem();
            if (selectedCourse != null && selectedStudent != null) {
                System.out.println(selectedStudent + " enrolled in " + selectedCourse);
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Please select both a course and a student.");
                alert.showAndWait();
            }
        });

        return vbox;
    }

    public static String getSelectedCourse() {
        return courseComboBox.getValue();
    }

    public static String getSelectedStudent() {
        return studentListView.getSelectionModel().getSelectedItem();
    }
}

/*
 * public class CourseEnrollmentView { public static VBox getView() { VBox vbox
 * = new VBox(); vbox.setPadding(new Insets(10)); vbox.setSpacing(8);
 * 
 * // Course selection Label courseLabel = new Label("Select Course:");
 * ComboBox<String> courseComboBox = new ComboBox<>();
 * courseComboBox.getItems().addAll("Math", "Science", "History");
 * 
 * // Student selection Label studentLabel = new Label("Select Student:");
 * ListView<String> studentListView = new ListView<>();
 * studentListView.getItems().addAll("Student1", "Student2", "Student3");
 * 
 * Button enrollButton = new Button("Enroll");
 * 
 * vbox.getChildren().addAll(courseLabel, courseComboBox, studentLabel,
 * studentListView, enrollButton);
 * 
 * enrollButton.setOnAction(e -> { String selectedCourse =
 * courseComboBox.getValue(); String selectedStudent =
 * studentListView.getSelectionModel().getSelectedItem(); if (selectedCourse !=
 * null && selectedStudent != null) { System.out.println(selectedStudent +
 * " enrolled in " + selectedCourse); } });
 * 
 * return vbox; } }
 */