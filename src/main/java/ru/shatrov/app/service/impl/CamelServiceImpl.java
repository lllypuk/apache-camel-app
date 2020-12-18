package ru.shatrov.app.service.impl;

import org.apache.camel.CamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shatrov.app.service.CamelService;

/**
 * Created on 18.12.2020.
 *
 * @author Shatrov Aleksandr
 */
@Service
public class CamelServiceImpl implements CamelService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CamelServiceImpl.class);

    protected final CamelContext camelContext;

    @Autowired
    public CamelServiceImpl(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public String action() {
        LOGGER.info("Log!");

        return "Test Camel!";
    }
}
