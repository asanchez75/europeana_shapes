
## Shapes definitions for edm:Agent class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/Agent.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a edm:Agent class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'><a href="#http_www_europeana_eu_schemas_edm_shapes_external_Agent_closure">closure</a></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#skos_altLabel">skos:altLabel</a>|0..*|<a href="#skos_altLabel_type">Literal</a>|<a href="#skos_altLabel_datatype">datatype</a>, <a href="#skos_altLabel_redundancy">redundancy</a>|
|<a href="#skos_note">skos:note</a>|0..*|<a href="#skos_note_type">Literal</a>|<a href="#skos_note_datatype">datatype</a>|
|<a href="#skos_prefLabel">skos:prefLabel</a>|<a href="#skos_prefLabel_cardinality">0..?</a>|<a href="#skos_prefLabel_type">Literal</a>|<a href="#skos_prefLabel_datatype">datatype</a>|
|<a href="#dc_date">dc:date</a>|0..*||<a href="#dc_date_literal">literal</a>|
|<a href="#dc_identifier">dc:identifier</a>|0..*|<a href="#dc_identifier_type">Literal</a>||
|<a href="#dct_hasPart">dct:hasPart</a>|0..*|<a href="#dct_hasPart_type">IRI</a>|<a href="#dct_hasPart_range-class">range-class</a>|
|<a href="#dct_isPartOf">dct:isPartOf</a>|0..*|<a href="#dct_isPartOf_type">IRI</a>|<a href="#dct_isPartOf_range-class">range-class</a>|
|<a href="#foaf_name">foaf:name</a>|0..*|<a href="#foaf_name_type">Literal</a>||
|<a href="#rdaGr2_biographicalInformation">rdaGr2:biographicalInformation</a>|0..*|<a href="#rdaGr2_biographicalInformation_type">Literal</a>||
|<a href="#rdaGr2_dateOfBirth">rdaGr2:dateOfBirth</a>|<a href="#rdaGr2_dateOfBirth_cardinality">0..1</a>|<a href="#rdaGr2_dateOfBirth_type">Literal</a>|<a href="#rdaGr2_dateOfBirth_correlation">correlation</a>, <a href="#rdaGr2_dateOfBirth_literal">literal</a>|
|<a href="#rdaGr2_dateOfDeath">rdaGr2:dateOfDeath</a>|<a href="#rdaGr2_dateOfDeath_cardinality">0..1</a>|<a href="#rdaGr2_dateOfDeath_type">Literal</a>|<a href="#rdaGr2_dateOfDeath_literal">literal</a>|
|<a href="#rdaGr2_dateOfEstablishment">rdaGr2:dateOfEstablishment</a>|0..*|<a href="#rdaGr2_dateOfEstablishment_type">Literal</a>|<a href="#rdaGr2_dateOfEstablishment_correlation">correlation</a>, <a href="#rdaGr2_dateOfEstablishment_literal">literal</a>|
|<a href="#rdaGr2_dateOfTermination">rdaGr2:dateOfTermination</a>|0..*|<a href="#rdaGr2_dateOfTermination_type">Literal</a>|<a href="#rdaGr2_dateOfTermination_literal">literal</a>|
|<a href="#rdaGr2_gender">rdaGr2:gender</a>|<a href="#rdaGr2_gender_cardinality">0..1</a>|<a href="#rdaGr2_gender_type">Literal</a>||
|<a href="#rdaGr2_placeOfBirth">rdaGr2:placeOfBirth</a>|<a href="#rdaGr2_placeOfBirth_cardinality">0..1</a>|||
|<a href="#rdaGr2_placeOfDeath">rdaGr2:placeOfDeath</a>|<a href="#rdaGr2_placeOfDeath_cardinality">0..1</a>|||
|<a href="#rdaGr2_professionOrOccupation">rdaGr2:professionOrOccupation</a>|<a href="#rdaGr2_professionOrOccupation_cardinality">0..?</a>|||
|<a href="#edm_begin">edm:begin</a>|<a href="#edm_begin_cardinality">0..1</a>|<a href="#edm_begin_type">Literal</a>|<a href="#edm_begin_correlation">correlation</a>, <a href="#edm_begin_literal">literal</a>, <a href="#edm_begin_redundancy">redundancy</a>|
|<a href="#edm_end">edm:end</a>|<a href="#edm_end_cardinality">0..1</a>|<a href="#edm_end_type">Literal</a>|<a href="#edm_end_literal">literal</a>, <a href="#edm_end_redundancy">redundancy</a>|
|<a href="#edm_hasMet">edm:hasMet</a>|0..*|<a href="#edm_hasMet_type">IRI</a>|<a href="#edm_hasMet_range-class">range-class</a>|
|<a href="#edm_isRelatedTo">edm:isRelatedTo</a>|0..*|<a href="#edm_isRelatedTo_type">IRI</a>||
|<a href="#owl_sameAs">owl:sameAs</a>|0..*|<a href="#owl_sameAs_type">IRI</a>||

