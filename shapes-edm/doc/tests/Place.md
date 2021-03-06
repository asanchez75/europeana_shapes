
## Test cases for edm:Place class
_This document was generated from the testcases available within this [directory] (/shapes-edm/src/test/resources/etc/edm/tests/data) using this [software](/shapes-doc)_

This document contains test cases that target constraints that are specific to resources of type edm:Place and which are defined within this [shape definition](/shapes-edm/doc/shapes/Place.md). The validation results were generated using [TopBraid SHACL](http://github.com/TopQuadrant/shacl) validator.  The following table shows the testcases that were run:

| Test Case | Results | Status |
| :--- | ---: | :--: |
| [ok.xml](#ok_data) | [0](#ok_result) |  |

#### Test Case: <a id="ok_data" target="_blank" href="/shapes-edm/src/test/resources/etc/edm/tests/data/place/ok.xml">ok.xml</a>
------

```XML
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
<a id="ok_result">&nbsp;</a>_Below is the output generated by TopBraid SHACL validator in Turtle syntax:_

```
@prefix sh:    <http://www.w3.org/ns/shacl#> .
```
