package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
public class Sender {
    @NotBlank
    private String id;
    @NotNull
    private Enums.SenderType type;
    @NotBlank
    private String senderName;
    private JsonNode additionalDetail;

}
