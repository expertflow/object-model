package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.enums.ReactionType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConversationSummaryActivity {
    private String summaryText;
    private ReactionType reactionType;
}