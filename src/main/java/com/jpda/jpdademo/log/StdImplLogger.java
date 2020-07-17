//
//  ========================================================================
//  Copyright (c) 2018-2019 HuJian/Pandening soft collection.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the #{license} Public License #{version}
//  EG:
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  You should bear the consequences of using the software (named 'java-debug-tool')
//  and any modify must be create an new pull request and attach an text to describe
//  the change detail.
//  ========================================================================
//


package com.jpda.jpdademo.log;


import com.jpda.jpdademo.util.UTILS;

public class StdImplLogger implements InternalLogger {

    /**
     * Return the name of this <code>InternalLogger</code> instance.
     *
     * @return name of this logger instance
     */
    @Override
    public String getName() {
        return "StdImplLogger";
    }

    /**
     * Is the logger instance enabled for the TRACE level?
     *
     * @return True if this InternalLogger is enabled for the TRACE level,
     * false otherwise.
     * @since 1.4
     */
    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    /**
     * Log a message at the TRACE level.
     *
     * @param msg the message string to be logged
     * @since 1.4
     */
    @Override
    public void trace(String msg) {
        com.jpda.jpdademo.log.PSLogger.t(msg);
    }

    /**
     * Log a message at the TRACE level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the TRACE level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     * @since 1.4
     */
    @Override
    public void trace(String format, Object arg) {
        com.jpda.jpdademo.log.PSLogger.t(String.format(format, arg));
    }

    /**
     * Log a message at the TRACE level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the TRACE level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @since 1.4
     */
    @Override
    public void trace(String format, Object arg1, Object arg2) {
        com.jpda.jpdademo.log.PSLogger.t(String.format(format, arg1, arg2));
    }

    /**
     * Log a message at the TRACE level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the TRACE level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for TRACE. The variants taking {@link #trace(String, Object) one} and
     * {@link #trace(String, Object, Object) two} arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @since 1.4
     */
    @Override
    public void trace(String format, Object... arguments) {
        //
    }

    /**
     * Log an exception (throwable) at the TRACE level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     * @since 1.4
     */
    @Override
    public void trace(String msg, Throwable t) {
        //
    }

    /**
     * Log a message at the DEBUG level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void debug(String msg) {
        //
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the DEBUG level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void debug(String format, Object arg) {
        //
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the DEBUG level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void debug(String format, Object arg1, Object arg2) {
        //
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the DEBUG level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for DEBUG. The variants taking
     * {@link #debug(String, Object) one} and {@link #debug(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void debug(String format, Object... arguments) {
        //
    }

    /**
     * Log an exception (throwable) at the DEBUG level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    @Override
    public void debug(String msg, Throwable t) {
        //
    }

    /**
     * Is the logger instance enabled for the INFO level?
     *
     * @return True if this InternalLogger is enabled for the INFO level,
     * false otherwise.
     */
    @Override
    public boolean isInfoEnabled() {
        return true;
    }

    /**
     * Log a message at the INFO level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void info(String msg) {
        com.jpda.jpdademo.log.PSLogger.i(msg);
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void info(String format, Object arg) {
        com.jpda.jpdademo.log.PSLogger.i(String.format(format, arg));
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void info(String format, Object arg1, Object arg2) {
        com.jpda.jpdademo.log.PSLogger.i(String.format(format, arg1, arg2));
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the INFO level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for INFO. The variants taking
     * {@link #info(String, Object) one} and {@link #info(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void info(String format, Object... arguments) {
        com.jpda.jpdademo.log.PSLogger.i(String.format(format, arguments));
    }

    /**
     * Log an exception (throwable) at the INFO level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    @Override
    public void info(String msg, Throwable t) {
        com.jpda.jpdademo.log.PSLogger.i(msg + "\n" + UTILS.getErrorMsg(t));
    }

    /**
     * Is the logger instance enabled for the WARN level?
     *
     * @return True if this InternalLogger is enabled for the WARN level,
     * false otherwise.
     */
    @Override
    public boolean isWarnEnabled() {
        return true;
    }

    /**
     * Log a message at the WARN level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void warn(String msg) {
        com.jpda.jpdademo.log.PSLogger.w(msg);
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the WARN level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void warn(String format, Object arg) {
        com.jpda.jpdademo.log.PSLogger.w(String.format(format, arg));
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the WARN level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for WARN. The variants taking
     * {@link #warn(String, Object) one} and {@link #warn(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void warn(String format, Object... arguments) {
        com.jpda.jpdademo.log.PSLogger.w(String.format(format, arguments));
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the WARN level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void warn(String format, Object arg1, Object arg2) {
        com.jpda.jpdademo.log.PSLogger.w(String.format(format, arg1 ,arg2));
    }

    /**
     * Log an exception (throwable) at the WARN level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    @Override
    public void warn(String msg, Throwable t) {
        com.jpda.jpdademo.log.PSLogger.w(msg + "\n" + UTILS.getErrorMsg(t));
    }

    /**
     * Is the logger instance enabled for the ERROR level?
     *
     * @return True if this InternalLogger is enabled for the ERROR level,
     * false otherwise.
     */
    @Override
    public boolean isErrorEnabled() {
        return true;
    }

    /**
     * Log a message at the ERROR level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void error(String msg) {
        com.jpda.jpdademo.log.PSLogger.e(msg);
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the ERROR level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void error(String format, Object arg) {
        com.jpda.jpdademo.log.PSLogger.e(String.format(format, arg));
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the ERROR level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void error(String format, Object arg1, Object arg2) {
        com.jpda.jpdademo.log.PSLogger.e(String.format(format, arg1, arg2));
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the ERROR level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for ERROR. The variants taking
     * {@link #error(String, Object) one} and {@link #error(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void error(String format, Object... arguments) {
        com.jpda.jpdademo.log.PSLogger.e(String.format(format, arguments));
    }

    /**
     * Log an exception (throwable) at the ERROR level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    @Override
    public void error(String msg, Throwable t) {
        com.jpda.jpdademo.log.PSLogger.e(msg + "\n" + UTILS.getErrorMsg(t));
    }
}
