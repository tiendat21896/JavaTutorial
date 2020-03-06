package Lab_S6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class List implements Initializable {
    public ListView<ListOfProducts> listView = new ListView<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            //stepp 2: Khai báo driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3: Tạo URL database
            String url = "jdbc:mysql://localhost:3306/product";
            String username = "root";
            String password = "";
            //step 4: Kết nối
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql_text = "SELECT * FROM products";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql_text);
            ObservableList ls = FXCollections.observableArrayList();
            while (rs.next()) {
                ListOfProducts products = new ListOfProducts(rs.getString("name"), rs.getString("des"),  rs.getInt("price"),rs.getInt("amount"));
                ls.add(products);
            }
            listView.setItems(ls);
        }catch (Exception e){

        }
    }
    public void list() {
        //day la noi chuyen man hinh
        try {
            Parent list = FXMLLoader.load(getClass().getResource("Add.fxml"));
            Main.mainStage.getScene().setRoot(list);

        } catch (Exception e) {

        }
    }
}
