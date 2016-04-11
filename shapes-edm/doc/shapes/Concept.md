
## Shapes definitions for skos:Concept class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/Concept.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a skos:Concept class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'><a href="#http_www_europeana_eu_schemas_edm_shapes_external_Concept_closure">closure</a></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#skos_altLabel">skos:altLabel</a>|0..*|<a href="#skos_altLabel_type">Literal</a>|<a href="#skos_altLabel_datatype">datatype</a>, <a href="#skos_altLabel_redundancy">redundancy</a>|
|<a href="#skos_broadMatch">skos:broadMatch</a>|0..*|<a href="#skos_broadMatch_type">IRI</a>||
|<a href="#skos_broader">skos:broader</a>|0..*|<a href="#skos_broader_type">IRI</a>|<a href="#skos_broader_range-class">range-class</a>|
|<a href="#skos_closeMatch">skos:closeMatch</a>|0..*|<a href="#skos_closeMatch_type">IRI</a>||
|<a href="#skos_exactMatch">skos:exactMatch</a>|0..*|<a href="#skos_exactMatch_type">IRI</a>||
|<a href="#skos_inScheme">skos:inScheme</a>|0..*|<a href="#skos_inScheme_type">IRI</a>||
|<a href="#skos_narrowMatch">skos:narrowMatch</a>|0..*|<a href="#skos_narrowMatch_type">IRI</a>||
|<a href="#skos_narrower">skos:narrower</a>|0..*|<a href="#skos_narrower_type">IRI</a>||
|<a href="#skos_notation">skos:notation</a>|0..*|<a href="#skos_notation_type">Literal</a>|<a href="#skos_notation_datatype">datatype</a>|
|<a href="#skos_note">skos:note</a>|0..*|<a href="#skos_note_type">Literal</a>|<a href="#skos_note_datatype">datatype</a>|
|<a href="#skos_prefLabel">skos:prefLabel</a>|<a href="#skos_prefLabel_cardinality">0..?</a>|<a href="#skos_prefLabel_type">Literal</a>|<a href="#skos_prefLabel_datatype">datatype</a>|
|<a href="#skos_related">skos:related</a>|0..*|<a href="#skos_related_type">IRI</a><a href="#skos_relatedMatch_type">IRI</a>||
|<a href="#skos_relatedMatch">skos:relatedMatch</a>|0..*|<a href="#skos_relatedMatch_type">IRI</a>||

