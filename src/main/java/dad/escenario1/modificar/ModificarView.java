package dad.escenario1.modificar;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ModificarView extends VBox {

    private TextField valorText;
    private Button establecerButton;
    private Button incremenatrButton;
    private Button decrementarButton;

    public ModificarView() {
        super();

        valorText = new TextField();
        valorText.setPrefColumnCount(5);

        establecerButton = new Button("Establecer");

        incremenatrButton = new Button(">>");

        decrementarButton = new Button("<<");

        HBox valorBox = new HBox(5, new Label("Nuevo valor"), valorText);

        HBox botonesBox = new HBox(5, decrementarButton, incremenatrButton);

        setSpacing(5);
        setFillWidth(false);
        setAlignment(Pos.CENTER);
        getChildren().addAll(valorBox, establecerButton, botonesBox);
    }

    public TextField getValorText() {
        return valorText;
    }

    public Button getEstablecerButton() {
        return establecerButton;
    }

    public Button getIncremenatrButton() {
        return incremenatrButton;
    }

    public Button getDecrementarButton() {
        return decrementarButton;
    }

}
