package com.oreilly;

// @formatter:off
public class MetricsNames {

    private MetricsNames() {
    }

    /**
     * Total number of invocations
     */
    public static final String EmhInvoked = "EmhInvoked"; // Extraction Message Handler (Emh)

    /**
     * Some bundles need to be parsed and skipped due to upstream test messages
     */
    public static final String EmhSkipped = "EmhSkipped";

    /**
     * Number of bundles that were not skipped and accepted for further processing
     */
    public static final String EmhAccepted = "EmhAccepted";

    /**
     * Number of correct handler returns (no errors occurred, the bundle was processed)
     */
    public static final String BundleProcessingSuccess = "BundleProcessingSuccess";

    /**
     * Number of invocations that found the bundle had already succeeded
     */
    public static final String BundleAlreadySuccessful = "BundleAlreadySuccessful";

    /**
     * Number of bundles we attempted to extract but mappings produced no model contributions
     */
    public static final String BundleEmptyContribution = "BundleEmptyContribution";

    /**
     * The ApproximateReceiveCount attribute of the SQS message
     */
    public static final String EmhApproximateReceiveCount = "EmhApproximateReceiveCount";

    /**
     * The age of the ApproximateFirstReceiveTimestamp when we start processing. Should hover close to zero, but if we start
     * handling a lot of retries, this will tell us about how old the messages we're working on now are.
     */
    public static final String EmhApproximateReceiveDelay = "EmhApproximateReceiveDelay";

    /**
     * The age of the bundle as soon as we received it from the external system
     */
    public static final String EmhHandlerBundleAge = "EmhHandlerBundleAge";

    /**
     * Time (ms) it took from bundle's load time assigned by EAS to a successful bulk import
     */
    public static final String BundleLoadToGraphTime = "BundleLoadToGraphTime";

    /**
     * Time (ms) it took from bundle's load time assigned by EAS to the start of the (ultimately successful) bulk import
     * <p>
     * This metric's reporting is delayed until import success, so that we ensure the stat is counting this step in each bundle's lifecycle exactly once.
     */
    public static final String BundleLoadToImportStartTime = "BundleLoadToImportStartTime";

    /**
     * Time (ms) it took from bundle oldest Detective receipt to a successful bulk import
     */
    public static final String BundleMaxDetectiveReceiptToGraphTime = "BundleMaxDetectiveReceiptToGraphTime";

    /**
     * Time (ms) it took from bundle oldest event time to a successful bulk import
     */
    public static final String BundleMaxEventToGraphTime = "BundleMaxEventToGraphTime";

    /**
     * Time (ms) it took from entering MappingState to opening fate operation
     */
    public static final String MappingStartToOpeningImportMs = "MappingStartToOpeningImportMs";

    /**
     * Number of errors occurring during bundle parsing
     */
    public static final String EmhEventBundleParserError = "EmhEventBundleParserError";

    /**
     * Number of bytes (as measured by metering) input in a single processed bundle
     */
    public static final String EmhInputMeteredBytes = "EmhInputMeteredBytes";

    /**
     * Number of events (as opposed to records) in a single processed bundle.
     * Notable difference is for VPC records where a single EmhInputRecords record can produce multiple events.
     */
    public static final String EmhInputEvents = "EmhInputEvents";

    /**
     * Number of events records that were successfully processed
     */
    public static final String EmhEventsProcessed = "EmhEventsProcessed";

    /**
     * Number of errors during bundle processing that we classified as known temporary add/or permanent
     */
    public static final String EmhTemporaryAndPermanentMessageHandlerErrors = "EmhTemporaryAndPermanentMessageHandlerErrors";

    /**
     * Number of errors that get thrown while the thread is interrupted.
     */
    public static final String EmhInterrupted = "EmhInterrupted";

    /**
     * Number of errors during bundle processing in which we attempted a state transition that had already been recorded
     */
    public static final String EmhDuplicateStateUpdateErrorPrefix = "EmhDuplicateStateUpdateError-";

    /**
     * Number of errors during bundle processing in which we attempted a state transition that had already been recorded
     */
    public static final String BundleAlreadyInState = "BundleAlreadyInState";

