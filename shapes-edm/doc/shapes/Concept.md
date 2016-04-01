
## Shapes definitions for skos:Concept class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/Concept.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a skos:Concept class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#skos_altLabel">skos:altLabel</a>|<a href="#edm_shapes_external_Concept_skos_altLabel_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_altLabel_type">Literal</a>|<a href="#edm_shapes_external_Concept_skos_altLabel_datatype">datatype</a>, <a href="#edm_shapes_external_Concept_skos_altLabel_redundancy">redundancy</a>|
|<a href="#skos_broadMatch">skos:broadMatch</a>|<a href="#edm_shapes_external_Concept_skos_broadMatch_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_broadMatch_type">IRI</a>||
|<a href="#skos_broader">skos:broader</a>|<a href="#edm_shapes_external_Concept_skos_broader_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_broader_type">IRI</a>|<a href="#edm_shapes_external_Concept_skos_broader_range-class">range-class</a>|
|<a href="#skos_closeMatch">skos:closeMatch</a>|<a href="#edm_shapes_external_Concept_skos_closeMatch_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_closeMatch_type">IRI</a>||
|<a href="#skos_exactMatch">skos:exactMatch</a>|<a href="#edm_shapes_external_Concept_skos_exactMatch_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_exactMatch_type">IRI</a>||
|<a href="#skos_inScheme">skos:inScheme</a>|<a href="#edm_shapes_external_Concept_skos_inScheme_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_inScheme_type">IRI</a>||
|<a href="#skos_narrowMatch">skos:narrowMatch</a>|<a href="#edm_shapes_external_Concept_skos_narrowMatch_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_narrowMatch_type">IRI</a>||
|<a href="#skos_narrower">skos:narrower</a>|<a href="#edm_shapes_external_Concept_skos_narrower_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_narrower_type">IRI</a>||
|<a href="#skos_notation">skos:notation</a>|<a href="#edm_shapes_external_Concept_skos_notation_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_notation_type">Literal</a>|<a href="#edm_shapes_external_Concept_skos_notation_datatype">datatype</a>|
|<a href="#skos_note">skos:note</a>|<a href="#edm_shapes_external_Concept_skos_note_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_note_type">Literal</a>|<a href="#edm_shapes_external_Concept_skos_note_datatype">datatype</a>|
|<a href="#skos_prefLabel">skos:prefLabel</a>|<a href="#edm_shapes_external_Concept_skos_prefLabel_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_prefLabel_type">Literal</a>|<a href="#edm_shapes_external_Concept_skos_prefLabel_datatype">datatype</a>|
|<a href="#skos_related">skos:related</a>|<a href="#edm_shapes_external_Concept_skos_related_cardinality">0..?</a><a href="#edm_shapes_external_Concept_skos_relatedMatch_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_related_type">IRI</a><a href="#edm_shapes_external_Concept_skos_relatedMatch_type">IRI</a>||
|<a href="#skos_relatedMatch">skos:relatedMatch</a>|<a href="#edm_shapes_external_Concept_skos_relatedMatch_cardinality">0..?</a>|<a href="#edm_shapes_external_Concept_skos_relatedMatch_type">IRI</a>||

#### Shape level constraints
------
#### Property <a id="skos_altLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>
------

##### <a id="edm_shapes_external_Concept_skos_altLabel_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:altLabel ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_altLabel_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#datatype</a>
------
<table>
<tr><th align="right">description</th><td>Ideally all skos:altLabel should have a language tag</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/55">R-48-MISSING-LANGUAGE-TAGS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#datatype>
  a sh:PropertyConstraint ;
  dc:type esc:datatype ;
  sh:description "Ideally all skos:altLabel should have a language tag" ;
  dc:subject "R-48-MISSING-LANGUAGE-TAGS" ;
  sh:predicate skos:altLabel ;
  sh:datatype rdf:langString ;
  sh:severity sh:Warning ;
.
```

##### <a id="edm_shapes_external_Concept_skos_altLabel_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#redundancy</a>
------
<table>
<tr><th align="right">description</th><td>skos:altLabel should not have the same labels than in 
                    skos:prefLabel</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/17">R-10-DEFINE-DISJOINT-PROPERTIES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#redundancy>
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

##### <a id="edm_shapes_external_Concept_skos_altLabel_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:altLabel ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_broadMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#broadMatch">http://www.w3.org/2004/02/skos/core#broadMatch</a>
------

##### <a id="edm_shapes_external_Concept_skos_broadMatch_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broadMatch#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broadMatch#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broadMatch#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:broadMatch ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_broadMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broadMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broadMatch#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broadMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:broadMatch ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_broader" target="_blank" href="http://www.w3.org/2004/02/skos/core#broader">http://www.w3.org/2004/02/skos/core#broader</a>
------

##### <a id="edm_shapes_external_Concept_skos_broader_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:broader ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_broader_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#range-class</a>
------
<table>
<tr><th align="right">description</th><td>skos:broader must refer to a valid skos:Concept</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#range-class>
  a sh:PropertyConstraint ;
  sh:description "skos:broader must refer to a valid skos:Concept" ;
  dc:type esc:range-class ;
  dc:subject "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:predicate skos:broader ;
  sh:valueShape Concept: ;
  sh:class edm:Concept ;
.
```

##### <a id="edm_shapes_external_Concept_skos_broader_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:broader ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_closeMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#closeMatch">http://www.w3.org/2004/02/skos/core#closeMatch</a>
------

