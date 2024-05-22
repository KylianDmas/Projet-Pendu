import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TitledPane;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar.ButtonData ;
import javafx.scene.control.ButtonType ;
import java.util.List;
import java.util.Arrays;
import java.io.File;
import java.util.ArrayList;

public class PageAcceuil extends VBox{
    Pendu appli;
    MotMystere modelePendu;

    public PageAcceuil(Pendu app){
        this.appli = app;
        start();
    }

    public void start(){
        /**
        HBox h = new HBox();
        Button b1 = new Button("", new ImageView("file:../img/home.png"));
        Button b2 = new Button("", new ImageView("file:../img/para.png"));
        Button b3 = new Button("", new ImageView("file:../img/info.png"));
        b1.setOnAction(null);
        b2.setOnAction(null);
        b3.setOnAction(null);
        h.getChildren().addAll(new Label("Jeu du Pendu"), b1, b2, b3);
        */

        Button button1 = new Button("Lancer une partie");
        button1.setOnAction(new ControleurLancerPartie(modelePendu, appli));
        this.getChildren().add(button1);
    }
}
