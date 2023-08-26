package pe.edu.tecsup.productosapi.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import pe.edu.tecsup.productosapi.entities.Producto;
import pe.edu.tecsup.productosapi.repositories.ProductoRepository;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}
	
	@Override
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe registro"));
	}
	
	@Override
	public void save(Producto producto) {
		// TODO Auto-generated method stub
		productoRepository.save(producto);
	}
	
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(id);
	}
}