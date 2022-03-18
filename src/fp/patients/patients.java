package fp.patients;

import  java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import fp.common.rango_edad;
import fp.utiles.Checkers;

//implementa el record con los tipos del csv
public record patients(Integer id,String first_name,String pais_nacimiento,String residencia,String sex,Integer age,LocalDate arrival_date,LocalDate recovery_date,Integer status,Boolean need_ICU,Double maximum_temperature,Integer daily_medications,Integer daily_medical_examinations 
) implements Comparable<patients>{

//propiedad derivada que devuelve un enum
public rango_edad getRango_edad() {
    Integer e = this.age;
    rango_edad Rango_edad= rango_edad.ANCIANO;
    if (e<=15) {
        Rango_edad=rango_edad.NIÑO;} 
    else if (e<=30){
        Rango_edad=rango_edad.JOVEN;}
         else if(e<=70){
            Rango_edad=rango_edad.ADULTO;}
       return Rango_edad; 
    }

//propiedad derivada que devuelve el tiempo pasado en el hospital en dias
public Long periodo() {
     Long periodo = arrival_date.until(recovery_date, ChronoUnit.DAYS);
    return periodo;
}


//implementa el compareTo comparando las id de los pacientes
@Override
public int compareTo(patients comparador) {
return this.id.compareTo(comparador.id);
}
//implementa los Checkers
public patients {
Checkers.check("La edad del paciente sea mayor de 0 años " + age,
age.compareTo(age) >= 0 );
Checkers.check("La fecha de entrada debe ser el año 2020", 
arrival_date.getYear()==2020);
}

//implementa el hashCode
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((age == null) ? 0 : age.hashCode());
    result = prime * result + ((arrival_date == null) ? 0 : arrival_date.hashCode());
    result = prime * result + ((daily_medical_examinations == null) ? 0 : daily_medical_examinations.hashCode());
    result = prime * result + ((daily_medications == null) ? 0 : daily_medications.hashCode());
    result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((maximum_temperature == null) ? 0 : maximum_temperature.hashCode());
    result = prime * result + ((need_ICU == null) ? 0 : need_ICU.hashCode());
    result = prime * result + ((pais_nacimiento == null) ? 0 : pais_nacimiento.hashCode());
    result = prime * result + ((recovery_date == null) ? 0 : recovery_date.hashCode());
    result = prime * result + ((residencia == null) ? 0 : residencia.hashCode());
    result = prime * result + ((sex == null) ? 0 : sex.hashCode());
    result = prime * result + ((status == null) ? 0 : status.hashCode());
    return result;
}
//implementa el equals
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    patients other = (patients) obj;
    if (age == null) {
        if (other.age != null)
            return false;
    } else if (!age.equals(other.age))
        return false;
    if (arrival_date == null) {
        if (other.arrival_date != null)
            return false;
    } else if (!arrival_date.equals(other.arrival_date))
        return false;
    if (daily_medical_examinations == null) {
        if (other.daily_medical_examinations != null)
            return false;
    } else if (!daily_medical_examinations.equals(other.daily_medical_examinations))
        return false;
    if (daily_medications == null) {
        if (other.daily_medications != null)
            return false;
    } else if (!daily_medications.equals(other.daily_medications))
        return false;
    if (first_name == null) {
        if (other.first_name != null)
            return false;
    } else if (!first_name.equals(other.first_name))
        return false;
    if (id == null) {
        if (other.id != null)
            return false;
    } else if (!id.equals(other.id))
        return false;
    if (maximum_temperature == null) {
        if (other.maximum_temperature != null)
            return false;
    } else if (!maximum_temperature.equals(other.maximum_temperature))
        return false;
    if (need_ICU == null) {
        if (other.need_ICU != null)
            return false;
    } else if (!need_ICU.equals(other.need_ICU))
        return false;
    if (pais_nacimiento == null) {
        if (other.pais_nacimiento != null)
            return false;
    } else if (!pais_nacimiento.equals(other.pais_nacimiento))
        return false;
    if (recovery_date == null) {
        if (other.recovery_date != null)
            return false;
    } else if (!recovery_date.equals(other.recovery_date))
        return false;
    if (residencia == null) {
        if (other.residencia != null)
            return false;
    } else if (!residencia.equals(other.residencia))
        return false;
    if (sex == null) {
        if (other.sex != null)
            return false;
    } else if (!sex.equals(other.sex))
        return false;
    if (status == null) {
        if (other.status != null)
            return false;
    } else if (!status.equals(other.status))
        return false;
    return true;
}
//implementa el toString
@Override
public String toString() {
    return "Jugador [id=" + id + ", first_name=" + first_name + ", pais_nacimiento=" + pais_nacimiento
            + ", residencia=" + residencia + ", sex=" + sex + ", age=" + age + ", arrival_date=" + arrival_date + ", recovery_date=" + recovery_date +
             ", status=" + status + ", need_ICU=" + need_ICU + ", maximum_temperature=" + maximum_temperature + ", daily_medications=" + daily_medications + 
             ", daily_medical_examinations=" + daily_medical_examinations + "]";
}
}
