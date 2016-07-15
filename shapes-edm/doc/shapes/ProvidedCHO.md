
## Shapes definitions for edm:ProvidedCHO class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/ProvidedCHO.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a edm:ProvidedCHO class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'><a href="#http_www_europeana_eu_schemas_edm_shapes_external_ProvidedCHO_closure">closure</a>, <a href="#http_www_europeana_eu_schemas_edm_shapes_external_ProvidedCHO_correlation">correlation</a></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#dc_contributor">dc:contributor</a>|0..*|||
|<a href="#dc_coverage">dc:coverage</a>|0..*|||
|<a href="#dc_creator">dc:creator</a>|0..*|||
|<a href="#dc_date">dc:date</a>|0..*|||
|<a href="#dc_description">dc:description</a>|0..*|||
|<a href="#dc_format">dc:format</a>|0..*|||
|<a href="#dc_identifier">dc:identifier</a>|0..*||<a href="#dc_identifier_type">type</a>|
|<a href="#dc_language">dc:language</a>|0..*||<a href="#dc_language_type">type</a>|
|<a href="#dc_publisher">dc:publisher</a>|0..*|||
|<a href="#dc_relation">dc:relation</a>|0..*|||
|<a href="#dc_rights">dc:rights</a>|0..*|||
|<a href="#dc_source">dc:source</a>|0..*|||
|<a href="#dc_subject">dc:subject</a>|0..*|||
|<a href="#dc_title">dc:title</a>|0..*|<a href="#dc_title_type">Literal</a>||
|<a href="#dc_type">dc:type</a>|0..*|||
|<a href="#dct_alternative">dct:alternative</a>|0..*|<a href="#dct_alternative_type">Literal</a>||
|<a href="#dct_conformsTo">dct:conformsTo</a>|0..*|||
|<a href="#dct_created">dct:created</a>|0..*|||
|<a href="#dct_extent">dct:extent</a>|0..*|||
|<a href="#dct_hasFormat">dct:hasFormat</a>|0..*|||
|<a href="#dct_hasPart">dct:hasPart</a>|0..*|||
|<a href="#dct_hasVersion">dct:hasVersion</a>|0..*|||
|<a href="#dct_isFormatOf">dct:isFormatOf</a>|0..*|||
|<a href="#dct_isPartOf">dct:isPartOf</a>|0..*|||
|<a href="#dct_isReferencedBy">dct:isReferencedBy</a>|0..*|||
|<a href="#dct_isReplacedBy">dct:isReplacedBy</a>|0..*|||
|<a href="#dct_isRequiredBy">dct:isRequiredBy</a>|0..*|||
|<a href="#dct_isVersionOf">dct:isVersionOf</a>|0..*|||
|<a href="#dct_issued">dct:issued</a>|0..*|||
|<a href="#dct_medium">dct:medium</a>|0..*|||
|<a href="#dct_provenance">dct:provenance</a>|0..*|||
|<a href="#dct_references">dct:references</a>|0..*|||
|<a href="#dct_replaces">dct:replaces</a>|0..*|||
|<a href="#dct_requires">dct:requires</a>|0..*|||
|<a href="#dct_spatial">dct:spatial</a>|0..*|||
|<a href="#dct_tableOfContents">dct:tableOfContents</a>|0..*|<a href="#dct_tableOfContents_type">Literal</a>||
|<a href="#dct_temporal">dct:temporal</a>|0..*|||
|<a href="#edm_currentLocation">edm:currentLocation</a>|0..*|<a href="#edm_currentLocation_type">IRI</a>||
|<a href="#edm_hasMet">edm:hasMet</a>|0..*|<a href="#edm_hasMet_type">IRI</a>||
|<a href="#edm_hasType">edm:hasType</a>|0..*|||
|<a href="#edm_incorporates">edm:incorporates</a>|0..*|<a href="#edm_incorporates_type">IRI</a>||
|<a href="#edm_isDerivativeOf">edm:isDerivativeOf</a>|0..*|<a href="#edm_isDerivativeOf_type">IRI</a>||
|<a href="#edm_isNextInSequence">edm:isNextInSequence</a>|0..*|<a href="#edm_isNextInSequence_type">IRI</a>||
|<a href="#edm_isRelatedTo">edm:isRelatedTo</a>|0..*|||
|<a href="#edm_isRepresentationOf">edm:isRepresentationOf</a>|<a href="#edm_isRepresentationOf_cardinality">0..1</a>|<a href="#edm_isRepresentationOf_type">IRI</a>||
|<a href="#edm_isSimilarTo">edm:isSimilarTo</a>|0..*|<a href="#edm_isSimilarTo_type">IRI</a>||
|<a href="#edm_isSuccessorOf">edm:isSuccessorOf</a>|0..*|<a href="#edm_isSuccessorOf_type">IRI</a>||
|<a href="#edm_realizes">edm:realizes</a>|0..*|<a href="#edm_realizes_type">IRI</a>||
|<a href="#edm_type">edm:type</a>|<a href="#edm_type_cardinality">1..1</a>|<a href="#edm_type_type">Literal</a>|<a href="#edm_type_values">values</a>|
|<a href="#edm_ugc">edm:ugc</a>|0..*|<a href="#edm_ugc_type">Literal</a>||
|<a href="#owl_sameAs">owl:sameAs</a>|0..*|<a href="#owl_sameAs_type">IRI</a>||

