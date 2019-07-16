# GoogleSpeechToTextAPI4Java
Easy way to use Google Cloud Speech-to-Text API using JAVA

## Dependency

```
    <repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
    </repositories>


    <dependency>
        <groupId>com.github.tecnologiabasica</groupId>
        <artifactId>GoogleSpeechToTextAPI4Java</artifactId>
        <version>0.1.0</version>
    </dependency>
```

## System Dependency

```
    sox
    libsox-fmt-all
    libsox-fmt-mp3
```

# API KEY

To use the Google Speech-to-Text API, you need to enable API_KEY. More information: https://cloud.google.com/speech-to-text/

This library will search file .googlecloud.properties in the home diretory. The key must be in the variable 'apiKey':

```
    apiKey=AIza...
```

If you want to set the apiKey hard coded, follow this instruction:

```
    JCommons.getInstance().setApiKey("[your_key]");
```

## Example

```
    public static void main(String[] args) {
        
        try {           
            String base64File = JBase64Util.getFileAsBase64(JEncodeUtil.encodeFileToFlac("[file-path]"));
            String encoding = "FLAC";
            String sampleRateHertz = "8000";
            String languageCode = "pt-BR";
            String transcript = null;
            
            GoogleSpeechToTextAPI googleSpeechToTextAPI = new GoogleSpeechToTextAPI();
            transcript = googleSpeechToTextAPI.recognize(base64File, encoding, sampleRateHertz, languageCode);
            if (transcript != null && !transcript.isEmpty()) {
                System.out.println("Transcript: " + transcript);
                System.out.println("Confidence: " + googleSpeechToTextAPI.getConfidence());
            } else {
                System.out.println("statusCode: " + googleSpeechToTextAPI.getStatusCode());
                System.out.println("message: " + googleSpeechToTextAPI.getMessage());
            }
        } catch (IOException ex) {
            Logger.getLogger(JLauncher.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
```

## Authors

* **Afonso Henrique** - *Initial work* - [afonsohmm](https://github.com/afonsohmm)

## License

This project is licensed under the GNU GENERAL PUBLIC LICENSE V2 - see the [LICENSE](LICENSE) file for details