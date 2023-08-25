package ceceply.spring.core.factory;

import ceceply.spring.core.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {
	@Override
	public PaymentGatewayClient getObject() throws Exception {
		PaymentGatewayClient paymentGatewayClient = new PaymentGatewayClient();
		paymentGatewayClient.setEndpoint("https://example.com");
		paymentGatewayClient.setPrivateKey("private");
		paymentGatewayClient.setPublicKey("public");
		return paymentGatewayClient;
	}

	@Override
	public Class<?> getObjectType() {
		return PaymentGatewayClient.class;
	}
}
