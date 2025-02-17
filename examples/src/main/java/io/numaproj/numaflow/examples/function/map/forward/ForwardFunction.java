package io.numaproj.numaflow.examples.function.map.forward;

import io.numaproj.numaflow.function.Datum;
import io.numaproj.numaflow.function.FunctionServer;
import io.numaproj.numaflow.function.Message;
import io.numaproj.numaflow.function.map.MapHandler;

import java.io.IOException;

/**
 * This is a simple User Defined Function example which forwards the message as is.
 */

public class ForwardFunction extends MapHandler {
    public Message[] processMessage(String[] keys, Datum data) {
        return new Message[]{Message.toAll(data.getValue())};
    }

    public static void main(String[] args) throws IOException {
        new FunctionServer().registerMapHandler(new ForwardFunction()).start();
    }
}
