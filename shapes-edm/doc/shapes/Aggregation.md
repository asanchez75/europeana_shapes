
## Shapes definitions for ore:Aggregation class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/Aggregation.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a ore:Aggregation class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'><a href="#http_www_europeana_eu_schemas_edm_shapes_external_Aggregation_correlation">correlation</a>, <a href="#http_www_europeana_eu_schemas_edm_shapes_external_Aggregation_closure">closure</a></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#dc_rights">dc:rights</a>|0..*|<a href="#dc_rights_type">Literal</a>|<a href="#dc_rights_redundancy">redundancy</a>|
|<a href="#edm_aggregatedCHO">edm:aggregatedCHO</a>|<a href="#edm_aggregatedCHO_cardinality">1..1</a>|<a href="#edm_aggregatedCHO_type">IRI</a>|<a href="#edm_aggregatedCHO_range-class">range-class</a>|
|<a href="#edm_dataProvider">edm:dataProvider</a>|<a href="#edm_dataProvider_cardinality">1..1</a>|||
|<a href="#edm_hasView">edm:hasView</a>|0..*|<a href="#edm_hasView_type">IRI</a>|<a href="#edm_hasView_range-class">range-class</a>|
|<a href="#edm_isShownAt">edm:isShownAt</a>|<a href="#edm_isShownAt_cardinality">0..1</a>|<a href="#edm_isShownAt_type">IRI</a>|<a href="#edm_isShownAt_range-class">range-class</a>|
|<a href="#edm_isShownBy">edm:isShownBy</a>|<a href="#edm_isShownBy_cardinality">0..1</a>|<a href="#edm_isShownBy_type">IRI</a>|<a href="#edm_isShownBy_range-class">range-class</a>|
|<a href="#edm_object">edm:object</a>|0..*|<a href="#edm_object_type">IRI</a>|<a href="#edm_object_range-class">range-class</a>|
|<a href="#edm_provider">edm:provider</a>|<a href="#edm_provider_cardinality">1..1</a>|||
|<a href="#edm_rights">edm:rights</a>|0..*|<a href="#edm_rights_type">IRI</a>|<a href="#edm_rights_values">values</a>|
|<a href="#edm_ugc">edm:ugc</a>|<a href="#edm_ugc_cardinality">1..?</a>|<a href="#edm_ugc_type">Literal</a>||
|<a href="#edm_unstored">edm:unstored</a>|0..*|<a href="#edm_unstored_type">Literal</a>||

#### Shape Body
------
_Shape body in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#base>
  a sh:Shape ;
  rdfs:subClassOf rdfs:Resource ;
  sh:description """This shape gathers all constraints that apply to a 
                    ore:Aggregation class""" ;

  sh:scopeClass ore:Aggregation ;

  # class level constraints
  sh:constraint      <Aggregation#closure> ;
  sh:constraint      <Aggregation#correlation> ;

  # DC properties
  sh:property        <Aggregation/dc_rights#type> ;
  sh:property        <Aggregation/dc_rights#redundancy> ;

  # EDM properties 
  sh:property        <Aggregation/edm_aggregatedCHO#type> ;
  sh:property        <Aggregation/edm_aggregatedCHO#cardinality> ;
  sh:property        <Aggregation/edm_aggregatedCHO#range-class> ;
  sh:property        <Aggregation/edm_dataProvider#cardinality> ;
  sh:property        <Aggregation/edm_hasView#type> ;
  sh:property        <Aggregation/edm_hasView#range-class> ;
  sh:property        <Aggregation/edm_isShownAt#type> ;
  sh:property        <Aggregation/edm_isShownAt#cardinality> ;
  sh:property        <Aggregation/edm_isShownAt#range-class> ;
  sh:property        <Aggregation/edm_isShownBy#type> ;
  sh:property        <Aggregation/edm_isShownBy#cardinality> ;
  sh:property        <Aggregation/edm_isShownBy#range-class> ;
  sh:property        <Aggregation/edm_object#type> ;
  sh:property        <Aggregation/edm_object#range-class> ;
  sh:property        <Aggregation/edm_provider#cardinality> ;
  sh:property        <Aggregation/edm_rights#type> ;
  sh:property        <Aggregation/edm_rights#values> ;
  sh:property        <Aggregation/edm_ugc#type> ;
  sh:property        <Aggregation/edm_ugc#cardinality> ;
  sh:property        <Aggregation/edm_unstored#type> ;
.
```

#### Shape level constraints
------

##### Constraint <a id="http_www_europeana_eu_schemas_edm_shapes_external_Aggregation_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#correlation">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#correlation</a>
<table>
<tr><th align="right">description</th><td>At least one edm:isShownAt or edm:isShownBy should be 
                    present</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/74">R-67-BOOLEAN-PROPERTY-PATTERNS</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/75">R-68-REQUIRED-PROPERTIES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#correlation>
  a sh:Constraint ;
  sh:description """At least one edm:isShownAt or edm:isShownBy should be 
                    present""" ;
  dc:type esc:correlation ;
  dc:relation "R-68-REQUIRED-PROPERTIES"
           , "R-67-BOOLEAN-PROPERTY-PATTERNS" ;
  sh:or (
    [ sh:property [ sh:predicate edm:isShownAt ; sh:minCount 1 ; ] ]
    [ sh:property [ sh:predicate edm:isShownBy ; sh:minCount 1 ; ] ]
  ) ;
.
```