#### Shape Body
------
_Shape body in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#base>
  a sh:Shape ;
  rdfs:subClassOf rdfs:Resource ;
  sh:description """This shape gathers all constraints that apply to a 
                    edm:ProvidedCHO class""" ;

  sh:scopeClass edm:ProvidedCHO ;

  # class level constraints
  sh:constraint      <ProvidedCHO#closure> ;
  sh:constraint      <ProvidedCHO#correlation> ;

  # DC properties
  sh:property        <ProvidedCHO/dc_identifier#type> ;
  sh:property        <ProvidedCHO/dc_language#type> ;
  sh:property        <ProvidedCHO/dc_title#type> ;

  # DCTERMS properties
  sh:property        <ProvidedCHO/dct_alternative#type> ;
  sh:property        <ProvidedCHO/dct_tableOfContents#type> ;

  # EDM properties
  sh:property        <ProvidedCHO/edm_currentLocation#type> ;
  sh:property        <ProvidedCHO/edm_hasMet#type> ;
  sh:property        <ProvidedCHO/edm_incorporates#type> ;
  sh:property        <ProvidedCHO/edm_isDerivativeOf#type> ;
  sh:property        <ProvidedCHO/edm_isNextInSequence#type> ;
  sh:property        <ProvidedCHO/edm_isRepresentationOf#type> ;
  sh:property        <ProvidedCHO/edm_isRepresentationOf#cardinality> ;
  sh:property        <ProvidedCHO/edm_isSimilarTo#type> ;
  sh:property        <ProvidedCHO/edm_isSuccessorOf#type> ;
  sh:property        <ProvidedCHO/edm_realizes#type> ;
  sh:property        <ProvidedCHO/edm_type#type> ;
  sh:property        <ProvidedCHO/edm_type#cardinality> ;
  sh:property        <ProvidedCHO/edm_type#values> ;
  sh:property        <ProvidedCHO/edm_ugc#type> ;

  # OWL properties
  sh:property        <ProvidedCHO/owl_sameAs#type> ;
.
```

#### Shape level constraints
------

##### Constraint <a id="http_www_europeana_eu_schemas_edm_shapes_external_ProvidedCHO_closure" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#closure">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#closure</a>
<table>
<tr><th align="right">description</th><td>An edm:ProvidedCHO resource must be defined using only the 
                    properties defined in EDM for Provided CHOs</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="null">R-206-DEFINE-ALLOWED-NAMESPACES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#closure">http://www.europeana.eu/schemas/edm/shapes/categories#closure</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#closure>
  sh:description """An edm:ProvidedCHO resource must be defined using only the 
                    properties defined in EDM for Provided CHOs""" ;
  dc:type esc:closure ;
  dc:relation "R-206-DEFINE-ALLOWED-NAMESPACES" ;
  sh:closed true ;
  sh:ignoredProperties (
    rdf:type
    dc:contributor dc:coverage dc:creator dc:date dc:description dc:format 
    dc:identifier dc:language dc:publisher dc:relation dc:rights dc:source
    dc:subject dc:title dc:type dct:alternative dct:conformsTo dct:created 
    dct:extent dct:hasFormat dct:hasPart dct:hasVersion dct:isFormatOf 
    dct:isPartOf dct:isReferencedBy dct:isReplacedBy dct:isRequiredBy
    dct:issued dct:isVersionOf dct:medium dct:provenance dct:references
    dct:replaces dct:requires dct:spatial dct:tableOfContents dct:temporal
    edm:currentLocation edm:hasMet edm:hasType edm:incorporates 
    edm:isDerivativeOf edm:isNextInSequence edm:isRelatedTo 
    edm:isRepresentationOf edm:isSimilarTo edm:isSuccessorOf edm:realizes 
    edm:type edm:ugc
    owl:sameAs
  ) ;
.
```

