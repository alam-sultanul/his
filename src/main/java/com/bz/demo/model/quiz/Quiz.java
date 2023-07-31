package com.bz.demo.model.quiz;


import com.bz.demo.model.Auditable;
import com.bz.demo.model.BaseEntity;
import com.bz.demo.model.common.UserStatus;
import com.bz.demo.model.common.UserType;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderClassName = "Builder")
@Entity
@Table(name = "QUIZ_QUES")
public class Quiz extends BaseEntity implements Auditable {

    @Column(name = "QUIZ_TITLE")
    private String quizTitle;

    @Column(name = "QUIZ_DESCRIPTION")
    private String quizDescription;

    @Column(name = "USER_TYPE_ID")
    private UserType userType;

    @Column(name = "REMARKS")
    private String remarks;

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

    @Column(name = "USER_STATUS")
    private UserStatus userStatus;


}
