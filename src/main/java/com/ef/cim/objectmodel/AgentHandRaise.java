package com.ef.cim.objectmodel;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AgentHandRaise {
    private boolean handRaised;
    private List<String> agentNames;
}
