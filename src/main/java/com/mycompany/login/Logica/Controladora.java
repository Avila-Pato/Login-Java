
package com.mycompany.login.Logica;

import com.mycompany.login.Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new  ControladoraPersistencia();
    
    public Controladora(){
        controlPersis = new ControladoraPersistencia();
    }

    public String validarUsuario(String usuario, String Contrasenia) {
            
        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario usu : listaUsuarios) {
            if(usu.getNombreUsuario().equals(usuario)) {
                if(usu.getContrasenia().equals(Contrasenia)){
                     mensaje = " Usuario y Contraseña Correctos Bienvenido/a";  
                }
                else {
                    mensaje = "contraña incorrecta";
                }
            }
            else {
                mensaje = "usuario no encontrado";
            }
        }
        return mensaje;
    }
}
