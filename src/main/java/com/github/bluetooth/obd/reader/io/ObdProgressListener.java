package com.github.bluetooth.obd.reader.io;

public interface ObdProgressListener {

    void stateUpdate(final ObdCommandJob job);

}