##### Constraint <a id="http_www_europeana_eu_schemas_edm_shapes_external_Aggregation_closure" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#closure">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#closure</a>
<table>
<tr><th align="right">description</th><td>An ore:Aggregation resource must be defined using only the 
                    properties defined in EDM for Aggregations</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="null">R-206-DEFINE-ALLOWED-NAMESPACES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#closure">http://www.europeana.eu/schemas/edm/shapes/categories#closure</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#closure>
  sh:description """An ore:Aggregation resource must be defined using only the 
                    properties defined in EDM for Aggregations""" ;
  dc:type esc:closure ;
  dc:relation "R-206-DEFINE-ALLOWED-NAMESPACES" ;
  sh:closed true ;
  sh:ignoredProperties (
    rdf:type dc:rights
    edm:aggregatedCHO edm:dataProvider edm:hasView edm:isShownAt 
    edm:isShownBy edm:object edm:provider edm:rights edm:ugc edm:unstored
  ) ;
.
```

#### Property <a id="dc_rights" target="_blank" href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>

------

##### Constraint <a id="dc_rights_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#redundancy</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

##### Constraint <a id="dc_rights_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/dc_rights#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

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

##### Constraint <a id="edm_aggregatedCHO_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:aggregatedCHO ;
  sh:minCount 1 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="edm_aggregatedCHO_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#range-class</a>
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:ProvidedCHO</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:ProvidedCHO" ;
# sh:description "Check that the URI refers to an existing CHO" ;
  dc:type esc:range-class ;
  dc:relation "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
            , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:aggregatedCHO ;
  sh:valueShape ProvidedCHO: ;
  sh:class edm:ProvidedCHO ;
.
```

##### Constraint <a id="edm_aggregatedCHO_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_aggregatedCHO#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

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

##### Constraint <a id="edm_dataProvider_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_dataProvider#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_dataProvider#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_dataProvider#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:dataProvider ;
  sh:minCount 1 ;
  sh:maxCount 1 ;
.
```

#### Property <a id="edm_hasView" target="_blank" href="http://www.europeana.eu/schemas/edm/hasView">http://www.europeana.eu/schemas/edm/hasView</a>

------

##### Constraint <a id="edm_hasView_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#range-class</a>
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/455">R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:WebResource" ;
# sh:description "Check that the pointed media resolves to a landing page" ;
  dc:type esc:range-class ;
  dc:relation "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:hasView ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```

##### Constraint <a id="edm_hasView_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_hasView#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

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

##### Constraint <a id="edm_isShownAt_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isShownAt ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="edm_isShownAt_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#range-class</a>
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/455">R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:WebResource" ;
# sh:description "Check that the pointed media resolves to a landing page" ;
  dc:type esc:range-class ;
  dc:relation "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:isShownAt ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```

##### Constraint <a id="edm_isShownAt_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownAt#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

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

##### Constraint <a id="edm_isShownBy_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isShownBy ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="edm_isShownBy_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#range-class</a>
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/455">R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:WebResource" ;
# sh:description "Check that the URI resolves to a media" ;
  dc:type esc:range-class ;
  dc:relation "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:isShownBy ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```

##### Constraint <a id="edm_isShownBy_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_isShownBy#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

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

##### Constraint <a id="edm_object_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#range-class</a>
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/455">R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:WebResource" ;
# sh:description "Check that the URI resolves to a media" ;
  dc:type esc:range-class ;
  dc:relation "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-171bis-VALIDATE-RESOURCE-MEDIA-TYPE-FROM-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:object ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```

##### Constraint <a id="edm_object_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_object#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

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

##### Constraint <a id="edm_provider_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_provider#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_provider#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_provider#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:provider ;
  sh:minCount 1 ;
  sh:maxCount 1 ;
.
```

#### Property <a id="edm_rights" target="_blank" href="http://www.europeana.eu/schemas/edm/rights">http://www.europeana.eu/schemas/edm/rights</a>

------

##### Constraint <a id="edm_rights_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:rights ;
  sh:nodeKind sh:IRI ;
.
```

##### Constraint <a id="edm_rights_values" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#values">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#values</a>
<table>
<tr><th align="right">description</th><td>Check the value is one of the controlled values: 
             http://pro.europeana.eu/web/guest/available-rights-statements </td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/37">R-30-DEFINE-VALUE-LISTS</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/423">R-210-DEFINE-EXCLUSIVELY-ALLOWED-PROPERTIES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#values">http://www.europeana.eu/schemas/edm/shapes/categories#values</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_rights#values>
  a sh:PropertyConstraint ;
  dc:type esc:values ;
  sh:description """Check the value is one of the controlled values: 
             http://pro.europeana.eu/web/guest/available-rights-statements """ ;
  dc:relation "R-210-DEFINE-EXCLUSIVELY-ALLOWED-PROPERTIES"
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

##### Constraint <a id="edm_ugc_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:ugc ;
  sh:minCount 0 ;
  sh:minCount 1 ;
.
```

##### Constraint <a id="edm_ugc_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_ugc#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

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

##### Constraint <a id="edm_unstored_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_unstored#type">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_unstored#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation/edm_unstored#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:unstored ;
  sh:nodeKind sh:Literal ;
.
```
