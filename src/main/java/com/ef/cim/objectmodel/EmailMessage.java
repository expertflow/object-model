package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmailMessage extends MessageBody {

    @Valid
    private String subject;
    @Valid
    private String from;
    @Valid
    private List<String> replyTo;
    @Valid
    private Long receivingDate;
    @Valid
    private String htmlBody;
    @Valid
    private List<String> recipientsTo;
    private List<String> recipientsCc;
    private List<String> recipientsBcc;
    private List<String> emailThreads;
    private List<Attachment> attachments;
    private JsonNode additionalDetails;

    /**
     * Default Constructor.
     */
    public EmailMessage() {
        super(MessageType.EMAIL);
    }

}