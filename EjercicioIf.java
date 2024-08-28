public class EjercicioIf {
    float salarioSinAjuste;
    float porcentajeAumento;
    float salarioConAjuste;
    public EjercicioIf(float salarioSinAjuste, float porcentajeAumento, float salarioConAjuste) {
        this.salarioSinAjuste = salarioSinAjuste;
        this.porcentajeAumento = porcentajeAumento;
        this.salarioConAjuste = salarioConAjuste;
    }
    public float calcularSalario(){
        if (salarioSinAjuste<1300606) {
            salarioConAjuste=salarioSinAjuste+(salarioSinAjuste*porcentajeAumento);
        } else {
            salarioConAjuste=salarioSinAjuste;
        }
        return salarioConAjuste;
    }
    
}
