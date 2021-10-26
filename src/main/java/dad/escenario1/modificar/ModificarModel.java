package dad.escenario1.modificar;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class ModificarModel {

    private IntegerProperty entrada = new SimpleIntegerProperty();
    private IntegerProperty valor = new SimpleIntegerProperty();

    public final IntegerProperty valorProperty() {
		return this.valor;
	}

	public final int getValor() {
		return this.valorProperty().get();
	}

	public final void setValor(final int valor) {
		this.valorProperty().set(valor);
	}

	public final IntegerProperty entradaProperty() {
		return this.entrada;
	}

	public final int getEntrada() {
		return this.entradaProperty().get();
	}

	public final void setEntrada(final int entrada) {
		this.entradaProperty().set(entrada);
	}

}