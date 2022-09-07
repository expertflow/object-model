package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.CCUser;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AgentSubUnSubDTO implements Serializable {
    private CCUser ccUser;
    private String reason;
}