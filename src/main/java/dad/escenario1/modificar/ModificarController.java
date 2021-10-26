package dad.escenario1.modificar;

import javafx.event.ActionEvent;
import javafx.util.converter.NumberStringConverter;

public class ModificarController {
    
    private ModificarModel model = new ModificarModel();
    private ModificarView view = new ModificarView();

    public ModificarController(){

        view.getValorText().textProperty().bindBidirectional(model.entradaProperty(),new NumberStringConverter());

        view.getEstablecerButton().setOnAction(e -> onEstablecerAction(e));

        view.getDecrementarButton().setOnAction(e -> onDecrementarAction(e));

        view.getIncremenatrButton().setOnAction(e -> onIncrementarAction(e));
    }

    public ModificarModel getModel(){
        return model;
    }
    public ModificarView getView(){
        return view;
    }
    //Lógica de negocio (listeners): siemprea actúa sobre elementos del modelo

    private void onIncrementarAction(ActionEvent e) {
       model.setValor(model.getValor() + 1);

    }

    private void onDecrementarAction(ActionEvent e) {
        model.setValor(model.getValor() - 1);
    }

    private void onEstablecerAction(ActionEvent e) {
        model.setValor(model.getEntrada());
    }
}
