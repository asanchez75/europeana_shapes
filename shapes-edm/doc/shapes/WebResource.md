
## Shapes definitions for edm:WebResource class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/WebResource.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a edm:WebResource class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#dc_description">dc:description</a>|<a href="#dc_description_cardinality">0..?</a>|||
|<a href="#dc_format">dc:format</a>|<a href="#dc_format_cardinality">0..?</a>|||
|<a href="#dc_rights">dc:rights</a>|<a href="#dc_rights_cardinality">0..?</a>||<a href="#dc_rights_redundancy">redundancy</a>|
|<a href="#dc_source">dc:source</a>|<a href="#dc_source_cardinality">0..?</a>|||
|<a href="#dct_conformsTo">dct:conformsTo</a>|<a href="#dct_conformsTo_cardinality">0..?</a>|||
|<a href="#dct_created">dct:created</a>|<a href="#dct_created_cardinality">0..?</a>||<a href="#dct_created_correlation_1">correlation_1</a>, <a href="#dct_created_correlation_2">correlation_2</a>, <a href="#dct_created_range-values">range-values</a>|
|<a href="#dct_extent">dct:extent</a>|<a href="#dct_extent_cardinality">0..?</a>|||
|<a href="#dct_hasPart">dct:hasPart</a>|<a href="#dct_hasPart_cardinality">0..?</a>|<a href="#dct_hasPartOf_type">IRI</a>|<a href="#dct_hasPart_range-class">range-class</a>|
|<a href="#dct_hasPartOf">dct:hasPartOf</a>||<a href="#dct_hasPartOf_type">IRI</a>||
|<a href="#dct_isFormatOf">dct:isFormatOf</a>|<a href="#dct_isFormatOf_cardinality">0..?</a>|||
|<a href="#dct_isPartOf">dct:isPartOf</a>|<a href="#dct_isPartOf_cardinality">0..?</a>|<a href="#dct_isPartOf_type">IRI</a>|<a href="#dct_isPartOf_range-class">range-class</a>|
|<a href="#dct_issued">dct:issued</a>|<a href="#dct_issued_cardinality">0..?</a>||<a href="#dct_issued_correlation">correlation</a>, <a href="#dct_issued_range-class">range-class</a>, <a href="#dct_issued_range-values">range-values</a>|
|<a href="#edm_isNextInSequence">edm:isNextInSequence</a>|<a href="#edm_isNextInSequence_cardinality">0..?</a>|<a href="#edm_isNextInSequence_type">IRI</a>|<a href="#edm_isNextInSequence_correlation">correlation</a>, <a href="#edm_isNextInSequence_range-class">range-class</a>|
|<a href="#edm_rights">edm:rights</a>|<a href="#edm_rights_cardinality">1..?</a>|<a href="#edm_rights_type">IRI</a>|<a href="#edm_rights_values">values</a>|

#### Shape Body
------
_Shape body in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource#base>
  a sh:Shape ;
  rdfs:subClassOf rdfs:Resource ;
  sh:description """This shape gathers all constraints that apply to a 
                    edm:WebResource class""" ;

  sh:scopeClass edm:WebResource ;

  # class level constraints
  sh:constraint      [ sh:closed true ; sh:ignoredProperties (rdf:type) ] ;

  # DC properties
  sh:property        <WebResource/dc_description#cardinality> ;
  sh:property        <WebResource/dc_format#cardinality> ;
  sh:property        <WebResource/dc_rights#cardinality> ;
  sh:property        <WebResource/dc_rights#redundancy> ;
  sh:property        <WebResource/dc_source#cardinality> ;

  # DCTERMS properties
  sh:property        <WebResource/dct_conformsTo#cardinality> ;
  sh:property        <WebResource/dct_created#cardinality> ;
  sh:property        <WebResource/dct_created#range-values> ;
  sh:property        <WebResource/dct_created#correlation_1> ;
  sh:property        <WebResource/dct_created#correlation_2> ;
  sh:property        <WebResource/dct_extent#cardinality> ;
  sh:property        <WebResource/dct_hasPartOf#type> ;
  sh:property        <WebResource/dct_hasPart#cardinality> ;
  sh:property        <WebResource/dct_hasPart#range-class> ;
  sh:property        <WebResource/dct_isFormatOf#cardinality> ;
  sh:property        <WebResource/dct_isPartOf#type> ;
  sh:property        <WebResource/dct_isPartOf#cardinality> ;
  sh:property        <WebResource/dct_isPartOf#range-class> ;
  sh:property        <WebResource/dct_issued#cardinality> ;
  sh:property        <WebResource/dct_issued#range-values> ;
  sh:property        <WebResource/dct_issued#range-class> ;
  sh:property        <WebResource/dct_issued#correlation> ;

  # EDM properties
  sh:property        <WebResource/edm_isNextInSequence#type> ;
  sh:property        <WebResource/edm_isNextInSequence#cardinality> ;
  sh:property        <WebResource/edm_isNextInSequence#range-class> ;
  sh:property        <WebResource/edm_isNextInSequence#correlation> ;
  sh:property        <WebResource/edm_rights#type> ;
  sh:property        <WebResource/edm_rights#cardinality> ;
  sh:property        <WebResource/edm_rights#values> ;
