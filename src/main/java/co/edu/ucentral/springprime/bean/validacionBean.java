package co.edu.ucentral.springprime.bean;

import co.edu.ucentral.springprime.dao.UsuarioOperaciones;
import co.edu.ucentral.springprime.modelo.usuario;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@Component
@ManagedBean
@ViewScoped
@Getter
@Setter
public class validacionBean {

    public String conectarse() {

        UsuarioOperaciones usuoper = new UsuarioOperaciones();
        usuario usu = new usuario();
        usu.setUsuario("Andres");
        usu.setContraseña("1234");
        if (usuoper.guardar(usu)) {
            System.out.println("Inserto");
        } else {
            System.out.println("No Inserto");
        }
        return "";

    }

}
