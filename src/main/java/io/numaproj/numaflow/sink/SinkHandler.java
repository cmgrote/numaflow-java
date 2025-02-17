package io.numaproj.numaflow.sink;

import java.util.List;

/**
 * SinkHandler exposes method for publishing messages to sink
 * Implementations should override the processMessage method
 * which will be used for processing the input messages
 */

public abstract class SinkHandler {
    // Function to process a list of coming messages
    public abstract List<Response> processMessage(SinkDatumStream datumStream);
}
