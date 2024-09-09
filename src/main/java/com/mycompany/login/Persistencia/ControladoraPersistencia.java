
package com.mycompany.login.Persistencia;

import com.mycompany.login.Logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();   

    public List<Usuario> traerUsuarios() {
    
         List<Usuario>listaUusario = usuJpa.findUsuarioEntities();
         return listaUusario;
        
    }
    
    
}
