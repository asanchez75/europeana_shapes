# Shapes definitions for EDM (external)
*This document was generated from the [shapes file](../../src/main/resources/etc/edm/shapes/external/EDM.ttl)*

This document presents all shape definitions that make up EDM (in the form 
which we informally call as external). It is composed of the following 
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

- **One shapes file per EDM class:** A shapes ontology was created for each 
class in order to split the complete shapes definition for EDM into smaller and 
manageable files. Each file corresponds to a sub-ontology which is linked 
(using the *owl:imports* property) to through the main ontology file defined in 
[EDM.ttl](../../src/main/resources/etc/edm/shapes/external/EDM.ttl).

- **Constraints are isolated per EDM requirement:** Each rule is expressed in 
a separate constraint or shape so that they are identifiable and may have their 
own descriptive information (metadata).

## Metadata and Classification

#### Syntax for identifiers

The following syntax was defined to all constraints that relate to an EDM 
validation requirement:

- in particular, for general constraints applied to a class:
> \<namespace\>/\<classname\>#\<category\>

- and for constraints specific to a property: 
> \<namespace\>/\<classname\>/\<property\>#\<category\>

Where:
- **namespace:** is the base URI for the EDM SHACL ontology.
- **classname:** is the name of the EDM class (without a namespace prefix)
- **property:** is the prefixed name of the property being constrained within the scope of a class
- **category:** is a keyword that differentiates the contraint by its category (see Section below)

Examples:
> http://www.europeana.eu/schemas/shapes/external/ProvidedCHO#type
> http://www.europeana.eu/schemas/shapes/external/ProvidedCHO/dc_contributor#cardinality


#### Classification

*Work in progress...*

## Known limitations and possible improvements

We identified the following limitations while using SHACL to express the EDM
validation requirements:

- **Comparison constraints limited to datatyped literals:** SHACL provides
functions to compare datatyped literal (e.g. sh:lessThan, sh:equals, sh:notEquals) values between properties. It uses the associated datatype to determine how the 
values can be compared, which is the typical behaviour for typed programming 
languages. However, most properties defined or adopted by EDM do not prescribe a
datatype, in particular, all date related properties (dc:date, dcterms:created, 
rdaGr2:dateOfBirth, etc.) and geospatial coordinates (wgs_pos). This brings an 
additional challenge as for some of them the values should obey to a 
specific format (e.g. geospatial coordinates) even though not explicit stated 
through a datatype, but for others there may be more than one format possible 
(e.g. dc:date). In both cases, there should be a way to make the datatype 
explicit or be determined so that comparative functions can still be applied. 
> Looking at the EDM requirements, the following should be supported:
> *Check that if edm:begin and edm:end are present in an edm:Agent, edm:begin 
must be earlier than edm:end.*


- **Constraints are limited to a single focus node:** typically, a SHACL 
constraint is applied to a focus node and the value range of a property. 
The only way to get around it, is to define templates using SPARQL 
which greatly opens the expressive power of the SHACL. However, using SPARQL 
looses the declarative advantage of using SHACL in the first place, especially
given that in many situations the only thing missing is a way to select a second
focus node.
> Here is an example of an EDM constraint that requires two focus nodes, one 
> for a edm:WebResource and a second for an edm:ProvidedCHO:
>
> *Check that dcterms:created of a edm:WebResource is equal or earlier than dcterms:issued and dcterms:created in edm:ProvidedCHO*
> 
> If the check applied to a single focus node (i.e. edm:WebResource), it could
> be expressed in the following way: 
> 
```
:contraint
  a sh:PropertyConstraint ;
  sh:predicate dct:created ;
  sh:lessThanOrEqual dct:issue ;
.
```


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


