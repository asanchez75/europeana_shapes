
## Shapes definitions for oreAggregation class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/Aggregation.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a ore:Aggregation class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'><a href="#http_www_europeana_eu_schemas_edm_shapes_external_Aggregation_correlation">correlation</a></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#dcrights">dcrights</a>||||
|<a href="#edmaggregatedCHO">edmaggregatedCHO</a>||||
|<a href="#edmdataProvider">edmdataProvider</a>||||
|<a href="#edmhasView">edmhasView</a>||||
|<a href="#edmisShownAt">edmisShownAt</a>||||
|<a href="#edmisShownBy">edmisShownBy</a>||||
|<a href="#edmobject">edmobject</a>||||
|<a href="#edmprovider">edmprovider</a>||||
|<a href="#edmrights">edmrights</a>||||
|<a href="#edmugc">edmugc</a>||||
|<a href="#edmunstored">edmunstored</a>||||

#### Shape Body
------
_Shape body in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#base>
  a sh:Shape ;
  rdfs:subClassOf rdfs:Resource ;
  sh:description """This shape gathers all constraints that apply to a 
                    ore:Aggregation class""" ;

  sh:scopeClass ore:Aggregation ;

  # class level constraints
  sh:constraint      [ sh:closed true ; sh:ignoredProperties (rdf:type) ] ;
  sh:constraint      <Aggregation#correlation> ;

  # DC properties
  sh:property        <Aggregation/dc_rights#type> ;
  sh:property        <Aggregation/dc_rights#cardinality> ;
  sh:property        <Aggregation/dc_rights#redundancy> ;

  # EDM properties
  sh:property        <Aggregation/edm_aggregatedCHO#type> ;
  sh:property        <Aggregation/edm_aggregatedCHO#cardinality> ;
  sh:property        <Aggregation/edm_aggregatedCHO#range-class> ;
  sh:property        <Aggregation/edm_dataProvider#cardinality> ;
  sh:property        <Aggregation/edm_hasView#type> ;
  sh:property        <Aggregation/edm_hasView#cardinality> ;
  sh:property        <Aggregation/edm_hasView#range-class> ;
  sh:property        <Aggregation/edm_isShownAt#type> ;
  sh:property        <Aggregation/edm_isShownAt#cardinality> ;
  sh:property        <Aggregation/edm_isShownAt#range-class> ;
  sh:property        <Aggregation/edm_isShownBy#type> ;
  sh:property        <Aggregation/edm_isShownBy#cardinality> ;
  sh:property        <Aggregation/edm_isShownBy#range-class> ;
  sh:property        <Aggregation/edm_object#type> ;
  sh:property        <Aggregation/edm_object#cardinality> ;
  sh:property        <Aggregation/edm_object#range-class> ;
  sh:property        <Aggregation/edm_provider#cardinality> ;
  sh:property        <Aggregation/edm_rights#type> ;
  sh:property        <Aggregation/edm_rights#cardinality> ;
  sh:property        <Aggregation/edm_rights#values> ;
  sh:property        <Aggregation/edm_ugc#type> ;
  sh:property        <Aggregation/edm_ugc#cardinality> ;
  sh:property        <Aggregation/edm_unstored#type> ;
  sh:property        <Aggregation/edm_unstored#cardinality> ;
.
```

#### Shape level constraints
------

##### Constraint <a id="http_www_europeana_eu_schemas_edm_shapes_external_Aggregation_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#correlation">http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#correlation</a>
<table>
<tr><th align="right">description</th><td>At least one edm:isShownAt or edm:isShownBy should be 
                    present</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/74">R-67-BOOLEAN-PROPERTY-PATTERNS</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/75">R-68-REQUIRED-PROPERTIES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Aggregation#correlation>
  a sh:Constraint ;
  sh:description """At least one edm:isShownAt or edm:isShownBy should be 
                    present""" ;
  dc:type esc:correlation ;
  dc:subject "R-68-REQUIRED-PROPERTIES"
           , "R-67-BOOLEAN-PROPERTY-PATTERNS" ;
  sh:or (
    [ sh:property [ sh:predicate edm:isShownAt ; sh:minCount 1 ; ] ]
    [ sh:property [ sh:predicate edm:isShownBy ; sh:minCount 1 ; ] ]
  ) ;
.
```
#### Property <a id="dcrights" target="_blank" href="http://purl.org/dc/elements/1.1/rights">http://purl.org/dc/elements/1.1/rights</a>
------
#### Property <a id="edmaggregatedCHO" target="_blank" href="http://www.europeana.eu/schemas/edm/aggregatedCHO">http://www.europeana.eu/schemas/edm/aggregatedCHO</a>
------
#### Property <a id="edmdataProvider" target="_blank" href="http://www.europeana.eu/schemas/edm/dataProvider">http://www.europeana.eu/schemas/edm/dataProvider</a>
------
#### Property <a id="edmhasView" target="_blank" href="http://www.europeana.eu/schemas/edm/hasView">http://www.europeana.eu/schemas/edm/hasView</a>
------
#### Property <a id="edmisShownAt" target="_blank" href="http://www.europeana.eu/schemas/edm/isShownAt">http://www.europeana.eu/schemas/edm/isShownAt</a>
------
#### Property <a id="edmisShownBy" target="_blank" href="http://www.europeana.eu/schemas/edm/isShownBy">http://www.europeana.eu/schemas/edm/isShownBy</a>
------
#### Property <a id="edmobject" target="_blank" href="http://www.europeana.eu/schemas/edm/object">http://www.europeana.eu/schemas/edm/object</a>
------
#### Property <a id="edmprovider" target="_blank" href="http://www.europeana.eu/schemas/edm/provider">http://www.europeana.eu/schemas/edm/provider</a>
------
#### Property <a id="edmrights" target="_blank" href="http://www.europeana.eu/schemas/edm/rights">http://www.europeana.eu/schemas/edm/rights</a>
------
#### Property <a id="edmugc" target="_blank" href="http://www.europeana.eu/schemas/edm/ugc">http://www.europeana.eu/schemas/edm/ugc</a>
------
#### Property <a id="edmunstored" target="_blank" href="http://www.europeana.eu/schemas/edm/unstored">http://www.europeana.eu/schemas/edm/unstored</a>
------
