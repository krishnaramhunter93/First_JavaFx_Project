 package application;
 import javafx.collections.FXCollections;
 import javafx.collections.ObservableList;
 import javafx.geometry.Insets;
 import javafx.scene.control.*;
 import javafx.scene.layout.VBox;
 import javafx.collections.FXCollections;
 import javafx.collections.ObservableList;
 import javafx.geometry.Insets;
 import javafx.scene.control.*;
 import javafx.scene.layout.VBox;

 public class StudentManagementView {
     private static ObservableList<Student> students = FXCollections.observableArrayList();
     private static TextField nameField = new TextField();
     private static TextField ageField = new TextField();
     private static TextField updateNameField = new TextField();
     private static TableView<Student> studentTable = new TableView<>();

     public static VBox getView() {
         VBox vbox = new VBox();
         vbox.setPadding(new Insets(10));
         vbox.setSpacing(8);

         // Add student form
         Label nameLabel = new Label("Name:");
         Label ageLabel = new Label("Age:");
         Button addButton = new Button("Add Student");

         vbox.getChildren().addAll(nameLabel, nameField, ageLabel, ageField, addButton);

         // Update student form
         Label updateNameLabel = new Label("Update Name:");
         Button updateButton = new Button("Update Student");

         vbox.getChildren().addAll(updateNameLabel, updateNameField, updateButton);

         // View student details
         TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
         nameColumn.setCellValueFactory(data -> data.getValue().nameProperty());
         TableColumn<Student, Integer> ageColumn = new TableColumn<>("Age");
         ageColumn.setCellValueFactory(data -> data.getValue().ageProperty().asObject());

         studentTable.setItems(students);
         studentTable.getColumns().addAll(nameColumn, ageColumn);

         vbox.getChildren().add(studentTable);

         // Event Handlers
         addButton.setOnAction(e -> {
             try {
                 String name = nameField.getText();
                 int age = Integer.parseInt(ageField.getText());
                 Student newStudent = new Student(name, age);
                 students.add(newStudent);
                 nameField.clear();
                 ageField.clear();
             } catch (NumberFormatException ex) {
                 Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid age. Please enter a number.");
                 alert.showAndWait();
             }
         });

         updateButton.setOnAction(e -> {
             Student selectedStudent = studentTable.getSelectionModel().getSelectedItem();
             if (selectedStudent != null) {
                 selectedStudent.setName(updateNameField.getText());
                 studentTable.refresh();
                 updateNameField.clear();
             } else {
                 Alert alert = new Alert(Alert.AlertType.WARNING, "No student selected. Please select a student to update.");
                 alert.showAndWait();
             }
         });

         return vbox;
     }

     public static String getNameInput() {
         return nameField.getText();
     }

     public static int getAgeInput() throws NumberFormatException {
         return Integer.parseInt(ageField.getText());
     }

     public static String getUpdateNameInput() {
         return updateNameField.getText();
     }

     public static Student getSelectedStudent() {
         return studentTable.getSelectionModel().getSelectedItem();
     }
 }

	/*
	 * public class StudentManagementView { private static ObservableList<Student>
	 * students = FXCollections.observableArrayList();
	 * 
	 * public static VBox getView() { VBox vbox = new VBox(); vbox.setPadding(new
	 * Insets(10)); vbox.setSpacing(8);
	 * 
	 * // Add student form Label nameLabel = new Label("Name:"); TextField nameField
	 * = new TextField(); Label ageLabel = new Label("Age:"); TextField ageField =
	 * new TextField(); Button addButton = new Button("Add Student");
	 * 
	 * vbox.getChildren().addAll(nameLabel, nameField, ageLabel, ageField,
	 * addButton);
	 * 
	 * // Update student form Label updateNameLabel = new Label("Update Name:");
	 * TextField updateNameField = new TextField(); Button updateButton = new
	 * Button("Update Student");
	 * 
	 * vbox.getChildren().addAll(updateNameLabel, updateNameField, updateButton);
	 * 
	 * // View student details TableView<Student> studentTable = new TableView<>();
	 * TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
	 * nameColumn.setCellValueFactory(data -> data.getValue().nameProperty());
	 * TableColumn<Student, Integer> ageColumn = new TableColumn<>("Age");
	 * ageColumn.setCellValueFactory(data ->
	 * data.getValue().ageProperty().asObject());
	 * 
	 * studentTable.setItems(students); studentTable.getColumns().addAll(nameColumn,
	 * ageColumn);
	 * 
	 * vbox.getChildren().add(studentTable);
	 * 
	 * // Event Handlers addButton.setOnAction(e -> { try { String name =
	 * nameField.getText(); int age = Integer.parseInt(ageField.getText()); Student
	 * newStudent = new Student(name, age); students.add(newStudent);
	 * nameField.clear(); ageField.clear(); } catch (NumberFormatException ex) {
	 * Alert alert = new Alert(Alert.AlertType.ERROR,
	 * "Invalid age. Please enter a number."); alert.showAndWait(); } });
	 * 
	 * updateButton.setOnAction(e -> { Student selectedStudent =
	 * studentTable.getSelectionModel().getSelectedItem(); if (selectedStudent !=
	 * null) { selectedStudent.setName(updateNameField.getText());
	 * studentTable.refresh(); updateNameField.clear(); } else { Alert alert = new
	 * Alert(Alert.AlertType.WARNING,
	 * "No student selected. Please select a student to update.");
	 * alert.showAndWait(); } });
	 * 
	 * return vbox; } }
	 */
/* 
 * import javafx.scene.layout.VBox; import javafx.scene.control.*; import
 * javafx.geometry.Insets;
 * 
 * public class StudentManagementView { public static VBox getView() { VBox vbox
 * = new VBox(); vbox.setPadding(new Insets(10)); vbox.setSpacing(8);
 * 
 * // Add student form Label nameLabel = new Label("Name:"); TextField nameField
 * = new TextField(); Label ageLabel = new Label("Age:"); TextField ageField =
 * new TextField(); Button addButton = new Button("Add Student");
 * 
 * vbox.getChildren().addAll(nameLabel, nameField, ageLabel, ageField,
 * addButton);
 * 
 * // Update student form Label updateNameLabel = new Label("Update Name:");
 * TextField updateNameField = new TextField(); Button updateButton = new
 * Button("Update Student");
 * 
 * vbox.getChildren().addAll(updateNameLabel, updateNameField, updateButton);
 * 
 * // View student details TableView<Student> studentTable = new TableView<>();
 * TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
 * TableColumn<Student, Integer> ageColumn = new TableColumn<>("Age");
 * studentTable.getColumns().addAll(nameColumn, ageColumn);
 * 
 * vbox.getChildren().add(studentTable);
 * 
 * // Event Handlers addButton.setOnAction(e -> { String name =
 * nameField.getText(); int age = Integer.parseInt(ageField.getText()); Student
 * newStudent = new Student(name, age); studentTable.getItems().add(newStudent);
 * nameField.clear(); ageField.clear(); });
 * 
 * updateButton.setOnAction(e -> { Student selectedStudent =
 * studentTable.getSelectionModel().getSelectedItem(); if (selectedStudent !=
 * null) { selectedStudent.setName(updateNameField.getText());
 * studentTable.refresh(); updateNameField.clear(); } });
 * 
 * return vbox; } }
 */