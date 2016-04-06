
## Shapes definitions for edmProvidedCHO class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/ProvidedCHO.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a edm:ProvidedCHO class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'><a href="#http_www_europeana_eu_schemas_edm_shapes_external_ProvidedCHO_correlation">correlation</a></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#dccontributor">dccontributor</a>||||
|<a href="#dccoverage">dccoverage</a>||||
|<a href="#dccreator">dccreator</a>||||
|<a href="#dcdate">dcdate</a>||||
|<a href="#dcdescription">dcdescription</a>||||
|<a href="#dcformat">dcformat</a>||||
|<a href="#dcidentifier">dcidentifier</a>||||
|<a href="#dcissued">dcissued</a>||||
|<a href="#dclanguage">dclanguage</a>||||
|<a href="#dcpublisher">dcpublisher</a>||||
|<a href="#dcrights">dcrights</a>||||
|<a href="#dcsubject">dcsubject</a>||||
|<a href="#dctitle">dctitle</a>||||
|<a href="#dctype">dctype</a>||||
|<a href="#dctalternative">dctalternative</a>||||
|<a href="#dctconformsTo">dctconformsTo</a>||||
|<a href="#dctcreated">dctcreated</a>||||
|<a href="#dctextent">dctextent</a>||||
|<a href="#dcthasFormat">dcthasFormat</a>||||
|<a href="#dcthasPart">dcthasPart</a>||||
|<a href="#dcthasVersion">dcthasVersion</a>||||
|<a href="#dctisFormatOf">dctisFormatOf</a>||||
|<a href="#dctisPartOf">dctisPartOf</a>||||
|<a href="#dctisReferencedBy">dctisReferencedBy</a>||||
|<a href="#dctisReplacedBy">dctisReplacedBy</a>||||
|<a href="#dctisRequiredBy">dctisRequiredBy</a>||||
|<a href="#dctisVersionOf">dctisVersionOf</a>||||
|<a href="#dctissued">dctissued</a>||||
|<a href="#dctmedium">dctmedium</a>||||
|<a href="#dctprovenance">dctprovenance</a>||||
|<a href="#dctreferences">dctreferences</a>||||
|<a href="#dctreplaces">dctreplaces</a>||||
|<a href="#dctrequires">dctrequires</a>||||
|<a href="#dctspatial">dctspatial</a>||||
|<a href="#dcttableOfContents">dcttableOfContents</a>||||
|<a href="#dcttemporal">dcttemporal</a>||||
|<a href="#edmaggregatedCHO">edmaggregatedCHO</a>||||
|<a href="#edmcurrentLocation">edmcurrentLocation</a>||||
|<a href="#edmhasMet">edmhasMet</a>||||
|<a href="#edmhasType">edmhasType</a>||||
|<a href="#edmincorporates">edmincorporates</a>||||
|<a href="#edmisDerivativeOf">edmisDerivativeOf</a>||||
|<a href="#edmisNextInSequence">edmisNextInSequence</a>||||
|<a href="#edmisRelatedTo">edmisRelatedTo</a>||||
|<a href="#edmisRepresentationOf">edmisRepresentationOf</a>||||
|<a href="#edmisSimilarTo">edmisSimilarTo</a>||||
|<a href="#edmisSuccessorOf">edmisSuccessorOf</a>||||
|<a href="#edmrealizes">edmrealizes</a>||||
|<a href="#edmtype">edmtype</a>||||
|<a href="#edmugc">edmugc</a>||||
|<a href="#edmunstored">edmunstored</a>||||
|<a href="#owlsameAs">owlsameAs</a>||||

