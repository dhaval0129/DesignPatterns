/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.bdp.ChainOfResponsibility;

/**
 *
 * @author djoshi
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        //System.out.println(loggerChain.level);
        loggerChain.logMessage(AbstractLogger.INFO,
            "This is an information.");
        System.out.println(loggerChain.level);
        loggerChain.logMessage(AbstractLogger.DEBUG,
            "This is an debug level information.");
                System.out.println(loggerChain.level);
        loggerChain.logMessage(AbstractLogger.ERROR,
            "This is an error information.");
    }
}
