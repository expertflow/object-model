package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class StringListDatatype extends ConversationData<List<List<String>>> {

        @NotNull(message = "value cannot be null")
        @Size(min = 1, message = "value must contain at least one element")
        @Valid
        private List<@Size(min = 1, message = "Each list must contain at least one element")
                List<@NotBlank(message = "List element cannot be blank") String>> value;

        @Override
        public List<List<String>> getValue() {
                return value;
        }

        @Override
        public void setValue(List<List<String>> value) {
                this.value = value;
        }
}
