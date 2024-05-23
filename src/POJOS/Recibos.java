package POJOS;
// Generated 8 abr. 2024 16:20:08 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Recibos generated by hbm2java
 */
public class Recibos  implements java.io.Serializable {


     private Integer numeroRecibo;
     private Contribuyente contribuyente;
     private String nifContribuyente;
     private String direccionCompleta;
     private String nombre;
     private String apellidos;
     private Date fechaRecibo;
     private Integer lecturaAnterior;
     private Integer lecturaActual;
     private Integer consumom3;
     private Date fechaPadron;
     private Double totalBaseImponible;
     private Double totalIva;
     private Double totalRecibo;
     private String iban;
     private String email;
     private String exencion;
     private Set lineasrecibos = new HashSet(0);

    public Recibos() {
    }

    public Recibos(Contribuyente contribuyente, String nifContribuyente, String direccionCompleta, String nombre, String apellidos, Date fechaRecibo, Integer lecturaAnterior, Integer lecturaActual, Integer consumom3, Date fechaPadron, Double totalBaseImponible, Double totalIva, Double totalRecibo, String iban, String email, String exencion, Set lineasrecibos) {
       this.contribuyente = contribuyente;
       this.nifContribuyente = nifContribuyente;
       this.direccionCompleta = direccionCompleta;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.fechaRecibo = fechaRecibo;
       this.lecturaAnterior = lecturaAnterior;
       this.lecturaActual = lecturaActual;
       this.consumom3 = consumom3;
       this.fechaPadron = fechaPadron;
       this.totalBaseImponible = totalBaseImponible;
       this.totalIva = totalIva;
       this.totalRecibo = totalRecibo;
       this.iban = iban;
       this.email = email;
       this.exencion = exencion;
       this.lineasrecibos = lineasrecibos;
    }
   
    public Integer getNumeroRecibo() {
        return this.numeroRecibo;
    }
    
    public void setNumeroRecibo(Integer numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }
    public Contribuyente getContribuyente() {
        return this.contribuyente;
    }
    
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    public String getNifContribuyente() {
        return this.nifContribuyente;
    }
    
    public void setNifContribuyente(String nifContribuyente) {
        this.nifContribuyente = nifContribuyente;
    }
    public String getDireccionCompleta() {
        return this.direccionCompleta;
    }
    
    public void setDireccionCompleta(String direccionCompleta) {
        this.direccionCompleta = direccionCompleta;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Date getFechaRecibo() {
        return this.fechaRecibo;
    }
    
    public void setFechaRecibo(Date fechaRecibo) {
        this.fechaRecibo = fechaRecibo;
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
    public Integer getConsumom3() {
        return this.consumom3;
    }
    
    public void setConsumom3(Integer consumom3) {
        this.consumom3 = consumom3;
    }
    public Date getFechaPadron() {
        return this.fechaPadron;
    }
    
    public void setFechaPadron(Date fechaPadron) {
        this.fechaPadron = fechaPadron;
    }
    public Double getTotalBaseImponible() {
        return this.totalBaseImponible;
    }
    
    public void setTotalBaseImponible(Double totalBaseImponible) {
        this.totalBaseImponible = totalBaseImponible;
    }
    public Double getTotalIva() {
        return this.totalIva;
    }
    
    public void setTotalIva(Double totalIva) {
        this.totalIva = totalIva;
    }
    public Double getTotalRecibo() {
        return this.totalRecibo;
    }
    
    public void setTotalRecibo(Double totalRecibo) {
        this.totalRecibo = totalRecibo;
    }
    public String getIban() {
        return this.iban;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getExencion() {
        return this.exencion;
    }
    
    public void setExencion(String exencion) {
        this.exencion = exencion;
    }
    public Set getLineasrecibos() {
        return this.lineasrecibos;
    }
    
    public void setLineasrecibos(Set lineasrecibos) {
        this.lineasrecibos = lineasrecibos;
    }




}


