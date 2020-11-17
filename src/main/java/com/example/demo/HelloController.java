package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * 描述说明:
 *
 * @author cxk
 * @version 1.0
 */
@RestController
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());



    @RequestMapping(value="/faceImageCheck")
    public String faceImageCheck() throws IOException {


        return "hello jenkins";
    }
}
