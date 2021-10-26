package dad.escenario1.ver;

public class VerController {

    private VerModel model = new VerModel();
    private VerView view = new VerView();

    public VerController() {
        
        view.getProgressBar().progressProperty().bind(model.valorProperty().divide(100.0));

        view.getProgressLabel().textProperty().bind(model.valorProperty().asString());
    }

    public VerModel getModel() {
        return model;
    }

    public VerView getView() {
        return view;
    }
}
