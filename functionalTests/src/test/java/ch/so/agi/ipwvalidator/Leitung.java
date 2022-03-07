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

public class Leitung {
    private static final String TEST_IN = "src/test/data/";
    private static final String LOGFILE_NAME = "ilivalidator.log";

    @Test
    public void Id_12001_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/12001/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/12001/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/12001/12001_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        System.out.println(content);
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY ARA_Nr"));
    }

}
