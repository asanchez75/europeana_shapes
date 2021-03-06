
## Shapes definitions for edm:Place class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/Place.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a edm:Place class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'><a href="#http_www_europeana_eu_schemas_edm_shapes_external_Place_closure">closure</a></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#skos_altLabel">skos:altLabel</a>|0..*|<a href="#skos_altLabel_type">Literal</a>||
|<a href="#skos_note">skos:note</a>|0..*|<a href="#skos_note_type">Literal</a>||
|<a href="#skos_prefLabel">skos:prefLabel</a>|0..*|<a href="#skos_prefLabel_type">Literal</a>||
|<a href="#wgs84_pos_alt">wgs84_pos:alt</a>|0..*|||
|<a href="#wgs84_pos_lat">wgs84_pos:lat</a>|0..*|||
|<a href="#wgs84_pos_long">wgs84_pos:long</a>|0..*|||
|<a href="#dct_hasPart">dct:hasPart</a>|0..*|<a href="#dct_hasPart_type">IRI</a>||
|<a href="#dct_isPartOf">dct:isPartOf</a>|0..*|<a href="#dct_isPartOf_type">IRI</a>||
|<a href="#edm_isNextInSequence">edm:isNextInSequence</a>|<a href="#edm_isNextInSequence_cardinality">0..?</a>|<a href="#edm_isNextInSequence_type">IRI</a>||
|<a href="#owl_sameAs">owl:sameAs</a>|0..*|<a href="#owl_sameAs_type">IRI</a>||

Below is an example of a resource of type edm:Place: 

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
         xmlns:dcterms="http://purl.org/dc/terms/"
         xmlns:wgs84_pos="http://www.w3.org/2003/01/geo/wgs84_pos#"
         xmlns:skos="http://www.w3.org/2004/02/skos/core#"
         xmlns:edm="http://www.europeana.eu/schemas/edm/"
         xmlns:owl="http://www.w3.org/2002/07/owl#"
         >
    <edm:Place rdf:about="http://sws.geonames.org/2988507/">
        <skos:prefLabel xml:lang="en">Paris</skos:prefLabel>
        <skos:prefLabel xml:lang="fr">Paris</skos:prefLabel>
        <skos:prefLabel xml:lang="ir">Parigi</skos:prefLabel>
        <skos:altLabel xml:lang="fr">Lutèce</skos:altLabel>
        <skos:note xml:lang="en">Paris is the capital and most populous city of France...</skos:note>
        <dcterms:hasPart rdf:resource="http://sws.geonames.org/6269274/"/>
        <dcterms:isPartOf rdf:resource="http://sws.geonames.org/3017382/"/>
        <edm:isNextInSequence rdf:resource="http://sws.geonames.org/9843561/"/>
        <wgs84_pos:lat>48.85341</wgs84_pos:lat>
        <wgs84_pos:long>2.3488</wgs84_pos:long>
        <owl:sameAs rdf:resource="http://dbpedia.org/resource/Paris"/>
    </edm:Place>
</rdf:RDF>
```

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
  sh:constraint      <Place#closure> ;

  # SKOS properties
  sh:property        <Place/skos_prefLabel#type> ;
  sh:property        <Place/skos_altLabel#type> ;
  sh:property        <Place/skos_note#type> ;

  # WGS84 properties
  sh:property        <Place/wgs84_lat#type> ;
  sh:property        <Place/wgs84_lat#cardinality> ;
  sh:property        <Place/wgs84_long#type> ;
  sh:property        <Place/wgs84_long#cardinality> ;
  sh:property        <Place/wgs84_alt#type> ;
  sh:property        <Place/wgs84_alt#cardinality> ;

  # DCTERMS properties
  sh:property        <Place/dct_hasPart#type> ;
  sh:property        <Place/dct_isPartOf#type> ;

  # EDM properties
  sh:property        <Place/edm_isNextInSequence#type> ;
  sh:property        <Place/edm_isNextInSequence#cardinality> ;

  # OWL properties
  sh:property        <Place/owl_sameAs#type> ;
.
```

