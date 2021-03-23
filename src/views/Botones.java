package views;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Botones {

    public Button btn1, btn2, btn3;
    private HBox hBox;
    private VBox vBox;


    private void CrearUI() {
        btn1 = new Button(("Botón 1"));
        btn2 = new Button(("Botón 2"));
        btn3 = new Button(("Botón 3"));

        hBox = new HBox();
        vBox = new VBox();

        hBox.getChildren().addAll(btn1, btn2, btn3);
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(20, 20, 20, 20));

        vBox.getChildren().addAll(btn1, btn2, btn3);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20, 20, 20, 20));
    }

    }
