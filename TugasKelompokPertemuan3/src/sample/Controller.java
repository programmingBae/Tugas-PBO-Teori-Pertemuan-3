package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public TableView<Student> tableStudent;
    @FXML
    private TableColumn<Student,String> columnNama;
    @FXML
    private TableColumn<Student,String> columnKAT;
    @FXML
    private TableColumn<Student,String> columnUTS;
    @FXML
    private TableColumn<Student,String> columnUAS;
    @FXML
    private TableColumn<Student,String> columnRataRata;

    private ObservableList<Student> students;

    private ObservableList<Double> nilaiKat;
    private ObservableList<Double> nilaiUts;
    private ObservableList<Double> nilaiUas;
    private ObservableList<Double> nilaiRata;


    public void submitData(ActionEvent actionEvent) throws IOException {
        Stage newStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("stage2.fxml"));
        Parent root = loader.load();
        Controller2 controller2 = loader.getController();
        controller2.setController(this);


        Scene newScene = new Scene(root);
        newStage.setScene(newScene);
        newStage.setTitle("Form Data");
        newStage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        students = FXCollections.observableArrayList();
        nilaiKat = FXCollections.observableArrayList();
        nilaiUts = FXCollections.observableArrayList();
        nilaiUas = FXCollections.observableArrayList();
        nilaiRata = FXCollections.observableArrayList();
        tableStudent.setItems(students);
        columnNama.setCellValueFactory(data->  new SimpleStringProperty(String.valueOf(data.getValue().getNama())));
        columnKAT.setCellValueFactory(data->  new SimpleStringProperty(String.valueOf(data.getValue().getKat())));
        columnUAS.setCellValueFactory(data->  new SimpleStringProperty(String.valueOf(data.getValue().getUas())));
        columnUTS.setCellValueFactory(data->  new SimpleStringProperty(String.valueOf(data.getValue().getUts())));
        columnRataRata.setCellValueFactory(data->  new SimpleStringProperty(String.valueOf(data.getValue().getNilaiRataRata())));

    }

    public ObservableList<Student> getStudents() {
        return students;
    }
}
