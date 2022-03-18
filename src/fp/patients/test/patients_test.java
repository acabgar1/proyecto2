package fp.patients.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import fp.patients.patients;

//test de patients
public class patients_test {
    public static void main(String[] args) {

        patients p1 = new patients(1,"Alonzo","Peru","2 Carioca Hill","f",27,LocalDate.of(2020, 3, 1),LocalDate.of(2021, 3, 1),1,true,40.5,4,7);
        patients p2 = new patients(1,"Alonzo","Peru","2 Carioca Hill","f",27,LocalDate.of(2020, 3, 1),LocalDate.of(2021, 3, 1),1,true,40.5,4,7);
        patients p3 = new patients(2,"Karrah","Indonesia","46563 Chive Place","m",85,LocalDate.of(2020, 4, 28),LocalDate.of(2020, 9, 22),2,true,41.5,12,12);

        //crea unalista vacia y añade tres elementos
        List<patients> patient =new ArrayList<patients>();
        patient.add(p3);
        patient.add(p2);
        patient.add(p3);
            
        //pruebas de las funciones
        System.out.println("rango de edad: "+p1.getRango_edad()+" , del paciente de "+p1.age()+" años");
        System.out.println();
        System.out.println("tiempo hospitalizado "+p1.periodo()+" dias");
        System.out.println();
        System.out.println("tostring: "+p1.toString());
        System.out.println();
        System.out.println("es igual p1 que p2: "+p1.equals(p2));
        System.out.println();
        System.out.println("es igual p1 que p3: "+p1.equals(p3));
        System.out.println();
        System.out.println("es igual p1 que p3: "+p1.compareTo(p2));
        System.out.println();
        System.out.println("la lista es:  "+patient);
        System.out.println();
        //ordena la lista segun el metodo compareTo
        Collections.sort(patient);
        System.out.println("la lista ordenada es:  "+patient);
    }
}