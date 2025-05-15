package com.ef.cim.objectmodel.audit;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.AuditorAware;

public class SpringAuditorAware implements AuditorAware<String> {

    private static final Logger logger = LoggerFactory.getLogger(SpringAuditorAware.class);

    @Override
    public Optional<String> getCurrentAuditor() {

        String auditor = AuditorContextHolder.getCurrentAuditor();
        logger.info("SpringAuditorAware returning auditor: {}", auditor);


        return Optional.ofNullable(AuditorContextHolder.getCurrentAuditor());
    }
}


