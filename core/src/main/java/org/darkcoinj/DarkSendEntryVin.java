package org.darkcoinj;

import org.helixj.core.NetworkParameters;
import org.helixj.core.TransactionInput;

/**
 * Created by Eric on 2/8/2015.
 */
public class DarkSendEntryVin {
    boolean isSigSet;
    TransactionInput vin;

    DarkSendEntryVin(NetworkParameters params)
    {
        isSigSet = false;
        vin = new TransactionInput(params, null, null);  //need to set later
    }
}
