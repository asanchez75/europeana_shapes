
## Shapes definitions for edmWebResource class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/WebResource.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a edm:WebResource class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#dcdescription">dcdescription</a>||||
|<a href="#dcformat">dcformat</a>||||
|<a href="#dcrights">dcrights</a>||||
|<a href="#dcsource">dcsource</a>||||
|<a href="#dctconformsTo">dctconformsTo</a>||||
|<a href="#dctcreated">dctcreated</a>||||
|<a href="#dctextent">dctextent</a>||||
|<a href="#dcthasPart">dcthasPart</a>||||
|<a href="#dcthasPartOf">dcthasPartOf</a>||||
|<a href="#dctisFormatOf">dctisFormatOf</a>||||
|<a href="#dctisPartOf">dctisPartOf</a>||||
|<a href="#dctissued">dctissued</a>||||
|<a href="#edmisNextInSequence">edmisNextInSequence</a>||||
|<a href="#edmrights">edmrights</a>||||

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
#### Property <a id="dcdescription" target="_blank" href="http://purl.org/dc/elements/1.1/description">http://purl.org/dc/elements/1.1/description</a>
------
#### Property <a id="dcformat" target="_blank" href="http://purl.org/dc/elements/1.1/format">http://purl.org/dc/elements/1.1/format</a>
------
#### Property <a id="dcrights" target="_blank" href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>
------
#### Property <a id="dcsource" target="_blank" href="http://purl.org/dc/elements/1.1/source">http://purl.org/dc/elements/1.1/source</a>
------
#### Property <a id="dctconformsTo" target="_blank" href="http://purl.org/dc/terms/conformsTo">http://purl.org/dc/terms/conformsTo</a>
------
#### Property <a id="dctcreated" target="_blank" href="http://purl.org/dc/terms/created">http://purl.org/dc/terms/created</a>
------
#### Property <a id="dctextent" target="_blank" href="http://purl.org/dc/terms/extent">http://purl.org/dc/terms/extent</a>
------
#### Property <a id="dcthasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------
#### Property <a id="dcthasPartOf" target="_blank" href="http://purl.org/dc/terms/hasPartOf">http://purl.org/dc/terms/hasPartOf</a>
------
#### Property <a id="dctisFormatOf" target="_blank" href="http://purl.org/dc/terms/isFormatOf">http://purl.org/dc/terms/isFormatOf</a>
------
#### Property <a id="dctisPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
------
#### Property <a id="dctissued" target="_blank" href="http://purl.org/dc/terms/issued">http://purl.org/dc/terms/issued</a>
------
#### Property <a id="edmisNextInSequence" target="_blank" href="http://www.europeana.eu/schemas/edm/isNextInSequence">http://www.europeana.eu/schemas/edm/isNextInSequence</a>
------
#### Property <a id="edmrights" target="_blank" href="http://www.europeana.eu/schemas/edm/rights">http://www.europeana.eu/schemas/edm/rights</a>
------
