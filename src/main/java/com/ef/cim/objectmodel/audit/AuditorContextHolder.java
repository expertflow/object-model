package com.ef.cim.objectmodel.audit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuditorContextHolder {
    private static final ThreadLocal<String> auditor = new ThreadLocal<>();
    private static final Logger logger = LoggerFactory.getLogger(AuditorContextHolder.class);

    public static void setCurrentAuditor(String agentId) {
        logger.info("Setting current auditor to: {}", agentId);
        auditor.set(agentId);
    }

    public static String getCurrentAuditor() {
        String current = auditor.get();
        logger.info("Getting current auditor: {}", current);
        return current;
    }

    public static void clear() {
        logger.info("Clearing current auditor");
        auditor.remove();
    }
}
