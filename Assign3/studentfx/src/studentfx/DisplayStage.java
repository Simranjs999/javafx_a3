package studentfx;

import content.Student;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DisplayStage extends Stage {
double totalavg =0;
    private ArrayList<Student> studentList = new ArrayList<>();

    public DisplayStage(ArrayList<Student> StudentList) {

        this.studentList = StudentList;
        setScene(addScene());

    }
    private Scene addScene() {

        String elements = new String();

        for (int sub = 0; sub < studentList.size(); sub++) {
            Student one = studentList.get(sub);
elements += "Student ID: " + one.getID()
        + "\n" + "Grade for Course 1 is:  " + one.getGrade1()
                    + "\n" + "Grade for Course 2 is:  " + one.getGrade2()
                    + "\n" + "Grade for course 3 is:  " + one.getGrade3()
                    + "\n" + "Grade for course 4 is :  " + one.getGrade4()
                    + "\n" + "Grade for course 5 is :  " + one.getGrade5()
                    + "\nAverage Grade is : " + one.Average()+"\n"+
"\n";
       totalavg+=one.Average();
                   

        }
double finalavg=totalavg/studentList.size();
elements+="Number of students processed are: "+studentList.size()+"\n"+
        "Final avg is: "+finalavg;
        TextArea txtDisplay = new TextArea(elements);

    

        Pane pane = new Pane(txtDisplay);

        Scene scene = new Scene(pane, 750, 750);

        return scene;

    }

}
