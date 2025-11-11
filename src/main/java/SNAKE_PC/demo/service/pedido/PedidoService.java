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
        return pedidoRepository.findByUsuarioIdOrderByFechaDesc(usuarioId);
    }

    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public void deletePedido(Long pedidoId) {
        pedidoRepository.deleteById(pedidoId);
    }

    public Pedido getPedidoById(Long pedidoId) {
        return pedidoRepository.findById(pedidoId).orElse(null);
    }

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }
}
