
## Shapes definitions for edmAgent class
_This document was generated from the [shapes file](/shapes-edm/src/main/resources/etc/edm/shapes/external/Agent.ttl) using this [software](/shapes-doc)_
> This shape gathers all constraints that apply to a edm:Agent class

The following constraints apply to shape or are not restricted to a specific property:
<table>
<tr><th align="right">Constraints</th><td width='100%'><a href="#http_www_europeana_eu_schemas_edm_shapes_external_Agent_closure">closure</a></td></tr>
</table>

The following table shows an overview of the constraints divided per property:

| Property | Cardinality | Value Type | Constraints |
| :--- | :--: | :--: | :--- |
|<a href="#skosaltLabel">skosaltLabel</a>||||
|<a href="#skosnote">skosnote</a>||||
|<a href="#skosprefLabel">skosprefLabel</a>||||
|<a href="#dcdate">dcdate</a>||||
|<a href="#dcidentifier">dcidentifier</a>||||
|<a href="#dcthasPart">dcthasPart</a>||||
|<a href="#dctisPartOf">dctisPartOf</a>||||
|<a href="#foafname">foafname</a>||||
|<a href="#rdaGr2biographicalInformation">rdaGr2biographicalInformation</a>||||
|<a href="#rdaGr2dateOfBirth">rdaGr2dateOfBirth</a>||||
|<a href="#rdaGr2dateOfDeath">rdaGr2dateOfDeath</a>||||
|<a href="#rdaGr2dateOfEstablishment">rdaGr2dateOfEstablishment</a>||||
|<a href="#rdaGr2dateOfTermination">rdaGr2dateOfTermination</a>||||
|<a href="#rdaGr2gender">rdaGr2gender</a>||||
|<a href="#rdaGr2placeOfBirth">rdaGr2placeOfBirth</a>||||
|<a href="#rdaGr2placeOfDeath">rdaGr2placeOfDeath</a>||||
|<a href="#rdaGr2professionOrOccupation">rdaGr2professionOrOccupation</a>||||
|<a href="#edmbegin">edmbegin</a>||||
|<a href="#edmend">edmend</a>||||
|<a href="#edmhasMet">edmhasMet</a>||||
|<a href="#edmisRelatedTo">edmisRelatedTo</a>||||
|<a href="#owlsameAs">owlsameAs</a>||||

Below is an example of a resource of type edmAgent: 

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
  sh:property        <Agent/skos_altLabel#cardinality> ;
  sh:property        <Agent/skos_altLabel#redundancy> ;
  sh:property        <Agent/skos_note#type> ;
  sh:property        <Agent/skos_note#datatype> ;
  sh:property        <Agent/skos_note#cardinality> ;

  # DC properties
  sh:property        <Agent/dc_date#cardinality> ;
  sh:property        <Agent/dc_date#literal> ;
  sh:property        <Agent/dc_identifier#type> ;
  sh:property        <Agent/dc_identifier#cardinality> ;

  # DCTERMS properties
  sh:property        <Agent/dct_hasPart#type> ;
  sh:property        <Agent/dct_hasPart#cardinality> ;
  sh:property        <Agent/dct_hasPart#range-class> ;
  sh:property        <Agent/dct_isPartOf#type> ;
  sh:property        <Agent/dct_isPartOf#cardinality> ;
  sh:property        <Agent/dct_isPartOf#range-class> ;

  # EDM properties
  sh:property        <Agent/edm_begin#type> ;
  sh:property        <Agent/edm_begin#cardinality> ;
  sh:property        <Agent/edm_begin#literal> ;
  sh:property        <Agent/edm_begin#correlation> ;
  sh:constraint      <Agent/edm_begin#redundancy> ;
  sh:property        <Agent/edm_end#type> ;
  sh:property        <Agent/edm_end#cardinality> ;
  sh:property        <Agent/edm_end#literal> ;
  sh:constraint      <Agent/edm_end#redundancy> ;
  sh:property        <Agent/edm_hasMet#type> ;
  sh:property        <Agent/edm_hasMet#cardinality> ;
  sh:property        <Agent/edm_hasMet#range-class> ;
  sh:property        <Agent/edm_isRelatedTo#type> ;
  sh:property        <Agent/edm_isRelatedTo#cardinality> ;

  # FOAF properties
  sh:property        <Agent/foaf_name#type> ;
  sh:property        <Agent/foaf_name#cardinality> ;

  # RDAGR2 properties
  sh:property        <Agent/rdaGr2_biographicalInformation#type> ;
  sh:property        <Agent/rdaGr2_biographicalInformation#cardinality> ;
  sh:property        <Agent/rdaGr2_dateOfBirth#type> ;
  sh:property        <Agent/rdaGr2_dateOfBirth#cardinality> ;
  sh:property        <Agent/rdaGr2_dateOfBirth#literal> ;
  sh:property        <Agent/rdaGr2_dateOfBirth#correlation> ;
  sh:property        <Agent/rdaGr2_dateOfDeath#type> ;
  sh:property        <Agent/rdaGr2_dateOfDeath#cardinality> ;
  sh:property        <Agent/rdaGr2_dateOfDeath#literal> ;
  sh:property        <Agent/rdaGr2_dateOfEstablishment#type> ;
  sh:property        <Agent/rdaGr2_dateOfEstablishment#cardinality> ;
  sh:property        <Agent/rdaGr2_dateOfEstablishment#literal> ;
  sh:property        <Agent/rdaGr2_dateOfEstablishment#correlation> ;
  sh:property        <Agent/rdaGr2_dateOfTermination#type> ;
  sh:property        <Agent/rdaGr2_dateOfTermination#cardinality> ;
  sh:property        <Agent/rdaGr2_dateOfTermination#literal> ;
  sh:property        <Agent/rdaGr2_gender#type> ;
  sh:property        <Agent/rdaGr2_gender#cardinality> ;
  sh:property        <Agent/rdaGr2_placeOfBirth#cardinality> ;
  sh:property        <Agent/rdaGr2_placeOfDeath#cardinality> ;
  sh:property        <Agent/rdaGr2_professionOrOccupation#cardinality> ;

  # OWL properties
  sh:property        <Agent/owl_sameAs#type> ;
  sh:property        <Agent/owl_sameAs#cardinality> ;
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
  dc:subject "R-206-DEFINE-ALLOWED-NAMESPACES" ;
  sh:closed true ;
  sh:ignoredProperties (rdf:type) ;
