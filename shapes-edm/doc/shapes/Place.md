
## Shapes definitions for edmPlace class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/Place.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a edm:Place class

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
|<a href="#wgs84_posalt">wgs84_posalt</a>||||
|<a href="#wgs84_poslat">wgs84_poslat</a>||||
|<a href="#wgs84_poslong">wgs84_poslong</a>||||
|<a href="#dcthasPart">dcthasPart</a>||||
|<a href="#dctisPartOf">dctisPartOf</a>||||
|<a href="#edmisNextInSequence">edmisNextInSequence</a>||||
|<a href="#owlsameAs">owlsameAs</a>||||

#### Shape Body
------
_Shape body in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Place#base>
  a sh:Shape ;
  rdfs:subClassOf rdfs:Resource ;
  sh:description """This shape gathers all constraints that apply to a 
                    edm:Place class""" ;

  sh:scopeClass edm:Place ;

  # class level constraints
  sh:constraint      [ sh:closed true ; sh:ignoredProperties (rdf:type) ] ;

  # SKOS properties
  sh:property        <Place/skos_prefLabel#type> ;
  sh:property        <Place/skos_prefLabel#datatype> ;
  sh:property        <Place/skos_prefLabel#cardinality> ;
  sh:property        <Place/skos_altLabel#type> ;
  sh:property        <Place/skos_altLabel#datatype> ;
  sh:property        <Place/skos_altLabel#cardinality> ;
  sh:property        <Place/skos_altLabel#redundancy> ;
  sh:property        <Place/skos_note#type> ;
  sh:property        <Place/skos_note#datatype> ;
  sh:property        <Place/skos_note#cardinality> ;

  # WGS84 properties
  sh:property        <Place/wgs84_lat#type> ;
  sh:property        <Place/wgs84_lat#cardinality> ;
  sh:property        <Place/wgs84_lat#literal> ;
  sh:property        <Place/wgs84_lat#correlation> ;
  sh:property        <Place/wgs84_long#type> ;
  sh:property        <Place/wgs84_long#cardinality> ;
  sh:property        <Place/wgs84_long#literal> ;
  sh:property        <Place/wgs84_long#correlation> ;
  sh:property        <Place/wgs84_alt#type> ;
  sh:property        <Place/wgs84_alt#cardinality> ;
  sh:property        <Place/wgs84_alt#literal> ;
  sh:constraint      <Place/wgs84_alt#correlation> ;

  # DCTERMS properties
  sh:property        <Place/dct_hasPart#type> ;
  sh:property        <Place/dct_hasPart#cardinality> ;
  sh:property        <Place/dct_hasPart#range-class> ;
  sh:property        <Place/dct_isPartOf#type> ;
  sh:property        <Place/dct_isPartOf#cardinality> ;
  sh:property        <Place/dct_isPartOf#range-class> ;

  # EDM properties
  sh:property        <Place/edm_isNextInSequence#type> ;
  sh:property        <Place/edm_isNextInSequence#cardinality> ;
  sh:property        <Place/edm_isNextInSequence#range-class> ;

  # OWL properties
  sh:property        <Place/owl_sameAs#type> ;
  sh:property        <Place/owl_sameAs#cardinality> ;
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
#### Property <a id="wgs84_posalt" target="_blank" href="http://www.w3.org/2003/01/geo/wgs84_pos#alt">http://www.w3.org/2003/01/geo/wgs84_pos#alt</a>
------
#### Property <a id="wgs84_poslat" target="_blank" href="http://www.w3.org/2003/01/geo/wgs84_pos#lat">http://www.w3.org/2003/01/geo/wgs84_pos#lat</a>
------
#### Property <a id="wgs84_poslong" target="_blank" href="http://www.w3.org/2003/01/geo/wgs84_pos#long">http://www.w3.org/2003/01/geo/wgs84_pos#long</a>
------
#### Property <a id="dcthasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------
#### Property <a id="dctisPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
------
#### Property <a id="edmisNextInSequence" target="_blank" href="http://www.europeana.eu/schemas/edm/isNextInSequence">http://www.europeana.eu/schemas/edm/isNextInSequence</a>
------
#### Property <a id="owlsameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>
------
