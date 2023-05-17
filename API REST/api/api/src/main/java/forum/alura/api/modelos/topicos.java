package forum.alura.api.modelos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

public class topicos implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha_creacion;
    private String estatus;
    private String autor;
    private String curso;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {

        return id;
    }
}
