package com.victor.crudcolab.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.victor.crudcolab.domain.Colaborador;
import com.victor.crudcolab.repositories.ColaboradorRepository;
import com.victor.crudcolab.services.exceptions.DatabaseException;
import com.victor.crudcolab.services.exceptions.ResourceNotFoundException;

@Service
public class ColaboradorService {

	@Autowired
	private ColaboradorRepository repository;

	public List<Colaborador> findAll() {
		return repository.findAll();
	}

	public Colaborador findById(Long id) {
		Optional<Colaborador> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Colaborador insert(Colaborador obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	@SuppressWarnings("deprecation")
	public Colaborador update(Long id, Colaborador obj) {
		try {
			Colaborador entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(Colaborador entity, Colaborador obj) {
		entity.setNome(obj.getNome());
		entity.setSobrenome(obj.getSobrenome());
		entity.setCargo(obj.getCargo());
		entity.setEndereco(obj.getEndereco());
		entity.setDataDeNascimento(obj.getDataDeNascimento());
	}
}