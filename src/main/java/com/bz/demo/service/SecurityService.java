package com.bz.demo.service;


import com.bz.demo.facade.data.Menu;
import com.bz.demo.model.security.MenuGroup;
import com.bz.demo.model.security.MenuItem;
import com.bz.demo.model.security.Privilege;
import com.bz.demo.model.security.Role;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface SecurityService {
    List<Privilege> savePrivileges(Role role, List<Long> selectedMenus);

    List<Privilege> findPrivileges(Role... roles);

    List<Menu> getMenus(Set<Role> roles);

    List<Menu> getMenus();

    List<Menu> getMenus(Role role);

    List<MenuGroup> findMenuGroups();

    List<MenuItem> findMenuItems();

    List<MenuItem> findMenuItems(MenuGroup menuGroup);

    Optional<MenuItem> findMenuItemById(Long id);
}
