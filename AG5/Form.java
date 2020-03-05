package AG5;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Form {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public void Add() throws Exception {
        try {

            //stepp 2: khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3: Tạo URL database
            String url = "jdbc:mysql://localhost:3306/T1907M";
            String username = "root";
            String password = "";
            //step 4: ket noi
            Connection conn = DriverManager.getConnection(url, username, password);
            String name = txtName.getText();
            Integer age = Integer.parseInt(txtAge.getText());
            Integer mark = Integer.parseInt(txtMark.getText());


            String sql_text = "INSERT INTO  student(name, age, mark) VALUES ('" + name + "', " + age + ", " + mark + " )";
            Statement stm = conn.createStatement();
            int row_number = stm.executeUpdate(sql_text);
            if (row_number > 0) {
                Parent list = FXMLLoader.load(getClass().getResource("List.fxml"));
                Main.mainStage.getScene().setRoot(list);
            } else {
                //thông báo validation
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Step 4: kết nối với database

        }
    }
}
