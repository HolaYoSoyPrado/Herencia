/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author Usuario
 */
public class UsarAlumno {
    public static void main(String[]args){
        Alumno a=new Alumno("318363952","ICO",2, "Leonardo Prado",20,1,1.75f);
        System.out.println("Nombre:" + a.getNombre());
        System.out.println("Edad:" + a.getEdad()); 
        System.out.println("Altura:" + a.getAltura());
        System.out.println("Numero de Cuenta:" + a.getNumeroCuenta());
        System.out.println("Carrera:" + a.getCarrera());
        System.out.println("Semestre:" + a.getSemestre());
        
    }
    
}
