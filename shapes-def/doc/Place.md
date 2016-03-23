## Class edm:Place
| Property | Cardinality | Value Type | Constraints |
| --- | --- | --- | --- |
|<a href="#dct_hasPart">dct:hasPart</a>|<a href="#edm_shapes_external_Place_dct_hasPart_cardinality">0..?</a>|<a href="#edm_shapes_external_Place_dct_hasPart_type">IRI</a>|<a href="#edm_shapes_external_Place_dct_hasPart_range-class">range-class</a>|
|<a href="#dct_isPartOf">dct:isPartOf</a>|<a href="#edm_shapes_external_Place_dct_isPartOf_cardinality">0..?</a>|<a href="#edm_shapes_external_Place_dct_isPartOf_type">IRI</a>|<a href="#edm_shapes_external_Place_dct_isPartOf_range-class">range-class</a>|
|<a href="#edm_isNextInSequence">edm:isNextInSequence</a>|<a href="#edm_shapes_external_Place_edm_isNextInSequence_cardinality">0..?</a>|<a href="#edm_shapes_external_Place_edm_isNextInSequence_type">IRI</a>|<a href="#edm_shapes_external_Place_edm_isNextInSequence_range-class">range-class</a>|
|<a href="#owl_sameAs">owl:sameAs</a>|<a href="#edm_shapes_external_Place_owl_sameAs_cardinality">0..?</a>|<a href="#edm_shapes_external_Place_owl_sameAs_type">IRI</a>||
|<a href="#http_www_w3_org_2003_01_geo_wgs84_pos_alt">http://www.w3.org/2003/01/geo/wgs84_pos#alt</a>||||
|<a href="#http_www_w3_org_2003_01_geo_wgs84_pos_lat">http://www.w3.org/2003/01/geo/wgs84_pos#lat</a>||||
|<a href="#http_www_w3_org_2003_01_geo_wgs84_pos_long">http://www.w3.org/2003/01/geo/wgs84_pos#long</a>||||
|<a href="#http_www_w3_org_2004_02_skos_core_altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>||||
|<a href="#http_www_w3_org_2004_02_skos_core_note">http://www.w3.org/2004/02/skos/core#note</a>||||
|<a href="#http_www_w3_org_2004_02_skos_core_prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>||||
#### Property <a id="dct_hasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------
###### <a id="edm_shapes_external_Place_dct_hasPart_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_hasPart#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_hasPart#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dct_hasPart#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:hasPart ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Place_dct_hasPart_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_hasPart#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_hasPart#range-class</a>
------
<table>
<tr><th align="right">description</th><td>dcterms:hasPart must refer to a valid edm:Place</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dct_hasPart#range-class>
  a sh:PropertyConstraint ;
  sh:description "dcterms:hasPart must refer to a valid edm:Place" ;
  dc:type esc:range-class ;
  dc:subject "R-225-VALIDATION-OF-CLASS-ASSOCIATION"
           , "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:predicate dct:hasPart ;
  sh:valueShape :base ;
  sh:class edm:Place ;
.
```
###### <a id="edm_shapes_external_Place_dct_hasPart_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_hasPart#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_hasPart#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dct_hasPart#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:hasPart ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="dct_isPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
------
###### <a id="edm_shapes_external_Place_dct_isPartOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_isPartOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_isPartOf#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dct_isPartOf#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:isPartOf ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Place_dct_isPartOf_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_isPartOf#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_isPartOf#range-class</a>
------
<table>
<tr><th align="right">description</th><td>dcterms:isPartOf must refer to a valid edm:Place</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dct_isPartOf#range-class>
  a sh:PropertyConstraint ;
  sh:description "dcterms:isPartOf must refer to a valid edm:Place" ;
  dc:type esc:range-class ;
  dc:subject "R-225-VALIDATION-OF-CLASS-ASSOCIATION"
           , "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:predicate dct:hasPart ;
  sh:valueShape :base ;
  sh:class edm:Place ;
.
```
###### <a id="edm_shapes_external_Place_dct_isPartOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_isPartOf#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_isPartOf#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dct_isPartOf#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:isPartOf ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_isNextInSequence" target="_blank" href="http://www.europeana.eu/schemas/edm/isNextInSequence">http://www.europeana.eu/schemas/edm/isNextInSequence</a>
------
###### <a id="edm_shapes_external_Place_edm_isNextInSequence_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_isNextInSequence#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isNextInSequence ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Place_edm_isNextInSequence_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#range-class</a>
------
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:Place</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_isNextInSequence#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:Place" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:isNextInSequence ;
  sh:valueShape :base ;
  sh:class edm:Place ;
.
```
###### <a id="edm_shapes_external_Place_edm_isNextInSequence_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_isNextInSequence#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isNextInSequence ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="owl_sameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>
------
###### <a id="edm_shapes_external_Place_owl_sameAs_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/owl_sameAs#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Place/owl_sameAs#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<owl_sameAs#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate owl:sameAs ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Place_owl_sameAs_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/owl_sameAs#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/owl_sameAs#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<owl_sameAs#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate owl:sameAs ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="http_www_w3_org_2003_01_geo_wgs84_pos_alt" target="_blank" href="http://www.w3.org/2003/01/geo/wgs84_pos#alt">http://www.w3.org/2003/01/geo/wgs84_pos#alt</a>
------
#### Property <a id="http_www_w3_org_2003_01_geo_wgs84_pos_lat" target="_blank" href="http://www.w3.org/2003/01/geo/wgs84_pos#lat">http://www.w3.org/2003/01/geo/wgs84_pos#lat</a>
------
#### Property <a id="http_www_w3_org_2003_01_geo_wgs84_pos_long" target="_blank" href="http://www.w3.org/2003/01/geo/wgs84_pos#long">http://www.w3.org/2003/01/geo/wgs84_pos#long</a>
------
#### Property <a id="http_www_w3_org_2004_02_skos_core_altLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>
------
#### Property <a id="http_www_w3_org_2004_02_skos_core_note" target="_blank" href="http://www.w3.org/2004/02/skos/core#note">http://www.w3.org/2004/02/skos/core#note</a>
------
#### Property <a id="http_www_w3_org_2004_02_skos_core_prefLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>
------