Below is an example of a resource of type skos:Concept: 

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
         xmlns:skos="http://www.w3.org/2004/02/skos/core#"
         >
    <skos:Concept rdf:about="http://dbpedia.org/resource/Contemporary_art">
        <skos:prefLabel xml:lang="en">Contemporary art</skos:prefLabel>
        <skos:prefLabel xml:lang="fr">Art contemporain</skos:prefLabel>
        <skos:prefLabel xml:lang="pt">Arte contemporânea</skos:prefLabel>
        <skos:note xml:lang="en">Contemporary art is art produced at the present period in time. Contemporary art includes, and develops from, Postmodern art, which is itself a successor to Modern art. In vernacular English, "modern" and "contemporary" are synonyms, resulting in some conflation of the terms "modern art" and "contemporary art" by non-specialists.</skos:note>
        <skos:note xml:lang="fr">L'expression « art contemporain » désigne de façon générale et globale l'ensemble des œuvres produites depuis 1945 à nos jours, et ce quels qu'en soient le style et la pratique esthétique. Dans cette classification périodique, l'art contemporain succède à l'art moderne (1850-1945). Cette désignation s'applique également aux musées, institutions, galeries, foires, salons, biennales montrant les œuvres de cette période.L'expression « art contemporain » est aussi utilisée en France, avec un sens plus restreint, pour désigner les pratiques esthétiques et réalisations d'artistes revendiquant « une avancée dans la progression des avant-gardes » et une transgression des frontières entre les domaines artistiques (dépassant la frontière de ce que le sens commun considère comme étant de l'art, c'est-à-dire les arts plastiques, en expérimentant le théâtre, le cinéma, la vidéo, la littérature). On parle aussi d'art contemporain pour désigner, par convention, l'art des années 1960 et d'après. Le pop art marquerait, de ce fait, une rupture par rapport à l'art moderne.</skos:note>
        <skos:note xml:lang="pt">Não há um consenso entre os autores sobre o início do período contemporâneo na arte. Neste artigo considera-se que a arte contemporânea, em seus estilos, escolas e movimentos, tenha surgido por volta da segunda metade do século XX, mais precisamente após a Segunda Guerra Mundial, como ação de ruptura com a arte moderna.Depois da guerra os artistas mostraram-se voltados às verdades do inconsciente e interessados pela reconstrução da sociedade. Sobrepôs-se aos costumes, a necessidade da produção em massa. Quando surgia um movimento na arte, este revelava-se por meio das variadas linguagens, através da constante experimentação de novas técnicas.A arte contemporânea se mostrou mais evidente na década de 60, período que muitos estudos consideram o início do seu estado de plenitude. A efervescência cultural da década começou a questionar a sociedade do pós-guerra, rebelando-se contra o estilo de vida difundido no cinema, na moda, na televisão e na literatura. Além disso, os avanços tecnológicos foram convulsivamente impulsionados pela corrida espacial e, como mostra dessa influência, as formas dos objetos tornam-se, quase subitamente, aerodinâmicas, alusivas ao espaço, com forte recorrência ao brilho do vinil. A ciência e a tecnologia abriram caminho à percepção das pessoas, de que a arte feita por outros, poderia estar a traduzir as suas próprias vidas.A consciência ecológica e o reaproveitamento de materiais são temas recorrentes, que se popularizaram no final do século XX. Em paralelo, a revolução digital e a consequente globalização, por meio da internet, formam o período mais recente da contemporaneidade.</skos:note>
        <skos:related rdf:resource="http://dbpedia.org/resource/Category:Postmodernism"/>
        <skos:related rdf:resource="http://dbpedia.org/resource/Category:Contemporary_art"/>
        <skos:related rdf:resource="http://dbpedia.org/resource/Category:Postmodern_art"/>
        <skos:exactMatch rdf:resource="http://rdf.freebase.com/ns/m.0h0vk"/>
        <skos:exactMatch rdf:resource="http://wikidata.dbpedia.org/resource/Q186030"/>
        <skos:exactMatch rdf:resource="http://wikidata.org/entity/Q186030"/>
        <skos:exactMatch rdf:resource="http://yago-knowledge.org/resource/Contemporary_art"/>
        <skos:exactMatch rdf:resource="http://fr.dbpedia.org/resource/Art_contemporain"/>
        <skos:inScheme rdf:resource="http://www.eionet.europa.eu/gemet"/>
    </skos:Concept>
</rdf:RDF>
```

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
  sh:constraint      <Concept#closure> ;

  # SKOS properties
  sh:property        <Concept/skos_prefLabel#type> ;
  sh:property        <Concept/skos_prefLabel#datatype> ;
  sh:property        <Concept/skos_prefLabel#cardinality> ;
  sh:property        <Concept/skos_altLabel#type> ;
  sh:property        <Concept/skos_altLabel#datatype> ;
  sh:property        <Concept/skos_altLabel#redundancy> ;
  sh:property        <Concept/skos_broader#type> ;
  sh:property        <Concept/skos_broader#range-class> ;
  sh:property        <Concept/skos_narrower#type> ;
  sh:property        <Concept/skos_related#type> ;
  sh:property        <Concept/skos_broadMatch#type> ;
  sh:property        <Concept/skos_narrowMatch#type> ;
  sh:property        <Concept/skos_relatedMatch#type> ;
  sh:property        <Concept/skos_exactMatch#type> ;
  sh:property        <Concept/skos_closeMatch#type> ;
  sh:property        <Concept/skos_note#type> ;
  sh:property        <Concept/skos_note#datatype> ;
  sh:property        <Concept/skos_notation#type> ;
  sh:constraint      <Concept/skos_notation#datatype> ;
  sh:property        <Concept/skos_inScheme#type> ;
.
```

#### Shape level constraints
------

##### Constraint <a id="http_www_europeana_eu_schemas_edm_shapes_external_Concept_closure" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept#closure">http://www.europeana.eu/schemas/edm/shapes/external/Concept#closure</a>
<table>
<tr><th align="right">description</th><td>An skos:Concept resource must be defined using only the 
                    properties defined in EDM for Concepts</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#closure">http://www.europeana.eu/schemas/edm/shapes/categories#closure</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept#closure>
  sh:description """An skos:Concept resource must be defined using only the 
                    properties defined in EDM for Concepts""" ;
  dc:type esc:closure ;
  dc:relation "R-206-DEFINE-ALLOWED-NAMESPACES" ;
  sh:closed true ;
  sh:ignoredProperties (
    rdf:type
    skos:prefLabel skos:altLabel skos:broader skos:narrower skos:related
    skos:broadMatch skos:narrowMatch skos:relatedMatch
    skos:exactMatch skos:closeMatch skos:note skos:notation skos:inScheme
  ) ;
