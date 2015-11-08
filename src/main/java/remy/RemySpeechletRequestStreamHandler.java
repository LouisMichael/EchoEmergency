package remy;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public final class RemySpeechletRequestStreamHandler extends
		SpeechletRequestStreamHandler {
	private static final Set<String> supportedApplicationIds = new HashSet<String>();
	static {
		supportedApplicationIds.add("amzn1.echo-sdk-ams.app."
				+ "fd7d8072-bfee-4d44-8215-a07a68073a74");
	}

	public RemySpeechletRequestStreamHandler() {
		super(new RemySpeechlet(), supportedApplicationIds);
	}
}
