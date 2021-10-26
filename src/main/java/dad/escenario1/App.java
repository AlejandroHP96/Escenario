package dad.escenario1;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import dad.escenario1.modificar.ModificarController;
import dad.escenario1.ver.VerController;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

public class App extends Application {

    private static final File fichero = new File("valor.txt");

    //model

    private ModificarController modificarController;
    private VerController verController;
    private IntegerProperty valor = new SimpleIntegerProperty();
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        modificarController = new ModificarController();

        // Scene modificarScene = new Scene(modificarController.getView(),320,200);

        // Stage modificarStage = new Stage();
        // modificarStage.setTitle("Modificar");
        // modificarStage.setScene(modificarScene);
        // modificarStage.show();

        //ver

        verController = new VerController();

        // Scene verScene = new Scene(verController.getView(),320,200);

        // Stage verStage = new Stage();
        // verStage.setTitle("Ver");
        // verStage.setScene(verScene);
        // verStage.show();

        //primary Stage

        SplitPane root = new SplitPane();
        root.getItems().addAll(verController.getView(), modificarController.getView());
        root.setDividerPositions(0.5);

        Scene scene = new Scene(root,640,480);

        primaryStage.setTitle("Escenario1");
        primaryStage.setScene(scene);
        primaryStage.show();
        //bindings

        valor.bindBidirectional(modificarController.getModel().valorProperty());
        verController.getModel().valorProperty().bind(valor);

        //listeners

        modificarController.getModel().valorProperty().addListener((o,ov,nv) -> {
            System.out.println("antes valia " + ov + " y ahora valgo " + nv);
        });
        
    }

@Override
public void init() throws Exception {
    System.out.println("iniciando mi aplicacion");
    if (fichero.exists()) {
        String contenido = Files.readString(fichero.toPath(),StandardCharsets.UTF_8);
        int entero = Integer.parseInt(contenido);
        valor.set(entero);
    } else {
        valor.set(50);
    }
}
@Override
public void stop() throws Exception {
    System.out.println("cerrando mi aplicacion");

    Files.writeString(fichero.toPath(), valor.getValue().toString(), StandardCharsets.UTF_8);
}

    public static void main(String[] args) {
        launch(args);
    }
}