#### Shape level constraints
------

##### Constraint <a id="http_www_europeana_eu_schemas_edm_shapes_external_Place_closure" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place#closure">http://www.europeana.eu/schemas/edm/shapes/external/Place#closure</a>
<table>
<tr><th align="right">description</th><td>An edm:Place resource must be defined using only the 
                    properties defined in EDM for Places</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="null">R-206-DEFINE-ALLOWED-NAMESPACES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#closure">http://www.europeana.eu/schemas/edm/shapes/categories#closure</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Place#closure>
  sh:description """An edm:Place resource must be defined using only the 
                    properties defined in EDM for Places""" ;
  dc:type esc:closure ;
  dc:relation "R-206-DEFINE-ALLOWED-NAMESPACES" ;
  sh:closed true ;
  sh:ignoredProperties (
    rdf:type 
    skos:prefLabel skos:altLabel skos:note
    wgs84_pos:lat wgs84_pos:long wgs84_pos:alt
    dct:hasPart dct:isPartOf
    edm:isNextInSequence
    owl:sameAs
  ) ;
.
```

#### Property <a id="skos_altLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>

------

##### Constraint <a id="skos_altLabel_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/skos_altLabel#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/skos_altLabel#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Place/skos_altLabel#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:altLabel ;
  sh:nodeKind sh:Literal ;
.
```

#### Property <a id="skos_note" target="_blank" href="http://www.w3.org/2004/02/skos/core#note">http://www.w3.org/2004/02/skos/core#note</a>

------

##### Constraint <a id="skos_note_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/skos_note#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/skos_note#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Place/skos_note#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:note ;
  sh:nodeKind sh:Literal ;
.
```

#### Property <a id="skos_prefLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>

------

##### Constraint <a id="skos_prefLabel_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/skos_prefLabel#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/skos_prefLabel#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Place/skos_prefLabel#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:prefLabel ;
  sh:nodeKind sh:Literal ;
.
```

#### Property <a id="wgs84_pos_alt" target="_blank" href="http://www.w3.org/2003/01/geo/wgs84_pos#alt">http://www.w3.org/2003/01/geo/wgs84_pos#alt</a>

------

#### Property <a id="wgs84_pos_lat" target="_blank" href="http://www.w3.org/2003/01/geo/wgs84_pos#lat">http://www.w3.org/2003/01/geo/wgs84_pos#lat</a>

------

#### Property <a id="wgs84_pos_long" target="_blank" href="http://www.w3.org/2003/01/geo/wgs84_pos#long">http://www.w3.org/2003/01/geo/wgs84_pos#long</a>

------

#### Property <a id="dct_hasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>

------

##### Constraint <a id="dct_hasPart_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_hasPart#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_hasPart#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_hasPart#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:hasPart ;
  sh:nodeKind sh:IRI ;
.
```

#### Property <a id="dct_isPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>

------

##### Constraint <a id="dct_isPartOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_isPartOf#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_isPartOf#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Place/dct_isPartOf#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate dct:isPartOf ;
  sh:nodeKind sh:IRI ;
.
```

#### Property <a id="edm_isNextInSequence" target="_blank" href="http://www.europeana.eu/schemas/edm/isNextInSequence">http://www.europeana.eu/schemas/edm/isNextInSequence</a>

------

##### Constraint <a id="edm_isNextInSequence_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:isNextInSequence ;
  sh:minCount 0 ;
.
```

##### Constraint <a id="edm_isNextInSequence_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Place/edm_isNextInSequence#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate edm:isNextInSequence ;
  sh:nodeKind sh:IRI ;
.
```

#### Property <a id="owl_sameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>

------

##### Constraint <a id="owl_sameAs_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Place/owl_sameAs#type">http://www.europeana.eu/schemas/edm/shapes/external/Place/owl_sameAs#type</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Place/owl_sameAs#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate owl:sameAs ;
  sh:nodeKind sh:IRI ;
.
```