    /**
     * Number of errors during bundle processing in which AM reported ResourceNotFound
     */
    public static final String GraphNotFound = "GraphNotFound";

    /**
     * Number of times a bundle was discarded because its graph was marked for deletion
     */
    public static final String GraphPendingDeletion = "GraphPendingDeletion";

    /**
     * Number of times a bundle was discarded because its graph ingest state was not started for a datasource package
     */
    public static final String GraphDatasourcePackageNotStarted = "GraphDatasourcePackageNotStarted";

    /**
     * Number of times a bundle was discarded because the graphinfo's metadata indicated there wasn't a real MSS table behind it
     */
    public static final String GraphIgnored = "GraphIgnored";

    /**
     * Number of times a bundle was discarded because its graph's ingest was disabled
     */
    public static final String GraphIngestDisabled = "GraphIngestDisabled";

    /**
     * Number of times a bundle was offloaded to another cluster to handle the next state
     */
    public static final String BundleStateOffload = "BundleStateOffload";

    /**
     * Number of times the handler exited with a short circuit
     */
    public static final String EmhShortCircuit = "EmhShortCircuit";

    /**
     * Number of errors during bundle processing that we didn't classify (didn't expect)
     */
    public static final String EmhUnclassifiedMessageHandlerErrors = "EmhUnclassifiedMessageHandlerErrors";

    // StateTracker stats
    public static final String EmhStateSuccessTimePrefix = "EmhStateSuccessTime-";
    public static final String EmhStateFailTimePrefix = "EmhStateFailTime-";
    public static final String EmhStateBlockedPrefix = "EmhStateBlocked-";
    public static final String EmhStateCountPrefix = "EmhStateCount-";
    public static final String EmhStateTotalCount = "EmhStateTotalCount";
    public static final String EmhStateExecutorSaturation = "EmhStateExecutorSaturation";
    public static final String EmhStateExecutorSaturationCluster = "EmhStateExecutorSaturationCluster";

    // Mapping output counts
    public static final String EmhTotalBytes = "EmhTotalBytes";
    public static final String EmhContributionsCount = "EmhContributionsCount";
    public static final String EmhContributionsBytes = "EmhContributionsBytes";

    // Compaction I/O counts
    public static final String CompactionModelOutBytes = "CompactionModelOutBytes";
    public static final String CompactionModelOutEntries = "CompactionModelOutEntries";
    public static final String CompactionRfilesIn = "CompactionRfilesIn";
    public static final String CompactionRfilesOut = "CompactionRfilesOut";
    public static final String CompactionRfileBytesIn = "CompactionRfileBytesIn";
    public static final String CompactionRfileBytesOut = "CompactionRfileBytesOut";

    /**
     * Time it took to do compactions (not including no-op compaction states).
     */
    public static final String EmhCompactionTimeMillis = "EmhCompactionTimeMillis";

    /**
     * The ratio of kv bytes written to kv bytes read. This uses the in-memory kv size, not the size of the files on disk.
     */
    public static final String CompactionBytesRatio = "CompactionBytesRatio";

    /**
     * Total size (in bytes) of successfully imported RFiles for one import
     */
    public static final String EmhImportedRfileBytes = "EmhImportedRfileBytes";
    /**
     * Size of the extraction in-memory buffer
     */
    public static final String ExtractionBufferSizeBytes = "ExtractionBufferSizeBytes";
    /**
     * How many bytes of the extraction buffer were actually filled (per RFile)
     */
    public static final String ExtractionBufferFillBytes = "ExtractionBufferFillBytes";

    /**
     * Number of (model) rfiles given to BulkImportLite (per import attempt)
     */
    public static final String EmhModelRfileCount = "EmhModelRfileCount";

    /**
     * Total number of errors while performing output operation
     */
    public static final String EmhOutputErrors = "EmhOutputErrors";

    /**
     * Total time it took message handler from accepting a message to reach some non-error exit condition
     */
    public static final String EmhHandlerTimeMillis = "EmhHandlerTimeMillis";

    /**
     * Time it took for message handler to reach error condition we chose not to recover from
     */
    public static final String EmhTimeToFailure = "EmhTimeToFailure";

