package Assignment7;

import Session6.ProductDataAccessObject;
import Connector.Connector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Form {
    public TextField txtName = new TextField();
    public TextArea txtDesc = new TextArea();
    public TextField txtPrice = new TextField();
    public TextField txtAmount = new TextField();
    private Load ld = Load.getInstance();
    public void submit(){
        try{

            String name = txtName.getText();
            String desc = txtDesc.getText();
            int price = Integer.parseInt(txtPrice.getText());
            int amount = Integer.parseInt(txtAmount.getText());
            ProductDataAccessObject pdao = ProductDataAccessObject.getInstance();
            Product pd = new Product(name,desc,price,amount);
            if(pdao.create(pd)){
                Parent list = FXMLLoader.load(getClass().getResource("list.fxml"));
                Main.mainStage.getScene().setRoot(list);
            }else{
                System.out.println("Fail");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
