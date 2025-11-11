package SNAKE_PC.demo.service.pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SNAKE_PC.demo.model.pedido.Pedido;
import SNAKE_PC.demo.repository.pedido.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> getPedidosByUsuarioId(Long usuarioId) {
        if (usuarioId == null || usuarioId <= 0) {
            throw new IllegalArgumentException("ID de usuario inválido.");
        }
        return pedidoRepository.findByUsuarioIdOrderByFechaDesc(usuarioId);
    }

    public Pedido savePedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("El pedido no puede ser nulo.");
        }
        if (pedido.getUsuario() == null) {
            throw new IllegalArgumentException("El pedido debe tener un usuario asociado.");
        }
        // Aquí podrías validar otros campos importantes, ejemplo: total, lista de
        // productos, fecha, etc.
        return pedidoRepository.save(pedido);
    }

    public void deletePedido(Long pedidoId) {
        if (!pedidoRepository.existsById(pedidoId)) {
            throw new IllegalArgumentException("El pedido no existe.");
        }
        pedidoRepository.deleteById(pedidoId);
    }

    public Pedido getPedidoById(Long pedidoId) {
        return pedidoRepository.findById(pedidoId)
                .orElseThrow(() -> new IllegalArgumentException("No se encontró el pedido con ID: " + pedidoId));
    }

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }
}
