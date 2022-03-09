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

public class Teileinzugsgebiet {
    private static final String TEST_IN = "src/test/data/";
    private static final String LOGFILE_NAME = "ilivalidator.log";

    @Test
    public void Id_17003_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17003/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17003/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17003/17003_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009001: MANDATORY Abflussbeiwert_RW_geplant"));
    }

    @Test
    public void Id_17003_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17003/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17003/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17003/17003_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_17004_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17004/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17004/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17004/17004_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009001: MANDATORY Abflussbeiwert_RW_Ist"));
    }

    @Test
    public void Id_17004_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17004/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17004/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17004/17004_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_17005_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17005/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17005/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17005/17005_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009001: MANDATORY Abflussbeiwert_SW_geplant"));
    }

    @Test
    public void Id_17005_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17005/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17005/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17005/17005_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_17006_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17006/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17006/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17006/17006_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009001: MANDATORY Abflussbeiwert_SW_Ist"));
    }

    @Test
    public void Id_17006_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17006/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17006/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17006/17006_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_17013_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17013/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17013/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17013/17013_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009001: MANDATORY Direkteinleitung_in_Gewaesser_geplant AND != #unbekannt"));
        assertTrue(content.contains("Error: line 30: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009002: MANDATORY Direkteinleitung_in_Gewaesser_geplant AND != #unbekannt"));
    }

    @Test
    public void Id_17013_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17013/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17013/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17013/17013_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_17014_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17014/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17014/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17014/17014_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009001: MANDATORY Direkteinleitung_in_Gewaesser_Ist AND != #unbekannt"));
        assertTrue(content.contains("Error: line 30: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009002: MANDATORY Direkteinleitung_in_Gewaesser_Ist AND != #unbekannt"));
    }

    @Test
    public void Id_17014_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17014/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17014/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17014/17014_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_17017_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17017/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17017/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17017/17017_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009001: MANDATORY Entwaesserungssystem_geplant AND != #unbekannt"));
        assertTrue(content.contains("Error: line 30: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009002: MANDATORY Entwaesserungssystem_geplant AND != #unbekannt"));
    }

    @Test
    public void Id_17017_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17017/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17017/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17017/17017_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_17018_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17018/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17018/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17018/17018_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009001: MANDATORY Entwaesserungssystem_Ist AND != #unbekannt"));
        assertTrue(content.contains("Error: line 30: VSADSSMINI_2020_LV95.VSADSSMini.Teileinzugsgebiet: tid deg5mQXX20009002: MANDATORY Entwaesserungssystem_Ist AND != #unbekannt"));
    }

    @Test
    public void Id_17018_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"teileinzugsgebiet/17018/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"teileinzugsgebiet/17018/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"teileinzugsgebiet/17018/17018_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }


}
