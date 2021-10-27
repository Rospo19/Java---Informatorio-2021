package ejercicios.complementarios.parte2;

import java.util.*;

public class ejercicio6 {
    public static void main(String[] args){
        HashSet<Employee> empleado = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleado.add(new Employee("Omar Gonzales", 52789365, 8, 500));
        empleado.add(new Employee("Gabriela Stacul", 41687368, 6, 400));
        empleado.add(new Employee("Francisco Chas", 14537816, 4, 750));
        empleado.add(new Employee("Jorge Villa", 85645210, 7, 985));
        empleado.add(new Employee("Sergio Batista", 328546310, 5, 220));

        System.out.println("Calculo del salario de los empleados");

        for (Employee lista : empleado) {
            System.out.println(lista.nombre + " - DNI " + lista.dni + " - Horas de trabajo: " + lista.horasTrabajadas + " - Valor por hora: " + lista.valorPorHora);
        }

        for (Employee crearUnaTabla : empleado) {
            salario.put(crearUnaTabla.clave(), crearUnaTabla.valor());
        }
        System.out.println("\nSalario percibido:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Salario: " + valor));
    }
}
class Employee {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;


    public Employee(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return this.horasTrabajadas * this.valorPorHora;
    }
    {
    }
}