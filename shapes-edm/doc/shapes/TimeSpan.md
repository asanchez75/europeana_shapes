
## Shapes definitions for edm:TimeSpan class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/TimeSpan.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a edm:TimeSpan class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'><a href="#http_www_europeana_eu_schemas_edm_shapes_external_TimeSpan_closure">closure</a></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#skos_altLabel">skos:altLabel</a>|<a href="#skos_altLabel_cardinality">0..?</a>|<a href="#skos_altLabel_type">Literal</a>|<a href="#skos_altLabel_datatype">datatype</a>, <a href="#skos_altLabel_redundancy">redundancy</a>|
|<a href="#skos_note">skos:note</a>|<a href="#skos_note_cardinality">0..?</a>|<a href="#skos_note_type">Literal</a>|<a href="#skos_note_datatype">datatype</a>|
|<a href="#skos_prefLabel">skos:prefLabel</a>|<a href="#skos_prefLabel_cardinality">0..?</a>|<a href="#skos_prefLabel_type">Literal</a>|<a href="#skos_prefLabel_datatype">datatype</a>|
|<a href="#dct_hasPart">dct:hasPart</a>|<a href="#dct_hasPart_cardinality">0..?</a>|<a href="#dct_hasPart_type">IRI</a>|<a href="#dct_hasPart_range-class">range-class</a>|
|<a href="#dct_isPartOf">dct:isPartOf</a>|<a href="#dct_isPartOf_cardinality">0..?</a>|<a href="#dct_isPartOf_type">IRI</a>|<a href="#dct_isPartOf_range-class">range-class</a>|
|<a href="#edm_begin">edm:begin</a>|<a href="#edm_begin_cardinality">0..1</a>|<a href="#edm_begin_type">Literal</a>|<a href="#edm_begin_correlation">correlation</a>, <a href="#edm_begin_literal">literal</a>|
|<a href="#edm_end">edm:end</a>|<a href="#edm_end_cardinality">0..1</a>|<a href="#edm_end_type">Literal</a>|<a href="#edm_end_literal">literal</a>|
|<a href="#edm_isNextInSequence">edm:isNextInSequence</a>|<a href="#edm_isNextInSequence_cardinality">0..?</a>|<a href="#edm_isNextInSequence_type">IRI</a>|<a href="#edm_isNextInSequence_range-class">range-class</a>|
|<a href="#owl_sameAs">owl:sameAs</a>|<a href="#owl_sameAs_cardinality">0..?</a>|<a href="#owl_sameAs_type">IRI</a>||

#### Shape Body
------
_Shape body in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan#base>
  a sh:Shape ;
  rdfs:subClassOf rdfs:Resource ;
  sh:description """This shape gathers all constraints that apply to a 
                    edm:TimeSpan class""" ;

  sh:scopeClass edm:TimeSpan ;

  # class level constraints
  sh:constraint      <TimeSpan#closure> ;

  # SKOS properties
  sh:property        <TimeSpan/skos_prefLabel#type> ;
  sh:property        <TimeSpan/skos_prefLabel#datatype> ;
  sh:property        <TimeSpan/skos_prefLabel#cardinality> ;
  sh:property        <TimeSpan/skos_altLabel#type> ;
  sh:property        <TimeSpan/skos_altLabel#datatype> ;
  sh:property        <TimeSpan/skos_altLabel#cardinality> ;
  sh:property        <TimeSpan/skos_altLabel#redundancy> ;
  sh:property        <TimeSpan/skos_note#type> ;
  sh:property        <TimeSpan/skos_note#datatype> ;
  sh:property        <TimeSpan/skos_note#cardinality> ;

  # DCTERMS properties
  sh:property        <TimeSpan/dct_hasPart#type> ;
  sh:property        <TimeSpan/dct_hasPart#cardinality> ;
  sh:property        <TimeSpan/dct_hasPart#range-class> ;
  sh:property        <TimeSpan/dct_isPartOf#type> ;
  sh:property        <TimeSpan/dct_isPartOf#cardinality> ;
  sh:property        <TimeSpan/dct_isPartOf#range-class> ;

  # EDM properties
  sh:property        <TimeSpan/edm_begin#type> ;
  sh:property        <TimeSpan/edm_begin#cardinality> ;
  sh:property        <TimeSpan/edm_begin#literal> ;
  sh:property        <TimeSpan/edm_begin#correlation> ;
  sh:property        <TimeSpan/edm_end#type> ;
  sh:property        <TimeSpan/edm_end#cardinality> ;
  sh:property        <TimeSpan/edm_end#literal> ;
  sh:property        <TimeSpan/edm_isNextInSequence#type> ;
  sh:property        <TimeSpan/edm_isNextInSequence#cardinality> ;
  sh:property        <TimeSpan/edm_isNextInSequence#range-class> ;

  # OWL properties
  sh:property        <TimeSpan/owl_sameAs#type> ;
  sh:property        <TimeSpan/owl_sameAs#cardinality> ;