    /**
     * Time it took to actually write entries to storage
     */
    public static final String EmhOutputtersTime = "EmhOutputtersTime";

    /**
     * Record bytes reported to Metering
     */
    public static final String EmhMeteringBytes = "EmhMeteringBytes";

    /**
     * The time (ms) spent waiting on MSS client API calls.
     * <p>
     * We also report per-call metrics as MssApiTime + "-" + callName
     */
    public static final String MssApiTime = "MssApiTime";

    /**
     * The count of MSS client API calls that threw an exception.
     * <p>
     * We also report per-call metrics as MssApiErrors + "-" + callName
     */
    public static final String MssApiErrors = "MssApiErrors";

    /**
     * The number of API calls currently open against MSS. Recorded after each call completes.
     * <p>
     * We also report per-call metrics as MssApiErrors + "-" + callName
     */
    public static final String MssPendingCalls = "MssPendingCalls";

    /**
     * Time (ms) it took from starting fate operation until we saw a SUCCESS
     */
    public static final String BulkImportSuccessTime = "BulkImportSuccessTime";

    /**
     * Time (ms) it took from starting fate operation until we saw a FAILED status
     */
    public static final String BulkImportFailureTime = "BulkImportFailureTime";

    /**
     * Counts for states the bundle processing gets resumed from
     * (the state name is appended to the prefix)
     */
    public static final String EmhResumeStatePrefix = "EmhResumeState-";

    /**
     * Counts for FATE statuses returned by waitForFateOperationStatus
     * (the status name is appended to the prefix)
     */
    public static final String EmhFateStatusPrefix = "EmhFateStatus-";

    /**
     * Content length of objects read as reported by S3 metadata
     */
    public static final String EmhInputContentLength = "EmhInputContentLength";

    /**
     * Record bytes read as reported by event access client record reader
     */
    public static final String EmhInputBytes = "EmhInputBytes";

    /**
     * Record count read as reported by event access client record reader
     */
    public static final String EmhInputRecords = "EmhInputRecords";

    /**
     * Record count of files that couldn't be read that weren't tracked in SDS
     */
    public static final String EmhExpectedMissingFiles = "EmhExpectedMissingFiles";

    /**
     * The amount of time (in seconds) spent actually reading from S3, as reported by the event access client record reader.
     */
    public static final String MillisSpentReadingFiles = "MillisSpentReadingFiles";

    /**
     * Time (ms) spent getting a partitioner in MappingState
     */
    public static final String TimeGettingPartitioner = "TimeGettingPartitioner";

    /**
     * Count of errors where mapping or compacting wrote an entry to an RFile that couldn't be read back as a SqrrlEntry
     */
    public static final String OutputEntryValidationFailure = "OutputEntryValidationFailure";

    // Dimension names used on import group stats
    public static final String DIMENSION_EVENT_TYPE = "EventType";
    public static final String DIMENSION_EVENT_PROCESS = "EventProcess";
    public static final String DIMENSION_CALLER = "Caller";
    public static final String DIMENSION_SOURCE_TYPE = "SourceType";
    public static final String DIMENSION_INDICATOR_GRAPH = "IndicatorGraph";

    /**
     * Number of Bundles Redriven from DLQ
     */
    public static final String RedrivenDLQBundles = "RedrivenDLQBundles";

    /**
     * Time (ms) it took from bundle's load time assigned by EAS to successfully bulk import it (after being Redriven from DLQ)
     */
    public static final String RedrivenBundleLoadToGraphTime = "RedrivenBundleLoadToGraphTime";

    /**
     * Time (ms) it took from bundle's Redriven Timestamp to a successful bulk import
     */
    public static final String BundleRedrivenToGraphTime = "BundleRedrivenToGraphTime";

    /**
     * Count of errors where the NoMemberException has been caught in MeteringState
     */
    public static final String EmhNoMemberMeteringErrors = "EmhNoMemberMeteringErrors";

    /**
     * Count of errors where the MeteringException (except NoMemberException) has been caught in MeteringState
     */
    public static final String EmhMeteringErrors = "EmhMeteringErrors";

}
// @formatter:on
