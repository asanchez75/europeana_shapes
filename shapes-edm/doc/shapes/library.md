
## Shapes Template Library for EDM
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/library.ttl) using this [software](/shapes-doc)_

Below is the index of all functions defined in this Library:
- <a id="TypedLiteralConstraint" href="#TypedLiteralConstraint">TypedLiteralConstraint</a>
- <a id="DisjointConstraint" href="#DisjointConstraint">DisjointConstraint</a>
- <a id="DisjointPropertyConstraint" href="#DisjointPropertyConstraint">DisjointPropertyConstraint</a>
- <a id="RedundancyConstraint" href="#RedundancyConstraint">RedundancyConstraint</a>

##### Template <a id="TypedLiteralConstraint" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/library#TypedLiteralConstraint">TypedLiteralConstraint</a>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/library#TypedLiteralConstraint>
    a sh:ConstraintTemplate ;
    rdfs:subClassOf sh:TemplateConstraint ;
    rdfs:label "Co-occurrence constraint between nodes" ;
    rdfs:comment "Tests if the range of a property is a typed literal";
    sh:argument [
        sh:predicate sh:predicate ;
        sh:class rdf:Property ;
        sh:name "predicate" ;
        sh:description "The property of the focus node." ;
    ] ;
    sh:message "Not a typed literal" ;
    sh:sparql """
      SELECT ?this (?this as ?subject) $predicate (?value AS ?object)
      WHERE {
        $this $predicate ?value .
```

##### Template <a id="DisjointConstraint" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/library#DisjointConstraint">DisjointConstraint</a>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/library#DisjointConstraint>
    a sh:ConstraintTemplate ;
    rdfs:subClassOf sh:TemplateConstraint ;
    rdfs:label "Disjoint constraint between nodes" ;
    rdfs:comment "Tests if the properties are disjoint";
    sh:message "Value sets of {?predicate} must be disjoint with the specified list of properties" ;
    sh:argument [
        sh:predicate sh:disjointProperties ;
        sh:class rdf:Property ;
        sh:name "disjointProperties" ;
        sh:description "List of properties that this property must be disjoint with." ;
    ] ;
    sh:sparql """
      SELECT $this ($this AS ?subject) (?property1 AS ?predicate) (?value AS ?object)
      WHERE {
        GRAPH $shapesGraph {
            $disjointProperties (rdf:rest*)/rdf:first ?property1 .
```

##### Template <a id="DisjointPropertyConstraint" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/library#DisjointPropertyConstraint">DisjointPropertyConstraint</a>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/library#DisjointPropertyConstraint>
    a sh:ConstraintTemplate ;
    rdfs:subClassOf sh:TemplateConstraint ;
    rdfs:label "Disjoint constraint between nodes" ;
    rdfs:comment "Tests if the properties are disjoint";
    sh:message "Value sets of {$predicate} and {?object} must be disjoint" ;
    sh:argument [
        sh:predicate sh:predicate ;
        sh:class rdf:Property ;
        sh:name "predicate" ;
        sh:description "The property of the focus node." ;
    ] ;
    sh:argument [
        sh:predicate sh:disjointWith ;
        sh:class rdf:Property ;
        sh:name "disjointWith" ;
        sh:description "List of properties that this property must be disjoint with." ;
    ] ;
    sh:sparql """
      SELECT $this ($this AS ?subject) $predicate (?value AS ?object)
      WHERE {
        $this $predicate ?value .
```

##### Template <a id="RedundancyConstraint" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/library#RedundancyConstraint">RedundancyConstraint</a>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/library#RedundancyConstraint>
    a sh:ConstraintTemplate ;
    rdfs:label "Co-occurrence constraint between nodes" ;
    rdfs:subClassOf sh:TemplateConstraint ;
    sh:argument [
        sh:predicate sh:predicate ;
        sh:class rdf:Property ;
        sh:name "predicate" ;
        sh:description "The property of the focus node." ;
    ] ;
    sh:argument [
        sh:predicate sh:scopeClass ;
        sh:class rdf:Class ;
        sh:name "scopeClass" ;
        sh:description "The class of the target node." ;
    ] ;
    sh:argument [
        sh:predicate sh:notEquals ;
        sh:class rdf:Property ;
        sh:name "notEquals" ;
        sh:description "The property of the target node." ;
    ] ;
    rdfs:comment "Duplicate values"^^xsd:string ;
    sh:message "Duplicate values" ;
    sh:sparql """
      SELECT ?this (?this as ?subject) $predicate ?value
      WHERE { ?node rdf:type ?scopeClass ; ?property  ?value .
```
