# GoogleSpeechToTextAPI4Java
Easy way to use Google Cloud Speech-to-Text API using JAVA

## Dependency

```
    <dependency>
        <groupId>br.com.tecnologiabasica</groupId>
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
            System.out.println(transcript);
            if(transcript != null && !transcript.isEmpty()) {
                System.out.println("Confidence: " + googleSpeechToTextAPI.getConfidence());
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

This project is licensed under the GNU GENERAL PUBLIC LICENSE V2 - see the [LICENSE.md](LICENSE.md) file for details