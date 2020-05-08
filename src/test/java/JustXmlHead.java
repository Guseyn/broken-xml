import com.guseyn.broken_xml.ParsedXML;
import com.guseyn.broken_xml.XmlDocument;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JustXmlHead extends XmlTest{
    @Test
    public void test() throws IOException {
        final ParsedXML xml = new ParsedXML(dataByPath("single-xml-head.xml"));
        XmlDocument doc = xml.value();
        assertEquals(doc.heads().size(), 1);
        XmlTestUtils.assertXmlHead(doc.heads().get(0), "1.0");
    }
}