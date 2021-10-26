package dad.escenario1.ver;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VerView extends VBox {
    
    private ProgressBar progressBar;
    private Label progressLabel;

    public VerView(){
        super();

        progressBar = new ProgressBar();

        progressLabel = new Label();

        HBox progressBox = new HBox(5,new Label("Valor actual: "),progressLabel);

        setSpacing(5);
        setFillWidth(false);
        setAlignment(Pos.CENTER);
        getChildren().addAll(progressBar,progressBox);

    }

    public ProgressBar getProgressBar(){
        return progressBar;
    }
    public Label getProgressLabel(){
        return progressLabel;
    }
}
