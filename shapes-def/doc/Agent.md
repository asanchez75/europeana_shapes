## Class edm:Agent
| Property | Cardinality | Value Type | Constraints |
| --- | --- | --- | --- |
|<a href="#dc_date">dc:date</a>|<a href="#edm_shapes_external_Agent_dc_date_cardinality">0..?</a>||<a href="#edm_shapes_external_Agent_dc_date_literal">literal</a>|
|<a href="#dc_identifier">dc:identifier</a>|<a href="#edm_shapes_external_Agent_dc_identifier_cardinality">0..?</a>|<a href="#edm_shapes_external_Agent_dc_identifier_type">Literal</a>||
|<a href="#dct_hasPart">dct:hasPart</a>|<a href="#edm_shapes_external_Agent_dct_hasPart_cardinality">0..?</a>|<a href="#edm_shapes_external_Agent_dct_hasPart_type">IRI</a>|<a href="#edm_shapes_external_Agent_dct_hasPart_range-class">range-class</a>|
|<a href="#dct_isPartOf">dct:isPartOf</a>|<a href="#edm_shapes_external_Agent_dct_isPartOf_cardinality">0..?</a>|<a href="#edm_shapes_external_Agent_dct_isPartOf_type">IRI</a>|<a href="#edm_shapes_external_Agent_dct_isPartOf_range-class">range-class</a>|
|<a href="#http_rdvocab_info_ElementsGr2_biographicalInformation">http://rdvocab.info/ElementsGr2/biographicalInformation</a>||||
|<a href="#http_rdvocab_info_ElementsGr2_dateOfBirth">http://rdvocab.info/ElementsGr2/dateOfBirth</a>||||
|<a href="#http_rdvocab_info_ElementsGr2_dateOfDeath">http://rdvocab.info/ElementsGr2/dateOfDeath</a>||||
|<a href="#http_rdvocab_info_ElementsGr2_dateOfEstablishment">http://rdvocab.info/ElementsGr2/dateOfEstablishment</a>||||
|<a href="#http_rdvocab_info_ElementsGr2_dateOfTermination">http://rdvocab.info/ElementsGr2/dateOfTermination</a>||||
|<a href="#http_rdvocab_info_ElementsGr2_gender">http://rdvocab.info/ElementsGr2/gender</a>||||
|<a href="#http_rdvocab_info_ElementsGr2_professionOrOccupation">http://rdvocab.info/ElementsGr2/professionOrOccupation</a>||||
|<a href="#edm_begin">edm:begin</a>|<a href="#edm_shapes_external_Agent_edm_begin_cardinality">0..1</a>|<a href="#edm_shapes_external_Agent_edm_begin_type">Literal</a>|<a href="#edm_shapes_external_Agent_edm_begin_correlation">correlation</a>, <a href="#edm_shapes_external_Agent_edm_begin_literal">literal</a>, <a href="#edm_shapes_external_Agent_edm_begin_redundancy">redundancy</a>|
|<a href="#edm_end">edm:end</a>|<a href="#edm_shapes_external_Agent_edm_end_cardinality">0..1</a>|<a href="#edm_shapes_external_Agent_edm_end_type">Literal</a>|<a href="#edm_shapes_external_Agent_edm_end_literal">literal</a>, <a href="#edm_shapes_external_Agent_edm_end_redundancy">redundancy</a>|
|<a href="#edm_hasMet">edm:hasMet</a>|<a href="#edm_shapes_external_Agent_edm_hasMet_cardinality">0..?</a>|<a href="#edm_shapes_external_Agent_edm_hasMet_type">IRI</a>|<a href="#edm_shapes_external_Agent_edm_hasMet_range-class">range-class</a>|
|<a href="#edm_isRelatedTo">edm:isRelatedTo</a>|<a href="#edm_shapes_external_Agent_edm_isRelatedTo_cardinality">0..?</a>|<a href="#edm_shapes_external_Agent_edm_isRelatedTo_type">IRI</a>||
|<a href="#owl_sameAs">owl:sameAs</a>|<a href="#edm_shapes_external_Agent_owl_sameAs_cardinality">0..?</a>|<a href="#edm_shapes_external_Agent_owl_sameAs_type">IRI</a>||
|<a href="#http_www_w3_org_2004_02_skos_core_altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>||||
|<a href="#http_www_w3_org_2004_02_skos_core_note">http://www.w3.org/2004/02/skos/core#note</a>||||
|<a href="#http_www_w3_org_2004_02_skos_core_prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>||||
|<a href="#http_xmlns_com_foaf_0_1_name">http://xmlns.com/foaf/0.1/name</a>||||
#### Property <a id="dc_date" target="_blank" href="http://purl.org/dc/elements/1.1/date">http://purl.org/dc/elements/1.1/date</a>
------
###### <a id="edm_shapes_external_Agent_dc_date_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_date#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_date#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dc_date#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:date ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Agent_dc_date_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_date#literal">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_date#literal</a>
------
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dc_date#literal>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""";
  dc:subject "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:predicate dc:date ;
  sh:filterShape [ #restrict only to Literals
      sh:property [
          sh:predicate dc:date ;
          sh:nodeKind sh:Literal ;
      ]
  ] ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```
#### Property <a id="dc_identifier" target="_blank" href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>
------
###### <a id="edm_shapes_external_Agent_dc_identifier_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_identifier#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_identifier#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dc_identifier#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:identifier ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Agent_dc_identifier_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_identifier#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_identifier#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dc_identifier#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dc:identifier ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="dct_hasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------
###### <a id="edm_shapes_external_Agent_dct_hasPart_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#cardinality</a>
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
###### <a id="edm_shapes_external_Agent_dct_hasPart_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#range-class</a>
------
<table>
<tr><th align="right">description</th><td>dcterms:hasPart must refer to a valid edm:Agent</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dct_hasPart#range-class>
  a sh:PropertyConstraint ;
  sh:description """dcterms:hasPart must refer to a valid edm:Agent""" ;
  dc:type esc:range-class ;
  dc:subject "R-225-VALIDATION-OF-CLASS-ASSOCIATION"
           , "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:predicate dct:hasPart ;
  sh:valueShape :base ;
  sh:class edm:Agent ;
.
```
###### <a id="edm_shapes_external_Agent_dct_hasPart_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#type</a>
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
###### <a id="edm_shapes_external_Agent_dct_isPartOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#cardinality</a>
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
###### <a id="edm_shapes_external_Agent_dct_isPartOf_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#range-class</a>
------
<table>
<tr><th align="right">description</th><td>dcterms:isPartOf must refer to a valid edm:Agent</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<dct_isPartOf#range-class>
  a sh:PropertyConstraint ;
  sh:description """dcterms:isPartOf must refer to a valid edm:Agent""" ;
  dc:type esc:range-class ;
  dc:subject "R-225-VALIDATION-OF-CLASS-ASSOCIATION"
           , "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:predicate dct:hasPart ;
  sh:valueShape :base ;
  sh:class edm:Agent ;
