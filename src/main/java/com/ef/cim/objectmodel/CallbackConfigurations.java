package com.ef.cim.objectmodel;

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
public class CallbackConfigurations {
    private boolean enableCallback;
    private String callbackUrl;
    private int campaignId;
    private String allowDuplicate;
    private String callBackForm;
    private boolean standaloneCallback;
}
