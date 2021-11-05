package com.obregon;

public class EmpleadoValidateException extends Exception {
    private int CodigoError;

    public EmpleadoValidateException(int codigoError){
        super();
        this.CodigoError = codigoError;
    }

    @Override
    public String getMessage(){
        String mensaje = "";

        switch (CodigoError){
            case 245:
                mensaje = "El campo de tipo de vendedor no existe";
                break;
        }
        return mensaje;
    }

}