.
```
#### Property <a id="skosaltLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#altLabel">http://www.w3.org/2004/02/skos/core#altLabel</a>
------
#### Property <a id="skosnote" target="_blank" href="http://www.w3.org/2004/02/skos/core#note">http://www.w3.org/2004/02/skos/core#note</a>
------
#### Property <a id="skosprefLabel" target="_blank" href="http://www.w3.org/2004/02/skos/core#prefLabel">http://www.w3.org/2004/02/skos/core#prefLabel</a>
------
#### Property <a id="dcdate" target="_blank" href="http://purl.org/dc/elements/1.1/date">http://purl.org/dc/elements/1.1/date</a>
------
#### Property <a id="dcidentifier" target="_blank" href="http://purl.org/dc/elements/1.1/identifier">http://purl.org/dc/elements/1.1/identifier</a>
------
#### Property <a id="dcthasPart" target="_blank" href="http://purl.org/dc/terms/hasPart">http://purl.org/dc/terms/hasPart</a>
------
#### Property <a id="dctisPartOf" target="_blank" href="http://purl.org/dc/terms/isPartOf">http://purl.org/dc/terms/isPartOf</a>
------
#### Property <a id="foafname" target="_blank" href="http://xmlns.com/foaf/0.1/name">http://xmlns.com/foaf/0.1/name</a>
------
#### Property <a id="rdaGr2biographicalInformation" target="_blank" href="http://rdvocab.info/ElementsGr2/biographicalInformation">http://rdvocab.info/ElementsGr2/biographicalInformation</a>
------
#### Property <a id="rdaGr2dateOfBirth" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfBirth">http://rdvocab.info/ElementsGr2/dateOfBirth</a>
------
#### Property <a id="rdaGr2dateOfDeath" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfDeath">http://rdvocab.info/ElementsGr2/dateOfDeath</a>
------
#### Property <a id="rdaGr2dateOfEstablishment" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfEstablishment">http://rdvocab.info/ElementsGr2/dateOfEstablishment</a>
------
#### Property <a id="rdaGr2dateOfTermination" target="_blank" href="http://rdvocab.info/ElementsGr2/dateOfTermination">http://rdvocab.info/ElementsGr2/dateOfTermination</a>
------
#### Property <a id="rdaGr2gender" target="_blank" href="http://rdvocab.info/ElementsGr2/gender">http://rdvocab.info/ElementsGr2/gender</a>
------
#### Property <a id="rdaGr2placeOfBirth" target="_blank" href="http://rdvocab.info/ElementsGr2/placeOfBirth">http://rdvocab.info/ElementsGr2/placeOfBirth</a>
------
#### Property <a id="rdaGr2placeOfDeath" target="_blank" href="http://rdvocab.info/ElementsGr2/placeOfDeath">http://rdvocab.info/ElementsGr2/placeOfDeath</a>
------
#### Property <a id="rdaGr2professionOrOccupation" target="_blank" href="http://rdvocab.info/ElementsGr2/professionOrOccupation">http://rdvocab.info/ElementsGr2/professionOrOccupation</a>
------
#### Property <a id="edmbegin" target="_blank" href="http://www.europeana.eu/schemas/edm/begin">http://www.europeana.eu/schemas/edm/begin</a>
------
#### Property <a id="edmend" target="_blank" href="http://www.europeana.eu/schemas/edm/end">http://www.europeana.eu/schemas/edm/end</a>
------
#### Property <a id="edmhasMet" target="_blank" href="http://www.europeana.eu/schemas/edm/hasMet">http://www.europeana.eu/schemas/edm/hasMet</a>
------
#### Property <a id="edmisRelatedTo" target="_blank" href="http://www.europeana.eu/schemas/edm/isRelatedTo">http://www.europeana.eu/schemas/edm/isRelatedTo</a>
------
#### Property <a id="owlsameAs" target="_blank" href="http://www.w3.org/2002/07/owl#sameAs">http://www.w3.org/2002/07/owl#sameAs</a>
------
