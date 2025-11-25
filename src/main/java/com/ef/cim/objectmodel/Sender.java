package com.ef.cim.objectmodel;

import java.util.Map;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    private String type;
    private String senderName;
    private Map<String, Object> additionalDetail;

}