##### Constraint <a id="http_www_europeana_eu_schemas_edm_shapes_external_ProvidedCHO_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#correlation">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#correlation</a>
<table>
<tr><th align="right">description</th><td>Check that if edm:ProvidedCHO is present, at least: one 
                    dc:title or sh:description should be present; one dc:subject
                    or dc:type or dc:coverage or dcterms:spatial and edm:type 
                    should be present</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/74">R-67-BOOLEAN-PROPERTY-PATTERNS</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/75">R-68-REQUIRED-PROPERTIES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#correlation>
  a sh:Constraint ;
  sh:description """Check that if edm:ProvidedCHO is present, at least: one 
                    dc:title or sh:description should be present; one dc:subject
                    or dc:type or dc:coverage or dcterms:spatial and edm:type 
                    should be present""" ;
  dc:type esc:correlation ;
  dc:relation "R-68-REQUIRED-PROPERTIES"
           , "R-67-BOOLEAN-PROPERTY-PATTERNS" ;
  sh:message """At least: one dc:title or sh:description; one dc:subject or 
                dc:type or dc:coverage or dcterms:spatial; and one edm:type 
                should be present""" ;
  sh:and (
    [
      sh:constraint [
        sh:or (
          [ sh:property [ sh:predicate dc:title       ; sh:minCount 1 ; ] ]
          [ sh:property [ sh:predicate dc:description ; sh:minCount 1 ; ] ]
        )
      ]
    ]
    [
      sh:constraint [
        sh:or (
          [ sh:property [ sh:predicate dc:subject  ; sh:minCount 1 ; ] ]
          [ sh:property [ sh:predicate dc:type     ; sh:minCount 1 ; ] ]
          [ sh:property [ sh:predicate dc:coverage ; sh:minCount 1 ; ] ]
          [ sh:property [ sh:predicate dct:spatial ; sh:minCount 1 ; ] ]
        )
      ]
    ]
  ) ;