.
```
#### Property <a id="skos_altLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>
------

##### Constraint <a id="skos_altLabel_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#datatype</a>
<table>
<tr><th align="right">description</th><td>Ideally all skos:altLabel should have a language tag</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#datatype>
  a sh:PropertyConstraint ;
  dc:type esc:datatype ;
  sh:description "Ideally all skos:altLabel should have a language tag" ;
  dc:relation "R-48-MISSING-LANGUAGE-TAGS" ;
  sh:filterShape [
      sh:property [
          sh:predicate skos:altLabel ;
          sh:nodeKind sh:Literal ;
      ]
  ] ;
  sh:predicate skos:altLabel ;
  sh:datatype rdf:langString ;
  sh:severity sh:Warning ;
.
```

##### Constraint <a id="skos_altLabel_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#redundancy</a>
<table>
<tr><th align="right">description</th><td>skos:altLabel should not have the same labels than in 
                    skos:prefLabel</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#redundancy>
  a sh:PropertyConstraint ;
  dc:type esc:redundancy ;
  sh:description """skos:altLabel should not have the same labels than in 
                    skos:prefLabel""" ;
  dc:relation "R-10-DEFINE-DISJOINT-PROPERTIES" ;
  sh:predicate  skos:altLabel ;
  sh:notEquals  skos:prefLabel ;
  sh:severity sh:Warning ;
.
```

##### Constraint <a id="skos_altLabel_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:altLabel must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_altLabel#type>
  a sh:PropertyConstraint ;
  sh:description "Values for skos:altLabel must be Literals" ;
  dc:type esc:type ;
  sh:predicate skos:altLabel ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_broadMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#broadMatch">http://www.w3.org/2004/02/skos/core#broadMatch</a>
------

##### Constraint <a id="skos_broadMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broadMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broadMatch#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:broadMatch must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broadMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:broadMatch must be Resources" ;
  sh:predicate skos:broadMatch ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_broader" target="_blank" href="http://www.w3.org/2004/02/skos/core#broader">http://www.w3.org/2004/02/skos/core#broader</a>
------

##### Constraint <a id="skos_broader_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#range-class</a>
<table>
<tr><th align="right">description</th><td>skos:broader must refer to a valid skos:Concept</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#range-class>
  a sh:PropertyConstraint ;
  sh:description "skos:broader must refer to a valid skos:Concept" ;
  dc:type esc:range-class ;
  dc:relation "R-225-VALIDATION-OF-CLASS-ASSOCIATION" ;
  sh:filterShape [
      sh:property [
          sh:predicate skos:broader ;
          sh:nodeKind sh:IRI ;
      ]
  ] ;
  sh:predicate skos:broader ;
  sh:valueShape Concept: ;
  sh:class edm:Concept ;
.
```

##### Constraint <a id="skos_broader_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:broader must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_broader#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:broader must be Resources" ;
  sh:predicate skos:broader ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_closeMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#closeMatch">http://www.w3.org/2004/02/skos/core#closeMatch</a>
------

##### Constraint <a id="skos_closeMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_closeMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_closeMatch#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:closeMatch must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_closeMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:closeMatch must be Resources" ;
  sh:predicate skos:closeMatch ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_exactMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#exactMatch">http://www.w3.org/2004/02/skos/core#exactMatch</a>
------

##### Constraint <a id="skos_exactMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_exactMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_exactMatch#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:exactMatch must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_exactMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:exactMatch must be Resources" ;
  sh:predicate skos:exactMatch ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_inScheme" target="_blank" href="http://www.w3.org/2004/02/skos/core#inScheme">http://www.w3.org/2004/02/skos/core#inScheme</a>
------

##### Constraint <a id="skos_inScheme_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_inScheme#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_inScheme#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:inScheme must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_inScheme#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:inScheme must be Resources" ;
  sh:predicate skos:inScheme ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_narrowMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#narrowMatch">http://www.w3.org/2004/02/skos/core#narrowMatch</a>
