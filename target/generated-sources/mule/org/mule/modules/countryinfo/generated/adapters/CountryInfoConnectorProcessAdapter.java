
package org.mule.modules.countryinfo.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.countryinfo.CountryInfoConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>CountryInfoConnectorProcessAdapter</code> is a wrapper around {@link CountryInfoConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-08-26T12:46:43-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class CountryInfoConnectorProcessAdapter
    extends CountryInfoConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<CountryInfoConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, CountryInfoConnectorCapabilitiesAdapter> getProcessTemplate() {
        final CountryInfoConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,CountryInfoConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, CountryInfoConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, CountryInfoConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