Below is an example of a resource of type edm:Agent: 

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
         xmlns:skos="http://www.w3.org/2004/02/skos/core#"
         xmlns:dc="http://purl.org/dc/elements/1.1/"
         xmlns:dcterms="http://purl.org/dc/terms/"
         xmlns:edm="http://www.europeana.eu/schemas/edm/"
         xmlns:rdaGr2="http://rdvocab.info/ElementsGr2/"
         xmlns:owl="http://www.w3.org/2002/07/owl#"
         >
    <edm:Agent rdf:about="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart">
        <skos:prefLabel xml:lang="en">Wolfgang Amadeus Mozart</skos:prefLabel>
        <skos:prefLabel xml:lang="nl">Wolfgang Amadeus Mozart</skos:prefLabel>
        <skos:prefLabel xml:lang="pt">Wolfgang Amadeus Mozart</skos:prefLabel>
        <skos:prefLabel xml:lang="es">Wolfgang Amadeus Mozart</skos:prefLabel>
        <skos:altLabel xml:lang="en">Mozart, Johann Chrysostom Wolfgang Amadeus</skos:altLabel>
        <skos:altLabel xml:lang="en">Mozart, Wolfgang Amadeus</skos:altLabel>
        <dc:identifier>32197206</dc:identifier>
        <rdaGr2:dateOfBirth>1756-01-27</rdaGr2:dateOfBirth>
        <rdaGr2:placeOfBirth rdf:resource="http://dbpedia.org/resource/Salzburg"/>
        <rdaGr2:dateOfDeath>1791-12-05</rdaGr2:dateOfDeath>
        <rdaGr2:placeOfDeath rdf:resource="http://dbpedia.org/resource/Vienna"/>
        <rdaGr2:gender>Male</rdaGr2:gender>
        <rdaGr2:biographicalInformation xml:lang="en">Wolfgang Amadeus Mozart (German: [ˈvɔlfɡaŋ amaˈdeus ˈmoːtsaʁt], English see fn.; 27 January 1756 – 5 December 1791), baptised as Johannes Chrysostomus Wolfgangus Theophilus Mozart, was a prolific and influential composer of the Classical era.Mozart showed prodigious ability from his earliest childhood. Already competent on keyboard and violin, he composed from the age of five and performed before European royalty. At 17, he was engaged as a court musician in Salzburg, but grew restless and travelled in search of a better position, always composing abundantly. While visiting Vienna in 1781, he was dismissed from his Salzburg position. He chose to stay in the capital, where he achieved fame but little financial security. During his final years in Vienna, he composed many of his best-known symphonies, concertos, and operas, and portions of the Requiem, which was largely unfinished at the time of his death. The circumstances of his early death have been much mythologized. He was survived by his wife Constanze and two sons.He composed over 600 works, many acknowledged as pinnacles of symphonic, concertante, chamber, operatic, and choral music. He is among the most enduringly popular of classical composers, and his influence on subsequent Western art music is profound; Beethoven composed his own early works in the shadow of Mozart, and Joseph Haydn wrote that "posterity will not see such a talent again in 100 years."</rdaGr2:biographicalInformation>
        <rdaGr2:biographicalInformation xml:lang="nl">Wolfgang Amadeus Mozart (Salzburg, 27 januari 1756 – Wenen, 5 december 1791), eigenlijk Joannes Chrysostomus Wolfgangus Theophilus Mozart, was een uit het prinsaartsbisdom Salzburg (in het tegenwoordige Oostenrijk) afkomstige componist, pianist, violist en dirigent.Mozart was een wonderkind, dat op uitzonderlijk jonge leeftijd viool, klavecimbel en orgel speelde en kwalitatief hoogstaand werk componeerde. Mozart wordt naast Johan Sebastian Bach en Ludwig van Beethoven gerekend tot de componisten die binnen een traditie nieuwe muzikale concepten bedachten en die diepgaande invloed uitoefenden op alle na hen komende componisten.Mozarts werk wordt gerekend tot de muziek van de klassieke periode. Samen met Joseph Haydn en Ludwig van Beethoven vormt hij, muziekhistorisch gezien, de Eerste Weense School.</rdaGr2:biographicalInformation>
        <rdaGr2:biographicalInformation xml:lang="pt">Wolfgang Amadeus Mozart (AFI: [ˈvɔlfgaŋ amaˈdeus ˈmoːtsart], batizado Joannes Chrysostomus Wolfgangus Theophilus Mozart; Salzburgo, 27 de janeiro de 1756 – Viena, 5 de dezembro de 1791) foi um prolífico e influente compositor austríaco do período clássico. Mozart mostrou uma habilidade musical prodigiosa desde sua infância. Já competente nos instrumentos de teclado e no violino, começou a compor aos cinco anos de idade, e passou a se apresentar para a realeza europeia, maravilhando a todos com seu talento precoce. Chegando à adolescência, foi contratado como músico da corte em Salzburgo, porém as limitações da vida musical na cidade o impeliram a buscar um novo cargo em outras cortes, mas sem sucesso. Ao visitar Viena em 1781 com seu patrão, desentendeu-se com ele e solicitou demissão, optando por ficar na capital, onde, ao longo do resto de sua vida, conquistou fama, porém pouca estabilidade financeira. Seus últimos anos viram surgir algumas de suas sinfonias, concertos e óperas mais conhecidos, além de seu Requiem. As circunstâncias de sua morte prematura deram origem a diversas lendas. Deixou uma esposa, Constanze, e dois filhos. Foi autor de mais de seiscentas obras, muitas delas referenciais na música sinfônica, concertante, operística, coral, pianística e camerística. Sua produção foi louvada por todos os críticos de sua época, embora muitos a considerassem excessivamente complexa e difícil, e estendeu sua influência sobre vários outros compositores ao longo de todo o século XIX e início do século XX. Hoje Mozart é visto pela crítica especializada como um dos maiores compositores do ocidente, conseguiu conquistar grande prestígio mesmo entre os leigos, e sua imagem se tornou um ícone popular.</rdaGr2:biographicalInformation>
        <rdaGr2:biographicalInformation xml:lang="es">Wolfgang Amadeus Mozart, cuyo nombre completo era Joannes Chrysostomus Wolfgangus Theophilus Mozart, (Salzburgo, 27 de enero de 1756-Viena, 5 de diciembre de 1791), fue un compositor y pianista austriaco, maestro del Clasicismo, considerado como uno de los músicos más influyentes y destacados de la historia. La obra mozartiana abarca todos los géneros musicales de su época y alcanza más de seiscientas creaciones, en su mayoría reconocidas como obras maestras de la música sinfónica, concertante, de cámara, para piano, operística y coral, logrando una popularidad y difusión universales.En su niñez más temprana en Salzburgo, Mozart mostró una capacidad prodigiosa en el dominio de instrumentos de teclado y del violín. Con tan solo cinco años ya componía obras musicales y sus interpretaciones eran del aprecio de la aristocracia y realeza europea. A los diecisiete años fue contratado como músico en la corte de Salzburgo, pero su inquietud le llevó a viajar en busca de una mejor posición, siempre componiendo de forma prolífica. Durante su visita a Viena en 1781, tras ser despedido de su puesto en la corte, decidió instalarse en esta ciudad donde alcanzó la fama que mantuvo el resto de su vida, a pesar de pasar por situaciones financieras difíciles. En sus años finales, compuso muchas de sus sinfonías, conciertos y óperas más conocidas, así como su Réquiem. Las circunstancias de su temprana muerte han sido objeto de numerosas especulaciones y elevadas a la categoría de mito. En palabras de críticos de música como Nicholas Till, Mozart siempre aprendía vorazmente de otros músicos y desarrolló un esplendor y una madurez de estilo que abarcó desde la luz y la elegancia, a la oscuridad y la pasión —todo bien fundado por una visión de la humanidad «redimida por el arte, perdonada y reconciliada con la naturaleza y lo absoluto»—. Su influencia en toda la música occidental posterior es profunda; Ludwig van Beethoven escribió sus primeras composiciones a la sombra de Mozart, de quien Joseph Haydn escribió que «la posteridad no verá tal talento otra vez en cien años».</rdaGr2:biographicalInformation>
        <rdaGr2:professionOrOccupation>Composer</rdaGr2:professionOrOccupation>
        <owl:sameAs rdf:resource="http://nl.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://pt.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://es.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://wikidata.org/entity/Q254"/>
        <owl:sameAs rdf:resource="http://yago-knowledge.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://rdf.freebase.com/ns/m.082db"/>
    </edm:Agent>
