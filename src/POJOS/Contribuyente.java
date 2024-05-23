package POJOS;
// Generated 23 may. 2024 22:57:30 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Contribuyente generated by hbm2java
 */
public class Contribuyente  implements java.io.Serializable {


     private int idContribuyente;
     private String nombre;
     private String apellido1;
     private String apellido2;
     private String nifnie;
     private String direccion;
     private String numero;
     private String paisCcc;
     private String ccc;
     private String iban;
     private String eemail;
     private String exencion;
     private Double bonificacion;
     private Date fechaAlta;
     private Date fechaBaja;
     private Set reciboses = new HashSet(0);
     private Set lecturases = new HashSet(0);
     private Set relContribuyenteOrdenanzas = new HashSet(0);

    public Contribuyente() {
    }

	
    public Contribuyente(int idContribuyente) {
        this.idContribuyente = idContribuyente;
    }
    public Contribuyente(int idContribuyente, String nombre, String apellido1, String apellido2, String nifnie, String direccion, String numero, String paisCcc, String ccc, String iban, String eemail, String exencion, Double bonificacion, Date fechaAlta, Date fechaBaja, Set reciboses, Set lecturases, Set relContribuyenteOrdenanzas) {
       this.idContribuyente = idContribuyente;
       this.nombre = nombre;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
       this.nifnie = nifnie;
       this.direccion = direccion;
       this.numero = numero;
       this.paisCcc = paisCcc;
       this.ccc = ccc;
       this.iban = iban;
       this.eemail = eemail;
       this.exencion = exencion;
       this.bonificacion = bonificacion;
       this.fechaAlta = fechaAlta;
       this.fechaBaja = fechaBaja;
       this.reciboses = reciboses;
       this.lecturases = lecturases;
       this.relContribuyenteOrdenanzas = relContribuyenteOrdenanzas;
    }
   
    public int getIdContribuyente() {
        return this.idContribuyente;
    }
    
    public void setIdContribuyente(int idContribuyente) {
        this.idContribuyente = idContribuyente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return this.apellido1;
    }
    
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return this.apellido2;
    }
    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getNifnie() {
        return this.nifnie;
    }
    
    public void setNifnie(String nifnie) {
        this.nifnie = nifnie;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getPaisCcc() {
        return this.paisCcc;
    }
    
    public void setPaisCcc(String paisCcc) {
        this.paisCcc = paisCcc;
    }
    public String getCcc() {
        return this.ccc;
    }
    
    public void setCcc(String ccc) {
        this.ccc = ccc;
    }
    public String getIban() {
        return this.iban;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getEemail() {
        return this.eemail;
    }
    
    public void setEemail(String eemail) {
        this.eemail = eemail;
    }
    public String getExencion() {
        return this.exencion;
    }
    
    public void setExencion(String exencion) {
        this.exencion = exencion;
    }
    public Double getBonificacion() {
        return this.bonificacion;
    }
    
    public void setBonificacion(Double bonificacion) {
        this.bonificacion = bonificacion;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public Date getFechaBaja() {
        return this.fechaBaja;
    }
    
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    public Set getReciboses() {
        return this.reciboses;
    }
    
    public void setReciboses(Set reciboses) {
        this.reciboses = reciboses;
    }
    public Set getLecturases() {
        return this.lecturases;
    }
    
    public void setLecturases(Set lecturases) {
        this.lecturases = lecturases;
    }
    public Set getRelContribuyenteOrdenanzas() {
        return this.relContribuyenteOrdenanzas;
    }
    
    public void setRelContribuyenteOrdenanzas(Set relContribuyenteOrdenanzas) {
        this.relContribuyenteOrdenanzas = relContribuyenteOrdenanzas;
    }




}


