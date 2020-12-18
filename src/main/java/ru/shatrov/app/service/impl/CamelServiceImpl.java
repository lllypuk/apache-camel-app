package ru.shatrov.app.service.impl;

import org.apache.camel.CamelContext;
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

    protected final CamelContext camelContext;

    @Autowired
    public CamelServiceImpl(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public String action() {

        return "Test Camel!";
    }
}
