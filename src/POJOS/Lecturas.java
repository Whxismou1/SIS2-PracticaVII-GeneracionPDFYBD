package POJOS;
// Generated 24 may. 2024 23:15:23 by Hibernate Tools 4.3.1



/**
 * Lecturas generated by hbm2java
 */
public class Lecturas  implements java.io.Serializable {


     private Integer id;
     private Contribuyente contribuyente;
     private String ejercicio;
     private String periodo;
     private Integer lecturaAnterior;
     private Integer lecturaActual;

    public Lecturas() {
    }

    public Lecturas(Contribuyente contribuyente, String ejercicio, String periodo, Integer lecturaAnterior, Integer lecturaActual) {
       this.contribuyente = contribuyente;
       this.ejercicio = ejercicio;
       this.periodo = periodo;
       this.lecturaAnterior = lecturaAnterior;
       this.lecturaActual = lecturaActual;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Contribuyente getContribuyente() {
        return this.contribuyente;
    }
    
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    public String getEjercicio() {
        return this.ejercicio;
    }
    
    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }
    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public Integer getLecturaAnterior() {
        return this.lecturaAnterior;
    }
    
    public void setLecturaAnterior(Integer lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }
    public Integer getLecturaActual() {
        return this.lecturaActual;
    }
    
    public void setLecturaActual(Integer lecturaActual) {
        this.lecturaActual = lecturaActual;
    }




}


