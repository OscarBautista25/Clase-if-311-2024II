var salarioSinAjuste, porcentajeAumento, salarioConAjuste;

salarioSinAjuste=parseFloat(prompt("Ingrese su salario sin ajuste"));
porcentajeAumento= parseFloat(prompt("Ingrese el porcentaje a aumentar el salario"));
if (salarioSinAjuste<1300606) {
    salarioConAjuste = salarioSinAjuste+(salarioSinAjuste*porcentajeAumento);
} else {
    salarioConAjuste = salarioSinAjuste;
}

alert("Su salario con ajuste es " + salarioConAjuste)