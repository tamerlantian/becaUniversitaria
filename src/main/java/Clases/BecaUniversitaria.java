package Clases;
/**
 *
 * @author sebastian
 */
public class BecaUniversitaria {
    double pMonto;
    double pInteres;
    int pTiempo; 

    public BecaUniversitaria() {
        this.pMonto = 0;
        this.pInteres = 0;
        this.pTiempo = 0;
    } 
    

    public BecaUniversitaria(double pMonto, double pInteres, int pTiempo) {
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;
    }
    
    
    
    public String compararInversion(int pTiempo, double pMonto, double pInteres){
        this.pTiempo= pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        
        double diferencia;
        diferencia = calcularInteresCompuesto() - calcularInteresSimple(); 
        diferencia = Math.round(diferencia);
        
        if (diferencia == 0) {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    
    }
    
    public String compararInversion(){
        double diferencia;
        diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        diferencia = Math.round(diferencia);
        
        if (diferencia == 0) {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    }
    
    public double calcularInteresSimple(){
        double interesSimple;
        interesSimple = this.pMonto * (this.pInteres / 100) * this.pTiempo;
        return Math.round(interesSimple);
    }
    
    public double calcularInteresCompuesto(){
        double interesCompuesto;
        interesCompuesto = this.pMonto * (Math.pow((1 + this.pInteres / 100), this.pTiempo) - 1);
    
        return Math.round(interesCompuesto);
    }    
    
}
