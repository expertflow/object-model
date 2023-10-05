package com.ef.cim.objectmodel;

public enum MessageIntent {
    NONE,
    START_CHAT,
    END_CHAT,
    CALL_LEG_STARTED,
    CALL_LEG_ENDED,
    AGENT_OUTBOUND,
    START_VOICE,
    END_VOICE,
    NETWORK_DISCONNECT,
    ASSIGN_RESOURCE_REQUESTED,
    IVR_AGGREGATED_ACTIVITY,
    START_CONVERSATION
}