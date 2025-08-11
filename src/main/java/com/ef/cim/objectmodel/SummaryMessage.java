package com.ef.cim.objectmodel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SummaryMessage extends MessageBody {
    private String summaryText;

    public SummaryMessage() {
        super(MessageType.SUMMARY);
    }

    public SummaryMessage(String summaryText) {
        super(MessageType.SUMMARY);
        this.summaryText = summaryText;
    }
}