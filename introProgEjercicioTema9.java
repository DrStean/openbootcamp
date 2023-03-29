
/*
 * Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */

 public class Persona {
    protected int edad;
    protected String nombre;
    protected String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}

public class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }
}

public class Trabajador extends Persona {
    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
}

//Objeto cliente
Cliente cliente1 = new Cliente(41, "Rene", "123-456-67899", 100);
System.out.println("Edad: " + cliente1.edad);
System.out.println("Nombre: " + cliente1.nombre);
System.out.println("Teléfono: " + cliente1.telefono);
System.out.println("Crédito: " + cliente1.credito);

//Objeto trabajador
Trabajador trabajador1 = new Trabajador(25, "Juan", "213-555-55555", 300);
System.out.println("Edad: " + trabajador1.edad);
System.out.println("Nombre: " + trabajador1.nombre);
System.out.println("Teléfono: " + trabajador1.telefono);
System.out.println("Salario: " + trabajador1.salario);