package com.ef.cim.objectmodel.audit;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Persistent
public class AuditMetadata {

    @CreatedBy
    @Field("createdBy")
    private String createdBy;

    @CreatedDate
    @Field("createdAt")
    private Date createdDate;

    @LastModifiedBy
    @Field("updatedBy")
    private String updatedBy;

    @LastModifiedDate
    @Field("updatedAt")
    private Date updatedDate;

    @Indexed
    @Field("isDeleted")
    private boolean isDeleted = false;
}


