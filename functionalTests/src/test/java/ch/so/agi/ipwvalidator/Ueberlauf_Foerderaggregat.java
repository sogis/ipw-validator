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

public class Ueberlauf_Foerderaggregat {
    private static final String TEST_IN = "src/test/data/";
    private static final String LOGFILE_NAME = "ilivalidator.log";

    @Test
    public void Id_18001_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"ueberlauf_foerderaggregat/18001/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"ueberlauf_foerderaggregat/18001/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"ueberlauf_foerderaggregat/18001/18001_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Ueberlauf_Foerderaggregat: tid deg5mQXX20009001: MANDATORY Art"));
    }

    @Test
    public void Id_18001_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"ueberlauf_foerderaggregat/18001/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"ueberlauf_foerderaggregat/18001/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"ueberlauf_foerderaggregat/18001/18001_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

}