</rdf:RDF>
```

#### Shape Body
------
_Shape body in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent#base>
  a sh:Shape ;
  rdfs:subClassOf rdfs:Resource ;
  sh:description """This shape gathers all constraints that apply to a 
                    edm:Agent class""" ;

  sh:scopeClass edm:Agent ;

  # class level constraints
  sh:constraint      <Agent#closure> ;

  # SKOS properties
  sh:property        <Agent/skos_prefLabel#type> ;
  sh:property        <Agent/skos_prefLabel#datatype> ;
  sh:property        <Agent/skos_prefLabel#cardinality> ;
  sh:property        <Agent/skos_altLabel#type> ;
  sh:property        <Agent/skos_altLabel#datatype> ;
  sh:property        <Agent/skos_altLabel#redundancy> ;
  sh:property        <Agent/skos_note#type> ;
  sh:property        <Agent/skos_note#datatype> ;

  # DC properties
  sh:property        <Agent/dc_date#literal> ;
  sh:property        <Agent/dc_identifier#type> ;

  # DCTERMS properties
  sh:property        <Agent/dct_hasPart#type> ;
  sh:property        <Agent/dct_hasPart#range-class> ;
  sh:property        <Agent/dct_isPartOf#type> ;
  sh:property        <Agent/dct_isPartOf#range-class> ;

  # EDM properties
  sh:property        <Agent/edm_begin#type> ;
  sh:property        <Agent/edm_begin#cardinality> ;
  sh:property        <Agent/edm_begin#literal> ;
  sh:property        <Agent/edm_begin#correlation> ;
  sh:property        <Agent/edm_begin#redundancy> ;
  sh:property        <Agent/edm_end#type> ;
  sh:property        <Agent/edm_end#cardinality> ;
  sh:property        <Agent/edm_end#literal> ;
  sh:property        <Agent/edm_end#redundancy> ;
  sh:property        <Agent/edm_hasMet#type> ;
  sh:property        <Agent/edm_hasMet#range-class> ;
  sh:property        <Agent/edm_isRelatedTo#type> ;

  # FOAF properties
  sh:property        <Agent/foaf_name#type> ;

  # RDAGR2 properties
  sh:property        <Agent/rdaGr2_biographicalInformation#type> ;
  sh:property        <Agent/rdaGr2_dateOfBirth#type> ;
  sh:property        <Agent/rdaGr2_dateOfBirth#cardinality> ;
  sh:property        <Agent/rdaGr2_dateOfBirth#literal> ;
  sh:property        <Agent/rdaGr2_dateOfBirth#correlation> ;
  sh:property        <Agent/rdaGr2_dateOfDeath#type> ;
  sh:property        <Agent/rdaGr2_dateOfDeath#cardinality> ;
  sh:property        <Agent/rdaGr2_dateOfDeath#literal> ;
  sh:property        <Agent/rdaGr2_dateOfEstablishment#type> ;
  sh:property        <Agent/rdaGr2_dateOfEstablishment#literal> ;
  sh:property        <Agent/rdaGr2_dateOfEstablishment#correlation> ;
  sh:property        <Agent/rdaGr2_dateOfTermination#type> ;
  sh:property        <Agent/rdaGr2_dateOfTermination#literal> ;
  sh:property        <Agent/rdaGr2_gender#type> ;
  sh:property        <Agent/rdaGr2_gender#cardinality> ;
  sh:property        <Agent/rdaGr2_placeOfBirth#cardinality> ;
  sh:property        <Agent/rdaGr2_placeOfDeath#cardinality> ;
  sh:property        <Agent/rdaGr2_professionOrOccupation#cardinality> ;

  # OWL properties
  sh:property        <Agent/owl_sameAs#type> ;
.
```

