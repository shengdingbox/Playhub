package android.content.res;

public interface XmlResourceParser {

    int getAttributeCount();

    String getAttributeName(int index);

    String getAttributeValue(int index);

    String getAttributeValue(String namespace, String name);

    String getName();

    int getDepth();

    int getEventType();

    String getText();

    boolean next() throws java.io.IOException;

    void close();
}