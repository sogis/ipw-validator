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

    @Test
    public void Id_12009_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12009/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12009/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12009/12009_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002001: MANDATORY FunktionHydraulisch AND != unbekannt"));
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY FunktionHydraulisch AND != unbekannt"));
    }

    @Test
    public void Id_12009_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12009/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12009/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12009/12009_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_12013_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12013/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12013/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12013/12013_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 41: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Knoten_nachRef (gilt für PAA)"));
    }
    
    @Disabled
    @Test
    public void Id_12013_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12013/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12013/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12013/12013_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_12014_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12014/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12014/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12014/12014_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 41: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Knoten_vonRef (gilt für PAA)"));
    }
    
    @Disabled
    @Test
    public void Id_12014_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12014/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12014/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12014/12014_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_12015_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12015/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12015/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12015/12015_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Kote_nach (gilt für PAA)"));
    }

    @Test
    public void Id_12015_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12015/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12015/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12015/12015_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_12016_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12016/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12016/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12016/12016_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Kote_von (gilt für PAA)"));
    }

    @Test
    public void Id_12016_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12016/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12016/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12016/12016_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_12017_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12017/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12017/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12017/12017_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY LaengeEffektiv (gilt für PAA)"));
    }

    @Test
    public void Id_12017_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12017/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12017/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12017/12017_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_12018_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12018/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12018/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12018/12018_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Lagebestimmung (gilt für PAA)"));
    }

    @Test
    public void Id_12018_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12018/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12018/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12018/12018_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_12021_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12021/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12021/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12021/12021_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Lichte_Breite (gilt für PAA)"));
    }

    @Test
    public void Id_12021_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12021/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12021/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12021/12021_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_12022_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12022/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12022/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12022/12022_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Lichte_Hoehe (gilt für PAA)"));
    }

    @Test
    public void Id_12022_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12022/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12022/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12022/12022_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_12023_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12023/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12023/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12023/12023_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Material (gilt für PAA)"));
    }

    @Test
    public void Id_12023_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12023/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12023/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12023/12023_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_12030_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12030/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12030/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12030/12030_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Profiltyp (gilt für PAA)"));
    }

    @Test
    public void Id_12030_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12030/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12030/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12030/12030_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_12031_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12031/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12031/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12031/12031_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Leitung: tid deg5mQXX20002002: MANDATORY Reliner_Art (gilt für PAA)"));
    }

    @Test
    public void Id_12031_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"leitung/12031/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"leitung/12031/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"leitung/12031/12031_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

}
