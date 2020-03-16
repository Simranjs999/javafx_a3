package studentfx;import content.Student;import java.io.BufferedReader;
import java.io.BufferedWriter;import java.io.FileReader;
import java.io.FileWriter;import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;import javafx.event.EventHandler;
import javafx.scene.Scene;import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;import javafx.stage.Stage;
public class Studentfx extends Application {
private ArrayList<Student> studentList = new ArrayList<>();
private Label lblID = new Label("Student ID: ");
private TextField txtID = new TextField();
private Label lblCourse1 = new Label("Enter Marks for course 1: ");
private TextField txtCourse1 = new TextField();
private Label lblCourse2 = new Label("Enter Marks for course 2:");
private TextField txtCourse2 = new TextField();
private Label lblCourse3 = new Label("Enter Marks for course 3: ");
private TextField txtCourse3 = new TextField();
private Label lblCourse4 = new Label("Enter Marks for course 4: ");
private TextField txtCourse4 = new TextField();
private Label lblCourse5 = new Label("Enter Marks for course 5: ");
private TextField txtCourse5 = new TextField();
private Button btnDisplay = new Button("Process student  ");
private Button btnAdd = new Button(" Add Student ");
private Button btnFile = new Button(" Make a file ");
private Pane addPAne() {
GridPane pane = new GridPane();
pane.add(lblID, 0, 0);
pane.add(txtID, 1, 0);
pane.add(lblCourse1, 0, 1);
pane.add(txtCourse1, 1, 1);
pane.add(lblCourse2, 0, 3);
pane.add(txtCourse2, 1, 3);
pane.add(lblCourse3, 0, 5);
pane.add(txtCourse3, 1, 5);
pane.add(lblCourse4, 0, 7);
pane.add(txtCourse4, 1, 7);
pane.add(lblCourse5, 0, 9);
pane.add(txtCourse5, 1, 9);
pane.add(btnDisplay, 0, 14);
pane.add(btnAdd, 1, 14);
pane.add(btnFile, 2, 14);
return pane;}
private void addStudent() {
Student one = new Student();
one.setID(txtID.getText());
one.setGrade1(Double.parseDouble(txtCourse1.getText()));
one.setGrade2(Double.parseDouble(txtCourse2.getText()));
one.setGrade3(Double.parseDouble(txtCourse3.getText()));
one.setGrade4(Double.parseDouble(txtCourse4.getText()));
one.setGrade5(Double.parseDouble(txtCourse5.getText()));
studentList.add(one); 
        txtID.clear();
        txtCourse1.clear();
        txtCourse2.clear();
        txtCourse3.clear();
        txtCourse4.clear();
        txtCourse5.clear();
        txtID.requestFocus();}@Override
    public void start(Stage primaryStage) {
Scene scene = new Scene(addPAne(), 500, 450);
primaryStage.setTitle("Student Grade:");primaryStage.setScene(scene);
primaryStage.show();btnDisplay.setOnAction((e) -> {addStudent();
 DisplayStage ds = new DisplayStage(studentList);ds.show();});
btnAdd.setOnAction((e) -> {addStudent();});
btnFile.setOnAction((e) -> {try {
FileWriter frw = new FileWriter("student.dat", true);
BufferedWriter bdw = new BufferedWriter(frw);
int size = studentList.size();
for (int i = 0; i < size; i++) {
String str = studentList.get(i).toString();
bdw.write(str);if (i < size - 1) {
bdw.write("\n");}}
bdw.flush();
bdw.close();
frw.close();
FileReader flr = new FileReader("student.dat");
BufferedReader bdr = new BufferedReader(flr);
String line = bdr.readLine();
while (line != null) {
System.out.println(line);
line = bdr.readLine();
}

            } catch (Exception f) {
                System.err.println(f);

            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
