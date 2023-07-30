package com.bz.demo.service;



import com.bz.demo.model.security.MenuItem;

import java.util.List;
import java.util.Optional;


public interface MenuItemService {
    MenuItem saveMenuItem(MenuItem menuItem);
    List<MenuItem> getMenuItemList(Long menuGroupId);
    List<Long>getAllSequences();
    void deleteMenuItem(Long id);
    Optional<MenuItem> findMenuItemById(Long id);
    MenuItem getMenuItem(Long id);
}
