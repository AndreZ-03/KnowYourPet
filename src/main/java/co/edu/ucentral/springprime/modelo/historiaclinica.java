package co.edu.ucentral.springprime.modelo;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class historiaclinica {
    private String nombreMascota;
    private Date fecha_historia;
    private String observacion;

}