------

##### Constraint <a id="skos_narrowMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrowMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrowMatch#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:narrowMatch must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrowMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:narrowMatch must be Resources" ;
  sh:predicate skos:narrowMatch ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_narrower" target="_blank" href="http://www.w3.org/2004/02/skos/core#narrower">http://www.w3.org/2004/02/skos/core#narrower</a>
------

##### Constraint <a id="skos_narrower_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrower#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrower#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:narrower must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_narrower#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:narrower must be Resources" ;
  sh:predicate skos:narrower ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_notation" target="_blank" href="http://www.w3.org/2004/02/skos/core#notation">http://www.w3.org/2004/02/skos/core#notation</a>
------

##### Constraint <a id="skos_notation_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#datatype</a>
<table>
<tr><th align="right">description</th><td>skos:notation should be assigned with a typed literal</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#datatype>
  a tpl:TypedLiteralConstraint ;
  sh:description "skos:notation should be assigned with a typed literal" ;
  dc:type esc:datatype ;
  sh:predicate skos:notation ;
.
```

##### Constraint <a id="skos_notation_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:notation must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_notation#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:notation must be Literals" ;
  sh:predicate skos:notation ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_note" target="_blank" href="http://www.w3.org/2004/02/skos/core#note">http://www.w3.org/2004/02/skos/core#note</a>
------

##### Constraint <a id="skos_note_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#datatype</a>
<table>
<tr><th align="right">description</th><td>Ideally all skos:note should have a language tag</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#datatype>
  a sh:PropertyConstraint ;
  dc:type esc:datatype ;
  sh:description "Ideally all skos:note should have a language tag" ;
  dc:relation "R-48-MISSING-LANGUAGE-TAGS" ;
  sh:filterShape [
      sh:property [
          sh:predicate skos:note ;
          sh:nodeKind sh:Literal ;
      ]
  ] ;
  sh:predicate skos:note ;
  sh:datatype rdf:langString ;
  sh:severity sh:Warning ;
.
```

##### Constraint <a id="skos_note_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:note must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_note#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:note must be Literals" ;
  sh:predicate skos:note ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_prefLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>
------

##### Constraint <a id="skos_prefLabel_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one skos:prefLabel per language</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one skos:prefLabel per language" ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS"
           , "R-49-PROPERTY-OCCURS-ONCE-PER-LANGUAGE-TAG" ;
  sh:predicate skos:prefLabel ;
  sh:minCount 0 ;
  sh:uniqueLang true ;
.
```

##### Constraint <a id="skos_prefLabel_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#datatype</a>
<table>
<tr><th align="right">description</th><td>Ideally all skos:prefLabel should have a language tag</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#datatype>
  a sh:PropertyConstraint ;
  dc:type esc:datatype ;
  sh:description "Ideally all skos:prefLabel should have a language tag" ;
  dc:relation "R-48-MISSING-LANGUAGE-TAGS" ;
  sh:filterShape [
      sh:property [
          sh:predicate skos:prefLabel ;
          sh:nodeKind sh:Literal ;
      ]
  ] ;
  sh:predicate skos:prefLabel ;
  sh:datatype rdf:langString ;
  sh:severity sh:Warning ;
.
```

##### Constraint <a id="skos_prefLabel_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:prefLabel must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_prefLabel#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:prefLabel must be Literals" ;
  sh:predicate skos:prefLabel ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_related" target="_blank" href="http://www.w3.org/2004/02/skos/core#related">http://www.w3.org/2004/02/skos/core#related</a>
------

##### Constraint <a id="skos_related_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_related#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_related#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:related must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_related#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:related must be Resources" ;
  sh:predicate skos:related ;
  sh:nodeKind sh:IRI ;
.
```

##### Constraint <a id="skos_relatedMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:relatedMatch must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:relatedMatch must be Resources" ;
  sh:predicate skos:relatedMatch ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="skos_relatedMatch" target="_blank" href="http://www.w3.org/2004/02/skos/core#relatedMatch">http://www.w3.org/2004/02/skos/core#relatedMatch</a>
------

##### Constraint <a id="skos_relatedMatch_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type">http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:relatedMatch must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Concept/skos_relatedMatch#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:relatedMatch must be Resources" ;
  sh:predicate skos:relatedMatch ;
  sh:nodeKind sh:IRI ;
.
```
