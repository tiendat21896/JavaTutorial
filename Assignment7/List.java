package Assignment7;

import Session6.ProductDataAccessObject;
import Connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.sql.*;

public class List implements Initializable {
    public ListView<Product> lsview = new ListView();
    Load ld = Load.getInstance();
    public static ObservableList<Product> listData = FXCollections.observableArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            reloadData();
            lsview.setItems(listData);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void reloadData() throws Exception{

        ProductDataAccessObject pdao = ProductDataAccessObject.getInstance();
        ArrayList<Product> ls = pdao.list();
        listData.addAll(ls);
    }
    public void form(){
        try {
            Parent form = FXMLLoader.load(getClass().getResource("form.fxml"));
            Main.mainStage.getScene().setRoot(form);
            Parent load = ld.loadScene("form.fxml");
            Main.mainStage.getScene().setRoot(load);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void addToCart(){
        Product selected = lsview.getSelectionModel().getSelectedItem();
        Main.cart.add(selected);
        System.out.println("Add to cart succesfully");
    }
    public void cart(){
        try {
            Parent cart = ld.loadScene("cart.fxml");
            Main.mainStage.getScene().setRoot(cart);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}