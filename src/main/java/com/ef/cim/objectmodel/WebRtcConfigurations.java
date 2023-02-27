package com.ef.cim.objectmodel;

import java.util.List;
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
public class WebRtcConfigurations {
    private boolean enableWebRtc;
    private String wssServerIp;
    private String wssServerPort;
    private String diallingUri;
    private String sipExtension;
    private boolean enabledSipLogs;
    private String extensionPassword;
    private String channel;
    private String websocket;
    private List<Object> iceServers;


}
