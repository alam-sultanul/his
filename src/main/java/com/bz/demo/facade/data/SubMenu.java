package com.bz.demo.facade.data;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubMenu {
    private Long subMenuId;
    private String subMenuName;
    private String url;
    private boolean selected;

    public String getUrlFriendlyName() {
        return "menu-item-" + subMenuId;
    }
}
