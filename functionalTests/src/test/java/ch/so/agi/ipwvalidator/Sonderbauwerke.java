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

public class Sonderbauwerke {
    private static final String TEST_IN = "src/test/data/";
    private static final String LOGFILE_NAME = "ilivalidator.log";

    @Test
    public void Id_19901_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/19901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/19901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/19901/19901_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 40: VSADSSMINI_2020_LV95.VSADSSMini.Bauwerkskomponente: tid deg5mQXX20011001: Keine Bauwerkskomponente erlaubt"));
    }

    @Test
    public void Id_19901_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/19901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/19901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/19901/19901_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_20901_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/20901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/20901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/20901/20901_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 23: VSADSSMINI_2020_LV95.VSADSSMini.Kennlinie_Stuetzpunkt: tid deg5mQXX20011001: Kein Kennlinie_Stuetzpunkt erlaubt"));
    }

    @Test
    public void Id_20901_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/20901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/20901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/20901/20901_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_22901_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/22901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/22901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/22901/22901_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.SK_Duekeroberhaupt: tid deg5mQXX20010001: Keine SK_Duekeroberhaupt erlaubt"));
    }

    @Test
    public void Id_22901_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/22901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/22901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/22901/22901_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_23901_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/23901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/23901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/23901/23901_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.SK_Einleitstelle: tid deg5mQXX20010001: Keine SK_Einleitstelle erlaubt"));
    }

    @Test
    public void Id_23901_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/23901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/23901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/23901/23901_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_24901_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/24901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/24901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/24901/24901_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.SK_Pumpwerk: tid deg5mQXX20010001: Keine SK_Pumpwerk erlaubt"));
    }

    @Test
    public void Id_24901_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/24901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/24901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/24901/24901_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }

    @Test
    public void Id_25901_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/25901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/25901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/25901/25901_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.SK_Regenrueckhaltebecken_kanal: tid deg5mQXX20010001: Keine SK_Regenrueckhaltebecken_kanal erlaubt"));
    }

    @Test
    public void Id_25901_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/25901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/25901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/25901/25901_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_26901_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/26901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/26901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/26901/26901_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.SK_Regenueberlauf: tid deg5mQXX20010001: Keine SK_Regenueberlauf erlaubt"));
    }

    @Test
    public void Id_26901_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/26901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/26901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/26901/26901_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_27901_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/27901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/27901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/27901/27901_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.SK_Regenueberlaufbecken: tid deg5mQXX20010001: Keine SK_Regenueberlaufbecken erlaubt"));
    }

    @Test
    public void Id_27901_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/27901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/27901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/27901/27901_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_28901_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/28901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/28901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/28901/28901_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.SK_Trennbauwerk: tid deg5mQXX20010001: Keine SK_Trennbauwerk erlaubt"));
    }

    @Test
    public void Id_28901_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/28901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/28901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/28901/28901_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }
    
    @Test
    public void Id_29901_fail(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/29901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/29901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/29901/29901_fail.xtf", settings);
        assertFalse(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertTrue(content.contains("Error: line 32: VSADSSMINI_2020_LV95.VSADSSMini.SK_Uebrige: tid deg5mQXX20010001: Keine SK_Uebrige erlaubt"));
    }

    @Test
    public void Id_29901_ok(@TempDir Path tempDir) throws Exception {
        String logFileName = Paths.get(tempDir.toFile().getAbsolutePath(), LOGFILE_NAME).toFile().getAbsolutePath();
        
        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_LOGFILE, logFileName);
        settings.setValue(Validator.SETTING_ILIDIRS, TEST_IN+"models/;"+TEST_IN+"sonderbauwerke/29901/");
        settings.setValue(Validator.SETTING_CONFIGFILE, TEST_IN+"sonderbauwerke/29901/config.toml");
        
        boolean valid = Validator.runValidation(TEST_IN+"sonderbauwerke/29901/29901_ok.xtf", settings);
        assertTrue(valid);

        String content = new String(Files.readAllBytes(Paths.get(logFileName)));
        //System.out.println(content);
        assertFalse(content.contains("Warning"));
        assertFalse(content.contains("Error"));
    }




}
