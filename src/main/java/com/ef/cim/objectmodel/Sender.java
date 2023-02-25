package com.ef.cim.objectmodel;

import java.util.Map;
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
    private String senderName;
    private Map<String, Object> additionalDetail;

}
