package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {


   private VBox vBox;
   private MenuBar mnbPrincipal;
   private Menu menCompetencia1, menCompetencia2, menSalir;
   private MenuItem mitCalcu, mitSalir;
   private Scene escena;


    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        CrearMenu();

        primaryStage.setTitle("Proyecto de Clase TAP 2021");
        primaryStage.setScene(escena);
        primaryStage.setMaximized(true);
        primaryStage.show();
       // primaryStage.setScene(new Scene(hBox, 300, 200));
        //primaryStage.setScene(new Scene(vBox, 300, 200));


    }

      private void CrearMenu(){
    vBox = new VBox();
    mnbPrincipal = new MenuBar();
    menCompetencia1 = new Menu("Competencia 1");
    menCompetencia2 = new Menu("Competencia 2");
    menSalir = new Menu("Salir");
    mnbPrincipal.getMenus().addAll(menCompetencia1,menCompetencia2,menSalir);

    mitCalcu = new MenuItem("Calculadora");
    menCompetencia1.getItems().add(mitCalcu);

    mitSalir= new MenuItem("Salir");
    mitSalir.setOnAction(event -> System.exit(0));
    menSalir.getItems().add(mitSalir);

    vBox.getChildren().add(mnbPrincipal);
    escena = new Scene(vBox, 300,300);
    }

    public static void main(String[] args) {
        launch(args);
    }

}

