import com.twilio.twiml.Dial;
import com.twilio.twiml.Number;
import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.TwiMLException;
import com.twilio.twiml.Language;

public class Example {
    public static void main(String[] args) {
        Number number = new Number.Builder("+15558675309").build();
        Dial dial = new Dial.Builder().record(Dial.Record
            .RECORD_FROM_RINGING_DUAL)
            .recordingStatusCallback("www.myexample.com").number(number)
            .build();
        VoiceResponse response = new VoiceResponse.Builder().dial(dial).build();

        try {
            System.out.println(response.toXml());
        } catch (TwiMLException e) {
            e.printStackTrace();
        }
    }
}
