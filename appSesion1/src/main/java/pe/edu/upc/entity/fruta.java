package pe.edu.upc.entity;

public class fruta {
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

public fruta(String nombre, String color, String sabor) {
		super();//Accede al constructor de la clase Object
		this.nombre = nombre;
		this.color = color;
		this.sabor = sabor;
	}

@Override //Con esta linea se esta heredando de la clase object
public String toString() {
	return "fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + "]";
}

//Atributos de instancia
private String nombre;
private String color;
private String sabor;

	//Atributos de clase
public static String LugarOrigen="UPC";
}
