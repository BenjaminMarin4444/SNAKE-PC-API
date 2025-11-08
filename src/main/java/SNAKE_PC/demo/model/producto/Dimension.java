package SNAKE_PC.demo.model.producto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dimension")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Dimension {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Largo", nullable = false)
    private String largo;

    @Column(name = "Ancho", nullable = false)
    private String ancho;

    @Column(name = "Alto", nullable = false)
    private String alto;    



}
