//Name = Simranjeet Singh
//Student ID= 991557252
package content;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayOrder extends Stage{
      public DisplayOrder(Order one) {
        
        
        setScene(getScene(one));
        
        

    }
       private Scene getScene(Order one){
        
        
        Label lblFirstName=new Label("Customer Name is: "+one.getFirstname());
        Label lblLastName=new Label("Customer Name is: "+one.getLastname());
        Label lblCity=new Label("Customer City is : "+one.getCity());
        Label lblorderID=new Label("Order Id is: "+one.getOrderId());
        
        VBox pane=new VBox(20,lblFirstName,lblLastName,lblCity,lblorderID);
        Scene scene=new Scene(pane,200,150);
        return scene;
        
    
    }

    
}