.
```

#### Shape level constraints
------

##### Constraint <a id="http_www_europeana_eu_schemas_edm_shapes_external_TimeSpan_closure" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan#closure">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan#closure</a>
<table>
<tr><th align="right">description</th><td>An edm:TimeSpan resource must be defined using only the 
                    properties defined in EDM for Time Spans</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="null">R-206-DEFINE-ALLOWED-NAMESPACES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#closure">http://www.europeana.eu/schemas/edm/shapes/categories#closure</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan#closure>
  sh:description """An edm:TimeSpan resource must be defined using only the 
                    properties defined in EDM for Time Spans""" ;
  dc:type esc:closure ;
  dc:subject "R-206-DEFINE-ALLOWED-NAMESPACES" ;
  sh:closed true ;
  sh:ignoredProperties (rdf:type) ;
.
```
#### Property <a id="skos_altLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>
------

##### Constraint <a id="skos_altLabel_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:altLabel ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="skos_altLabel_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#datatype">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#datatype</a>
<table>
<tr><th align="right">description</th><td>Ideally all skos:altLabel should have a language tag</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/55">R-48-MISSING-LANGUAGE-TAGS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#datatype>
  a sh:PropertyConstraint ;
  dc:type esc:datatype ;
  sh:description "Ideally all skos:altLabel should have a language tag" ;
  dc:subject "R-48-MISSING-LANGUAGE-TAGS" ;
  sh:filterShape [
      sh:property [
          sh:predicate skos:altLabel ;
          sh:nodeKind sh:Literal ;
      ]
  ] ;
  sh:predicate skos:altLabel ;
  sh:datatype rdf:langString ;
  sh:severity sh:Warning ;
.
```

##### Constraint <a id="skos_altLabel_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#redundancy</a>
<table>
<tr><th align="right">description</th><td>skos:altLabel should not have the same labels than in 
                    skos:prefLabel</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/17">R-10-DEFINE-DISJOINT-PROPERTIES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#redundancy>
  a sh:PropertyConstraint ;
  dc:type esc:redundancy ;
  sh:description """skos:altLabel should not have the same labels than in 
                    skos:prefLabel""" ;
  dc:subject "R-10-DEFINE-DISJOINT-PROPERTIES" ;
  sh:predicate  skos:altLabel ;
  sh:notEquals  skos:prefLabel ;
  sh:severity sh:Warning ;
.
```

##### Constraint <a id="skos_altLabel_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#type">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_altLabel#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:altLabel ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_note" target="_blank" href="http://www.w3.org/2004/02/skos/core#note">http://www.w3.org/2004/02/skos/core#note</a>
------

##### Constraint <a id="skos_note_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_note#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_note#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_note#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:note ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="skos_note_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_note#datatype">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_note#datatype</a>
<table>
<tr><th align="right">description</th><td>Ideally all skos:note should have a language tag</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/55">R-48-MISSING-LANGUAGE-TAGS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_note#datatype>
  a sh:PropertyConstraint ;
  dc:type esc:datatype ;
  sh:description "Ideally all skos:note should have a language tag" ;
  dc:subject "R-48-MISSING-LANGUAGE-TAGS" ;
  sh:filterShape [
      sh:property [
          sh:predicate skos:note ;
          sh:nodeKind sh:Literal ;
      ]
  ] ;
  sh:predicate skos:note ;
  sh:datatype rdf:langString ;
  sh:severity sh:Warning ;
.
```

##### Constraint <a id="skos_note_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_note#type">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_note#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_note#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:note ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_prefLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>
------

##### Constraint <a id="skos_prefLabel_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_prefLabel#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_prefLabel#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one skos:prefLabel per language</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/56">R-49-PROPERTY-OCCURS-ONCE-PER-LANGUAGE-TAG</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_prefLabel#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one skos:prefLabel per language" ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS"
           , "R-49-PROPERTY-OCCURS-ONCE-PER-LANGUAGE-TAG" ;
  sh:predicate skos:prefLabel ;
  sh:minCount 0 ;
  sh:uniqueLang true ;
.
```

##### Constraint <a id="skos_prefLabel_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_prefLabel#datatype">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_prefLabel#datatype</a>
<table>
<tr><th align="right">description</th><td>Ideally all skos:prefLabel should have a language tag</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/55">R-48-MISSING-LANGUAGE-TAGS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_prefLabel#datatype>
  a sh:PropertyConstraint ;
  dc:type esc:datatype ;
  sh:description "Ideally all skos:prefLabel should have a language tag" ;
  dc:subject "R-48-MISSING-LANGUAGE-TAGS" ;
  sh:filterShape [
      sh:property [
          sh:predicate skos:prefLabel ;
          sh:nodeKind sh:Literal ;
      ]
  ] ;
  sh:predicate skos:prefLabel ;
  sh:datatype rdf:langString ;
  sh:severity sh:Warning ;
