package ch.so.agi.ipwvalidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.interlis2.validator.Validator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import ch.ehi.basics.settings.Settings;

public class ALR {
    private static final String TEST_IN = "src/test/data/";
    private static final String LOGFILE_NAME = "ilivalidator.log";

    @Test
    public void Id_10001_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"alr/10001/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"alr/10001/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"alr/10001/10001_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.ALR: tid deg5mQXX20008001: MANDATORY Beseitigung_Ist"));
    }

    @Test
    public void Id_10001_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"alr/10001/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"alr/10001/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"alr/10001/10001_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_10003_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"alr/10003/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"alr/10003/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"alr/10003/10003_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.ALR: tid deg5mQXX20008001: MANDATORY Einwohnerwerte"));
    }

    @Test
    public void Id_10003_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"alr/10003/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"alr/10003/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"alr/10003/10003_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_10004_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"alr/10004/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"alr/10004/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"alr/10004/10004_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.ALR: tid deg5mQXX20008001: MANDATORY Lage"));
    }

    @Test
    public void Id_10004_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"alr/10004/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"alr/10004/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"alr/10004/10004_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_10005_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"alr/10005/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"alr/10005/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"alr/10005/10005_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 39: VSADSSMINI_2020_LV95.VSADSSMini.ALR: tid deg5mQXX20008002: MANDATORY MassnahmeRef OR Sanierungsbedarf != #ja"));
    }

    //@Disabled
    @Test
    public void Id_10005_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"alr/10005/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"alr/10005/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"alr/10005/10005_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_10012_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"alr/10012/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"alr/10012/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"alr/10012/10012_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.ALR: tid deg5mQXX20008001: MANDATORY Sanierungsbedarf AND != #unbekannt"));
        assertTrue(content.contains("Error: line 30: VSADSSMINI_2020_LV95.VSADSSMini.ALR: tid deg5mQXX20008002: MANDATORY Sanierungsbedarf AND != #unbekannt"));
    }

    //@Disabled
    @Test
    public void Id_10012_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"alr/10012/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"alr/10012/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"alr/10012/10012_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

}
