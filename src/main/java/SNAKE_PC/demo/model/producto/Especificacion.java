package SNAKE_PC.demo.model.producto;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "especificacion")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Especificacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "frecuencia", nullable = false)
    private String frecuencia;

    @Column(name = "capacidad", nullable = false)
    private String capacidadAlmacenamiento;

    @Column(name = "consumo", nullable = false)
    private String consumo;

    @OneToMany(mappedBy = "especificacion")
    private List<Producto> productos;
}
