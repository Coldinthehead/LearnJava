package org.example;

import org.apache.log4j.*;

public class App {
    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.log(Priority.DEBUG, "Debug logger message");
        logger.log(Priority.INFO, "Info logger message");
        logger.log(Priority.ERROR, "Error logger message");

        logger.setLevel(Level.DEBUG);
        logger.debug("Debug logger message");
        logger.info("info after debug message");
        logger.setLevel(Level.INFO);
        logger.info("Info logger message");
        logger.debug("debug after info");
        logger.setLevel(Level.ERROR);
        logger.error("Error logger message");
    }
}
