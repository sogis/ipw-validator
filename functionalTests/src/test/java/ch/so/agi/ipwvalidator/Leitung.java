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

public class Leitung {
    private static final String TEST_IN = "src/test/data/";
    private static final String LOGFILE_NAME = "ilivalidator.log";

    @Test
    public void Id_12001_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12001/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12001/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12001/12001_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 39: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Baujahr (gilt für PAA)"));
    }

    @Test
    public void Id_12001_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12001/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12001/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12001/12001_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_12002_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12002/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12002/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12002/12002_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002001: MANDATORY BaulicherZustand"));
    }

    @Test
    public void Id_12002_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12002/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12002/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12002/12002_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_12004_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12004/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12004/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12004/12004_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002001: MANDATORY BetreiberRef"));
    }

    @Disabled
    @Test
    public void Id_12004_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12004/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12004/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12004/12004_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_12007_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12007/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12007/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12007/12007_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002001: MANDATORY Finanzierung AND != unbekannt"));
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Finanzierung AND != unbekannt"));
    }

    @Test
    public void Id_12007_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12007/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12007/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12007/12007_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_12008_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12008/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12008/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12008/12008_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002001: MANDATORY FunktionHierarchisch AND != unbekannt"));
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY FunktionHierarchisch AND != unbekannt"));
        assertTrue(content.contains("Error: line 42: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002003: MANDATORY FunktionHierarchisch AND != unbekannt"));
    }

    @Test
    public void Id_12008_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12008/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12008/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12008/12008_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }


}
