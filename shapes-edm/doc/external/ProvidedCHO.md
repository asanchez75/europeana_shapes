
## Shapes definitions for edm:ProvidedCHO class
_This document was generated from the [shapes file](/src/main/resources/etc/edm/shapes/external/ProvidedCHO.ttl) using [this software](https://github.com/hugomanguinhas/europeana_shapes/tree/master/shapes-doc)_
> This shape gathers all constraints that apply to a edm:ProvidedCHO class

The following table shows an overview of the contraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| --- | --- | --- | --- |
|<a href="#dc_contributor">dc:contributor</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_contributor_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dc_contributor_range-class">range-class</a>|
|<a href="#dc_coverage">dc:coverage</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_coverage_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dc_coverage_range-class">range-class</a>, <a href="#edm_shapes_external_ProvidedCHO_dc_coverage_subproperty_1">subproperty_1</a>, <a href="#edm_shapes_external_ProvidedCHO_dc_coverage_subproperty_2">subproperty_2</a>|
|<a href="#dc_creator">dc:creator</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_creator_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dc_creator_range-class">range-class</a>|
|<a href="#dc_date">dc:date</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_date_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dc_date_literal">literal</a>, <a href="#edm_shapes_external_ProvidedCHO_dc_date_range-class">range-class</a>, <a href="#edm_shapes_external_ProvidedCHO_dc_date_subproperty_1">subproperty_1</a>, <a href="#edm_shapes_external_ProvidedCHO_dc_date_subproperty_2">subproperty_2</a>|
|<a href="#dc_description">dc:description</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_description_cardinality">0..?</a>|||
|<a href="#dc_format">dc:format</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_format_cardinality">0..?</a>|||
|<a href="#dc_identifier">dc:identifier</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_identifier_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dc_identifier_type">type</a>|
|<a href="#dc_issued">dc:issued</a>||||
|<a href="#dc_language">dc:language</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_language_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dc_language_type">type</a>, <a href="#edm_shapes_external_ProvidedCHO_dc_language_values">values</a>|
|<a href="#dc_publisher">dc:publisher</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_publisher_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dc_publisher_range-class">range-class</a>|
|<a href="#dc_rights">dc:rights</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_rights_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dc_rights_redundancy">redundancy</a>|
|<a href="#dc_subject">dc:subject</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_subject_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dc_subject_multiplevalue">multiplevalue</a>, <a href="#edm_shapes_external_ProvidedCHO_dc_subject_range-class">range-class</a>|
|<a href="#dc_title">dc:title</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_title_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_title_type">Literal</a>||
|<a href="#dc_type">dc:type</a>|<a href="#edm_shapes_external_ProvidedCHO_dc_type_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dc_type_range-class">range-class</a>|
|<a href="#dct_alternative">dct:alternative</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_alternative_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_alternative_type">Literal</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_alternative_subproperty">subproperty</a>|
|<a href="#dct_conformsTo">dct:conformsTo</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_conformsTo_cardinality">0..?</a>|||
|<a href="#dct_created">dct:created</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_created_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dct_created_correlation">correlation</a>, <a href="#edm_shapes_external_ProvidedCHO_dct_created_range-values">range-values</a>|
|<a href="#dct_extent">dct:extent</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_extent_cardinality">0..?</a>|||
|<a href="#dct_hasFormat">dct:hasFormat</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_hasFormat_cardinality">0..?</a>|||
|<a href="#dct_hasPart">dct:hasPart</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_hasPart_cardinality">0..?</a>|||
|<a href="#dct_hasVersion">dct:hasVersion</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_hasVersion_cardinality">0..?</a>|||
|<a href="#dct_isFormatOf">dct:isFormatOf</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_isFormatOf_cardinality">0..?</a>|||
|<a href="#dct_isPartOf">dct:isPartOf</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_isPartOf_cardinality">0..?</a>|||
|<a href="#dct_isReferencedBy">dct:isReferencedBy</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_isReferencedBy_cardinality">0..?</a>|||
|<a href="#dct_isReplacedBy">dct:isReplacedBy</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_isReplacedBy_cardinality">0..?</a>|||
|<a href="#dct_isRequiredBy">dct:isRequiredBy</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_isRequiredBy_cardinality">0..?</a>|||
|<a href="#dct_isVersionOf">dct:isVersionOf</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_isVersionOf_cardinality">0..?</a>|||
|<a href="#dct_issued">dct:issued</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_issued_cardinality">0..?</a>||<a href="#edm_shapes_external_ProvidedCHO_dct_issued_range-class">range-class</a>, <a href="#edm_shapes_external_ProvidedCHO_dct_issued_range-values">range-values</a>|
|<a href="#dct_medium">dct:medium</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_medium_cardinality">0..?</a>|||
|<a href="#dct_provenance">dct:provenance</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_provenance_cardinality">0..?</a>|||
|<a href="#dct_references">dct:references</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_references_cardinality">0..?</a>|||
|<a href="#dct_replaces">dct:replaces</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_replaces_cardinality">0..?</a>|||
|<a href="#dct_requires">dct:requires</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_requires_cardinality">0..?</a>|||
|<a href="#dct_spatial">dct:spatial</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_spatial_cardinality">0..?</a>|||
|<a href="#dct_tableOfContents">dct:tableOfContents</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_tableOfContents_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_tableOfContents_type">Literal</a>||
|<a href="#dct_temporal">dct:temporal</a>|<a href="#edm_shapes_external_ProvidedCHO_dct_temporal_cardinality">0..?</a>|||
|<a href="#edm_aggregatedCHO">edm:aggregatedCHO</a>|||<a href="#edm_shapes_external_ProvidedCHO_edm_aggregatedCHO_correlation">correlation</a>|
|<a href="#edm_currentLocation">edm:currentLocation</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_currentLocation_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_currentLocation_type">IRI</a>||
|<a href="#edm_hasMet">edm:hasMet</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_hasMet_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_hasMet_type">IRI</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_hasMet_range-class">range-class</a>|
|<a href="#edm_hasType">edm:hasType</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_hasType_cardinality">0..?</a>|||
|<a href="#edm_incorporates">edm:incorporates</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_incorporates_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_incorporates_type">IRI</a>||
|<a href="#edm_isDerivativeOf">edm:isDerivativeOf</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isDerivativeOf_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isDerivativeOf_type">IRI</a>||
|<a href="#edm_isNextInSequence">edm:isNextInSequence</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isNextInSequence_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isNextInSequence_type">IRI</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isNextInSequence_correlation">correlation</a>, <a href="#edm_shapes_external_ProvidedCHO_edm_isNextInSequence_range-class">range-class</a>|
|<a href="#edm_isRelatedTo">edm:isRelatedTo</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isRelatedTo_cardinality">0..?</a>|||
|<a href="#edm_isRepresentationOf">edm:isRepresentationOf</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isRepresentationOf_cardinality">0..1</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isRepresentationOf_type">IRI</a>||
|<a href="#edm_isSimilarTo">edm:isSimilarTo</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isSimilarTo_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isSimilarTo_type">IRI</a>||
|<a href="#edm_isSuccessorOf">edm:isSuccessorOf</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isSuccessorOf_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_isSuccessorOf_type">IRI</a>||
|<a href="#edm_realizes">edm:realizes</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_realizes_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_realizes_type">IRI</a>||
|<a href="#edm_type">edm:type</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_type_cardinality">1..1</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_type_type">Literal</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_type_correlation">correlation</a>, <a href="#edm_shapes_external_ProvidedCHO_edm_type_values">values</a>|
|<a href="#edm_ugc">edm:ugc</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_ugc_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_ugc_type">Literal</a>||
|<a href="#edm_unstored">edm:unstored</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_unstored_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_edm_unstored_type">Literal</a>||
|<a href="#owl_sameAs">owl:sameAs</a>|<a href="#edm_shapes_external_ProvidedCHO_owl_sameAs_cardinality">0..?</a>|<a href="#edm_shapes_external_ProvidedCHO_owl_sameAs_type">IRI</a>||
#### Property <a id="dc_contributor" target="_blank" href="http://purl.org/dc/elements/1.1/contributor">http://purl.org/dc/elements/1.1/contributor</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_contributor_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_contributor#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_contributor#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_contributor#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:contributor ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_contributor_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_contributor#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_contributor#range-class</a>
------
<table>
<tr><th align="right">description</th><td>the reference should be one to an Agent (the access to the 
                    data and the data itself should be formatted according to 
                    the Agent specifications.)</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_contributor#range-class>
  a sh:PropertyConstraint ;
  sh:description """the reference should be one to an Agent (the access to the 
                    data and the data itself should be formatted according to 
                    the Agent specifications.)""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;  
  sh:predicate dc:contributor ;
  sh:filterShape [
    sh:property [
      sh:predicate dc:contributor ;
      sh:nodeKind sh:IRI ;
    ]
  ] ;
  sh:valueShape Agent: ;
  sh:class edm:Agent ;
.
```
#### Property <a id="dc_coverage" target="_blank" href="http://purl.org/dc/elements/1.1/coverage">http://purl.org/dc/elements/1.1/coverage</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_coverage_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:coverage ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_coverage_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#range-class</a>
------
<table>
<tr><th align="right">description</th><td>If the value is a URI, check if it refers to a TimeSpan or a
                    Place that is declared in the document.</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#range-class>
  a sh:PropertyConstraint ;
  sh:description """If the value is a URI, check if it refers to a TimeSpan or a
                    Place that is declared in the document.""" ;
  dc:type esc:range-class ;
  sh:predicate dc:coverage ;
  sh:filterShape [
    sh:property [
        sh:predicate dc:coverage ;
        sh:nodeKind sh:IRI ;
    ]
  ] ;
  sh:valueShape [
    sh:constraint [
      sh:or ( Place: TimeSpan: )
    ] ;
  ] ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_coverage_subproperty_1" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#subproperty_1">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#subproperty_1</a>
------
<table>
<tr><th align="right">description</th><td>If two dc:coverage are present, suggest the use of 
                    dcterms:spatial or dcterms:temporal.</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#subproperty">http://www.europeana.eu/schemas/edm/shapes/categories#subproperty</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#subproperty_1>
  a sh:PropertyConstraint ;
  sh:description """If two dc:coverage are present, suggest the use of 
                    dcterms:spatial or dcterms:temporal.""" ;
  dc:type esc:subproperty ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:predicate dc:coverage ;
  sh:maxCount 1 ;
  sh:severity sh:Warning ;
  sh:message "Suggest the use of dcterms:spatial or dcterms:temporal" ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_coverage_subproperty_2" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#subproperty_2">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#subproperty_2</a>
------
<table>
<tr><th align="right">description</th><td>If dc:coverage and dcterms:spatial or dcterms:temporal are 
                    present, check that the value in dc:coverage is not 
                    redundant with dcterms:spatial or dcterms:temporal for 
                    ingestion</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#subproperty">http://www.europeana.eu/schemas/edm/shapes/categories#subproperty</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_coverage#subproperty_2>
  a sh:Constraint ;
  sh:description """If dc:coverage and dcterms:spatial or dcterms:temporal are 
                    present, check that the value in dc:coverage is not 
                    redundant with dcterms:spatial or dcterms:temporal for 
                    ingestion""" ;
  dc:type esc:subproperty ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:severity sh:Warning ;
  sh:and (
    [
      sh:property [
        sh:predicate dc:coverage ;
        sh:notEquals dct:spatial ;
      ]
    ]
    [
      sh:property [
        sh:predicate dc:coverage ;
        sh:notEquals dct:temporal ;
      ]
    ]
  )
.
```
#### Property <a id="dc_creator" target="_blank" href="http://purl.org/dc/elements/1.1/creator">http://purl.org/dc/elements/1.1/creator</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_creator_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_creator#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_creator#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_creator#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:creator ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_creator_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_creator#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_creator#range-class</a>
------
<table>
<tr><th align="right">description</th><td>the reference should be one to an Agent (the access to the 
                    data and the data itself should be formatted according to 
                    the Agent specifications.)</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_creator#range-class>
  a sh:PropertyConstraint ;
  sh:description """the reference should be one to an Agent (the access to the 
                    data and the data itself should be formatted according to 
                    the Agent specifications.)""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:predicate dc:creator ;
  sh:filterShape [ #restrict only to nodes
      sh:property [
          sh:predicate dc:creator ;
          sh:nodeKind sh:IRI ;
      ]
  ] ;
  sh:valueShape Agent: ;
  sh:class edm:Agent ;
.
```
#### Property <a id="dc_date" target="_blank" href="http://purl.org/dc/elements/1.1/date">http://purl.org/dc/elements/1.1/date</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_date_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:date ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_date_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#literal">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#literal</a>
------
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#literal>
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
###### <a id="edm_shapes_external_ProvidedCHO_dc_date_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#range-class</a>
------
<table>
<tr><th align="right">description</th><td>the reference should be one to a TimeSpan (the access to 
                    the data and the data itself should be formatted according 
                    to the TimeSpan specifications.)</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#range-class>
  a sh:PropertyConstraint ;
  sh:description """the reference should be one to a TimeSpan (the access to 
                    the data and the data itself should be formatted according 
                    to the TimeSpan specifications.)""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;  
  sh:predicate dc:date ;
  sh:filterShape [
      sh:property [
          sh:predicate dc:date ;
          sh:nodeKind sh:IRI ;
      ]
  ] ;
  sh:valueShape TimeSpan: ;
  sh:class edm:TimeSpan ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_date_subproperty_1" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#subproperty_1">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#subproperty_1</a>
------
<table>
<tr><th align="right">description</th><td>If two dc:date are present, suggest the use of 
                    dcterms:created or dcterms:issued.</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#subproperty">http://www.europeana.eu/schemas/edm/shapes/categories#subproperty</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#subproperty_1>
  a sh:PropertyConstraint ;
  sh:description """If two dc:date are present, suggest the use of 
                    dcterms:created or dcterms:issued.""" ;
  dc:type esc:subproperty ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:predicate dc:date ;
  sh:maxCount 1 ;
  sh:severity sh:Warning ;
  sh:message "Suggest the use of dcterms:created or dcterms:issued" ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_date_subproperty_2" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#subproperty_2">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#subproperty_2</a>
------
<table>
<tr><th align="right">description</th><td>If dc:date and dcterms:created or dcterms:issued are present
                    , check that the value in dc:date is not redundant with 
                    dcterms:created or dctersm:issued for ingestion</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#subproperty">http://www.europeana.eu/schemas/edm/shapes/categories#subproperty</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_date#subproperty_2>
  a sh:Constraint ;
  sh:description """If dc:date and dcterms:created or dcterms:issued are present
                    , check that the value in dc:date is not redundant with 
                    dcterms:created or dctersm:issued for ingestion""" ;
  dc:type esc:subproperty ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:severity sh:Warning ;
  sh:and (
    [
      sh:predicate  dc:date ;
      sh:notEquals dct:created ;
    ]
    [
      sh:predicate dc:date ;
      sh:notEquals dct:issued ;
    ]
  )
.
```
#### Property <a id="dc_description" target="_blank" href="http://purl.org/dc/elements/1.1/description">http://purl.org/dc/elements/1.1/description</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_description_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_description#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_description#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_description#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:description ;
  sh:minCount 0 ;
.
```
#### Property <a id="dc_format" target="_blank" href="http://purl.org/dc/elements/1.1/format">http://purl.org/dc/elements/1.1/format</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_format_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_format#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_format#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_format#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:format ;
  sh:minCount 0 ;
.
```
#### Property <a id="dc_identifier" target="_blank" href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_identifier_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_identifier#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_identifier#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_identifier#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:identifier ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_identifier_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_identifier#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_identifier#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_identifier#type>
  a sh:PropertyConstraint ;
  sh:predicate dc:identifier ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="dc_issued" target="_blank" href="http://purl.org/dc/elements/1.1/issued">http://purl.org/dc/elements/1.1/issued</a>
------
#### Property <a id="dc_language" target="_blank" href="http://purl.org/dc/elements/1.1/language">http://purl.org/dc/elements/1.1/language</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_language_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:language ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_language_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#type>
  a sh:PropertyConstraint ;
  sh:predicate dc:language ;
  sh:nodeKind sh:Literal ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_language_values" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#values">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#values</a>
------
<table>
<tr><th align="right">description</th><td>Check that the value for language matches ISO 639 two-letter
                    code if it exists at http://www.loc.gov/standards/iso639-2/php/code_list.php
                    otherwise accept three-letter code.</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/54">R-47-SPECIFY-AND-VALIDATE-LANGUAGE-TAGS</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/56">R-49-PROPERTY-OCCURS-ONCE-PER-LANGUAGE-TAG</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#values>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for language matches ISO 639 two-letter
                    code if it exists at http://www.loc.gov/standards/iso639-2/php/code_list.php
                    otherwise accept three-letter code.""" ;
  dc:subject "R-49-PROPERTY-OCCURS-ONCE-PER-LANGUAGE-TAG"
           , "R-47-SPECIFY-AND-VALIDATE-LANGUAGE-TAGS" ;
  sh:predicate dc:language ;
  #alternative is to have the full list of acceptable values
  sh:pattern "^[a-z]{2}$" ;
.
```
#### Property <a id="dc_publisher" target="_blank" href="http://purl.org/dc/elements/1.1/publisher">http://purl.org/dc/elements/1.1/publisher</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_publisher_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_publisher#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_publisher#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_publisher#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:publisher ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_publisher_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_publisher#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_publisher#range-class</a>
------
<table>
<tr><th align="right">description</th><td>The reference should be one to an Agent( the access to the 
                    data and the data itself should be formatted according to 
                    the Agent specifications.)</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_publisher#range-class>
  a sh:PropertyConstraint ;
  sh:description """The reference should be one to an Agent( the access to the 
                    data and the data itself should be formatted according to 
                    the Agent specifications.)""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:predicate dc:publisher ;
  sh:filterShape [
    sh:property [
      sh:predicate dc:publisher ;
      sh:nodeKind sh:IRI ;
    ]
  ] ;
  sh:valueShape Agent: ;
  sh:class edm:Agent ;
.
```
#### Property <a id="dc_rights" target="_blank" href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_rights_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_rights#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_rights#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_rights#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:rights ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_rights_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_rights#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_rights#redundancy</a>
------
<table>
<tr><th align="right">description</th><td>Check if dc:rights has the same value than edm:rights of the 
                    Aggregation (either as rdf:resource or literal), if yes the 
                    field is redundant</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_rights#redundancy>
  a tpl:RedundancyConstraint, sh:Constraint ;
  dc:type esc:redundancy ;
  sh:description """Check if dc:rights has the same value than edm:rights of the 
                    Aggregation (either as rdf:resource or literal), if yes the 
                    field is redundant""" ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:predicate  dc:rights ;
  sh:scopeClass edm:Aggregation ;
  sh:notEquals  edm:rights ;
  sh:severity sh:Warning ;
.
```
#### Property <a id="dc_subject" target="_blank" href="http://purl.org/dc/elements/1.1/subject">http://purl.org/dc/elements/1.1/subject</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_subject_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_subject#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_subject#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_subject#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:subject ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_subject_multiplevalue" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_subject#multiplevalue">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_subject#multiplevalue</a>
------
<table>
<tr><th align="right">description</th><td>If more than one term is in the field, a new dc:subject 
                    should be created.</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_subject#multiplevalue>
  a sh:PropertyConstraint ;

  sh:description """If more than one term is in the field, a new dc:subject 
                    should be created.""" ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  skos:note """The field is considered to have multiple terms if a separator is 
               detected""" ;
  sh:severity sh:Warning ;

  sh:predicate dc:subject ;
  sh:pattern "^.*[,;].*$" ; #check for char separators

  sh:message """More than one term was detected, suggest the use of a new 
                dc:subject field""" ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_subject_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_subject#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_subject#range-class</a>
------
<table>
<tr><th align="right">description</th><td>The reference should be one to a Concept( the access to the
                    data and the data itself should be formatted according to 
                    the Concept specifications.)</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_subject#range-class>
  a sh:PropertyConstraint ;
  sh:description """The reference should be one to a Concept( the access to the
                    data and the data itself should be formatted according to 
                    the Concept specifications.)""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;  
  sh:predicate dc:publisher ;
  sh:filterShape [ #restrict only to nodes
      sh:property [
          sh:predicate dc:subject ;
          sh:nodeKind sh:IRI ;
      ]
  ] ;
  sh:valueShape Concept: ;
  sh:class skos:Concept ;
.
```
#### Property <a id="dc_title" target="_blank" href="http://purl.org/dc/elements/1.1/title">http://purl.org/dc/elements/1.1/title</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_title_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_title#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_title#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_title#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:title ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_title_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_title#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_title#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_title#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dc:title ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="dc_type" target="_blank" href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dc_type_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_type#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_type#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_type#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:type ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dc_type_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_type#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_type#range-class</a>
------
<table>
<tr><th align="right">description</th><td>If the value is a URI, check if a skos:Concept class is 
                    created.</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_type#range-class>
  a sh:PropertyConstraint ;
  sh:description """If the value is a URI, check if a skos:Concept class is 
                    created.""" ;
#  sh:description """The reference should be one to a Concept( the access to the
#                    data and the data itself should be formatted according to 
#                    the Concept specifications.)""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:predicate dc:type ;
  sh:filterShape [
    sh:property [
      sh:predicate dc:type ;
      sh:nodeKind sh:IRI ;
    ]
  ] ;
  sh:valueShape Concept: ;
  sh:class skos:Concept ;
.
```
#### Property <a id="dct_alternative" target="_blank" href="http://purl.org/dc/terms/alternative">http://purl.org/dc/terms/alternative</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_alternative_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:alternative ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dct_alternative_subproperty" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#subproperty">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#subproperty</a>
------
<table>
<tr><th align="right">description</th><td>If dcterms:alternative has the same title than dc:title, 
                    then dcterms:alternative is redundant.</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#subproperty">http://www.europeana.eu/schemas/edm/shapes/categories#subproperty</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#subproperty>
  a sh:PropertyConstraint ;
  dc:type esc:subproperty ;
  sh:description """If dcterms:alternative has the same title than dc:title, 
                    then dcterms:alternative is redundant.""" ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:severity sh:Warning ;
  sh:predicate dct:alternative ;
  sh:notEquals dc:title ;
#  sh:message "Redundant dcterms:alternative" ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dct_alternative_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:alternative ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="dct_conformsTo" target="_blank" href="http://purl.org/dc/terms/conformsTo">http://purl.org/dc/terms/conformsTo</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_conformsTo_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_conformsTo#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_conformsTo#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_conformsTo#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:conformsTo ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_created" target="_blank" href="http://purl.org/dc/terms/created">http://purl.org/dc/terms/created</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_created_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_created#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_created#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_created#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:created ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dct_created_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_created#correlation">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_created#correlation</a>
------
<table>
<tr><th align="right">description</th><td>dcterms:created must be equal or earlier than dcterms:issued</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/50">R-43-LITERAL-VALUE-COMPARISON</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_created#correlation>
  a sh:PropertyConstraint ;

  sh:description "dcterms:created must be equal or earlier than dcterms:issued";
#  sh:description """Check that dcterms:created is equal or earlier than 
#                    dcterms:issued""" ;
  dc:type esc:correlation ;
  dc:subject "R-43-LITERAL-VALUE-COMPARISON" ;

  sh:predicate dct:created ;
  sh:lessThanOrEquals dct:issued ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dct_created_range-values" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_created#range-values">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_created#range-values</a>
------
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-value">http://www.europeana.eu/schemas/edm/shapes/categories#range-value</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_created#range-values>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""" ;
  dc:type esc:range-value ;
  dc:subject "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:predicate dct:created ;
  sh:filterShape [ #restrict only to Literals
    sh:property [
      sh:predicate dct:created ;
      sh:nodeKind sh:Literal ;
    ]
  ] ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```
#### Property <a id="dct_extent" target="_blank" href="http://purl.org/dc/terms/extent">http://purl.org/dc/terms/extent</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_extent_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_extent#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_extent#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_extent#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:extent ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_hasFormat" target="_blank" href="http://purl.org/dc/terms/hasFormat">http://purl.org/dc/terms/hasFormat</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_hasFormat_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_hasFormat#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_hasFormat#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_hasFormat#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:hasFormat ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_hasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_hasPart_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_hasPart#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_hasPart#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_hasPart#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:hasPart ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_hasVersion" target="_blank" href="http://purl.org/dc/terms/hasVersion">http://purl.org/dc/terms/hasVersion</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_hasVersion_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_hasVersion#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_hasVersion#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_hasVersion#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:hasVersion ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_isFormatOf" target="_blank" href="http://purl.org/dc/terms/isFormatOf">http://purl.org/dc/terms/isFormatOf</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_isFormatOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isFormatOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isFormatOf#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isFormatOf#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:isFormatOf ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_isPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_isPartOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isPartOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isPartOf#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isPartOf#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:isPartOf ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_isReferencedBy" target="_blank" href="http://purl.org/dc/terms/isReferencedBy">http://purl.org/dc/terms/isReferencedBy</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_isReferencedBy_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isReferencedBy#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isReferencedBy#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isReferencedBy#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:isReferencedBy ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_isReplacedBy" target="_blank" href="http://purl.org/dc/terms/isReplacedBy">http://purl.org/dc/terms/isReplacedBy</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_isReplacedBy_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isReplacedBy#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isReplacedBy#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isReplacedBy#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:isReplacedBy ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_isRequiredBy" target="_blank" href="http://purl.org/dc/terms/isRequiredBy">http://purl.org/dc/terms/isRequiredBy</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_isRequiredBy_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isRequiredBy#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isRequiredBy#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isRequiredBy#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:isRequiredBy ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_isVersionOf" target="_blank" href="http://purl.org/dc/terms/isVersionOf">http://purl.org/dc/terms/isVersionOf</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_isVersionOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isVersionOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isVersionOf#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_isVersionOf#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:isVersionOf ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_issued" target="_blank" href="http://purl.org/dc/terms/issued">http://purl.org/dc/terms/issued</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_issued_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_issued#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_issued#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_issued#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:issued ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dct_issued_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_issued#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_issued#range-class</a>
------
<table>
<tr><th align="right">description</th><td>the reference should be one to a TimeSpan (the access to 
                    the data and the data itself should be formatted according 
                    to the TimeSpan specifications.)</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_issued#range-class>
  a sh:PropertyConstraint ;
  sh:description """the reference should be one to a TimeSpan (the access to 
                    the data and the data itself should be formatted according 
                    to the TimeSpan specifications.)""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;  
  sh:predicate dc:issued ;
  sh:filterShape [
      sh:property [
          sh:predicate dct:issued ;
          sh:nodeKind sh:IRI ;
      ]
  ] ;
  sh:valueShape TimeSpan: ;
  sh:class edm:TimeSpan ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dct_issued_range-values" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_issued#range-values">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_issued#range-values</a>
------
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-value">http://www.europeana.eu/schemas/edm/shapes/categories#range-value</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_issued#range-values>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""" ;
  dc:type esc:range-value ;
  dc:subject "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:predicate dct:issued ;
  sh:filterShape [ #restrict only to Literals
    sh:property [
      sh:predicate dct:issued ;
      sh:nodeKind sh:Literal ;
    ]
  ] ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```
#### Property <a id="dct_medium" target="_blank" href="http://purl.org/dc/terms/medium">http://purl.org/dc/terms/medium</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_medium_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_medium#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_medium#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_medium#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:medium ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_provenance" target="_blank" href="http://purl.org/dc/terms/provenance">http://purl.org/dc/terms/provenance</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_provenance_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_provenance#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_provenance#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_provenance#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:provenance ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_references" target="_blank" href="http://purl.org/dc/terms/references">http://purl.org/dc/terms/references</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_references_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_references#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_references#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_references#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:references ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_replaces" target="_blank" href="http://purl.org/dc/terms/replaces">http://purl.org/dc/terms/replaces</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_replaces_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_replaces#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_replaces#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_replaces#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:replaces ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_requires" target="_blank" href="http://purl.org/dc/terms/requires">http://purl.org/dc/terms/requires</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_requires_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_requires#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_requires#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_requires#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:requires ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_spatial" target="_blank" href="http://purl.org/dc/terms/spatial">http://purl.org/dc/terms/spatial</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_spatial_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_spatial#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_spatial#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_spatial#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:spatial ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_tableOfContents" target="_blank" href="http://purl.org/dc/terms/tableOfContents">http://purl.org/dc/terms/tableOfContents</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_tableOfContents_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_tableOfContents#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_tableOfContents#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_tableOfContents#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:tableOfContents ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_dct_tableOfContents_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_tableOfContents#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_tableOfContents#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_tableOfContents#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:tableOfContents ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="dct_temporal" target="_blank" href="http://purl.org/dc/terms/temporal">http://purl.org/dc/terms/temporal</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_dct_temporal_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_temporal#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_temporal#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_temporal#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:temporal ;
  sh:minCount 0 ;
.
```
#### Property <a id="edm_aggregatedCHO" target="_blank" href="http://www.europeana.eu/schemas/edm/aggregatedCHO">http://www.europeana.eu/schemas/edm/aggregatedCHO</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_aggregatedCHO_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_aggregatedCHO#correlation">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_aggregatedCHO#correlation</a>
------
<table>
<tr><th align="right">description</th><td>Check that the URI of the ProvidedCHO and the URI described 
                    in edm:aggregatedCHO are the same.</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_aggregatedCHO#correlation>
  a sh:InversePropertyConstraint ;
  sh:description """Check that the URI of the ProvidedCHO and the URI described 
                    in edm:aggregatedCHO are the same.""" ;
  dc:type esc:correlation ;
  dc:subject "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:aggregatedCHO ;
  sh:valueClass ore:Aggregation ;
  sh:minCount 1 ;
  sh:maxCount 1 ; #this enforces uniqueness
.
```
#### Property <a id="edm_currentLocation" target="_blank" href="http://www.europeana.eu/schemas/edm/currentLocation">http://www.europeana.eu/schemas/edm/currentLocation</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_currentLocation_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_currentLocation#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_currentLocation#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_currentLocation#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:currentLocation ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_currentLocation_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_currentLocation#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_currentLocation#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_currentLocation#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:currentLocation ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_hasMet" target="_blank" href="http://www.europeana.eu/schemas/edm/hasMet">http://www.europeana.eu/schemas/edm/hasMet</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_hasMet_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:hasMet ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_hasMet_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#range-class</a>
------
<table>
<tr><th align="right">description</th><td>A edm:hasMet should reference one of Agent, Place, TimeSpan 
                    or Concept that is declared in the record</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#range-class>
  a sh:Constraint ;
  sh:description """A edm:hasMet should reference one of Agent, Place, TimeSpan 
                    or Concept that is declared in the record""" ;
# sh:description """the reference should be one to an Agent, a Place, a TimeSpan
#                   or a Concept ( the access to the data and the data itself 
#                   should be formatted according to the specifications of the 
#                   corresponding classes.)""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:or (
    [ sh:predicate dc:contributor ; sh:valueShape Agent:    ]
    [ sh:predicate dc:contributor ; sh:valueShape Place:    ]
    [ sh:predicate dc:contributor ; sh:valueShape TimeSpan: ]
    [ sh:predicate dc:contributor ; sh:valueShape Concept:  ]
  )
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_hasMet_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:hasMet ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_hasType" target="_blank" href="http://www.europeana.eu/schemas/edm/hasType">http://www.europeana.eu/schemas/edm/hasType</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_hasType_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasType#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasType#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasType#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:hasType ;
  sh:minCount 0 ;
.
```
#### Property <a id="edm_incorporates" target="_blank" href="http://www.europeana.eu/schemas/edm/incorporates">http://www.europeana.eu/schemas/edm/incorporates</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_incorporates_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_incorporates#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_incorporates#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_incorporates#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:incorporates ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_incorporates_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_incorporates#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_incorporates#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_incorporates#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:incorporates ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_isDerivativeOf" target="_blank" href="http://www.europeana.eu/schemas/edm/isDerivativeOf">http://www.europeana.eu/schemas/edm/isDerivativeOf</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_isDerivativeOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isDerivativeOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isDerivativeOf#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isDerivativeOf#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isDerivativeOf ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_isDerivativeOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isDerivativeOf#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isDerivativeOf#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isDerivativeOf#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isDerivativeOf ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_isNextInSequence" target="_blank" href="http://www.europeana.eu/schemas/edm/isNextInSequence">http://www.europeana.eu/schemas/edm/isNextInSequence</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_isNextInSequence_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isNextInSequence ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_isNextInSequence_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#correlation">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#correlation</a>
------
<table>
<tr><th align="right">description</th><td>The ProvidedCHO referred to by this property must share 
                    the same parent</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="null">?</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#correlation>
  a sh:PropertyConstraint ;
  dc:type esc:correlation ;
  sh:description """The ProvidedCHO referred to by this property must share 
                    the same parent""" ;
  dc:subject "?" ;
  sh:predicate edm:isNextInSequence ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_isNextInSequence_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#range-class">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#range-class</a>
------
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:ProvidedCHO</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#range-class>
  a sh:PropertyConstraint ;
  sh:description """The reference should be a valid edm:ProvidedCHO""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:isNextInSequence ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_isNextInSequence_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isNextInSequence ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_isRelatedTo" target="_blank" href="http://www.europeana.eu/schemas/edm/isRelatedTo">http://www.europeana.eu/schemas/edm/isRelatedTo</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_isRelatedTo_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRelatedTo#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRelatedTo#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRelatedTo#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isRelatedTo ;
  sh:minCount 0 ;
.
```
#### Property <a id="edm_isRepresentationOf" target="_blank" href="http://www.europeana.eu/schemas/edm/isRepresentationOf">http://www.europeana.eu/schemas/edm/isRepresentationOf</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_isRepresentationOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRepresentationOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRepresentationOf#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRepresentationOf#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isRepresentationOf ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_isRepresentationOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRepresentationOf#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRepresentationOf#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRepresentationOf#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isRepresentationOf ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_isSimilarTo" target="_blank" href="http://www.europeana.eu/schemas/edm/isSimilarTo">http://www.europeana.eu/schemas/edm/isSimilarTo</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_isSimilarTo_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSimilarTo#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSimilarTo#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSimilarTo#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isSimilarTo ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_isSimilarTo_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSimilarTo#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSimilarTo#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSimilarTo#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isSimilarTo ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_isSuccessorOf" target="_blank" href="http://www.europeana.eu/schemas/edm/isSuccessorOf">http://www.europeana.eu/schemas/edm/isSuccessorOf</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_isSuccessorOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSuccessorOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSuccessorOf#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSuccessorOf#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isSuccessorOf ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_isSuccessorOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSuccessorOf#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSuccessorOf#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSuccessorOf#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isSuccessorOf ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_realizes" target="_blank" href="http://www.europeana.eu/schemas/edm/realizes">http://www.europeana.eu/schemas/edm/realizes</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_realizes_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_realizes#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_realizes#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_realizes#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:realizes ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_realizes_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_realizes#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_realizes#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_realizes#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:realizes ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_type" target="_blank" href="http://www.europeana.eu/schemas/edm/type">http://www.europeana.eu/schemas/edm/type</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_type_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:type ;
  sh:minCount 1 ;
  sh:maxCount 1 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_type_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#correlation">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#correlation</a>
------
<table>
<tr><th align="right">description</th><td>If the value of edm:type is '3D' then the syntax of 
                    dc:format must be '3D-PDF'</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#correlation>
  a sh:PropertyConstraint ;
# sh:description """Check that if the value of edm:type  is 3D the syntax of 
#                   dc:format is 3D-PDF """ ;
  sh:description """If the value of edm:type is '3D' then the syntax of 
                    dc:format must be '3D-PDF'""";
  dc:type esc:correlation ;
  dc:subject "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:filterShape [
    sh:property [
      sh:predicate edm:type ;
      sh:hasValue "3D" ;
    ]
  ] ;
  sh:predicate dc:format ;
  sh:hasValue "3D-PDF" ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_type_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:type ;
  sh:nodeKind sh:Literal ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_type_values" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#values">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#values</a>
------
<table>
<tr><th align="right">description</th><td>The value of edm:type must match one of: 
                    TEXT, VIDEO, SOUND, IMAGE, 3D</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/37">R-30-DEFINE-VALUE-LISTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#values">http://www.europeana.eu/schemas/edm/shapes/categories#values</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#values>
  a sh:PropertyConstraint ;
  dc:type esc:values ;
  sh:description """The value of edm:type must match one of: 
                    TEXT, VIDEO, SOUND, IMAGE, 3D""" ;
# sh:description """Check that edm:type matches the value 
#                   TEXT, VIDEO, SOUND, IMAGE, 3D""" ;
  dc:subject "R-30-DEFINE-VALUE-LISTS" ;
  sh:predicate edm:type ;
  sh:in ( "TEXT" "VIDEO" "SOUND" "IMAGE" "3D" ) ;
.
```
#### Property <a id="edm_ugc" target="_blank" href="http://www.europeana.eu/schemas/edm/ugc">http://www.europeana.eu/schemas/edm/ugc</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_ugc_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_ugc#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_ugc#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_ugc#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:ugc ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_ugc_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_ugc#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_ugc#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_ugc#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:ugc ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="edm_unstored" target="_blank" href="http://www.europeana.eu/schemas/edm/unstored">http://www.europeana.eu/schemas/edm/unstored</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_edm_unstored_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_unstored#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_unstored#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_unstored#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:unstored ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_edm_unstored_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_unstored#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_unstored#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_unstored#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:unstored ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="owl_sameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>
------
###### <a id="edm_shapes_external_ProvidedCHO_owl_sameAs_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/owl_sameAs#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/owl_sameAs#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/owl_sameAs#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate owl:sameAs ;
  sh:minCount 0 ;
.
```
###### <a id="edm_shapes_external_ProvidedCHO_owl_sameAs_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/owl_sameAs#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/owl_sameAs#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/owl_sameAs#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate owl:sameAs ;
  sh:nodeKind sh:IRI ;
.
```
