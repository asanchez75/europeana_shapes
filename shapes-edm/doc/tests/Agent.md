
## Shapes definitions for edm:Agent class

| Test Case | Results | Status |
| --- | --- | --- |

| [agent_closure.xml](#agent_closure.xml) | null |  |

| [agent_labels_multiple.xml](#agent_labels_multiple.xml) | 1 |  |

| [agent_labels_nolang.xml](#agent_labels_nolang.xml) | 2 |  |

| [agent_labels_redundant.xml](#agent_labels_redundant.xml) | 1 |  |

| [agent_ok1.xml](#agent_ok1.xml) | 0 |  |

| [agent_prop_types.xml](#agent_prop_types.xml) | null |  |

#### Test Case: <a id="agent_closure.xml" target="_blank" href="/shapes-edm/src/test/resources/etc/edm/data/external/agent_closure.xml">agent_closure.xml</a>

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
         xmlns:edm="http://www.europeana.eu/schemas/edm/"
         xmlns:dc="http://purl.org/dc/elements/1.1/"
         xmlns:dcterms="http://purl.org/dc/terms/"
         xmlns:ebucore="http://www.ebu.ch/metadata/ontologies/ebucore/ebucore#"
         xmlns:ore="http://www.openarchives.org/ore/terms/"
         xmlns:skos="http://www.w3.org/2004/02/skos/core#"
         xmlns:rdaGr2="http://rdvocab.info/ElementsGr2/"
         xmlns:owl="http://www.w3.org/2002/07/owl#"
         xmlns:bibo=""
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

        <owl:sameAs rdf:resource="http://nl.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://pt.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://es.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://wikidata.org/entity/Q254"/>
        <owl:sameAs rdf:resource="http://yago-knowledge.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://rdf.freebase.com/ns/m.082db"/>

        <skos:hiddenLabel xml:lang="en">Mozart</skos:hiddenLabel>
        <edm:wasPresentAt>...</edm:wasPresentAt>
        <bibo:suffixName>??</bibo:suffixName>

    </edm:Agent>

</rdf:RDF>
```
_Result_``
#### Test Case: <a id="agent_labels_multiple.xml" target="_blank" href="/shapes-edm/src/test/resources/etc/edm/data/external/agent_labels_multiple.xml">agent_labels_multiple.xml</a>

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
         xmlns:edm="http://www.europeana.eu/schemas/edm/"
         xmlns:dc="http://purl.org/dc/elements/1.1/"
         xmlns:dcterms="http://purl.org/dc/terms/"
         xmlns:ebucore="http://www.ebu.ch/metadata/ontologies/ebucore/ebucore#"
         xmlns:ore="http://www.openarchives.org/ore/terms/"
         xmlns:skos="http://www.w3.org/2004/02/skos/core#"
         xmlns:rdaGr2="http://rdvocab.info/ElementsGr2/"
         xmlns:owl="http://www.w3.org/2002/07/owl#"
         >

    <edm:Agent rdf:about="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart">

        <skos:prefLabel xml:lang="en">Wolfgang Amadeus Mozart</skos:prefLabel>
        <skos:prefLabel xml:lang="en">Johann Chrysostom Wolfgang Amadeus Mozart</skos:prefLabel>
        <skos:prefLabel xml:lang="nl">Wolfgang Amadeus Mozart</skos:prefLabel>
        <skos:prefLabel xml:lang="pt">Wolfgang Amadeus Mozart</skos:prefLabel>

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

        <owl:sameAs rdf:resource="http://nl.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://pt.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://es.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://wikidata.org/entity/Q254"/>
        <owl:sameAs rdf:resource="http://yago-knowledge.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://rdf.freebase.com/ns/m.082db"/>

    </edm:Agent>

</rdf:RDF>
```
_Result_
```
<rdf:RDF
    xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:sh="http://www.w3.org/ns/shacl#" > 
  <rdf:Description rdf:nodeID="A0">
    <sh:focusNode rdf:resource="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
    <sh:subject rdf:resource="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
    <sh:predicate rdf:resource="http://www.w3.org/2004/02/skos/core#prefLabel"/>
    <sh:message>Duplicate use of language tag "en"</sh:message>
    <sh:sourceTemplate rdf:resource="http://www.w3.org/ns/shacl#AbstractUniqueLangPropertyConstraint"/>
    <sh:sourceShape rdf:resource="http://www.europeana.eu/schemas/edm/shapes/external/Agent#base"/>
    <sh:sourceConstraint rdf:resource="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#cardinality"/>
    <sh:severity rdf:resource="http://www.w3.org/ns/shacl#Violation"/>
    <rdf:type rdf:resource="http://www.w3.org/ns/shacl#ValidationResult"/>
  </rdf:Description>
</rdf:RDF>
```

#### Test Case: <a id="agent_labels_nolang.xml" target="_blank" href="/shapes-edm/src/test/resources/etc/edm/data/external/agent_labels_nolang.xml">agent_labels_nolang.xml</a>

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
         xmlns:edm="http://www.europeana.eu/schemas/edm/"
         xmlns:dc="http://purl.org/dc/elements/1.1/"
         xmlns:dcterms="http://purl.org/dc/terms/"
         xmlns:ebucore="http://www.ebu.ch/metadata/ontologies/ebucore/ebucore#"
         xmlns:ore="http://www.openarchives.org/ore/terms/"
         xmlns:skos="http://www.w3.org/2004/02/skos/core#"
         xmlns:rdaGr2="http://rdvocab.info/ElementsGr2/"
         xmlns:owl="http://www.w3.org/2002/07/owl#"
         >

    <edm:Agent rdf:about="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart">

        <skos:prefLabel xml:lang="en">Wolfgang Amadeus Mozart</skos:prefLabel>
        <skos:prefLabel xml:lang="nl">Wolfgang Amadeus Mozart</skos:prefLabel>
        <skos:prefLabel xml:lang="pt">Wolfgang Amadeus Mozart</skos:prefLabel>
        <skos:prefLabel>Wolfgang Amadeus Mozart</skos:prefLabel>

        <skos:altLabel xml:lang="en">Mozart, Johann Chrysostom Wolfgang Amadeus</skos:altLabel>
        <skos:altLabel>Mozart, Wolfgang Amadeus</skos:altLabel>

        <dc:identifier>32197206</dc:identifier>
        <rdaGr2:dateOfBirth>1756-01-27</rdaGr2:dateOfBirth>
        <rdaGr2:placeOfBirth rdf:resource="http://dbpedia.org/resource/Salzburg"/>
        <rdaGr2:dateOfDeath>1791-12-05</rdaGr2:dateOfDeath>
        <rdaGr2:placeOfDeath rdf:resource="http://dbpedia.org/resource/Vienna"/>
        <rdaGr2:gender>Male</rdaGr2:gender>

        <rdaGr2:biographicalInformation xml:lang="en">Wolfgang Amadeus Mozart (German: [ˈvɔlfɡaŋ amaˈdeus ˈmoːtsaʁt], English see fn.; 27 January 1756 – 5 December 1791), baptised as Johannes Chrysostomus Wolfgangus Theophilus Mozart, was a prolific and influential composer of the Classical era.Mozart showed prodigious ability from his earliest childhood. Already competent on keyboard and violin, he composed from the age of five and performed before European royalty. At 17, he was engaged as a court musician in Salzburg, but grew restless and travelled in search of a better position, always composing abundantly. While visiting Vienna in 1781, he was dismissed from his Salzburg position. He chose to stay in the capital, where he achieved fame but little financial security. During his final years in Vienna, he composed many of his best-known symphonies, concertos, and operas, and portions of the Requiem, which was largely unfinished at the time of his death. The circumstances of his early death have been much mythologized. He was survived by his wife Constanze and two sons.He composed over 600 works, many acknowledged as pinnacles of symphonic, concertante, chamber, operatic, and choral music. He is among the most enduringly popular of classical composers, and his influence on subsequent Western art music is profound; Beethoven composed his own early works in the shadow of Mozart, and Joseph Haydn wrote that "posterity will not see such a talent again in 100 years."</rdaGr2:biographicalInformation>
        <rdaGr2:biographicalInformation xml:lang="nl">Wolfgang Amadeus Mozart (Salzburg, 27 januari 1756 – Wenen, 5 december 1791), eigenlijk Joannes Chrysostomus Wolfgangus Theophilus Mozart, was een uit het prinsaartsbisdom Salzburg (in het tegenwoordige Oostenrijk) afkomstige componist, pianist, violist en dirigent.Mozart was een wonderkind, dat op uitzonderlijk jonge leeftijd viool, klavecimbel en orgel speelde en kwalitatief hoogstaand werk componeerde. Mozart wordt naast Johan Sebastian Bach en Ludwig van Beethoven gerekend tot de componisten die binnen een traditie nieuwe muzikale concepten bedachten en die diepgaande invloed uitoefenden op alle na hen komende componisten.Mozarts werk wordt gerekend tot de muziek van de klassieke periode. Samen met Joseph Haydn en Ludwig van Beethoven vormt hij, muziekhistorisch gezien, de Eerste Weense School.</rdaGr2:biographicalInformation>
        <rdaGr2:biographicalInformation xml:lang="pt">Wolfgang Amadeus Mozart (AFI: [ˈvɔlfgaŋ amaˈdeus ˈmoːtsart], batizado Joannes Chrysostomus Wolfgangus Theophilus Mozart; Salzburgo, 27 de janeiro de 1756 – Viena, 5 de dezembro de 1791) foi um prolífico e influente compositor austríaco do período clássico. Mozart mostrou uma habilidade musical prodigiosa desde sua infância. Já competente nos instrumentos de teclado e no violino, começou a compor aos cinco anos de idade, e passou a se apresentar para a realeza europeia, maravilhando a todos com seu talento precoce. Chegando à adolescência, foi contratado como músico da corte em Salzburgo, porém as limitações da vida musical na cidade o impeliram a buscar um novo cargo em outras cortes, mas sem sucesso. Ao visitar Viena em 1781 com seu patrão, desentendeu-se com ele e solicitou demissão, optando por ficar na capital, onde, ao longo do resto de sua vida, conquistou fama, porém pouca estabilidade financeira. Seus últimos anos viram surgir algumas de suas sinfonias, concertos e óperas mais conhecidos, além de seu Requiem. As circunstâncias de sua morte prematura deram origem a diversas lendas. Deixou uma esposa, Constanze, e dois filhos. Foi autor de mais de seiscentas obras, muitas delas referenciais na música sinfônica, concertante, operística, coral, pianística e camerística. Sua produção foi louvada por todos os críticos de sua época, embora muitos a considerassem excessivamente complexa e difícil, e estendeu sua influência sobre vários outros compositores ao longo de todo o século XIX e início do século XX. Hoje Mozart é visto pela crítica especializada como um dos maiores compositores do ocidente, conseguiu conquistar grande prestígio mesmo entre os leigos, e sua imagem se tornou um ícone popular.</rdaGr2:biographicalInformation>
        <rdaGr2:biographicalInformation>Wolfgang Amadeus Mozart, cuyo nombre completo era Joannes Chrysostomus Wolfgangus Theophilus Mozart, (Salzburgo, 27 de enero de 1756-Viena, 5 de diciembre de 1791), fue un compositor y pianista austriaco, maestro del Clasicismo, considerado como uno de los músicos más influyentes y destacados de la historia. La obra mozartiana abarca todos los géneros musicales de su época y alcanza más de seiscientas creaciones, en su mayoría reconocidas como obras maestras de la música sinfónica, concertante, de cámara, para piano, operística y coral, logrando una popularidad y difusión universales.En su niñez más temprana en Salzburgo, Mozart mostró una capacidad prodigiosa en el dominio de instrumentos de teclado y del violín. Con tan solo cinco años ya componía obras musicales y sus interpretaciones eran del aprecio de la aristocracia y realeza europea. A los diecisiete años fue contratado como músico en la corte de Salzburgo, pero su inquietud le llevó a viajar en busca de una mejor posición, siempre componiendo de forma prolífica. Durante su visita a Viena en 1781, tras ser despedido de su puesto en la corte, decidió instalarse en esta ciudad donde alcanzó la fama que mantuvo el resto de su vida, a pesar de pasar por situaciones financieras difíciles. En sus años finales, compuso muchas de sus sinfonías, conciertos y óperas más conocidas, así como su Réquiem. Las circunstancias de su temprana muerte han sido objeto de numerosas especulaciones y elevadas a la categoría de mito. En palabras de críticos de música como Nicholas Till, Mozart siempre aprendía vorazmente de otros músicos y desarrolló un esplendor y una madurez de estilo que abarcó desde la luz y la elegancia, a la oscuridad y la pasión —todo bien fundado por una visión de la humanidad «redimida por el arte, perdonada y reconciliada con la naturaleza y lo absoluto»—. Su influencia en toda la música occidental posterior es profunda; Ludwig van Beethoven escribió sus primeras composiciones a la sombra de Mozart, de quien Joseph Haydn escribió que «la posteridad no verá tal talento otra vez en cien años».</rdaGr2:biographicalInformation>

        <owl:sameAs rdf:resource="http://nl.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://pt.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://es.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://wikidata.org/entity/Q254"/>
        <owl:sameAs rdf:resource="http://yago-knowledge.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://rdf.freebase.com/ns/m.082db"/>

    </edm:Agent>

</rdf:RDF>
```
_Result_
```
<rdf:RDF
    xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:sh="http://www.w3.org/ns/shacl#" > 
  <rdf:Description rdf:nodeID="A0">
    <sh:severity rdf:resource="http://www.w3.org/ns/shacl#Warning"/>
    <sh:subject rdf:resource="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
    <sh:sourceTemplate rdf:resource="http://www.w3.org/ns/shacl#AbstractDatatypePropertyConstraint"/>
    <sh:sourceShape rdf:resource="http://www.europeana.eu/schemas/edm/shapes/external/Agent#base"/>
    <sh:object>Wolfgang Amadeus Mozart</sh:object>
    <sh:predicate rdf:resource="http://www.w3.org/2004/02/skos/core#prefLabel"/>
    <sh:focusNode rdf:resource="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
    <rdf:type rdf:resource="http://www.w3.org/ns/shacl#ValidationResult"/>
    <sh:message>Values must have datatype rdf:langString</sh:message>
    <sh:sourceConstraint rdf:resource="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_prefLabel#datatype"/>
  </rdf:Description>
  <rdf:Description rdf:nodeID="A1">
    <sh:object>Mozart, Wolfgang Amadeus</sh:object>
    <sh:sourceConstraint rdf:resource="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#datatype"/>
    <sh:sourceShape rdf:resource="http://www.europeana.eu/schemas/edm/shapes/external/Agent#base"/>
    <rdf:type rdf:resource="http://www.w3.org/ns/shacl#ValidationResult"/>
    <sh:message>Values must have datatype rdf:langString</sh:message>
    <sh:severity rdf:resource="http://www.w3.org/ns/shacl#Warning"/>
    <sh:subject rdf:resource="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
    <sh:predicate rdf:resource="http://www.w3.org/2004/02/skos/core#altLabel"/>
    <sh:focusNode rdf:resource="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
    <sh:sourceTemplate rdf:resource="http://www.w3.org/ns/shacl#AbstractDatatypePropertyConstraint"/>
  </rdf:Description>
</rdf:RDF>
```

#### Test Case: <a id="agent_labels_redundant.xml" target="_blank" href="/shapes-edm/src/test/resources/etc/edm/data/external/agent_labels_redundant.xml">agent_labels_redundant.xml</a>

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
         xmlns:edm="http://www.europeana.eu/schemas/edm/"
         xmlns:dc="http://purl.org/dc/elements/1.1/"
         xmlns:dcterms="http://purl.org/dc/terms/"
         xmlns:ebucore="http://www.ebu.ch/metadata/ontologies/ebucore/ebucore#"
         xmlns:ore="http://www.openarchives.org/ore/terms/"
         xmlns:skos="http://www.w3.org/2004/02/skos/core#"
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
        <skos:altLabel xml:lang="en">Wolfgang Amadeus Mozart</skos:altLabel>

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

        <owl:sameAs rdf:resource="http://nl.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://pt.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://es.dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://wikidata.org/entity/Q254"/>
        <owl:sameAs rdf:resource="http://yago-knowledge.org/resource/Wolfgang_Amadeus_Mozart"/>
        <owl:sameAs rdf:resource="http://rdf.freebase.com/ns/m.082db"/>

    </edm:Agent>

</rdf:RDF>
```
_Result_
```
<rdf:RDF
    xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:sh="http://www.w3.org/ns/shacl#" > 
  <rdf:Description rdf:nodeID="A0">
    <sh:message>Value sets of skos:altLabel and  must not share equal values</sh:message>
    <rdf:type rdf:resource="http://www.w3.org/ns/shacl#ValidationResult"/>
    <sh:sourceTemplate rdf:resource="http://www.w3.org/ns/shacl#AbstractNotEqualsPropertyConstraint"/>
    <sh:predicate rdf:resource="http://www.w3.org/2004/02/skos/core#altLabel"/>
    <sh:sourceConstraint rdf:resource="http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#redundancy"/>
    <sh:severity rdf:resource="http://www.w3.org/ns/shacl#Warning"/>
    <sh:focusNode rdf:resource="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
    <sh:object xml:lang="en">Wolfgang Amadeus Mozart</sh:object>
    <sh:sourceShape rdf:resource="http://www.europeana.eu/schemas/edm/shapes/external/Agent#base"/>
    <sh:subject rdf:resource="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart"/>
  </rdf:Description>
</rdf:RDF>
```

#### Test Case: <a id="agent_ok1.xml" target="_blank" href="/shapes-edm/src/test/resources/etc/edm/data/external/agent_ok1.xml">agent_ok1.xml</a>

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
_Result_
```
<rdf:RDF
    xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
    xmlns:sh="http://www.w3.org/ns/shacl#" > 
</rdf:RDF>
```

#### Test Case: <a id="agent_prop_types.xml" target="_blank" href="/shapes-edm/src/test/resources/etc/edm/data/external/agent_prop_types.xml">agent_prop_types.xml</a>

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
         xmlns:edm="http://www.europeana.eu/schemas/edm/"
         xmlns:dc="http://purl.org/dc/elements/1.1/"
         xmlns:dcterms="http://purl.org/dc/terms/"
         xmlns:ore="http://www.openarchives.org/ore/terms/"
         xmlns:foaf="http://xmlns.com/foaf/0.1/"
         xmlns:rdaGr2="http://rdvocab.info/ElementsGr2/"
         xmlns:skos="http://www.w3.org/2004/02/skos/core#"
         xmlns:owl="http://www.w3.org/2002/07/owl#"
         >

    <edm:Agent rdf:about="http://dbpedia.org/resource/Wolfgang_Amadeus_Mozart">

        <skos:prefLabel rdf:resource="http://dbpedia.org/resource/xpto"/>
        <skos:altLabel rdf:resource="http://dbpedia.org/resource/xpto"/>
        <skos:note rdf:resource="http://dbpedia.org/resource/xpto"/>
        <dc:identifier rdf:resource="http://dbpedia.org/resource/xpto"/>
        <dcterms:hasPart>xpto</dcterms:hasPart>
        <dcterms:isPartOf>xpto</dcterms:isPartOf>
        <foaf:name rdf:resource="http://dbpedia.org/resource/xpto"/>
        <rdaGr2:biographicalInformation rdf:resource="http://dbpedia.org/resource/xpto"/>
        <rdaGr2:dateOfBirth rdf:resource="http://dbpedia.org/resource/xpto"/>
        <rdaGr2:dateOfDeath rdf:resource="http://dbpedia.org/resource/xpto"/>
        <rdaGr2:dateOfEstablishment rdf:resource="http://dbpedia.org/resource/xpto"/>
        <rdaGr2:dateOfTermination rdf:resource="http://dbpedia.org/resource/xpto"/>
        <rdaGr2:gender rdf:resource="http://dbpedia.org/resource/xpto"/>
        <edm:begin rdf:resource="http://dbpedia.org/resource/xpto"/>
        <edm:end rdf:resource="http://dbpedia.org/resource/xpto"/>
        <edm:hasMet>xpto</edm:hasMet>
        <edm:isRelatedTo>xpto</edm:isRelatedTo>
        <owl:sameAs>xpto</owl:sameAs>

    </edm:Agent>

</rdf:RDF>
```
_Result_``