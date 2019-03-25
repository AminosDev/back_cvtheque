package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repositories.RoleRepository;
import com.service.RoleService;
import com.models.Role;
@Service
public class RoleServiceImpl implements RoleService {

	
	@Autowired 
	private RoleRepository rr ;
	@Override
	public void saveRole(Role role) {
		// TODO Auto-generated method stub
		rr.save(role);
		
	}

	@Override
	public boolean deleteRole(Long id) {
		rr.deleteById(id);
		return true;
	}

	@Override
	public void updateRole(Role r) {
		rr.save(r);
		
	}

	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return rr.findAll();
	}

	@Override
	public Optional<com.models.Role> getRole(Long id) {
		// TODO Auto-generated method stub
		return rr.findById(id);
	}

}
