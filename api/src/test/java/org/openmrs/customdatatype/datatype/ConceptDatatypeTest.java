package org.openmrs.customdatatype.datatype;

import org.openmrs.customdatatype.CustomDatatype;
import org.junit.Assert;
import org.junit.Test;
import org.openmrs.Concept;

public class ConceptDatatypeTest {

    /**
     * @see ConceptDatatype#doGetTextSummary(Concept)
     * @should return true but throws null pointer exceptipn doGetTextSummary
     * assumes Concept is not null, deserialize returns null if the string is
     * blank.
     */
    @Test
    public void doGetTextSummary_shouldReturnDefaultSummary() throws Exception {
        ConceptDatatype datatype = new ConceptDatatype();
        Assert.assertEquals(new CustomDatatype.Summary("", true), datatype.doGetTextSummary(datatype.deserialize("")));
    }

    /**
     * Test of deserialize method, of class ConceptDatatype.
     */
    @Test
    public void testDeserialize() {
        System.out.println("deserialize");
        String uuid = "";
        ConceptDatatype instance = new ConceptDatatype();
        Concept expResult = null;
        Concept result = instance.deserialize(uuid);
        Assert.assertEquals(expResult, result);
    }

}
