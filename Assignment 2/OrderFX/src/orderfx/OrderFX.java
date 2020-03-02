//Name = Simranjeet Singh
//Student ID= 991557252
package orderfx;
import content.DisplayOrder;
import content.Order;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class OrderFX extends Application {
     private Label lblFirstName = new Label(" First NAME: ");
    private TextField txtFName = new TextField();
    private Label lblLastName = new Label(" Last NAME: ");
    private TextField txtLName = new TextField();
    private Label lblCity = new Label("CITY: ");
    private TextField txtCity = new TextField();
    
     private Label lblOrderId = new Label(" Order Id: ");
    private TextField txtOrderid = new TextField();
    
    private Button btnDisplay = new Button("Your order is: ");
    private Order one = new Order();
    @Override
    public void start(Stage primaryStage) {
         btnDisplay.setOnAction((e) -> {

            process();
            DisplayOrder ds = new DisplayOrder(one);
            ds.show();
        });
         
          primaryStage.setOnCloseRequest((e)-> {
           Alert dlgInfo=new Alert(Alert.AlertType.CONFIRMATION);
           dlgInfo.setHeaderText("Closing Primary Stage");
           dlgInfo.show();
            
        });

        primaryStage.setTitle("Text Example");
        primaryStage.show();
        Scene scene = new Scene(getGrid(), 500, 350);
        primaryStage.setScene(scene);
     
        
        primaryStage.setTitle("Hello World!");
       
        primaryStage.show();
    }
     private void process() {

        String fname = txtFName.getText();
        String lname = txtLName.getText();
        String city = txtCity.getText();
        String OrderId=txtOrderid.getText();
        one.setFirstname(fname.toUpperCase());
        one.setLastname(lname.toUpperCase());
        one.setCity(city.toUpperCase());
        one.setOrderId(OrderId);

    }
    private GridPane getGrid() {

        GridPane pane = new GridPane();
        ImageView exorcist = new ImageView("images/exorcist.jpg");

        ImageView ps = new ImageView("images/ps.jpg");

        ImageView java = new ImageView("images/java.jpg");

        ImageView bram = new ImageView("images/bram1.jpg");

        exorcist.setFitHeight(200);

        exorcist.setFitWidth(200);
        ps.setFitHeight(200);

        ps.setFitWidth(200);

        java.setFitHeight(200);

        java.setFitWidth(200);

        bram.setFitHeight(200);

        bram.setFitWidth(200);

        Pane exor = new Pane(exorcist);

        Pane ps1 = new Pane(ps);

        Pane jav = new Pane(java);

        Pane bram1 = new Pane(bram);

        pane.add(exor, 1, 0);
        pane.add(ps1, 3, 0);
        pane.add(jav, 5, 0);
        pane.add(bram1, 7, 0);

pane.add(lblFirstName, 0, 1);
        pane.add(txtFName, 1, 1);
        pane.add(lblLastName, 0, 3);
        pane.add(txtLName, 1, 3);
        pane.add(lblCity, 0, 5);
        pane.add(txtCity, 1, 5);
        pane.add(lblOrderId, 0, 7);
        pane.add(txtOrderid, 1, 7);
        
        pane.add(btnDisplay, 0, 9);

        return pane;

    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
