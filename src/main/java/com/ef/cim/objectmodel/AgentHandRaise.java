package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class AgentHandRaise {
    private boolean handRaised;
    private List<String> agentNames;
}