.
```

#### Property <a id="dc_contributor" target="_blank" href="http://purl.org/dc/elements/1.1/contributor">http://purl.org/dc/elements/1.1/contributor</a>

------

#### Property <a id="dc_coverage" target="_blank" href="http://purl.org/dc/elements/1.1/coverage">http://purl.org/dc/elements/1.1/coverage</a>

------

#### Property <a id="dc_creator" target="_blank" href="http://purl.org/dc/elements/1.1/creator">http://purl.org/dc/elements/1.1/creator</a>

------

#### Property <a id="dc_date" target="_blank" href="http://purl.org/dc/elements/1.1/date">http://purl.org/dc/elements/1.1/date</a>

------

#### Property <a id="dc_description" target="_blank" href="http://purl.org/dc/elements/1.1/description">http://purl.org/dc/elements/1.1/description</a>

------

#### Property <a id="dc_format" target="_blank" href="http://purl.org/dc/elements/1.1/format">http://purl.org/dc/elements/1.1/format</a>

------

#### Property <a id="dc_identifier" target="_blank" href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>

------

##### Constraint <a id="dc_identifier_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_identifier#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_identifier#type</a>
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

#### Property <a id="dc_language" target="_blank" href="http://purl.org/dc/elements/1.1/language">http://purl.org/dc/elements/1.1/language</a>

------

##### Constraint <a id="dc_language_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_language#type</a>
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

#### Property <a id="dc_publisher" target="_blank" href="http://purl.org/dc/elements/1.1/publisher">http://purl.org/dc/elements/1.1/publisher</a>

------

#### Property <a id="dc_relation" target="_blank" href="http://purl.org/dc/elements/1.1/relation">http://purl.org/dc/elements/1.1/relation</a>

------

#### Property <a id="dc_rights" target="_blank" href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>

------

#### Property <a id="dc_source" target="_blank" href="http://purl.org/dc/elements/1.1/source">http://purl.org/dc/elements/1.1/source</a>

------

#### Property <a id="dc_subject" target="_blank" href="http://purl.org/dc/elements/1.1/subject">http://purl.org/dc/elements/1.1/subject</a>

------

#### Property <a id="dc_title" target="_blank" href="http://purl.org/dc/elements/1.1/title">http://purl.org/dc/elements/1.1/title</a>

------

##### Constraint <a id="dc_title_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_title#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dc_title#type</a>
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

#### Property <a id="dct_alternative" target="_blank" href="http://purl.org/dc/terms/alternative">http://purl.org/dc/terms/alternative</a>

------

##### Constraint <a id="dct_alternative_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_alternative#type</a>
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

#### Property <a id="dct_created" target="_blank" href="http://purl.org/dc/terms/created">http://purl.org/dc/terms/created</a>

------

#### Property <a id="dct_extent" target="_blank" href="http://purl.org/dc/terms/extent">http://purl.org/dc/terms/extent</a>

------

#### Property <a id="dct_hasFormat" target="_blank" href="http://purl.org/dc/terms/hasFormat">http://purl.org/dc/terms/hasFormat</a>

------

#### Property <a id="dct_hasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>

------

#### Property <a id="dct_hasVersion" target="_blank" href="http://purl.org/dc/terms/hasVersion">http://purl.org/dc/terms/hasVersion</a>

------

#### Property <a id="dct_isFormatOf" target="_blank" href="http://purl.org/dc/terms/isFormatOf">http://purl.org/dc/terms/isFormatOf</a>

------

#### Property <a id="dct_isPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>

------

#### Property <a id="dct_isReferencedBy" target="_blank" href="http://purl.org/dc/terms/isReferencedBy">http://purl.org/dc/terms/isReferencedBy</a>

------

#### Property <a id="dct_isReplacedBy" target="_blank" href="http://purl.org/dc/terms/isReplacedBy">http://purl.org/dc/terms/isReplacedBy</a>

------

#### Property <a id="dct_isRequiredBy" target="_blank" href="http://purl.org/dc/terms/isRequiredBy">http://purl.org/dc/terms/isRequiredBy</a>

------

#### Property <a id="dct_isVersionOf" target="_blank" href="http://purl.org/dc/terms/isVersionOf">http://purl.org/dc/terms/isVersionOf</a>

------

#### Property <a id="dct_issued" target="_blank" href="http://purl.org/dc/terms/issued">http://purl.org/dc/terms/issued</a>

------

#### Property <a id="dct_medium" target="_blank" href="http://purl.org/dc/terms/medium">http://purl.org/dc/terms/medium</a>

------

#### Property <a id="dct_provenance" target="_blank" href="http://purl.org/dc/terms/provenance">http://purl.org/dc/terms/provenance</a>

------

#### Property <a id="dct_references" target="_blank" href="http://purl.org/dc/terms/references">http://purl.org/dc/terms/references</a>

------

#### Property <a id="dct_replaces" target="_blank" href="http://purl.org/dc/terms/replaces">http://purl.org/dc/terms/replaces</a>

------

#### Property <a id="dct_requires" target="_blank" href="http://purl.org/dc/terms/requires">http://purl.org/dc/terms/requires</a>

------

#### Property <a id="dct_spatial" target="_blank" href="http://purl.org/dc/terms/spatial">http://purl.org/dc/terms/spatial</a>

------

#### Property <a id="dct_tableOfContents" target="_blank" href="http://purl.org/dc/terms/tableOfContents">http://purl.org/dc/terms/tableOfContents</a>

------

##### Constraint <a id="dct_tableOfContents_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_tableOfContents#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dct_tableOfContents#type</a>
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

#### Property <a id="edm_currentLocation" target="_blank" href="http://www.europeana.eu/schemas/edm/currentLocation">http://www.europeana.eu/schemas/edm/currentLocation</a>

------

##### Constraint <a id="edm_currentLocation_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_currentLocation#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_currentLocation#type</a>
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

##### Constraint <a id="edm_hasMet_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_hasMet#type</a>
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

#### Property <a id="edm_incorporates" target="_blank" href="http://www.europeana.eu/schemas/edm/incorporates">http://www.europeana.eu/schemas/edm/incorporates</a>

------

##### Constraint <a id="edm_incorporates_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_incorporates#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_incorporates#type</a>
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

##### Constraint <a id="edm_isDerivativeOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isDerivativeOf#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isDerivativeOf#type</a>
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

##### Constraint <a id="edm_isNextInSequence_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isNextInSequence#type</a>
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

#### Property <a id="edm_isRepresentationOf" target="_blank" href="http://www.europeana.eu/schemas/edm/isRepresentationOf">http://www.europeana.eu/schemas/edm/isRepresentationOf</a>

------

##### Constraint <a id="edm_isRepresentationOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRepresentationOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRepresentationOf#cardinality</a>
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
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isRepresentationOf ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="edm_isRepresentationOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRepresentationOf#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isRepresentationOf#type</a>
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

##### Constraint <a id="edm_isSimilarTo_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSimilarTo#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSimilarTo#type</a>
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

##### Constraint <a id="edm_isSuccessorOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSuccessorOf#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_isSuccessorOf#type</a>
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

##### Constraint <a id="edm_realizes_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_realizes#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_realizes#type</a>
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

##### Constraint <a id="edm_type_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#cardinality</a>
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
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:type ;
  sh:minCount 1 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="edm_type_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#type</a>
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

##### Constraint <a id="edm_type_values" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#values">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_type#values</a>
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
  dc:relation "R-30-DEFINE-VALUE-LISTS" ;
  sh:predicate edm:type ;
  sh:in ( "TEXT" "VIDEO" "SOUND" "IMAGE" "3D" ) ;
.
```

#### Property <a id="edm_ugc" target="_blank" href="http://www.europeana.eu/schemas/edm/ugc">http://www.europeana.eu/schemas/edm/ugc</a>

------

##### Constraint <a id="edm_ugc_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_ugc#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edm_ugc#type</a>
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

#### Property <a id="owl_sameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>

------

##### Constraint <a id="owl_sameAs_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/owl_sameAs#type">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/owl_sameAs#type</a>
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