#### Shape Body
------
_Shape body in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#base>
  a sh:Shape ;
  rdfs:subClassOf rdfs:Resource ;
  sh:description """This shape gathers all constraints that apply to a 
                    edm:ProvidedCHO class""" ;

  sh:scopeClass edm:ProvidedCHO ;

  # class level constraints
  sh:constraint      [ sh:closed true ; sh:ignoredProperties (rdf:type) ] ;
  sh:constraint      <ProvidedCHO#correlation> ;

  # DC properties
  sh:property        <ProvidedCHO/dc_contributor#cardinality> ;
  sh:property        <ProvidedCHO/dc_contributor#range-class> ;
  sh:property        <ProvidedCHO/dc_coverage#cardinality> ;
  sh:property        <ProvidedCHO/dc_coverage#range-class> ;
  sh:property        <ProvidedCHO/dc_coverage#subproperty_1> ;
  sh:constraint      <ProvidedCHO/dc_coverage#subproperty_2> ;
  sh:property        <ProvidedCHO/dc_creator#cardinality> ;
  sh:property        <ProvidedCHO/dc_creator#range-class> ;
  sh:property        <ProvidedCHO/dc_date#cardinality> ;
  sh:property        <ProvidedCHO/dc_date#range-class> ;
  sh:property        <ProvidedCHO/dc_date#literal> ;
  sh:property        <ProvidedCHO/dc_date#subproperty_1> ;
  sh:constraint      <ProvidedCHO/dc_date#subproperty_2> ;
  sh:property        <ProvidedCHO/dc_description#cardinality> ;
  sh:property        <ProvidedCHO/dc_format#cardinality> ;
  sh:property        <ProvidedCHO/dc_identifier#type> ;
  sh:property        <ProvidedCHO/dc_identifier#cardinality> ;
  sh:property        <ProvidedCHO/dc_language#type> ;
  sh:property        <ProvidedCHO/dc_language#cardinality> ;
  sh:property        <ProvidedCHO/dc_language#values> ;
  sh:property        <ProvidedCHO/dc_publisher#cardinality> ;
  sh:property        <ProvidedCHO/dc_publisher#range-class> ;
  sh:property        <ProvidedCHO/dc_rights#cardinality> ;
  sh:constraint      <ProvidedCHO/dc_rights#redundancy> ;
  sh:property        <ProvidedCHO/dc_subject#cardinality> ;
  sh:property        <ProvidedCHO/dc_subject#range-class> ;
  sh:property        <ProvidedCHO/dc_subject#multiplevalue> ;
  sh:property        <ProvidedCHO/dc_title#type> ;
  sh:property        <ProvidedCHO/dc_title#cardinality> ;
  sh:property        <ProvidedCHO/dc_type#cardinality> ;
  sh:property        <ProvidedCHO/dc_type#range-class> ;

  # DCTERMS properties
  sh:property        <ProvidedCHO/dct_alternative#cardinality> ;
  sh:property        <ProvidedCHO/dct_alternative#type> ;
  sh:property        <ProvidedCHO/dct_alternative#subproperty> ;
  sh:property        <ProvidedCHO/dct_conformsTo#cardinality> ;
  sh:property        <ProvidedCHO/dct_created#cardinality> ;
  sh:property        <ProvidedCHO/dct_created#range-values> ;
  sh:property        <ProvidedCHO/dct_created#correlation> ;
  sh:property        <ProvidedCHO/dct_extent#cardinality> ;
  sh:property        <ProvidedCHO/dct_hasFormat#cardinality> ;
  sh:property        <ProvidedCHO/dct_hasPart#cardinality> ;
  sh:property        <ProvidedCHO/dct_hasVersion#cardinality> ;
  sh:property        <ProvidedCHO/dct_isFormatOf#cardinality> ;
  sh:property        <ProvidedCHO/dct_isPartOf#cardinality> ;
  sh:property        <ProvidedCHO/dct_isReferencedBy#cardinality> ;
  sh:property        <ProvidedCHO/dct_isReplacedBy#cardinality> ;
  sh:property        <ProvidedCHO/dct_isRequiredBy#cardinality> ;
  sh:property        <ProvidedCHO/dct_issued#cardinality> ;
  sh:property        <ProvidedCHO/dct_issued#range-values> ;
  sh:property        <ProvidedCHO/dct_issued#range-class> ;
  sh:property        <ProvidedCHO/dct_isVersionOf#cardinality> ;
  sh:property        <ProvidedCHO/dct_medium#cardinality> ;
  sh:property        <ProvidedCHO/dct_provenance#cardinality> ;
  sh:property        <ProvidedCHO/dct_references#cardinality> ;
  sh:property        <ProvidedCHO/dct_replaces#cardinality> ;
  sh:property        <ProvidedCHO/dct_requires#cardinality> ;
  sh:property        <ProvidedCHO/dct_spatial#cardinality> ;
  sh:property        <ProvidedCHO/dct_tableOfContents#type> ;
  sh:property        <ProvidedCHO/dct_tableOfContents#cardinality> ;
  sh:property        <ProvidedCHO/dct_temporal#cardinality> ;

  # EDM properties
  sh:inverseProperty <ProvidedCHO/edm_aggregatedCHO#correlation> ;
  sh:property        <ProvidedCHO/edm_currentLocation#type> ;
  sh:property        <ProvidedCHO/edm_currentLocation#cardinality> ;
  sh:property        <ProvidedCHO/edm_hasMet#type> ;
  sh:property        <ProvidedCHO/edm_hasMet#cardinality> ;
  sh:constraint      <ProvidedCHO/edm_hasMet#range-class> ;
  sh:property        <ProvidedCHO/edm_hasType#cardinality> ;
  sh:property        <ProvidedCHO/edm_incorporates#type> ;
  sh:property        <ProvidedCHO/edm_incorporates#cardinality> ;
  sh:property        <ProvidedCHO/edm_isDerivativeOf#type> ;
  sh:property        <ProvidedCHO/edm_isDerivativeOf#cardinality> ;
  sh:property        <ProvidedCHO/edm_isNextInSequence#type> ;
  sh:property        <ProvidedCHO/edm_isNextInSequence#cardinality> ;
  sh:property        <ProvidedCHO/edm_isNextInSequence#range-class> ;
  sh:property        <ProvidedCHO/edm_isNextInSequence#correlation> ;
  sh:property        <ProvidedCHO/edm_isRelatedTo#cardinality> ;
  sh:property        <ProvidedCHO/edm_isRepresentationOf#type> ;
  sh:property        <ProvidedCHO/edm_isRepresentationOf#cardinality> ;
  sh:property        <ProvidedCHO/edm_isSimilarTo#type> ;
  sh:property        <ProvidedCHO/edm_isSimilarTo#cardinality> ;
  sh:property        <ProvidedCHO/edm_isSuccessorOf#type> ;
  sh:property        <ProvidedCHO/edm_isSuccessorOf#cardinality> ;
  sh:property        <ProvidedCHO/edm_realizes#type> ;
  sh:property        <ProvidedCHO/edm_realizes#cardinality> ;
  sh:property        <ProvidedCHO/edm_type#type> ;
  sh:property        <ProvidedCHO/edm_type#cardinality> ;
  sh:property        <ProvidedCHO/edm_type#values> ;
  sh:property        <ProvidedCHO/edm_type#correlation> ;
  sh:property        <ProvidedCHO/edm_unstored#type> ;
  sh:property        <ProvidedCHO/edm_unstored#cardinality> ;
  sh:property        <ProvidedCHO/edm_ugc#type> ;
  sh:property        <ProvidedCHO/edm_ugc#cardinality> ;

  # OWL properties
  sh:property        <ProvidedCHO/owl_sameAs#type> ;
  sh:property        <ProvidedCHO/owl_sameAs#cardinality> ;
