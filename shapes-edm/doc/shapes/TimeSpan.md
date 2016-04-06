
## Shapes definitions for edmTimeSpan class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/TimeSpan.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a edm:TimeSpan class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#skosaltLabel">skosaltLabel</a>||||
|<a href="#skosnote">skosnote</a>||||
|<a href="#skosprefLabel">skosprefLabel</a>||||
|<a href="#dcthasPart">dcthasPart</a>||||
|<a href="#dctisPartOf">dctisPartOf</a>||||
|<a href="#edmbegin">edmbegin</a>||||
|<a href="#edmend">edmend</a>||||
|<a href="#edmisNextInSequence">edmisNextInSequence</a>||||
|<a href="#owlsameAs">owlsameAs</a>||||

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
  sh:constraint      [ sh:closed true ; sh:ignoredProperties (rdf:type) ] ;

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
#### Property <a id="skosaltLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>
------
#### Property <a id="skosnote" target="_blank" href="http://www.w3.org/2004/02/skos/core#note">http://www.w3.org/2004/02/skos/core#note</a>
------
#### Property <a id="skosprefLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>
------
#### Property <a id="dcthasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------
#### Property <a id="dctisPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
------
#### Property <a id="edmbegin" target="_blank" href="http://www.europeana.eu/schemas/edm/begin">http://www.europeana.eu/schemas/edm/begin</a>
------
#### Property <a id="edmend" target="_blank" href="http://www.europeana.eu/schemas/edm/end">http://www.europeana.eu/schemas/edm/end</a>
------
#### Property <a id="edmisNextInSequence" target="_blank" href="http://www.europeana.eu/schemas/edm/isNextInSequence">http://www.europeana.eu/schemas/edm/isNextInSequence</a>
------
#### Property <a id="owlsameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>
------
