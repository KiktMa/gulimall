package com.mjtal.common.dllinterface;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.ByteByReference;

public interface GdalTest extends Library {

    GdalTest test = Native.load("helloJna", GdalTest.class);

    ByteByReference test(String startpath);
}