.
```

#### Shape level constraints
------
#### Property <a id="dc_description" target="_blank" href="http://purl.org/dc/elements/1.1/description">http://purl.org/dc/elements/1.1/description</a>
------

##### Constraint <a id="dc_description_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_description#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_description#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_description#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:description ;
  sh:minCount 0 ;
.
```
#### Property <a id="dc_format" target="_blank" href="http://purl.org/dc/elements/1.1/format">http://purl.org/dc/elements/1.1/format</a>
------

##### Constraint <a id="dc_format_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_format#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_format#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_format#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:format ;
  sh:minCount 0 ;
.
```
#### Property <a id="dc_rights" target="_blank" href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>
------

##### Constraint <a id="dc_rights_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_rights#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_rights#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_rights#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:rights ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="dc_rights_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_rights#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_rights#redundancy</a>
<table>
<tr><th align="right">description</th><td>dc:rights should not be the same as edm:rights, if true the 
                    field is redundant</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_rights#redundancy>
  a sh:PropertyConstraint ;
  dc:type esc:redundancy ;
  sh:description """dc:rights should not be the same as edm:rights, if true the 
                    field is redundant""" ;
  dc:subject "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:severity sh:Warning ;
  sh:predicate dc:rights ;
  sh:notEquals edm:rights ;
.
```
#### Property <a id="dc_source" target="_blank" href="http://purl.org/dc/elements/1.1/source">http://purl.org/dc/elements/1.1/source</a>
------

##### Constraint <a id="dc_source_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_source#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_source#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dc_source#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dc:source ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_conformsTo" target="_blank" href="http://purl.org/dc/terms/conformsTo">http://purl.org/dc/terms/conformsTo</a>
------

##### Constraint <a id="dct_conformsTo_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_conformsTo#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_conformsTo#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_conformsTo#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:conformsTo ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_created" target="_blank" href="http://purl.org/dc/terms/created">http://purl.org/dc/terms/created</a>
------

##### Constraint <a id="dct_created_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:created ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="dct_created_correlation_1" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#correlation_1">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#correlation_1</a>
<table>
<tr><th align="right">description</th><td>dcterms:created must be equal or earlier than dcterms:issued</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/50">R-43-LITERAL-VALUE-COMPARISON</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#correlation_1>
  a sh:PropertyConstraint ;
  dc:type esc:correlation ;
  sh:description "dcterms:created must be equal or earlier than dcterms:issued";
  dc:type esc:correlation ;
  dc:subject "R-43-LITERAL-VALUE-COMPARISON" ;
  sh:predicate dct:created ;
  sh:lessThanOrEquals dct:issued ;
.
```

##### Constraint <a id="dct_created_correlation_2" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#correlation_2">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#correlation_2</a>
<table>
<tr><th align="right">description</th><td>dcterms:created must be equal or earlier than dcterms:issued
                    and dcterms:created in edm:ProvidedCHO</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/50">R-43-LITERAL-VALUE-COMPARISON</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#correlation_2>
  a sh:PropertyConstraint ;

  sh:description """dcterms:created must be equal or earlier than dcterms:issued
                    and dcterms:created in edm:ProvidedCHO""";
  dc:type esc:correlation ;
  dc:subject "R-43-LITERAL-VALUE-COMPARISON" ;
  sh:predicate dct:created ;

  #requires a second focus node (ie. ProvidedCHO)
  #can though be implemented using SPARQL
.
```

##### Constraint <a id="dct_created_range-values" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#range-values">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#range-values</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-value">http://www.europeana.eu/schemas/edm/shapes/categories#range-value</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_created#range-values>
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

##### Constraint <a id="dct_extent_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_extent#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_extent#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_extent#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:extent ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_hasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------

##### Constraint <a id="dct_hasPart_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPart#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPart#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPart#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:hasPart ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="dct_hasPart_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPart#range-class">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPart#range-class</a>
<table>
<tr><th align="right">description</th><td>dcterms:hasPart must refer to a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPart#range-class>
  a sh:PropertyConstraint ;
  sh:description "dcterms:hasPart must refer to a valid edm:WebResource" ;
  dc:type esc:range-class ;
  dc:subject "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate dct:hasPart ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```

##### Constraint <a id="dct_hasPartOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPartOf#type">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPartOf#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPartOf#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:hasPartOf ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="dct_hasPartOf" target="_blank" href="http://purl.org/dc/terms/hasPartOf">http://purl.org/dc/terms/hasPartOf</a>
------

##### Constraint <a id="dct_hasPartOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPartOf#type">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPartOf#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_hasPartOf#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:hasPartOf ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="dct_isFormatOf" target="_blank" href="http://purl.org/dc/terms/isFormatOf">http://purl.org/dc/terms/isFormatOf</a>
------