.
```

#### Shape level constraints
------

##### Constraint <a id="http_www_europeana_eu_schemas_edm_shapes_external_ProvidedCHO_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#correlation">http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#correlation</a>
<table>
<tr><th align="right">description</th><td>Check that if edm:ProvidedCHO is present, at least: one 
                    dc:title or sh:description should be present; one dc:subject
                    or dc:type or dc:coverage or dcterms:spatial and edm:type 
                    should be present</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/74">R-67-BOOLEAN-PROPERTY-PATTERNS</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/75">R-68-REQUIRED-PROPERTIES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO#correlation>
  a sh:Constraint ;
  sh:description """Check that if edm:ProvidedCHO is present, at least: one 
                    dc:title or sh:description should be present; one dc:subject
                    or dc:type or dc:coverage or dcterms:spatial and edm:type 
                    should be present""" ;
  dc:type esc:correlation ;
  dc:subject "R-68-REQUIRED-PROPERTIES"
           , "R-67-BOOLEAN-PROPERTY-PATTERNS" ;
  sh:message """At least: one dc:title or sh:description; one dc:subject or 
                dc:type or dc:coverage or dcterms:spatial; and one edm:type 
                should be present""" ;
  sh:and (
    [
      sh:constraint [
        sh:or (
          [ sh:property [ sh:predicate dc:title       ; sh:minCount 1 ; ] ]
          [ sh:property [ sh:predicate dc:description ; sh:minCount 1 ; ] ]
        )
      ]
    ]
    [
      sh:constraint [
        sh:or (
          [ sh:property [ sh:predicate dc:subject  ; sh:minCount 1 ; ] ]
          [ sh:property [ sh:predicate dc:type     ; sh:minCount 1 ; ] ]
          [ sh:property [ sh:predicate dc:coverage ; sh:minCount 1 ; ] ]
          [ sh:property [ sh:predicate dct:spatial ; sh:minCount 1 ; ] ]
        )
      ]
    ]
  ) ;
.
```
#### Property <a id="dccontributor" target="_blank" href="http://purl.org/dc/elements/1.1/contributor">http://purl.org/dc/elements/1.1/contributor</a>
------
#### Property <a id="dccoverage" target="_blank" href="http://purl.org/dc/elements/1.1/coverage">http://purl.org/dc/elements/1.1/coverage</a>
------
#### Property <a id="dccreator" target="_blank" href="http://purl.org/dc/elements/1.1/creator">http://purl.org/dc/elements/1.1/creator</a>
------
#### Property <a id="dcdate" target="_blank" href="http://purl.org/dc/elements/1.1/date">http://purl.org/dc/elements/1.1/date</a>
------
#### Property <a id="dcdescription" target="_blank" href="http://purl.org/dc/elements/1.1/description">http://purl.org/dc/elements/1.1/description</a>
------
#### Property <a id="dcformat" target="_blank" href="http://purl.org/dc/elements/1.1/format">http://purl.org/dc/elements/1.1/format</a>
------
#### Property <a id="dcidentifier" target="_blank" href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>
------
#### Property <a id="dcissued" target="_blank" href="http://purl.org/dc/elements/1.1/issued">http://purl.org/dc/elements/1.1/issued</a>
------
#### Property <a id="dclanguage" target="_blank" href="http://purl.org/dc/elements/1.1/language">http://purl.org/dc/elements/1.1/language</a>
------
#### Property <a id="dcpublisher" target="_blank" href="http://purl.org/dc/elements/1.1/publisher">http://purl.org/dc/elements/1.1/publisher</a>
------
#### Property <a id="dcrights" target="_blank" href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>
------
#### Property <a id="dcsubject" target="_blank" href="http://purl.org/dc/elements/1.1/subject">http://purl.org/dc/elements/1.1/subject</a>
------
#### Property <a id="dctitle" target="_blank" href="http://purl.org/dc/elements/1.1/title">http://purl.org/dc/elements/1.1/title</a>
------
#### Property <a id="dctype" target="_blank" href="http://purl.org/dc/elements/1.1/type">http://purl.org/dc/elements/1.1/type</a>
------
#### Property <a id="dctalternative" target="_blank" href="http://purl.org/dc/terms/alternative">http://purl.org/dc/terms/alternative</a>
------
#### Property <a id="dctconformsTo" target="_blank" href="http://purl.org/dc/terms/conformsTo">http://purl.org/dc/terms/conformsTo</a>
------
#### Property <a id="dctcreated" target="_blank" href="http://purl.org/dc/terms/created">http://purl.org/dc/terms/created</a>
------
#### Property <a id="dctextent" target="_blank" href="http://purl.org/dc/terms/extent">http://purl.org/dc/terms/extent</a>
------
#### Property <a id="dcthasFormat" target="_blank" href="http://purl.org/dc/terms/hasFormat">http://purl.org/dc/terms/hasFormat</a>
------
#### Property <a id="dcthasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------
#### Property <a id="dcthasVersion" target="_blank" href="http://purl.org/dc/terms/hasVersion">http://purl.org/dc/terms/hasVersion</a>
------
#### Property <a id="dctisFormatOf" target="_blank" href="http://purl.org/dc/terms/isFormatOf">http://purl.org/dc/terms/isFormatOf</a>
------
#### Property <a id="dctisPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
------
#### Property <a id="dctisReferencedBy" target="_blank" href="http://purl.org/dc/terms/isReferencedBy">http://purl.org/dc/terms/isReferencedBy</a>
------
#### Property <a id="dctisReplacedBy" target="_blank" href="http://purl.org/dc/terms/isReplacedBy">http://purl.org/dc/terms/isReplacedBy</a>
------
#### Property <a id="dctisRequiredBy" target="_blank" href="http://purl.org/dc/terms/isRequiredBy">http://purl.org/dc/terms/isRequiredBy</a>
------
#### Property <a id="dctisVersionOf" target="_blank" href="http://purl.org/dc/terms/isVersionOf">http://purl.org/dc/terms/isVersionOf</a>
------
#### Property <a id="dctissued" target="_blank" href="http://purl.org/dc/terms/issued">http://purl.org/dc/terms/issued</a>
------
#### Property <a id="dctmedium" target="_blank" href="http://purl.org/dc/terms/medium">http://purl.org/dc/terms/medium</a>
------
#### Property <a id="dctprovenance" target="_blank" href="http://purl.org/dc/terms/provenance">http://purl.org/dc/terms/provenance</a>
------
#### Property <a id="dctreferences" target="_blank" href="http://purl.org/dc/terms/references">http://purl.org/dc/terms/references</a>
------
#### Property <a id="dctreplaces" target="_blank" href="http://purl.org/dc/terms/replaces">http://purl.org/dc/terms/replaces</a>
------
#### Property <a id="dctrequires" target="_blank" href="http://purl.org/dc/terms/requires">http://purl.org/dc/terms/requires</a>
------
#### Property <a id="dctspatial" target="_blank" href="http://purl.org/dc/terms/spatial">http://purl.org/dc/terms/spatial</a>
------
#### Property <a id="dcttableOfContents" target="_blank" href="http://purl.org/dc/terms/tableOfContents">http://purl.org/dc/terms/tableOfContents</a>
------
#### Property <a id="dcttemporal" target="_blank" href="http://purl.org/dc/terms/temporal">http://purl.org/dc/terms/temporal</a>
------
#### Property <a id="edmaggregatedCHO" target="_blank" href="http://www.europeana.eu/schemas/edm/aggregatedCHO">http://www.europeana.eu/schemas/edm/aggregatedCHO</a>
------
#### Property <a id="edmcurrentLocation" target="_blank" href="http://www.europeana.eu/schemas/edm/currentLocation">http://www.europeana.eu/schemas/edm/currentLocation</a>
------
#### Property <a id="edmhasMet" target="_blank" href="http://www.europeana.eu/schemas/edm/hasMet">http://www.europeana.eu/schemas/edm/hasMet</a>
------
#### Property <a id="edmhasType" target="_blank" href="http://www.europeana.eu/schemas/edm/hasType">http://www.europeana.eu/schemas/edm/hasType</a>
------
#### Property <a id="edmincorporates" target="_blank" href="http://www.europeana.eu/schemas/edm/incorporates">http://www.europeana.eu/schemas/edm/incorporates</a>
------
#### Property <a id="edmisDerivativeOf" target="_blank" href="http://www.europeana.eu/schemas/edm/isDerivativeOf">http://www.europeana.eu/schemas/edm/isDerivativeOf</a>
------
#### Property <a id="edmisNextInSequence" target="_blank" href="http://www.europeana.eu/schemas/edm/isNextInSequence">http://www.europeana.eu/schemas/edm/isNextInSequence</a>
------
#### Property <a id="edmisRelatedTo" target="_blank" href="http://www.europeana.eu/schemas/edm/isRelatedTo">http://www.europeana.eu/schemas/edm/isRelatedTo</a>
------
#### Property <a id="edmisRepresentationOf" target="_blank" href="http://www.europeana.eu/schemas/edm/isRepresentationOf">http://www.europeana.eu/schemas/edm/isRepresentationOf</a>
------
#### Property <a id="edmisSimilarTo" target="_blank" href="http://www.europeana.eu/schemas/edm/isSimilarTo">http://www.europeana.eu/schemas/edm/isSimilarTo</a>
------
#### Property <a id="edmisSuccessorOf" target="_blank" href="http://www.europeana.eu/schemas/edm/isSuccessorOf">http://www.europeana.eu/schemas/edm/isSuccessorOf</a>
------
#### Property <a id="edmrealizes" target="_blank" href="http://www.europeana.eu/schemas/edm/realizes">http://www.europeana.eu/schemas/edm/realizes</a>
------
#### Property <a id="edmtype" target="_blank" href="http://www.europeana.eu/schemas/edm/type">http://www.europeana.eu/schemas/edm/type</a>
------
#### Property <a id="edmugc" target="_blank" href="http://www.europeana.eu/schemas/edm/ugc">http://www.europeana.eu/schemas/edm/ugc</a>
------
#### Property <a id="edmunstored" target="_blank" href="http://www.europeana.eu/schemas/edm/unstored">http://www.europeana.eu/schemas/edm/unstored</a>
------
#### Property <a id="owlsameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>
------
