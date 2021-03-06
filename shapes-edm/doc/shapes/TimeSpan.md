
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
|<a href="#skos_altLabel">skos:altLabel</a>|0..*|<a href="#skos_altLabel_type">Literal</a>||
|<a href="#skos_note">skos:note</a>|0..*|<a href="#skos_note_type">Literal</a>||
|<a href="#skos_prefLabel">skos:prefLabel</a>|0..*|<a href="#skos_prefLabel_type">Literal</a>||
|<a href="#dct_hasPart">dct:hasPart</a>|0..*|<a href="#dct_hasPart_type">IRI</a>||
|<a href="#dct_isPartOf">dct:isPartOf</a>|0..*|<a href="#dct_isPartOf_type">IRI</a>||
|<a href="#edm_begin">edm:begin</a>|<a href="#edm_begin_cardinality">0..1</a>|<a href="#edm_begin_type">Literal</a>||
|<a href="#edm_end">edm:end</a>|<a href="#edm_end_cardinality">0..1</a>|<a href="#edm_end_type">Literal</a>||
|<a href="#edm_isNextInSequence">edm:isNextInSequence</a>|0..*|<a href="#edm_isNextInSequence_type">IRI</a>||
|<a href="#owl_sameAs">owl:sameAs</a>|0..*|<a href="#owl_sameAs_type">IRI</a>||

Below is an example of a resource of type edm:TimeSpan: 

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
         xmlns:skos="http://www.w3.org/2004/02/skos/core#"
         xmlns:dcterms="http://purl.org/dc/terms/"
         xmlns:edm="http://www.europeana.eu/schemas/edm/"
         xmlns:owl="http://www.w3.org/2002/07/owl#"
         >
    <edm:TimeSpan rdf:about="http://semium.org/time/19xx_2_third">
        <skos:prefLabel xml:lang="en">Mid 20th century</skos:prefLabel>
        <skos:prefLabel xml:lang="fr">Milieu du 20e siècle</skos:prefLabel>
        <skos:prefLabel xml:lang="de">Mitte des 20. Jahrhunderts</skos:prefLabel>
        <skos:prefLabel xml:lang="it">Metà del 20° secolo</skos:prefLabel>
        <skos:altLabel xml:lang="en">Middle of the 20th Century</skos:altLabel>
        <edm:begin>1934-01-01</edm:begin>
        <edm:end>1966-12-31</edm:end>
        <dcterms:hasPart rdf:resource="http://semium.org/time/1939"/>
        <dcterms:isPartOf rdf:resource="http://semium.org/time/19xx"/>
        <edm:isNextInSequence rdf:resource="http://semium.org/time/19xx_3_third"/>
    </edm:TimeSpan>
</rdf:RDF>
```

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
  sh:property        <TimeSpan/skos_altLabel#type> ;
  sh:property        <TimeSpan/skos_note#type> ;

  # DCTERMS properties
  sh:property        <TimeSpan/dct_hasPart#type> ;
  sh:property        <TimeSpan/dct_isPartOf#type> ;

  # EDM properties
  sh:property        <TimeSpan/edm_begin#type> ;
  sh:property        <TimeSpan/edm_begin#cardinality> ;
  sh:property        <TimeSpan/edm_end#type> ;
  sh:property        <TimeSpan/edm_end#cardinality> ;
  sh:property        <TimeSpan/edm_isNextInSequence#type> ;

  # OWL properties
  sh:property        <TimeSpan/owl_sameAs#type> ;
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
  dc:relation "R-206-DEFINE-ALLOWED-NAMESPACES" ;
  sh:closed true ;
  sh:ignoredProperties (
    rdf:type 
    skos:prefLabel skos:altLabel skos:note
    dct:hasPart dct:isPartOf
    edm:begin edm:end edm:isNextInSequence
    owl:sameAs
  ) ;
.
```

#### Property <a id="skos_altLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>

------

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
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:begin ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
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
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:end ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
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
