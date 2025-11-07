package SNAKE_PC.demo.model;

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
@Table(name = "pago")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pago {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "monto", nullable = false)
    private Double monto;

    @Column(name = "fecha_pago", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd") 
    private String fechaPago;

    @ManyToOne
    @JoinColumn(name = "id_metodo_pago", nullable = false)
    private MetodoPago metodoPago;

    @ManyToOne
    @JoinColumn(name = "id_pedido", nullable = false)
    private Pedido pedido;

}