.
```

##### Constraint <a id="skos_prefLabel_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_prefLabel#type">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_prefLabel#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/skos_prefLabel#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:prefLabel ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="dct_hasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------

##### Constraint <a id="dct_hasPart_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_hasPart#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_hasPart#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_hasPart#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:hasPart ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="dct_hasPart_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_hasPart#range-class">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_hasPart#range-class</a>
<table>
<tr><th align="right">description</th><td>dcterms:hasPart must refer to a valid edm:TimeSpan</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_hasPart#range-class>
  a sh:PropertyConstraint ;
  sh:description "dcterms:hasPart must refer to a valid edm:TimeSpan" ;
  dc:type esc:range-class ;
  dc:subject "R-225-VALIDATION-OF-CLASS-ASSOCIATION"
           , "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:predicate dct:hasPart ;
  sh:valueShape TimeSpan: ;
  sh:class edm:TimeSpan ;
.
```

##### Constraint <a id="dct_hasPart_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_hasPart#type">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_hasPart#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_hasPart#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:hasPart ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="dct_isPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
------

##### Constraint <a id="dct_isPartOf_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_isPartOf#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_isPartOf#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_isPartOf#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate dct:isPartOf ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="dct_isPartOf_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_isPartOf#range-class">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_isPartOf#range-class</a>
<table>
<tr><th align="right">description</th><td>dcterms:isPartOf must refer to a valid edm:TimeSpan</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_isPartOf#range-class>
  a sh:PropertyConstraint ;
  sh:description "dcterms:isPartOf must refer to a valid edm:TimeSpan" ;
  dc:type esc:range-class ;
  dc:subject "R-225-VALIDATION-OF-CLASS-ASSOCIATION"
           , "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:predicate dct:hasPart ;
  sh:valueShape TimeSpan: ;
  sh:class edm:TimeSpan ;
.
```

##### Constraint <a id="dct_isPartOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_isPartOf#type">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_isPartOf#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/dct_isPartOf#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:isPartOf ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_begin" target="_blank" href="http://www.europeana.eu/schemas/edm/begin">http://www.europeana.eu/schemas/edm/begin</a>
------

##### Constraint <a id="edm_begin_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one edm:begin</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one edm:begin" ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:begin ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="edm_begin_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#correlation">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#correlation</a>
<table>
<tr><th align="right">description</th><td>edm:begin must be earlier or equals than edm:end</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/50">R-43-LITERAL-VALUE-COMPARISON</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#correlation>
  a sh:PropertyConstraint ;
  sh:description "edm:begin must be earlier or equals than edm:end";
  dc:type esc:correlation ;
  dc:subject "R-43-LITERAL-VALUE-COMPARISON" ;
  sh:predicate edm:begin ;
  sh:lessThanOrEquals edm:end ;
.
```

##### Constraint <a id="edm_begin_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#literal">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#literal</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#literal>
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

##### Constraint <a id="edm_begin_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#type">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_begin#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:begin ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="edm_end" target="_blank" href="http://www.europeana.eu/schemas/edm/end">http://www.europeana.eu/schemas/edm/end</a>
------

##### Constraint <a id="edm_end_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_end#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_end#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one edm:end</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_end#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one edm:end" ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:end ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="edm_end_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_end#literal">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_end#literal</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_end#literal>
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

##### Constraint <a id="edm_end_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_end#type">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_end#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_end#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:end ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="edm_isNextInSequence" target="_blank" href="http://www.europeana.eu/schemas/edm/isNextInSequence">http://www.europeana.eu/schemas/edm/isNextInSequence</a>
------

##### Constraint <a id="edm_isNextInSequence_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_isNextInSequence#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_isNextInSequence#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_isNextInSequence#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isNextInSequence ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="edm_isNextInSequence_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_isNextInSequence#range-class">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_isNextInSequence#range-class</a>
<table>
<tr><th align="right">description</th><td>The reference should be a valid edm:TimeSpan</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_isNextInSequence#range-class>
  a sh:PropertyConstraint ;
  sh:description "The reference should be a valid edm:TimeSpan" ;
  dc:type esc:range-class ;
  dc:subject "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING"
           , "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate edm:isNextInSequence ;
  sh:valueShape TimeSpan: ;
  sh:class edm:TimeSpan ;
.
```

##### Constraint <a id="edm_isNextInSequence_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_isNextInSequence#type">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_isNextInSequence#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/edm_isNextInSequence#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isNextInSequence ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="owl_sameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>
------

##### Constraint <a id="owl_sameAs_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/owl_sameAs#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/owl_sameAs#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/owl_sameAs#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate owl:sameAs ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="owl_sameAs_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/owl_sameAs#type">http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/owl_sameAs#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/TimeSpan/owl_sameAs#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate owl:sameAs ;
  sh:nodeKind sh:IRI ;
.
```
