package com.bz.demo.service.impl;

import com.bz.demo.exception.NotFoundException;
import com.bz.demo.repository.MenuGroupRepository;
import com.bz.demo.model.security.MenuGroup;
import com.bz.demo.service.MenuGroupService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class MenuGroupServiceImpl implements MenuGroupService {


    @NonNull
    private final MenuGroupRepository menuGroupRepository;

    @Override
    public Page<MenuGroup> findAllMenuGroups(Pageable pageable) {
        return menuGroupRepository.findAllMenuGroups(pageable);
    }

    @Override
    public MenuGroup saveMenuGroup(MenuGroup menuGroup) {
        return menuGroupRepository.save(menuGroup);
    }

    @Override
    public Optional<MenuGroup> findMenuGroupById(Long id) {
        return menuGroupRepository.findById(id);
    }

    @Override
    public MenuGroup getMenuGroup(Long id) {
        return findMenuGroupById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public List<Long> getAllSequences() {
        return menuGroupRepository.findAllSequence();
    }

    @Override
    public boolean isSequenceNoExists(Long sequenceNo) {
        return menuGroupRepository.countBySequenceNo(sequenceNo)>0;
    }
}
