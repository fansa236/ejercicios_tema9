//  Ejercicio del tema 9: tarea para practicar la herencia.

public class Tarea_tema9 {

    public static void main(String[] args) {
        
        //  Creación del objeto cliente

        Cliente cliente = new Cliente();
        
        //  Creación del objeto trabajador

        Trabajador trabajador = new Trabajador();

        /*
        Objetos (instancias) de la clase Cliente con las
        propiedades edad, télefono, nombre y crédito.

        cliente.edad
        cliente.telefono
        cliente.nombre

        cliente.credito
        
        Objeto (instancia) de la clase Trabajador con la
        propiedad salario.

        trabajador.salario
        */

        //  Establecer los valores a las variables utilizando Sets

        cliente.setEdad(50);
        cliente.setNombre("Fernando");
        cliente.setTelefono("+584246262323");

        cliente.setCredito(120000.12);
        
        trabajador.setSalario((float) 40000.12);

        //  Obtener los valores de las variables utilizando Gets
        
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());

        System.out.println(cliente.getCredito());

        System.out.println(trabajador.getSalario());

    }
}

//  Creación de la clase Persona

class Persona {

    //  Declaración de las propiedades (variables) de la clase

    int edad;
    String nombre;
    String telefono;

    //  Sets y Gets de la variables edad, nombre y teléfono

    public void setEdad(int valor) {
        this.edad = valor;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String valor) {
        this.nombre = valor;
    }

    public String getNombre() {
        return this.nombre;
    }
  
    public void setTelefono(String valor) {
        this.telefono = valor;
    }

    public String getTelefono() {
        return this.telefono;
    }

}

//  Creación de la clase Cliente que hereda de Persona

class Cliente extends Persona {

    Double credito;

    //  Setter y Getter de la variable credito

    public void setCredito(Double valor) {
        this.credito = valor;
    }

    public Double getCredito() {
        return this.credito;
    }

}

//  Creación de la clase Trabajador que hereda de Persona

class Trabajador extends Persona {

    Float salario;

    //  Setter y Getter de la variable salario

    public void setSalario(Float valor) {
        this.salario = valor;
    }

    public Float getSalario() {
        return this.salario;
    }

}


