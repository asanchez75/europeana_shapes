
## Shapes definitions for skosConcept class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/Concept.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a skos:Concept class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#skosaltLabel">skosaltLabel</a>||||
|<a href="#skosbroadMatch">skosbroadMatch</a>||||
|<a href="#skosbroader">skosbroader</a>||||
|<a href="#skoscloseMatch">skoscloseMatch</a>||||
|<a href="#skosexactMatch">skosexactMatch</a>||||
|<a href="#skosinScheme">skosinScheme</a>||||
|<a href="#skosnarrowMatch">skosnarrowMatch</a>||||
|<a href="#skosnarrower">skosnarrower</a>||||
|<a href="#skosnotation">skosnotation</a>||||
|<a href="#skosnote">skosnote</a>||||
|<a href="#skosprefLabel">skosprefLabel</a>||||
|<a href="#skosrelated">skosrelated</a>||||
|<a href="#skosrelatedMatch">skosrelatedMatch</a>||||

#### Shape Body
------
_Shape body in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept#base>
  a sh:Shape ;
  rdfs:subClassOf rdfs:Resource ;
  sh:description """This shape gathers all constraints that apply to a 
                    skos:Concept class""" ;

  sh:scopeClass skos:Concept ;

  # class level constraints
  sh:constraint      [ sh:closed true ; sh:ignoredProperties (rdf:type) ] ;

  # SKOS properties
  sh:property        <Concept/skos_prefLabel#type> ;
  sh:property        <Concept/skos_prefLabel#datatype> ;
  sh:property        <Concept/skos_prefLabel#cardinality> ;
  sh:property        <Concept/skos_altLabel#type> ;
  sh:property        <Concept/skos_altLabel#datatype> ;
  sh:property        <Concept/skos_altLabel#cardinality> ;
  sh:property        <Concept/skos_altLabel#redundancy> ;
  sh:property        <Concept/skos_broader#type> ;
  sh:property        <Concept/skos_broader#cardinality> ;
  sh:property        <Concept/skos_broader#range-class> ;
  sh:property        <Concept/skos_narrower#type> ;
  sh:property        <Concept/skos_narrower#cardinality> ;
  sh:property        <Concept/skos_related#type> ;
  sh:property        <Concept/skos_related#cardinality> ;
  sh:property        <Concept/skos_broadMatch#type> ;
  sh:property        <Concept/skos_broadMatch#cardinality> ;
  sh:property        <Concept/skos_narrowMatch#type> ;
  sh:property        <Concept/skos_narrowMatch#cardinality> ;
  sh:property        <Concept/skos_relatedMatch#type> ;
  sh:property        <Concept/skos_relatedMatch#cardinality> ;
  sh:property        <Concept/skos_exactMatch#type> ;
  sh:property        <Concept/skos_exactMatch#cardinality> ;
  sh:property        <Concept/skos_closeMatch#type> ;
  sh:property        <Concept/skos_closeMatch#cardinality> ;
  sh:property        <Concept/skos_note#type> ;
  sh:property        <Concept/skos_note#datatype> ;
  sh:property        <Concept/skos_note#cardinality> ;
  sh:property        <Concept/skos_notation#type> ;
  sh:property        <Concept/skos_notation#datatype> ;
  sh:property        <Concept/skos_notation#cardinality> ;
  sh:property        <Concept/skos_inScheme#type> ;
  sh:property        <Concept/skos_inScheme#cardinality> ;
.
```

#### Shape level constraints
------
#### Property <a id="skosaltLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>
------
#### Property <a id="skosbroadMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#broadMatch">http://www.w3.org/2004/02/skos/core#broadMatch</a>
------
#### Property <a id="skosbroader" target="_blank" href="http://www.w3.org/2004/02/skos/core#broader">http://www.w3.org/2004/02/skos/core#broader</a>
------
#### Property <a id="skoscloseMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#closeMatch">http://www.w3.org/2004/02/skos/core#closeMatch</a>
------
#### Property <a id="skosexactMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#exactMatch">http://www.w3.org/2004/02/skos/core#exactMatch</a>
------
#### Property <a id="skosinScheme" target="_blank" href="http://www.w3.org/2004/02/skos/core#inScheme">http://www.w3.org/2004/02/skos/core#inScheme</a>
------
#### Property <a id="skosnarrowMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#narrowMatch">http://www.w3.org/2004/02/skos/core#narrowMatch</a>
------
#### Property <a id="skosnarrower" target="_blank" href="http://www.w3.org/2004/02/skos/core#narrower">http://www.w3.org/2004/02/skos/core#narrower</a>
------
#### Property <a id="skosnotation" target="_blank" href="http://www.w3.org/2004/02/skos/core#notation">http://www.w3.org/2004/02/skos/core#notation</a>
------
#### Property <a id="skosnote" target="_blank" href="http://www.w3.org/2004/02/skos/core#note">http://www.w3.org/2004/02/skos/core#note</a>
------
#### Property <a id="skosprefLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>
------
#### Property <a id="skosrelated" target="_blank" href="http://www.w3.org/2004/02/skos/core#related">http://www.w3.org/2004/02/skos/core#related</a>
------
#### Property <a id="skosrelatedMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#relatedMatch">http://www.w3.org/2004/02/skos/core#relatedMatch</a>
------