##### Constraint <a id="dct_isFormatOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isFormatOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isFormatOf#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isFormatOf#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:isFormatOf ;
  sh:minCount 0 ;
.
```
#### Property <a id="dct_isPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
------

##### Constraint <a id="dct_isPartOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isPartOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isPartOf#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isPartOf#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:isPartOf ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="dct_isPartOf_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isPartOf#range-class">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isPartOf#range-class</a>
<table>
<tr><th align="right">description</th><td>dcterms:isPartOf must refer to a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isPartOf#range-class>
  a sh:PropertyConstraint ;
  sh:description "dcterms:isPartOf must refer to a valid edm:WebResource" ;
  dc:type esc:range-class ;
  dc:subject "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate dct:isPartOf ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```

##### Constraint <a id="dct_isPartOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isPartOf#type">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isPartOf#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_isPartOf#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:isPartOf ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="dct_issued" target="_blank" href="http://purl.org/dc/terms/issued">http://purl.org/dc/terms/issued</a>
------

##### Constraint <a id="dct_issued_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:issued ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="dct_issued_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#correlation">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#correlation</a>
<table>
<tr><th align="right">description</th><td>dcterms:issued must be equal or later than dcterms:created 
                    and dcterms:issued of the ProvidedCHO</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/50">R-43-LITERAL-VALUE-COMPARISON</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#correlation>
  a sh:PropertyConstraint ;
  dc:type esc:correlation ;
  sh:description """dcterms:issued must be equal or later than dcterms:created 
                    and dcterms:issued of the ProvidedCHO""" ;
  dc:type esc:correlation ;
  dc:subject "R-43-LITERAL-VALUE-COMPARISON" ;
  sh:predicate dct:issued ;

  #requires a second focus node (ie. ProvidedCHO)
  #can though be implemented using SPARQL
.
```

##### Constraint <a id="dct_issued_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#range-class">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#range-class</a>
<table>
<tr><th align="right">description</th><td>the reference should be one to a TimeSpan (the access to 
                    the data and the data itself should be formatted according 
                    to the TimeSpan specifications.)</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#range-class>
  a sh:PropertyConstraint ;
  sh:description """the reference should be one to a TimeSpan (the access to 
                    the data and the data itself should be formatted according 
                    to the TimeSpan specifications.)""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;  
  sh:predicate dct:issued ;
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

##### Constraint <a id="dct_issued_range-values" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#range-values">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#range-values</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-value">http://www.europeana.eu/schemas/edm/shapes/categories#range-value</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/dct_issued#range-values>
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
#### Property <a id="edm_isNextInSequence" target="_blank" href="http://www.europeana.eu/schemas/edm/isNextInSequence">http://www.europeana.eu/schemas/edm/isNextInSequence</a>
------

##### Constraint <a id="edm_isNextInSequence_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isNextInSequence ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="edm_isNextInSequence_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#correlation">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#correlation</a>
<table>
<tr><th align="right">description</th><td>Both WebResources referred to and subject of this property 
                    must share the same parent, if present</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="null">?</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#correlation>
  a sh:PropertyConstraint ;
  dc:type esc:correlation ;
  sh:description """Both WebResources referred to and subject of this property 
                    must share the same parent, if present""" ;
# sh:description """Check that if WebResource 2 is PartOf WebResource X and 
#                   IsNextInSequence WebResource 1 and WebResource 2 are part of
#                   WebResource X""" ;
  dc:subject "?" ;
  sh:predicate edm:isNextInSequence ;

# Implement using a SPARQL query
.
```

##### Constraint <a id="edm_isNextInSequence_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#range-class">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#range-class</a>
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:WebResource</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#range-class>
  a sh:PropertyConstraint ;
  sh:description """The reference should be a valid edm:WebResource""" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:isNextInSequence ;
  sh:valueShape WebResource: ;
  sh:class edm:WebResource ;
.
```

##### Constraint <a id="edm_isNextInSequence_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#type">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_isNextInSequence#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isNextInSequence ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_rights" target="_blank" href="http://www.europeana.eu/schemas/edm/rights">http://www.europeana.eu/schemas/edm/rights</a>
------

##### Constraint <a id="edm_rights_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_rights#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_rights#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_rights#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:rights;
  sh:minCount 0 ;
  sh:minCount 1 ;
.
```

##### Constraint <a id="edm_rights_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_rights#type">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_rights#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_rights#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:rights ;
  sh:nodeKind sh:IRI ;
.
```

##### Constraint <a id="edm_rights_values" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_rights#values">http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_rights#values</a>
<table>
<tr><th align="right">description</th><td>Check the value is one of the controlled values: 
             http://pro.europeana.eu/web/guest/available-rights-statements </td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/37">R-30-DEFINE-VALUE-LISTS</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/423">R-210-DEFINE-EXCLUSIVELY-ALLOWED-PROPERTIES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#values">http://www.europeana.eu/schemas/edm/shapes/categories#values</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/WebResource/edm_rights#values>
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
