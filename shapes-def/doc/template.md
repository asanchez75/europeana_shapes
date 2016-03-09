# Class edm:ProvidedCHO

| Property | Cardinality | Constraints |
| --- | --- | --- |
|dc:contributor|1..1| <a href="#cardinality">cardinality</a>, range-class |
|dc:coverage|1..1| cardinality, quality, range-class |
|dc:creator|1..1|cardinality, range-class |
|dc:date|1..1|quality, range-class, cardinality, literal |

#### Property "dc:contributor"
------

###### <a id="cardinality" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/contributor#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/contributor#range-class</a>
<table>
<tr><th align="right">description</th><td>the reference should be one to an Agent (the access to the data and the data itself should be formatted according to the Agent specifications.)<td></tr>
<tr><th align="right">subject</th><td>R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</td></tr>
<tr><th align="right">type</th><td>range-class</td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<contributor#cardinality>
  a sh:PropertyConstraint ;
  sh:predicate dc:contributor ;
  sh:minCount 0 ;
.
```
