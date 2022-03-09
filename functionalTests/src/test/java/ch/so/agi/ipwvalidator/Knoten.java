package ch.so.agi.ipwvalidator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.interlis2.validator.Validator;

import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.settings.Settings;

public class Knoten {
    private static final String TEST_IN = "src/test/data/";
    private static final String LOGFILE_NAME = "ilivalidator.log";

    @Test
    public void Id_11001_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11001/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11001/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11001/11001_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY ARA_Nr"));
    }

    @Test
    public void Id_11001_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11001/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11001/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11001/11001_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_11002_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11002/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11002/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11002/11002_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Baujahr (gilt für PAA)"));
    }
    
    @Test
    public void Id_11002_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11002/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11002/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11002/11002_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_11003_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11003/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11003/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11003/11003_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY BaulicherZustand"));
    }

    @Test
    public void Id_11003_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11003/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11003/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11003/11003_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    
    
    @Test
    public void Id_11005_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11005/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11005/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11005/11005_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY BetreiberRef"));
    }
    
    @Disabled
    @Test
    public void Id_11005_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11005/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11005/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11005/11005_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    

    @Test
    public void Id_11007_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11007/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11007/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11007/11007_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Deckelkote (gilt für PAA)"));
    }
    
    @Test
    public void Id_11007_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11007/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11007/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11007/11007_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    
    
    @Test
    public void Id_11008_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11008/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11008/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11008/11008_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Detailgeometrie (gilt für PAA)"));
    }

    @Test
    public void Id_11008_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11008/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11008/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11008/11008_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    

    @Test
    public void Id_11012_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11012/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11012/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11012/11012_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        System.out.println(content);
        assertTrue(content.contains("Error: line 22: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Finanzierung AND != unbekannt"));
        assertTrue(content.contains("Error: line 37: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001002: MANDATORY Finanzierung AND != unbekannt"));
    }

    @Test
    public void Id_11012_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11012/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11012/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11012/11012_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    

    @Test
    public void Id_11013_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11013/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11013/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11013/11013_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 22: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Funktion AND != unbekannt"));
        assertTrue(content.contains("Error: line 37: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001002: MANDATORY Funktion AND != unbekannt"));
    }
    
    @Test
    public void Id_11013_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11013/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11013/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11013/11013_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    
    
    @Test
    public void Id_11014_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11014/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11014/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11014/11014_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY FunktionHierarchisch"));
    }

    @Test
    public void Id_11014_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11014/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11014/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11014/11014_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    

    @Test
    public void Id_11015_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11015/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11015/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11015/11015_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Lage"));
    }

    @Test
    public void Id_11015_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11015/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11015/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11015/11015_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }   
    
    @Test
    public void Id_11016_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11016/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11016/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11016/11016_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Lagegenauigkeit"));
    }

    @Test
    public void Id_11016_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11016/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11016/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11016/11016_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    

    @Test
    public void Id_11017_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11017/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11017/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11017/11017_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 22: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Nutzungsart_geplant AND != unbekannt"));
        assertTrue(content.contains("Error: line 37: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001002: MANDATORY Nutzungsart_geplant AND != unbekannt"));
    }

    @Test
    public void Id_11017_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11017/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11017/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11017/11017_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    

    @Test
    public void Id_11018_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11018/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11018/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11018/11018_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 22: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Nutzungsart_Ist AND != unbekannt"));
        assertTrue(content.contains("Error: line 37: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001002: MANDATORY Nutzungsart_Ist AND != unbekannt"));
    }

    @Test
    public void Id_11018_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11018/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11018/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11018/11018_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }  
    
    @Test
    public void Id_11024_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11024/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11024/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11024/11024_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 21: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Sohlenkote (gilt für PAA)"));
    }

    @Test
    public void Id_11024_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11024/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11024/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11024/11024_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    

    @Disabled
    @Test
    public void Id_11025_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11025/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11025/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11025/11025_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 22: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001001: MANDATORY Status AND != unbekannt"));
    }

    @Disabled
    @Test
    public void Id_11025_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11025/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11025/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11025/11025_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    

    @Test
    public void Id_11028_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11028/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11028/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11028/11028_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.Knoten: tid deg5mQXX20001002: MANDATORY Zustandserhebung_Jahr OR BaulicherZustand == #unbekannt"));
    }

    @Test
    public void Id_11028_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"knoten/11028/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"knoten/11028/config.toml");
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        
        EhiLogger.getInstance().setTraceFilter(false);
        
        boolean valid = Validator.runValidation(TEST_IN+"knoten/11028/11028_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }    

}
