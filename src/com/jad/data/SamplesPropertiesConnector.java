package com.jad.data;

import java.io.*;
import java.util.Properties;

public class SamplesPropertiesConnector {
    private static final String FileName = "src/data/samples.properties";
    private static SamplesPropertiesConnector Instance = null;
    private Properties properties = null;

    private SamplesPropertiesConnector() {
        try {
            SamplesPropertiesConnector.createSamples();
            this.load();
        } catch (IOException exception) {
            this.manageException(exception);
        }
    }

    public static SamplesPropertiesConnector getInstance() {
        if (SamplesPropertiesConnector.Instance == null) {
            SamplesPropertiesConnector.Instance = new SamplesPropertiesConnector();
        }
        return SamplesPropertiesConnector.Instance;
    }

    private void load() throws IOException {
        InputStream input = new FileInputStream(SamplesPropertiesConnector.FileName);
        this.properties = new Properties();
        this.properties.load(input);
    }

    private static void createSamples() throws IOException {
        OutputStream output = new FileOutputStream(SamplesPropertiesConnector.FileName);
        Properties properties = new Properties();
        properties.setProperty("1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        properties.setProperty("2", "Vestibulum feugiat nibh in enim lacinia, efficitur interdum diam laoreet.");
        properties.setProperty("3", "Phasellus volutpat tincidunt rhoncus. Donec bibendum auctor pretium.");
        properties.setProperty("4", "Vestibulum neque sem, maximus eget orci vel, feugiat rhoncus odio.");
        properties.setProperty("5", "In scelerisque eros vel arcu hendrerit blandit.");
        properties.setProperty("6", "Nullam sit amet lectus maximus quam placerat lobortis a sit amet ligula.");
        properties.setProperty("7", "Aenean et fermentum lectus.");
        properties.setProperty("8", "Aenean dapibus risus ex, sed ultrices dui suscipit tempus. Suspendisse non felis erat.");
        properties.setProperty("9", "Duis massa libero, laoreet sed felis at, maximus convallis lectus.");
        properties.setProperty("10", "Sed purus nisi, posuere in metus sit amet, posuere finibus eros. ");
        properties.store(output, null);
    }

    public String getById(int id) {
        return properties.getProperty(String.valueOf(id));
    }

    private void manageException(Exception exception) {
        System.out.println(exception.getMessage());
    }
}
