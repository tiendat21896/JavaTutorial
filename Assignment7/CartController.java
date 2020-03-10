package Assignment7;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class CartController implements Initializable {
    @FXML
    ListView<Product> lsview1 = new ListView<>();
    Load ld = Load.getInstance();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lsview1.setItems(Main.cart);
    }
    public void backtolist(){
        try {
//            Parent pdlist = FXMLLoader.load(getClass().getClassLoader().getResource("list.fxml"));
//            Main.mainStage.getScene().setRoot(pdlist);
            Parent pdlist = ld.loadScene("list.fxml");
            Main.mainStage.getScene().setRoot(pdlist);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
