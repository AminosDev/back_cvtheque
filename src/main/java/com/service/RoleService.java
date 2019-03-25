package com.service;

import java.util.List;
import java.util.Optional;

import com.models.Role;

public interface RoleService {
	void saveRole(Role role);
	boolean deleteRole(Long id);
	void updateRole(Role r);
	List<Role> getAllRoles();
	Optional<Role> getRole(Long id);
}