##### <a id="edm_shapes_external_Concept_skos_closeMatch_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_closeMatch#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_closeMatch#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_closeMatch#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:closeMatch ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_closeMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_closeMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_closeMatch#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_closeMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:closeMatch ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_exactMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#exactMatch">http://www.w3.org/2004/02/skos/core#exactMatch</a>
------

##### <a id="edm_shapes_external_Concept_skos_exactMatch_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_exactMatch#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_exactMatch#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_exactMatch#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:exactMatch ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_exactMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_exactMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_exactMatch#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_exactMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:exactMatch ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_inScheme" target="_blank" href="http://www.w3.org/2004/02/skos/core#inScheme">http://www.w3.org/2004/02/skos/core#inScheme</a>
------

##### <a id="edm_shapes_external_Concept_skos_inScheme_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_inScheme#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_inScheme#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_inScheme#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:inScheme ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_inScheme_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_inScheme#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_inScheme#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_inScheme#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:inScheme ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_narrowMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#narrowMatch">http://www.w3.org/2004/02/skos/core#narrowMatch</a>
------

##### <a id="edm_shapes_external_Concept_skos_narrowMatch_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrowMatch#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrowMatch#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrowMatch#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:narrowMatch ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_narrowMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrowMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrowMatch#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrowMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:narrowMatch ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_narrower" target="_blank" href="http://www.w3.org/2004/02/skos/core#narrower">http://www.w3.org/2004/02/skos/core#narrower</a>
------

##### <a id="edm_shapes_external_Concept_skos_narrower_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrower#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrower#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrower#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:narrower ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_narrower_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrower#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrower#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrower#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:narrower ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_notation" target="_blank" href="http://www.w3.org/2004/02/skos/core#notation">http://www.w3.org/2004/02/skos/core#notation</a>
------

##### <a id="edm_shapes_external_Concept_skos_notation_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:notation ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_notation_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#datatype</a>
------
<table>
<tr><th align="right">description</th><td>skos:notation should be assigned with a typed literal</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#datatype>
  a sh:PropertyConstraint ;
  sh:description "skos:notation should be assigned with a typed literal" ;
  dc:type esc:datatype ;
  sh:predicate skos:notation ;
  #prescribe as typed literal
.
```

##### <a id="edm_shapes_external_Concept_skos_notation_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:notation ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_note" target="_blank" href="http://www.w3.org/2004/02/skos/core#note">http://www.w3.org/2004/02/skos/core#note</a>
------

##### <a id="edm_shapes_external_Concept_skos_note_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:note ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_note_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#datatype</a>
------
<table>
<tr><th align="right">description</th><td>Ideally all skos:note should have a language tag</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/55">R-48-MISSING-LANGUAGE-TAGS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#datatype>
  a sh:PropertyConstraint ;
  dc:type esc:datatype ;
  sh:description "Ideally all skos:note should have a language tag" ;
  dc:subject "R-48-MISSING-LANGUAGE-TAGS" ;
  sh:predicate skos:note ;
  sh:datatype rdf:langString ;
  sh:severity sh:Warning ;
.
```

##### <a id="edm_shapes_external_Concept_skos_note_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:note ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_prefLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>
------

##### <a id="edm_shapes_external_Concept_skos_prefLabel_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/56">R-49-PROPERTY-OCCURS-ONCE-PER-LANGUAGE-TAG</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS"
           , "R-49-PROPERTY-OCCURS-ONCE-PER-LANGUAGE-TAG" ;
  sh:predicate skos:prefLabel ;
  sh:minCount 0 ;
  sh:uniqueLang true ;
.
```

##### <a id="edm_shapes_external_Concept_skos_prefLabel_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#datatype</a>
------
<table>
<tr><th align="right">description</th><td>Ideally all skos:prefLabel should have a language tag</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/55">R-48-MISSING-LANGUAGE-TAGS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#datatype>
  a sh:PropertyConstraint ;
  dc:type esc:datatype ;
  sh:description "Ideally all skos:prefLabel should have a language tag" ;
  dc:subject "R-48-MISSING-LANGUAGE-TAGS" ;
  sh:predicate skos:prefLabel ;
  sh:datatype rdf:langString ;
  sh:severity sh:Warning ;
.
```

##### <a id="edm_shapes_external_Concept_skos_prefLabel_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:prefLabel ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_related" target="_blank" href="http://www.w3.org/2004/02/skos/core#related">http://www.w3.org/2004/02/skos/core#related</a>
------

##### <a id="edm_shapes_external_Concept_skos_related_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_related#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_related#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_related#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:related ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_related_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_related#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_related#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_related#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:related ;
  sh:nodeKind sh:IRI ;
.
```

##### <a id="edm_shapes_external_Concept_skos_relatedMatch_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:relatedMatch ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_relatedMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:relatedMatch ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_relatedMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#relatedMatch">http://www.w3.org/2004/02/skos/core#relatedMatch</a>
------

##### <a id="edm_shapes_external_Concept_skos_relatedMatch_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#cardinality</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:subject "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate skos:relatedMatch ;
  sh:minCount 0 ;
.
```

##### <a id="edm_shapes_external_Concept_skos_relatedMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type</a>
------
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:predicate skos:relatedMatch ;
  sh:nodeKind sh:IRI ;
.
```
