| Property | Cardinality | Constraints |
|http://www.europeana.eu/schemas/edm/ProvidedCHO||
|http://purl.org/dc/elements/1.1/contributor|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/contributor#cardinality)[range-class](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/contributor#range-class)|
|http://purl.org/dc/elements/1.1/coverage|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/coverage#cardinality)[quality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/coverage#quality)[range-class](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/coverage#range-class)|
|http://purl.org/dc/elements/1.1/creator|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/creator#cardinality)[range-class](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/creator#range-class)|
|http://purl.org/dc/elements/1.1/date|1..1|[quality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/date#quality)[range-class](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/date#range-class)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/date#cardinality)[literal](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/date#literal)|
|http://purl.org/dc/elements/1.1/description|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/description#cardinality)|
|http://purl.org/dc/elements/1.1/format|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/format#cardinality)[correlation](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edmtype#correlation)|
|http://purl.org/dc/elements/1.1/identifier|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/identifier#cardinality)[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/identifier#type)|
|http://purl.org/dc/elements/1.1/language|1..1|[values](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/language#values)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/language#cardinality)[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/language#type)|
|http://purl.org/dc/elements/1.1/publisher|1..1|[range-class](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/publisher#range-class)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/publisher#cardinality)[range-class](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/subject#range-class)|
|http://purl.org/dc/elements/1.1/rights|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/rights#cardinality)
        
        
        
        R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION
        Check if dc:rights has the same value than edm:rights either
                    as rdf:resource or literal, if yes the field is 
                    redundant
        
      |
|http://purl.org/dc/elements/1.1/subject|1..1|[multiplevalue](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/subject#multiplevalue)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/subject#cardinality)|
|http://purl.org/dc/elements/1.1/title|1..1|[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/title#type)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/title#cardinality)|
|http://purl.org/dc/elements/1.1/type|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dctype#cardinality)[range-class](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/dctype#range-class)|
|http://purl.org/dc/terms/alternative|1..1|
        Redundant dcterms:alternative
        
        
        
        R-224-USE-SUB-SUPER-RELATIONS-IN-VALIDATION
        If dcterms:alternative has the same title than dc:title, 
                    then dcterms:alternative is redundant.
        
      [type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/alternative#type)|
|http://purl.org/dc/terms/conformsTo|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/conformsTo#cardinality)|
|http://purl.org/dc/terms/created|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/created#cardinality)[correlation](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/created#correlation)|
|http://purl.org/dc/terms/extent|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/extent#cardinality)|
|http://purl.org/dc/terms/hasFormat|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/hasFormat#cardinality)|
|http://purl.org/dc/terms/hasPart|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/hasPart#cardinality)|
|http://purl.org/dc/terms/hasVersion|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/hasVersion#cardinality)|
|http://purl.org/dc/terms/isFormatOf|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isFormatOf#cardinality)|
|http://purl.org/dc/terms/isPartOf|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isPartOf#cardinality)|
|http://purl.org/dc/terms/isReferencedBy|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isReferencedBy#cardinality)|
|http://purl.org/dc/terms/isReplacedBy|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isReplacedBy#cardinality)|
|http://purl.org/dc/terms/isRequiredBy|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isRequiredBy#cardinality)|
|http://purl.org/dc/terms/isVersionOf|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isVersionOf#cardinality)|
|http://purl.org/dc/terms/issued|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/issued#cardinality)|
|http://purl.org/dc/terms/medium|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/medium#cardinality)|
|http://purl.org/dc/terms/provenance|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/provenance#cardinality)|
|http://purl.org/dc/terms/references|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/references#cardinality)|
|http://purl.org/dc/terms/replaces|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/replaces#cardinality)|
|http://purl.org/dc/terms/requires|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/requires#cardinality)|
|http://purl.org/dc/terms/spatial|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/spatial#cardinality)|
|http://purl.org/dc/terms/tableOfContents|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/tableOfContents#cardinality)|
|http://purl.org/dc/terms/temporal|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/temporal#cardinality)|
|http://www.europeana.eu/schemas/edm/aggregatedCHO|1..1|
        1
        1
        
        
        R-225-Validation-of-class-association
        
        Check that the URI of the ProvidedCHO and the URI described 
                    in edm:aggregatedCHO are the same.
      |
|http://www.europeana.eu/schemas/edm/currentLocation|1..1|[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/currentLocation#type)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/currentLocation#cardinality)|
|http://www.europeana.eu/schemas/edm/hasMet|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/hasMet#cardinality)[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/hasMet#type)|
|http://www.europeana.eu/schemas/edm/hasType|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/hasType#cardinality)|
|http://www.europeana.eu/schemas/edm/incorporates|1..1|[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/incorporates#type)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/incorporates#cardinality)|
|http://www.europeana.eu/schemas/edm/isDerivativeOf|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isDerivativeOf#cardinality)[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isDerivativeOf#type)|
|http://www.europeana.eu/schemas/edm/isNextInSequence|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isNextInSequence#cardinality)[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isNextInSequence#type)[range-class](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isNextInSequence#range-class)[correlation](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isNextInSequence#correlation)|
|http://www.europeana.eu/schemas/edm/isRelatedTo|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isRelatedTo#cardinality)|
|http://www.europeana.eu/schemas/edm/isRepresentationOf|1..1|[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isRepresentationOf#type)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isRepresentationOf#cardinality)|
|http://www.europeana.eu/schemas/edm/isSimilarTo|1..1|[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isSimilarTo#type)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isSimilarTo#cardinality)|
|http://www.europeana.eu/schemas/edm/isSuccessorOf|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isSuccessorOf#cardinality)[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/isSuccessorOf#type)|
|http://www.europeana.eu/schemas/edm/realizes|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/realizes#cardinality)[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/realizes#type)|
|http://www.europeana.eu/schemas/edm/tableOfContents|1..1|[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/tableOfContents#type)|
|http://www.europeana.eu/schemas/edm/type|1..1|[values](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edmtype#values)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edmtype#cardinality)[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/edmtype#type)|
|http://www.europeana.eu/schemas/edm/ugc|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/ugc#cardinality)[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/ugc#type)|
|http://www.europeana.eu/schemas/edm/unstored|1..1|[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/unstored#type)[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/unstored#cardinality)|
|http://www.w3.org/2002/07/owl#sameAs|1..1|[cardinality](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/sameAs#cardinality)[type](#http://www.europeana.eu/schemas/edm/shapes/external/ProvidedCHO/sameAs#type)|
|http://www.europeana.eu/schemas/edm/Agent||