#### Shape level constraints
------

##### Constraint <a id="http_www_europeana_eu_schemas_edm_shapes_external_Agent_closure" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent#closure">http://www.europeana.eu/schemas/edm/shapes/external/Agent#closure</a>
<table>
<tr><th align="right">description</th><td>An edm:Agent resource must be defined using only the 
                    properties defined in EDM for Agents</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="null">R-206-DEFINE-ALLOWED-NAMESPACES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#closure">http://www.europeana.eu/schemas/edm/shapes/categories#closure</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent#closure>
  sh:description """An edm:Agent resource must be defined using only the 
                    properties defined in EDM for Agents""" ;
  dc:type esc:closure ;
  dc:relation "R-206-DEFINE-ALLOWED-NAMESPACES" ;
  sh:closed true ;
  sh:ignoredProperties (
    rdf:type 
    skos:prefLabel skos:altLabel skos:note
    dc:date dc:identifier dct:hasPart dct:isPartOf
    edm:begin edm:end edm:hasMet edm:isRelatedTo foaf:name
    rdaGr2:biographicalInformation rdaGr2:dateOfBirth rdaGr2:dateOfDeath
    rdaGr2:dateOfEstablishment rdaGr2:dateOfTermination rdaGr2:gender 
    rdaGr2:placeOfBirth rdaGr2:placeOfDeath rdaGr2:professionOrOccupation
    owl:sameAs
  ) ;
