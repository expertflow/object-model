package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.Customer;
import com.ef.cim.objectmodel.KeycloakUser;
import java.util.Map;
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
public class CallLegStartedDto {
    private String leg;
    private String channelSessionId;
    private Map<String, Object> dialog;
    private KeycloakUser agent;
    private Customer customer;
}
