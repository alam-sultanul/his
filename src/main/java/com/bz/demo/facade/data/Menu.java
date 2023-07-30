package com.bz.demo.facade.data;

import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Menu {
    private Long menuId;
    private String menuName;
    private List<SubMenu> subMenus;

    public String getUrlFriendlyName() {
        return "menu-group-" + menuId;
    }

    public boolean hasSubMenu() {
        return subMenus != null && !subMenus.isEmpty();
    }
}
