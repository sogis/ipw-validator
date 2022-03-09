package ch.so.agi.ipwvalidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.interlis2.validator.Validator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import ch.ehi.basics.settings.Settings;

public class Rohrprofil_Geometrie {
    private static final String TEST_IN = "src/test/data/";
    private static final String LOGFILE_NAME = "ilivalidator.log";

    @Test
    public void Id_16002_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"rohrprofil_geometrie/16002/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"rohrprofil_geometrie/16002/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"rohrprofil_geometrie/16002/16002_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 30: VSADSSMINI_2020_LV95.VSADSSMini.Rohrprofil_Geometrie: tid deg5mQXX20006001: MANDATORY Reihenfolge"));
    }

    @Test
    public void Id_16002_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"rohrprofil_geometrie/16002/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"rohrprofil_geometrie/16002/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"rohrprofil_geometrie/16002/16002_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_16004_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"rohrprofil_geometrie/16004/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"rohrprofil_geometrie/16004/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"rohrprofil_geometrie/16004/16004_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 30: VSADSSMINI_2020_LV95.VSADSSMini.Rohrprofil_Geometrie: tid deg5mQXX20006001: MANDATORY X"));
    }

    @Test
    public void Id_16004_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"rohrprofil_geometrie/16004/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"rohrprofil_geometrie/16004/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"rohrprofil_geometrie/16004/16004_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_16005_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"rohrprofil_geometrie/16005/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"rohrprofil_geometrie/16005/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"rohrprofil_geometrie/16005/16005_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 30: VSADSSMINI_2020_LV95.VSADSSMini.Rohrprofil_Geometrie: tid deg5mQXX20006001: MANDATORY Y"));
    }

    @Test
    public void Id_16005_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"rohrprofil_geometrie/16005/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"rohrprofil_geometrie/16005/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"rohrprofil_geometrie/16005/16005_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

}
