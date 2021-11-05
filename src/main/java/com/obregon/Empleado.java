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

        //System.out.println("Estamos en funcion de calcular");

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

    }

}