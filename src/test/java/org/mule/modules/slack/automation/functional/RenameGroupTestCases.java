/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.slack.automation.functional;

import org.junit.Test;
import org.mule.modules.slack.automation.runner.AbstractSlackTestCase;

import static org.junit.Assert.assertEquals;

/**
 * Created by estebanwasinger on 8/8/15.
 */
public class RenameGroupTestCases extends AbstractSlackTestCase {

    @Test
    public void testRenameGroup() {
        String actualDate = getDateString();
        getConnector().renameGroup(GROUP_ID, actualDate);
        assertEquals(actualDate,getConnector().getGroupInfo(GROUP_ID).getName());
    }

}
