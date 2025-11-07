package SNAKE_PC.demo.model;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pedido")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_pedido", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaPedido;

    @Column(name = "estado", nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_contacto", nullable = false)
    private Contacto contacto;

    
}