.
```
#### Property <a id="skos_altLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>
------

##### Constraint <a id="skos_altLabel_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#datatype</a>
<table>
<tr><th align="right">description</th><td>Ideally all skos:altLabel should have a language tag</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/55">R-48-MISSING-LANGUAGE-TAGS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#datatype>
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

##### Constraint <a id="skos_altLabel_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#redundancy</a>
<table>
<tr><th align="right">description</th><td>skos:altLabel should not have the same labels than in 
                    skos:prefLabel</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/17">R-10-DEFINE-DISJOINT-PROPERTIES</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#redundancy>
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

##### Constraint <a id="skos_altLabel_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:altLabel must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:altLabel must be Literals" ;
  sh:predicate skos:altLabel ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_note" target="_blank" href="http://www.w3.org/2004/02/skos/core#note">http://www.w3.org/2004/02/skos/core#note</a>
------

##### Constraint <a id="skos_note_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_note#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_note#datatype</a>
<table>
<tr><th align="right">description</th><td>Ideally all skos:note should have a language tag</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/55">R-48-MISSING-LANGUAGE-TAGS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_note#datatype>
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

##### Constraint <a id="skos_note_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_note#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_note#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:note must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_note#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:note must be Literals" ;
  sh:predicate skos:note ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="skos_prefLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>
------

##### Constraint <a id="skos_prefLabel_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one skos:prefLabel per language</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/56">R-49-PROPERTY-OCCURS-ONCE-PER-LANGUAGE-TAG</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#cardinality>
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

##### Constraint <a id="skos_prefLabel_datatype" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#datatype">http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#datatype</a>
<table>
<tr><th align="right">description</th><td>Ideally all skos:prefLabel should have a language tag</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/55">R-48-MISSING-LANGUAGE-TAGS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#datatype">http://www.europeana.eu/schemas/edm/shapes/categories#datatype</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#datatype>
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

##### Constraint <a id="skos_prefLabel_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#type</a>
<table>
<tr><th align="right">description</th><td>Values for skos:prefLabel must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for skos:prefLabel must be Literals" ;
  sh:predicate skos:prefLabel ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="dc_date" target="_blank" href="http://purl.org/dc/elements/1.1/date">http://purl.org/dc/elements/1.1/date</a>
------

##### Constraint <a id="dc_date_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_date#literal">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_date#literal</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_date#literal>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""";
  dc:relation "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:filterShape [ #restrict only to Literals
      sh:property [
          sh:predicate dc:date ;
          sh:nodeKind sh:Literal ;
      ]
  ] ;
  sh:predicate dc:date ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```
#### Property <a id="dc_identifier" target="_blank" href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>
------

##### Constraint <a id="dc_identifier_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_identifier#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_identifier#type</a>
<table>
<tr><th align="right">description</th><td>Values for dc:identifier must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/dc_identifier#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for dc:identifier must be Literals" ;
  sh:predicate dc:identifier ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="dct_hasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------

##### Constraint <a id="dct_hasPart_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#range-class</a>
<table>
<tr><th align="right">description</th><td>dcterms:hasPart must refer to a valid edm:Agent</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#range-class>
  a sh:PropertyConstraint ;
  sh:description """dcterms:hasPart must refer to a valid edm:Agent""" ;
  dc:type esc:range-class ;
  dc:relation "R-225-VALIDATION-OF-CLASS-ASSOCIATION"
           , "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:filterShape [
      sh:property [
          sh:predicate dct:hasPart ;
          sh:nodeKind sh:IRI ;
      ]
  ] ;
  sh:predicate dct:hasPart ;
  sh:valueShape Agent: ;
  sh:class edm:Agent ;
.
```

##### Constraint <a id="dct_hasPart_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#type</a>
<table>
<tr><th align="right">description</th><td>Values for dcterms:hasPart must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_hasPart#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for dcterms:hasPart must be Resources" ;
  sh:predicate dct:hasPart ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="dct_isPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
------

##### Constraint <a id="dct_isPartOf_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#range-class</a>
<table>
<tr><th align="right">description</th><td>dcterms:isPartOf must refer to a valid edm:Agent</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/286">R-171-VALIDATION-OF-URIS-BY-DEREFERENCING</a>, <a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/453">R-225-VALIDATION-OF-CLASS-ASSOCIATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#range-class>
  a sh:PropertyConstraint ;
  sh:description """dcterms:isPartOf must refer to a valid edm:Agent""" ;
  dc:type esc:range-class ;
  dc:relation "R-225-VALIDATION-OF-CLASS-ASSOCIATION"
           , "R-171-VALIDATION-OF-URIS-BY-DEREFERENCING" ;
  sh:filterShape [
      sh:property [
          sh:predicate dct:isPartOf ;
          sh:nodeKind sh:IRI ;
      ]
  ] ;
  sh:predicate dct:hasPart ;
  sh:valueShape Agent: ;
  sh:class edm:Agent ;
.
```

##### Constraint <a id="dct_isPartOf_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#type</a>
<table>
<tr><th align="right">description</th><td>Values for dcterms:isPartOf must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/dct_isPartOf#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for dcterms:isPartOf must be Resources" ;
  sh:predicate dct:isPartOf ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="foaf_name" target="_blank" href="http://xmlns.com/foaf/0.1/name">http://xmlns.com/foaf/0.1/name</a>
------

##### Constraint <a id="foaf_name_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/foaf_name#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/foaf_name#type</a>
<table>
<tr><th align="right">description</th><td>Values for foaf:name must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/foaf_name#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for foaf:name must be Literals" ;
  sh:predicate foaf:name ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="rdaGr2_biographicalInformation" target="_blank" href="http://rdvocab.info/ElementsGr2/biographicalInformation">http://rdvocab.info/ElementsGr2/biographicalInformation</a>
------

##### Constraint <a id="rdaGr2_biographicalInformation_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_biographicalInformation#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_biographicalInformation#type</a>
<table>
<tr><th align="right">description</th><td>Values for rdaGr2:biographicalInformation must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_biographicalInformation#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for rdaGr2:biographicalInformation must be Literals" ;
  sh:predicate rdaGr2:biographicalInformation ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="rdaGr2_dateOfBirth" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfBirth">http://rdvocab.info/ElementsGr2/dateOfBirth</a>