.
```
###### <a id="edm_shapes_external_Agent_dct_isPartOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#type</a>
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
#### Property <a id="http_rdvocab_info_ElementsGr2_biographicalInformation" target="_blank" href="http://rdvocab.info/ElementsGr2/biographicalInformation">http://rdvocab.info/ElementsGr2/biographicalInformation</a>
------
#### Property <a id="http_rdvocab_info_ElementsGr2_dateOfBirth" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfBirth">http://rdvocab.info/ElementsGr2/dateOfBirth</a>
------
#### Property <a id="http_rdvocab_info_ElementsGr2_dateOfDeath" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfDeath">http://rdvocab.info/ElementsGr2/dateOfDeath</a>
------
#### Property <a id="http_rdvocab_info_ElementsGr2_dateOfEstablishment" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfEstablishment">http://rdvocab.info/ElementsGr2/dateOfEstablishment</a>
------
#### Property <a id="http_rdvocab_info_ElementsGr2_dateOfTermination" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfTermination">http://rdvocab.info/ElementsGr2/dateOfTermination</a>
------
#### Property <a id="http_rdvocab_info_ElementsGr2_gender" target="_blank" href="http://rdvocab.info/ElementsGr2/gender">http://rdvocab.info/ElementsGr2/gender</a>
------
#### Property <a id="http_rdvocab_info_ElementsGr2_professionOrOccupation" target="_blank" href="http://rdvocab.info/ElementsGr2/professionOrOccupation">http://rdvocab.info/ElementsGr2/professionOrOccupation</a>
------
#### Property <a id="edm_begin" target="_blank" href="http://www.europeana.eu/schemas/edm/begin">http://www.europeana.eu/schemas/edm/begin</a>
------
###### <a id="edm_shapes_external_Agent_edm_begin_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_begin#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:begin ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```
###### <a id="edm_shapes_external_Agent_edm_begin_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#correlation">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#correlation</a>
------
<table>
<tr><th align="right">description</th><td>edm:begin must be earlier or equals than edm:end</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/50">R-43-LITERAL-VALUE-COMPARISON</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_begin#correlation>
  a sh:PropertyConstraint ;
  sh:description "edm:begin must be earlier or equals than edm:end";
  dc:type esc:correlation ;
  dc:subject "R-43-LITERAL-VALUE-COMPARISON" ;
  sh:predicate edm:begin ;
  sh:lessThanOrEquals edm:end ;
