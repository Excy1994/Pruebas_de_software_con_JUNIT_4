package com.obregon;

public class Empleado {

    public String nombres;
    public String apellidos;
    public String cedula;
    public String tipo_empleado;
    public float horas_extras;
    public float ventasM;

    float salario_base = 0;
    float salario_base1 = 0;
    float salario_bruto = 0;
    float salario_neto = 0;
    float salar_h = 0;
    float retencion = 0;


    float CalcularSalarioBruto(String tipo_empleado, float ventasM, float horas_extras) throws EmpleadoValidateException {



        if (tipo_empleado == "vendedor") {
            //System.out.println(tipo_empleado);
            salario_base = 1000;
            return ventas(ventasM, salario_base, horas_extras);
        } else if (tipo_empleado == "encargado") {
            salario_base = 1500;
            System.out.println();
            return ventas(ventasM, salario_base, horas_extras);
        }

        return 0;
    }

    float ventas(float vM, float sb,float he){
        if(vM >= 1000 && vM <=1499){
            salario_base1 = sb + 100;
            salar_h = he * 20;
            salario_bruto = salario_base1 + salar_h;
        }
        if(vM >= 1500){
            salario_base1 = sb + 200;
            salar_h = he * 20;
            salario_bruto = salario_base1 + salar_h;
        }
        return salario_bruto;
    }

    float calculaSalarioNeto(float salario_bruto){

        if(salario_bruto < 0 ){
            throw new RuntimeException("El salario es menor de 0");
        }

        if(salario_bruto < 1000){
            salario_neto = salario_bruto;
        }
        else if (salario_bruto >= 1000 && salario_bruto<1500){
            retencion = (salario_bruto * 16) / 100;
            salario_neto = salario_bruto - retencion;
        }
        else if (salario_bruto >= 1500){
            retencion = (salario_bruto * 18) / 100;
            salario_neto = salario_bruto - retencion;
        }

        return salario_neto;
    }

}
