package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor

public class StringListDatatype extends ConversationData <List<String>> {
        @NotNull(message = "value cannot be null")
        @Size(min = 1, message = "value must contain at least one element")
        private List<@NotBlank(message = "List element cannot be blank") String> value;

        @Override
        public List<String> getValue() {
                return value;
        }

        @Override
        public void setValue(List<String> value) {
                this.value=value;

        }
}
