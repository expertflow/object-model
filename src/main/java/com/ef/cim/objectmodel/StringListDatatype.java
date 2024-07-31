package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.enums.ConversationTypeEnum;
import com.sun.org.apache.xerces.internal.xs.StringList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor

public class StringListDatatype extends ConversationData <List<String>> {

        private List<String> value;

        @Override
        public List<String> getValue() {
                return value;
        }

        @Override
        public void setValue(List<String> value) {
                this.value=value;

        }
}
