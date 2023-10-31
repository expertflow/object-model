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
public class WebhookConfigurations {
    private boolean enableWebhook;
    private String webhookUrl;
}
