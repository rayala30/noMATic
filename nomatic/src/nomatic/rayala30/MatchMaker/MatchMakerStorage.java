package nomatic.rayala30.MatchMaker;

import nomatic.rayala30.MatchMaker.model.Match;
import nomatic.rayala30.util.BasicFileStorage;
import nomatic.rayala30.util.BasicXmlParser;
import nomatic.rayala30.util.FileStorageException;

public class MatchMakerStorage {

    /**
     * MatchMakerStorage is a class for saving a match to a file so that it be loaded back
     * in later. It depends on the Match object's ability to provide and populate its data
     * in basic XML, and it depends on an object that implements the BasicFileStorage interface
     * to handle the details of interacting with the file system.
     */

    private final BasicFileStorage fileStorage;

    // Constructor
    public MatchMakerStorage(BasicFileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }

    public Match readMatchFromFile(String filename) throws FileStorageException {
        String contents = fileStorage.readContentsOfFile(filename);
        BasicXmlParser parser = new BasicXmlParser(contents);
        String innerXml = parser.getStringContent("match");
        if (innerXml == null || innerXml.isEmpty()) {
            throw new FileStorageException("No match data found in " + filename);
        } else {
            Match result = new Match();

        }
    }

}
