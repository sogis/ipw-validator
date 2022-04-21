# ipw-validator

Zusätzliche Validierungen / Constraints für das Datenmodell `VSADSSMINI_2020_LV95` im Kontext der Informationsplattform Wasser (IPW). Als Prüfsoftware wird _ilivalidator_ **(>= 1.11.14)** verwendet. Für jeden zusätzlichen Constraint gibt es eigene Test. 

Ausgangslage: https://docs.google.com/spreadsheets/d/1m54R4bajP0hNA4FALl8u_Q6l7OWWlF-4/edit?usp=sharing&ouid=110080811444247305648&rtpof=true&sd=true (Excelfile)

## Test
```
./gradlew clean test
```

Systemtest, z.B.:

```
java -jar /Users/stefan/apps/ilivalidator-1.11.11/ilivalidator-1.11.11.jar --config config.toml --modeldir ".;https://vsa.ch/models;http://models.geo.admin.ch" --log fubar.log /Users/stefan/tmp/dssmini_birmensdorf/21-12-13_BDF_Abwasser_DSS2020_Mini.xtf
```

## Build
Für den Betrieb wird ein einzelnes Validierungsdatenmodell benötigt (siehe `models/YYYY-MM-DD`). Dieses muss bis auf weiteres aus den vielen Validierungsmodellen der einzelnen Tests zusammenkopiert werden.

## Run

Das Validierungsmodell wird in der INTERLIS-Modellablage des Kantons Solothurn gehosted. Die `config.toml`-Datei muss lokal vorgehalten werden.

Ilivalidator:
```
java -jar ilivalidator.jar --config config.toml --modeldir "path/to/VSADSSMINI_2020_LV95_Validierung_IPW_20220310.ili;https://vsa.ch/models;http://models.geo.admin.ch"
```

`path/to/...` ist überflüssig, wenn das Validierungsmodell in einer Modellablage vorhanden ist.

Ili2pg:
```
java -jar ili2pg.jar --validConfig config.toml --modeldir "path/to/VSADSSMINI_2020_LV95_Validierung_IPW_20220310.ili;https://vsa.ch/models;http://models.geo.admin.ch" ...
```
Siehe Kommentar _ilivalidator_.


## todo
- jreleaser?
