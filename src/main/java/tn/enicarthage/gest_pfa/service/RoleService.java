package tn.enicarthage.gest_pfa.service;

import tn.enicarthage.gest_pfa.model.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);

    List<Role> findAll();
}
