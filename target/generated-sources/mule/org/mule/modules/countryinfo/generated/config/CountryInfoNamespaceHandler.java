
package org.mule.modules.countryinfo.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/country-info</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-08-26T12:46:43-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class CountryInfoNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(CountryInfoNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [country-info] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [country-info] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new CountryInfoConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-on-lang", new FindOnLangDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-on-lang", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-by-capital", new FindByCapitalDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-by-capital", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-by-currency", new FindByCurrencyDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-by-currency", "@Processor", ex);
        }
    }

}