------

##### Constraint <a id="rdaGr2_dateOfBirth_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one rdaGr2:dateOfBirth</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one rdaGr2:dateOfBirth" ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate rdaGr2:dateOfBirth ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="rdaGr2_dateOfBirth_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#correlation">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#correlation</a>
<table>
<tr><th align="right">description</th><td>rdaGr2:dateOfBirth must be earlier or equals than 
                    rdaGr2:dateOfDeath</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/50">R-43-LITERAL-VALUE-COMPARISON</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#correlation>
  a sh:PropertyConstraint ;
  sh:description """rdaGr2:dateOfBirth must be earlier or equals than 
                    rdaGr2:dateOfDeath""";
  dc:type esc:correlation ;
  dc:relation "R-43-LITERAL-VALUE-COMPARISON" ;
  sh:predicate rdaGr2:dateOfBirth ;
  sh:lessThanOrEquals rdaGr2:dateOfDeath ;
.
```

##### Constraint <a id="rdaGr2_dateOfBirth_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#literal">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#literal</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#literal>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""";
  dc:relation "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:filterShape [
    sh:property [
      sh:predicate rdaGr2:dateOfBirth ;
      sh:nodeKind sh:Literal ;
    ]
  ] ;
  sh:predicate rdaGr2:dateOfBirth ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```

##### Constraint <a id="rdaGr2_dateOfBirth_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#type</a>
<table>
<tr><th align="right">description</th><td>Values for rdaGr2:dateOfBirth must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfBirth#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for rdaGr2:dateOfBirth must be Literals" ;
  sh:predicate rdaGr2:dateOfBirth ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="rdaGr2_dateOfDeath" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfDeath">http://rdvocab.info/ElementsGr2/dateOfDeath</a>
------

##### Constraint <a id="rdaGr2_dateOfDeath_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfDeath#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfDeath#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one rdaGr2:dateOfDeath</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfDeath#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one rdaGr2:dateOfDeath" ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate rdaGr2:dateOfDeath ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="rdaGr2_dateOfDeath_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfDeath#literal">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfDeath#literal</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfDeath#literal>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""";
  dc:relation "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:filterShape [
    sh:property [
      sh:predicate rdaGr2:dateOfDeath ;
      sh:nodeKind sh:Literal ;
    ]
  ] ;
  sh:predicate rdaGr2:dateOfDeath ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```

##### Constraint <a id="rdaGr2_dateOfDeath_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfDeath#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfDeath#type</a>
<table>
<tr><th align="right">description</th><td>Values for rdaGr2:dateOfDeath must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfDeath#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for rdaGr2:dateOfDeath must be Literals" ;
  sh:predicate rdaGr2:dateOfDeath ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="rdaGr2_dateOfEstablishment" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfEstablishment">http://rdvocab.info/ElementsGr2/dateOfEstablishment</a>
------

##### Constraint <a id="rdaGr2_dateOfEstablishment_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfEstablishment#correlation">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfEstablishment#correlation</a>
<table>
<tr><th align="right">description</th><td>rdaGr2:dateOfEstablishment must be earlier or equals than 
                    rdaGr2:dateOfTermination</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/50">R-43-LITERAL-VALUE-COMPARISON</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfEstablishment#correlation>
  a sh:PropertyConstraint ;
  sh:description """rdaGr2:dateOfEstablishment must be earlier or equals than 
                    rdaGr2:dateOfTermination""";
  dc:type esc:correlation ;
  dc:relation "R-43-LITERAL-VALUE-COMPARISON" ;
  sh:predicate rdaGr2:dateOfEstablishment ;
  sh:lessThanOrEquals rdaGr2:dateOfTermination ;
.
```

##### Constraint <a id="rdaGr2_dateOfEstablishment_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfEstablishment#literal">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfEstablishment#literal</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfEstablishment#literal>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""";
  dc:relation "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:filterShape [
    sh:property [
      sh:predicate rdaGr2:dateOfEstablishment ;
      sh:nodeKind sh:Literal ;
    ]
  ] ;
  sh:predicate rdaGr2:dateOfEstablishment ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```

##### Constraint <a id="rdaGr2_dateOfEstablishment_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfEstablishment#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfEstablishment#type</a>
<table>
<tr><th align="right">description</th><td>Values for rdaGr2:dateOfEstablishment must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfEstablishment#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for rdaGr2:dateOfEstablishment must be Literals" ;
  sh:predicate rdaGr2:dateOfEstablishment ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="rdaGr2_dateOfTermination" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfTermination">http://rdvocab.info/ElementsGr2/dateOfTermination</a>
------

##### Constraint <a id="rdaGr2_dateOfTermination_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfTermination#literal">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfTermination#literal</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfTermination#literal>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""";
  dc:relation "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:filterShape [
    sh:property [
      sh:predicate rdaGr2:dateOfTermination ;
      sh:nodeKind sh:Literal ;
    ]
  ] ;
  sh:predicate rdaGr2:dateOfTermination ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```

