package com.bz.demo.model.security;

import com.bz.demo.model.Auditable;
import com.bz.demo.model.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "Builder")
@Entity
@Table(name = "BG_MENU_GROUP")
public class MenuGroup extends BaseEntity implements Auditable {

    @Column(name = "name")
    private String name;

    @Column(name = "SEQUENCE_NO")
    private Long sequenceNo;

    @Column(name = "ACTIVE_STATUS")
    private int activeStatus;

    @Column(name = "ENTERED_BY")
    private Long createdBy;

    @Column(name = "ENTRY_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_BY")
    private Long updatedBy;

    @Column(name = "UPDATE_TIMESTAMP")
    private LocalDateTime modifiedAt;

}
