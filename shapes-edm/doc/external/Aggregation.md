## Shapes definitions for ore:Aggregation class
*This document was generated from the [shapes file](../../src/main/resources/etc/edm/shapes/external/Aggregation.ttl) using [this software](https://github.com/hugomanguinhas/europeana_shapes/tree/master/shapes-doc)*
> This shape gathers all constraints that apply to a ore:Aggregation class
The following table shows an overview of the contraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| --- | --- | --- | --- |
|<a href="#dc_rights">dc:rights</a>|<a href="#edm_shapes_external_Aggregation_dc_rights_cardinality">0..?</a>|<a href="#edm_shapes_external_Aggregation_dc_rights_type">Literal</a>|<a href="#edm_shapes_external_Aggregation_dc_rights_redundancy">redundancy</a>|
|<a href="#edm_aggregatedCHO">edm:aggregatedCHO</a>|<a href="#edm_shapes_external_Aggregation_edm_aggregatedCHO_cardinality">1..1</a>|<a href="#edm_shapes_external_Aggregation_edm_aggregatedCHO_type">IRI</a>|<a href="#edm_shapes_external_Aggregation_edm_aggregatedCHO_range-class">range-class</a>|
|<a href="#edm_dataProvider">edm:dataProvider</a>|<a href="#edm_shapes_external_Aggregation_edm_dataProvider_cardinality">1..1</a>|||
|<a href="#edm_hasView">edm:hasView</a>|<a href="#edm_shapes_external_Aggregation_edm_hasView_cardinality">0..?</a>|<a href="#edm_shapes_external_Aggregation_edm_hasView_type">IRI</a>|<a href="#edm_shapes_external_Aggregation_edm_hasView_range-class">range-class</a>|
|<a href="#edm_isShownAt">edm:isShownAt</a>|<a href="#edm_shapes_external_Aggregation_edm_isShownAt_cardinality">0..1</a>|<a href="#edm_shapes_external_Aggregation_edm_isShownAt_type">IRI</a>|<a href="#edm_shapes_external_Aggregation_edm_isShownAt_range-class">range-class</a>|
|<a href="#edm_isShownBy">edm:isShownBy</a>|<a href="#edm_shapes_external_Aggregation_edm_isShownBy_cardinality">0..1</a>|<a href="#edm_shapes_external_Aggregation_edm_isShownBy_type">IRI</a>|<a href="#edm_shapes_external_Aggregation_edm_isShownBy_range-class">range-class</a>|
|<a href="#edm_object">edm:object</a>|<a href="#edm_shapes_external_Aggregation_edm_object_cardinality">0..?</a>|<a href="#edm_shapes_external_Aggregation_edm_object_type">IRI</a>|<a href="#edm_shapes_external_Aggregation_edm_object_range-class">range-class</a>|
|<a href="#edm_provider">edm:provider</a>|<a href="#edm_shapes_external_Aggregation_edm_provider_cardinality">1..1</a>|||
|<a href="#edm_rights">edm:rights</a>|<a href="#edm_shapes_external_Aggregation_edm_rights_cardinality">0..?</a>|<a href="#edm_shapes_external_Aggregation_edm_rights_type">IRI</a>|<a href="#edm_shapes_external_Aggregation_edm_rights_values">values</a>|
|<a href="#edm_ugc">edm:ugc</a>|<a href="#edm_shapes_external_Aggregation_edm_ugc_cardinality">1..?</a>|<a href="#edm_shapes_external_Aggregation_edm_ugc_type">Literal</a>||
|<a href="#edm_unstored">edm:unstored</a>|<a href="#edm_shapes_external_Aggregation_edm_unstored_cardinality">0..?</a>|<a href="#edm_shapes_external_Aggregation_edm_unstored_type">Literal</a>||
#### Property <a id="dc_rights" target="_blank" href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>
------
###### <a id="edm_shapes_external_Aggregation_dc_rights_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:rights ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Aggregation_dc_rights_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#redundancy</a>
------
<table>
<tr><th align="right">description</th><td>dc:rights should not be the same as edm:rights, if true
                    the field is redundant</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#redundancy>
  a sh:PropertyConstraint ;
  dc:type esc:redundancy ;
  sh:description """dc:rights should not be the same as edm:rights, if true
                    the field is redundant""" ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:severity sh:Warning ;
  sh:predicate dc:rights ;
  sh:notEquals edm:rights ;
.
```
###### <a id="edm_shapes_external_Aggregation_dc_rights_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:rights ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="edm_aggregatedCHO" target="_blank" href="http://www.europeana.eu/schemas/edm/aggregatedCHO">http://www.europeana.eu/schemas/edm/aggregatedCHO</a>
------
###### <a id="edm_shapes_external_Aggregation_edm_aggregatedCHO_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:aggregatedCHO ;
  sh:minCount 1 ;
  sh:maxCount 1 ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_aggregatedCHO_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#range-class</a>
------
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:ProvidedCHO</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:ProvidedCHO" ;
# sh:description "Check that the URI refers to an existing CHO" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:aggregatedCHO ;
  sh:valueShape ProvidedCHO: ;
  sh:class edm:ProvidedCHO ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_aggregatedCHO_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:aggregatedCHO ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_dataProvider" target="_blank" href="http://www.europeana.eu/schemas/edm/dataProvider">http://www.europeana.eu/schemas/edm/dataProvider</a>
------
###### <a id="edm_shapes_external_Aggregation_edm_dataProvider_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_dataProvider#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_dataProvider#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_dataProvider#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:dataProvider ;
  sh:minCount 1 ;
  sh:maxCount 1 ;
.
```
#### Property <a id="edm_hasView" target="_blank" href="http://www.europeana.eu/schemas/edm/hasView">http://www.europeana.eu/schemas/edm/hasView</a>
------
###### <a id="edm_shapes_external_Aggregation_edm_hasView_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:hasView ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_hasView_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#range-class</a>
------
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/455">R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:WebResource" ;
# sh:description "Check that the pointed media resolves to a landing page" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:hasView ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_hasView_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:hasView ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_isShownAt" target="_blank" href="http://www.europeana.eu/schemas/edm/isShownAt">http://www.europeana.eu/schemas/edm/isShownAt</a>
------
###### <a id="edm_shapes_external_Aggregation_edm_isShownAt_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isShownAt ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_isShownAt_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#range-class</a>
------
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/455">R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:WebResource" ;
# sh:description "Check that the pointed media resolves to a landing page" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:isShownAt ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_isShownAt_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isShownAt ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_isShownBy" target="_blank" href="http://www.europeana.eu/schemas/edm/isShownBy">http://www.europeana.eu/schemas/edm/isShownBy</a>
------
###### <a id="edm_shapes_external_Aggregation_edm_isShownBy_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isShownBy ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_isShownBy_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#range-class</a>
------
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/455">R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:WebResource" ;
# sh:description "Check that the URI resolves to a media" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:isShownBy ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_isShownBy_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isShownBy ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_object" target="_blank" href="http://www.europeana.eu/schemas/edm/object">http://www.europeana.eu/schemas/edm/object</a>
------
###### <a id="edm_shapes_external_Aggregation_edm_object_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:object ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_object_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#range-class</a>
------
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/455">R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:WebResource" ;
# sh:description "Check that the URI resolves to a media" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:object ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_object_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:object ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_provider" target="_blank" href="http://www.europeana.eu/schemas/edm/provider">http://www.europeana.eu/schemas/edm/provider</a>
------
###### <a id="edm_shapes_external_Aggregation_edm_provider_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_provider#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_provider#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_provider#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:provider ;
  sh:minCount 1 ;
  sh:maxCount 1 ;
.
```
#### Property <a id="edm_rights" target="_blank" href="http://www.europeana.eu/schemas/edm/rights">http://www.europeana.eu/schemas/edm/rights</a>
------
###### <a id="edm_shapes_external_Aggregation_edm_rights_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:rights ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_rights_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:rights ;
  sh:nodeKind sh:IRI ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_rights_values" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#values">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#values</a>
------
<table>
<tr><th align="right">description</th><td>Check the value is one of the controlled values: 
             http://pro.europeana.eu/web/guest/available-rights-statements </td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/37">R-30-DEFINE-VALUE-LISTS</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/423">R-210-DEFINE-EXCLUSIVELY-ALLOWED-PROPERTIES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#values">http://www.europeana.eu/schemas/edm/shapes/categories#values</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#values>
  a sh:PropertyConstraint ;
  dc:type esc:values ;
  sh:description """Check the value is one of the controlled values: 
             http://pro.europeana.eu/web/guest/available-rights-statements """ ;
  dc:subject "R-210-DEFINE-EXCLUSIVELY-ALLOWED-PROPERTIES"
           , "R-30-DEFINE-VALUE-LISTS" ;
  sh:predicate edm:rights ;
  sh:in ( <http://creativecommons.org/publicdomain/mark/1.0/> 
          <http://www.europeana.eu/rights/out-of-copyright-non-commercial/>
          <http://creativecommons.org/publicdomain/zero/1.0/>
          <http://creativecommons.org/licenses/by/4.0/>
          <http://creativecommons.org/licenses/by-sa/4.0/>
          <http://creativecommons.org/licenses/by-nd/4.0/>
          <http://creativecommons.org/licenses/by-nc/4.0/>
          <http://creativecommons.org/licenses/by-nc-sa/4.0/>
          <http://creativecommons.org/licenses/by-nc-nd/4.0/>
          <http://www.europeana.eu/rights/rr-f/>
          <http://www.europeana.eu/rights/rr-p/> 
          <http://www.europeana.eu/rights/orphan-work-eu/>
          <http://www.europeana.eu/rights/unknown/> ) ;
.
```
#### Property <a id="edm_ugc" target="_blank" href="http://www.europeana.eu/schemas/edm/ugc">http://www.europeana.eu/schemas/edm/ugc</a>
------
###### <a id="edm_shapes_external_Aggregation_edm_ugc_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:ugc ;
  sh:minCount 0 ;
  sh:minCount 1 ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_ugc_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:ugc ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="edm_unstored" target="_blank" href="http://www.europeana.eu/schemas/edm/unstored">http://www.europeana.eu/schemas/edm/unstored</a>
------
###### <a id="edm_shapes_external_Aggregation_edm_unstored_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_unstored#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_unstored#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_unstored#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:unstored ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_Aggregation_edm_unstored_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_unstored#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_unstored#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
*Shape definition in Turtle syntax:*
```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_unstored#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:unstored ;
  sh:nodeKind sh:Literal ;
.
```