.
```
###### <a id="edm_shapes_external_Agent_edm_begin_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#literal">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#literal</a>
------
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_begin#literal>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""";
  dc:subject "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:predicate edm:begin ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```
###### <a id="edm_shapes_external_Agent_edm_begin_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#redundancy</a>
------
<table>
<tr><th align="right">description</th><td>edm:begin should not be the same as rdaGr2:dateOfBirth
                  , if true the field is redundant</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_begin#redundancy>
  a sh:Constraint ;
  dc:type esc:redundancy ;
  sh:description """edm:begin should not be the same as rdaGr2:dateOfBirth
                  , if true the field is redundant""" ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:severity sh:Warning ;
  sh:predicate edm:begin ;
  sh:notEquals rdaGr2:dateOfBirth ;
.
```
###### <a id="edm_shapes_external_Agent_edm_begin_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_begin#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:begin ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="edm_end" target="_blank" href="http://www.europeana.eu/schemas/edm/end">http://www.europeana.eu/schemas/edm/end</a>
------
###### <a id="edm_shapes_external_Agent_edm_end_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_end#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:end ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```
###### <a id="edm_shapes_external_Agent_edm_end_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#literal">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#literal</a>
------
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_end#literal>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""";
  dc:subject "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:predicate edm:end ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```
###### <a id="edm_shapes_external_Agent_edm_end_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#redundancy</a>
------
<table>
<tr><th align="right">description</th><td>edm:end should not be the same as rdaGr2:dateOfDeath
                  , if true the field is redundant</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_end#redundancy>
  a sh:Constraint ;
  dc:type esc:redundancy ;
  sh:description """edm:end should not be the same as rdaGr2:dateOfDeath
                  , if true the field is redundant""" ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:severity sh:Warning ;
  sh:predicate edm:end ;
  sh:notEquals rdaGr2:dateOfDeath ;
.
```
###### <a id="edm_shapes_external_Agent_edm_end_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_end#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:end ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="edm_hasMet" target="_blank" href="http://www.europeana.eu/schemas/edm/hasMet">http://www.europeana.eu/schemas/edm/hasMet</a>
------
###### <a id="edm_shapes_external_Agent_edm_hasMet_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_hasMet#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:hasMet ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Agent_edm_hasMet_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#range-class</a>
------
<table>
<tr><th align="right">description</th><td>edm:hasMet must refer to a valid edm:Agent, edm:Place
                  , skos:Concept or edm:TimeSpan</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_hasMet#range-class>
  a sh:PropertyConstraint ;
  sh:description """edm:hasMet must refer to a valid edm:Agent, edm:Place
                  , skos:Concept or edm:TimeSpan""";
  dc:type esc:range-class ;
  sh:predicate edm:hasMet ;
  sh:valueShape [
    sh:constraint [
      sh:or ( Agent: Place: Concept: TimeSpan: )
    ] ;
  ] ;
.
```
###### <a id="edm_shapes_external_Agent_edm_hasMet_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_hasMet#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:hasMet ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_isRelatedTo" target="_blank" href="http://www.europeana.eu/schemas/edm/isRelatedTo">http://www.europeana.eu/schemas/edm/isRelatedTo</a>
------
###### <a id="edm_shapes_external_Agent_edm_isRelatedTo_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_isRelatedTo#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_isRelatedTo#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_isRelatedTo#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isRelatedTo ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Agent_edm_isRelatedTo_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_isRelatedTo#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_isRelatedTo#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<edm_isRelatedTo#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isRelatedTo ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="owl_sameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>
------
###### <a id="edm_shapes_external_Agent_owl_sameAs_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/owl_sameAs#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/owl_sameAs#cardinality</a>
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
###### <a id="edm_shapes_external_Agent_owl_sameAs_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/owl_sameAs#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/owl_sameAs#type</a>
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
#### Property <a id="http_www_w3_org_2004_02_skos_core_altLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>
------
#### Property <a id="http_www_w3_org_2004_02_skos_core_note" target="_blank" href="http://www.w3.org/2004/02/skos/core#note">http://www.w3.org/2004/02/skos/core#note</a>
------
#### Property <a id="http_www_w3_org_2004_02_skos_core_prefLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>
------
#### Property <a id="http_xmlns_com_foaf_0_1_name" target="_blank" href="http://xmlns.com/foaf/0.1/name">http://xmlns.com/foaf/0.1/name</a>
------