##### Constraint <a id="rdaGr2_dateOfTermination_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfTermination#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfTermination#type</a>
<table>
<tr><th align="right">description</th><td>Values for rdaGr2:dateOfTermination must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_dateOfTermination#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for rdaGr2:dateOfTermination must be Literals" ;
  sh:predicate rdaGr2:dateOfTermination ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="rdaGr2_gender" target="_blank" href="http://rdvocab.info/ElementsGr2/gender">http://rdvocab.info/ElementsGr2/gender</a>
------

##### Constraint <a id="rdaGr2_gender_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_gender#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_gender#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one rdaGr2:gender</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_gender#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one rdaGr2:gender" ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate rdaGr2:gender ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="rdaGr2_gender_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_gender#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_gender#type</a>
<table>
<tr><th align="right">description</th><td>Values for rdaGr2:gender must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_gender#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for rdaGr2:gender must be Literals" ;
  sh:predicate rdaGr2:gender ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="rdaGr2_placeOfBirth" target="_blank" href="http://rdvocab.info/ElementsGr2/placeOfBirth">http://rdvocab.info/ElementsGr2/placeOfBirth</a>
------

##### Constraint <a id="rdaGr2_placeOfBirth_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_placeOfBirth#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_placeOfBirth#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one rdaGr2:placeOfBirth</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_placeOfBirth#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one rdaGr2:placeOfBirth" ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate rdaGr2:placeOfBirth ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```
#### Property <a id="rdaGr2_placeOfDeath" target="_blank" href="http://rdvocab.info/ElementsGr2/placeOfDeath">http://rdvocab.info/ElementsGr2/placeOfDeath</a>
------

##### Constraint <a id="rdaGr2_placeOfDeath_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_placeOfDeath#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_placeOfDeath#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one rdaGr2:placeOfDeath</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_placeOfDeath#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one rdaGr2:placeOfDeath" ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate rdaGr2:placeOfDeath ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```
#### Property <a id="rdaGr2_professionOrOccupation" target="_blank" href="http://rdvocab.info/ElementsGr2/professionOrOccupation">http://rdvocab.info/ElementsGr2/professionOrOccupation</a>
------

##### Constraint <a id="rdaGr2_professionOrOccupation_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_professionOrOccupation#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_professionOrOccupation#cardinality</a>
<table>
<tr><th align="right">description</th><td></td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/rdaGr2_professionOrOccupation#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate rdaGr2:professionOrOccupation ;
  sh:minCount 0 ;
.
```
#### Property <a id="edm_begin" target="_blank" href="http://www.europeana.eu/schemas/edm/begin">http://www.europeana.eu/schemas/edm/begin</a>
------

##### Constraint <a id="edm_begin_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one edm:begin</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one edm:begin" ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:begin ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="edm_begin_correlation" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#correlation">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#correlation</a>
<table>
<tr><th align="right">description</th><td>edm:begin must be earlier or equals than edm:end</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/50">R-43-LITERAL-VALUE-COMPARISON</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#correlation">http://www.europeana.eu/schemas/edm/shapes/categories#correlation</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#correlation>
  a sh:PropertyConstraint ;
  sh:description "edm:begin must be earlier or equals than edm:end";
  dc:type esc:correlation ;
  dc:relation "R-43-LITERAL-VALUE-COMPARISON" ;
  sh:predicate edm:begin ;
  sh:lessThanOrEquals edm:end ;
.
```

##### Constraint <a id="edm_begin_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#literal">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#literal</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#literal>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""";
  dc:relation "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:filterShape [
    sh:property [
      sh:predicate edm:begin ;
      sh:nodeKind sh:Literal ;
    ]
  ] ;
  sh:predicate edm:begin ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```

##### Constraint <a id="edm_begin_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#redundancy</a>
<table>
<tr><th align="right">description</th><td>edm:begin should not be the same as rdaGr2:dateOfBirth
                  , if true the field is redundant</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#redundancy>
  a sh:PropertyConstraint ;
  dc:type esc:redundancy ;
  sh:description """edm:begin should not be the same as rdaGr2:dateOfBirth
                  , if true the field is redundant""" ;
  dc:relation "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:severity sh:Warning ;
  sh:predicate edm:begin ;
  sh:notEquals rdaGr2:dateOfBirth ;
.
```

##### Constraint <a id="edm_begin_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#type</a>
<table>
<tr><th align="right">description</th><td>Values for edm:being must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_begin#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for edm:being must be Literals" ;
  sh:predicate edm:begin ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="edm_end" target="_blank" href="http://www.europeana.eu/schemas/edm/end">http://www.europeana.eu/schemas/edm/end</a>
------

##### Constraint <a id="edm_end_cardinality" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#cardinality">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#cardinality</a>
<table>
<tr><th align="right">description</th><td>There must be at most one edm:end</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/424">R-211-CARDINALITY-CONSTRAINTS</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#cardinality">http://www.europeana.eu/schemas/edm/shapes/categories#cardinality</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#cardinality>
  a sh:PropertyConstraint ;
  dc:type esc:cardinality ;
  sh:description "There must be at most one edm:end" ;
  dc:relation "R-211-CARDINALITY-CONSTRAINTS" ;
  sh:predicate edm:end ;
  sh:minCount 0 ;
  sh:maxCount 1 ;
