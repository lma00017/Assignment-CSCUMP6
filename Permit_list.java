/* Generated by Together */

/**
 * Permit list manages the collection of permits currently issued and not yet cancelled (or expired).
 * It handles most of the use cases in the Administration section. Note that each Permit must have a
 * unique permit holder name (so a HashTable is probably a good implementation of the collection, with
 * permit holder name as key).
 *
 * There will only be one instance of this class.
 */
public class Permit_list {
    /** The Permit list maintains a collection of the Permits currently issued.
     *
     * This association must be implemented by an attribute holding a collection data structure (for
     * example: array, hash table - the latter is recommended).
     *
     * Note that no two Permits may have the same permit holder name (this information is not represented diagrammatically).
     * @associates Permit
     * @label Contains
     * @clientCardinality 1
     * @supplierCardinality 0..*
     * @directed*/
    private java.util.Hashtable lnkPermit;
}
