# Shapes Definitions for EDM (External)
*This document was generated from the [shapes file](../../src/main/resources/etc/edm/shapes/external/EDM.ttl)*

This document presents all shape definitions that make up EDM (in the form 
which we call informally as external). It  is composed of the following 
documents, one for each EDM class:
- [ore:Aggregation](Aggregation.md)
- [edm:ProvidedCHO](ProvidedCHO.md)
- [edm:WebResource](WebResource.md)
- [edm:Agent](Agent.md)
- [edm:Place](Place.md)
- [skos:Concept](Concept.md)
- [edm:TimeSpan](TimeSpan.md)

## Design choices

This section explains the main design choices:

- **One shapes file per class:** A shapes ontology was created for each class
in order to split the complete shapes definition for EDM into smaller and 
manageable files. Each file corresponds to a sub-ontology which is linked 
(using the *owl:imports* property) to through the main ontology file defined in 
[EDM.ttl](../../src/main/resources/etc/edm/shapes/external/EDM.ttl).

- **Constraints are isolated:** Each rule is expressed in a separate constraint
or shape so that they are identifiable and have their own descriptive 
information (metadata).
- syntax for identifiers

## Metadata and Classification

### Identifiers

http://www.europeana.eu/schemas/edm/shapes/external/Agent/skos_altLabel#cardinality

### Classification

*Work in progress...*

## Known limitations and possible improvements

We identified the following limitations while using SHACL to express EDM
validation requirements:

- **Comparison constraints limited to datatyped literals:** SHACL provides
functions to compare datatyped literal (e.g. sh:lessThan, sh:equals, sh:notEquals) values between properties. It uses the associated datatype to determine how the 
values can be compared, which is the typical behaviour for typed programming 
languages. However, most properties defined or adopted by EDM do not prescribe a
datatype, in particular, all date related properties (dc:date, dcterms:created, 
rdaGr2:dateOfBirth, etc.) and geospatial coordinates (wgs_pos). This brings an 
additional challenge as for some of them the values should in fact obey to a 
specific format (e.g. geospatial coordinates) even though not explicit stated 
through a datatype, but for others there may be more than one format possible 
(e.g. dc:date). In both cases, there should be a way to make the datatype 
explicit or be determined so that comparative functions can still be applied. 
> Looking at the EDM requirements, the following should be supported:
> *Check that if edm:begin and edm:end are defined to an edm:Agent, edm:begin 
must be earlier than edm:end.*
>

- **Constraints are limited to a single focus node:** typically, a SHACL 
constraint is applied to a focus node and the value range of a property. 
The only way to get around it, is to define constraint templates using SPARQL 
which greatly increases the expressive power of the language. However,
it is cumbersome to define it using SPARQL if there could be a simpler, declarative
way to express them, especially when only a second focus node is needed.
> Let me explain with an example from EDM (it is now expressed using SPARQL here):
>
> *Check that dcterms:created of a edm:WebResource is equal or earlier than dcterms:issued and dcterms:created in edm:ProvidedCHO*
> 
> The only thing missing to express it in a declarative way is the second focus
> node for the resource(s) with rdf:type edm:ProvidedCHO.


Besides the two points mentioned above as limitations, there are some features
missing to SHACL which could greatly help improve the expressiveness of the 
language, like the following:

- **Shapes are limited to resource nodes:** The same way as shapes can be 
defined for resources, there should also be a way to define shapes that apply to
literals. The main interest of this option is to be able to reuse such shapes on 
more than one constraints.

> As an example and looking again at EDM, there are a 
> significant number of properties whose values are dates, for which, we would 
> like to validate against the same pattern. The 
> following pattern ```sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;``` 
> was defined for dates, but could be further expanded to consider correct 
> values for day, month, etc. 
> 

- **Missing some inverse comparison properties:** SHACL defines properties for 
comparing datatyped values such as sh:equals, sh:lessThan and sh:lessThanOrEqual
, but is missing their inverse (e.g. sh:moreThan) with the exception of sh:equals
(ie. notEquals). For the sake of consistency and also because there can be 
situations where inverting the order may not be ideal, such functions should be
available.

- **Better support for disjointness of properties:** 

- can I use notEquals more than once for the same property constraint?