.
```

##### Constraint <a id="edm_end_literal" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#literal">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#literal</a>
<table>
<tr><th align="right">description</th><td>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/51">R-44-PATTERN-MATCHING-ON-RDF-LITERALS</a></td></tr>
<tr><th align="right">type</th><td></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#literal>
  a sh:PropertyConstraint ;
  sh:description """Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD""";
  dc:relation "R-44-PATTERN-MATCHING-ON-RDF-LITERALS" ;
  sh:filterShape [
    sh:property [
      sh:predicate edm:end ;
      sh:nodeKind sh:Literal ;
    ]
  ] ;
  sh:predicate edm:end ;
  #does not check for valid dates but could be expanded
  sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;
.
```

##### Constraint <a id="edm_end_redundancy" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#redundancy">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#redundancy</a>
<table>
<tr><th align="right">description</th><td>edm:end should not be the same as rdaGr2:dateOfDeath
                  , if true the field is redundant</td></tr>
<tr><th align="right">subject</th><td><a target="_blank" href="http://lelystad.informatik.uni-mannheim.de/rdf-validation/?q=node/451">R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION</a></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#redundancy">http://www.europeana.eu/schemas/edm/shapes/categories#redundancy</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#redundancy>
  a sh:PropertyConstraint ;
  dc:type esc:redundancy ;
  sh:description """edm:end should not be the same as rdaGr2:dateOfDeath
                  , if true the field is redundant""" ;
  dc:relation "R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION" ;
  sh:severity sh:Warning ;
  sh:predicate edm:end ;
  sh:notEquals rdaGr2:dateOfDeath ;
.
```

##### Constraint <a id="edm_end_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#type</a>
<table>
<tr><th align="right">description</th><td>Values for edm:end must be Literals</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_end#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for edm:end must be Literals" ;
  sh:predicate edm:end ;
  sh:nodeKind sh:Literal ;
.
```
#### Property <a id="edm_hasMet" target="_blank" href="http://www.europeana.eu/schemas/edm/hasMet">http://www.europeana.eu/schemas/edm/hasMet</a>
------

##### Constraint <a id="edm_hasMet_range-class" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#range-class">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#range-class</a>
<table>
<tr><th align="right">description</th><td>edm:hasMet must refer to a valid edm:Agent, edm:Place
                  , skos:Concept or edm:TimeSpan</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#range-class">http://www.europeana.eu/schemas/edm/shapes/categories#range-class</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#range-class>
  a sh:PropertyConstraint ;
  sh:description """edm:hasMet must refer to a valid edm:Agent, edm:Place
                  , skos:Concept or edm:TimeSpan""";
  dc:type esc:range-class ;
  sh:predicate edm:hasMet ;
  sh:valueShape [
    sh:constraint [
      sh:or ( Agent: Place: Concept: TimeSpan: )
    ] ;
  ] ;
.
```

##### Constraint <a id="edm_hasMet_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#type</a>
<table>
<tr><th align="right">description</th><td>Values for edm:hasMet must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_hasMet#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for edm:hasMet must be Resources" ;
  sh:predicate edm:hasMet ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="edm_isRelatedTo" target="_blank" href="http://www.europeana.eu/schemas/edm/isRelatedTo">http://www.europeana.eu/schemas/edm/isRelatedTo</a>
------

##### Constraint <a id="edm_isRelatedTo_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_isRelatedTo#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_isRelatedTo#type</a>
<table>
<tr><th align="right">description</th><td>Values for edm:isRelatedTo must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/edm_isRelatedTo#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for edm:isRelatedTo must be Resources" ;
  sh:predicate edm:isRelatedTo ;
  sh:nodeKind sh:IRI ;
.
```
#### Property <a id="owl_sameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>
------

##### Constraint <a id="owl_sameAs_type" target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/external/Agent/owl_sameAs#type">http://www.europeana.eu/schemas/edm/shapes/external/Agent/owl_sameAs#type</a>
<table>
<tr><th align="right">description</th><td>Values for owl:sameAs must be Resources</td></tr>
<tr><th align="right">subject</th><td></td></tr>
<tr><th align="right">type</th><td><a target="_blank" href="http://www.europeana.eu/schemas/edm/shapes/categories#type">http://www.europeana.eu/schemas/edm/shapes/categories#type</a></td></tr>
</table>
_Shape definition in Turtle syntax:_

```
<http://www.europeana.eu/schemas/edm/shapes/external/Agent/owl_sameAs#type>
  a sh:PropertyConstraint ;
  dc:type esc:type ;
  sh:description "Values for owl:sameAs must be Resources" ;
  sh:predicate owl:sameAs ;
  sh:nodeKind sh:IRI ;
.
```
