package application;

import javafx.scene.layout.VBox;
import javafx.scene.control.*;
import javafx.geometry.Insets;

public class GradeManagementView {
    public static VBox getView() {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);

        // Student selection
        Label studentLabel = new Label("Select Student:");
        ComboBox<String> studentComboBox = new ComboBox<>();
        studentComboBox.getItems().addAll("Student1", "Student2", "Student3");

        // Course selection
        Label courseLabel = new Label("Select Course:");
        ComboBox<String> courseComboBox = new ComboBox<>();
        courseComboBox.getItems().addAll("Math", "Science", "History");

        // Grade entry
        Label gradeLabel = new Label("Enter Grade:");
        TextField gradeField = new TextField();
        Button assignButton = new Button("Assign Grade");

        vbox.getChildren().addAll(studentLabel, studentComboBox, courseLabel, courseComboBox, gradeLabel, gradeField, assignButton);

        assignButton.setOnAction(e -> {
            String selectedStudent = studentComboBox.getValue();
            String selectedCourse = courseComboBox.getValue();
            String grade = gradeField.getText();
            if (selectedStudent != null && selectedCourse != null && !grade.isEmpty()) {
                System.out.println("Assigned grade " + grade + " to " + selectedStudent + " for " + selectedCourse);
                gradeField.clear();
            }
        });

        return vbox;
    }
}
