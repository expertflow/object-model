package com.ef.cim.objectmodel;

import java.util.Map;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sender {
    @Indexed
    @NotBlank
    private String id;
    @NotNull
    @Indexed
    private String type;
    @Indexed
    private String senderName;
    private Map<String, Object> additionalDetail;

}
