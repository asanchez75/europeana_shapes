# Shapes definitions for EDM (external)
*This document was generated from the [shapes file](../../src/main/resources/etc/edm/shapes/external/EDM.ttl)* using this 
[software](/shapes-doc)

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

- **One shapes file per EDM class:** A shapes ontology was created for each EDM
class, in order to split the shapes definition for EDM into smaller and 
manageable files. Each file corresponds then to a sub-ontology which is linked to 
(using the *owl:imports* property) from the main ontology file defined in 
[EDM.ttl](../../src/main/resources/etc/edm/shapes/external/EDM.ttl).

- **Constraints are isolated per EDM requirement:** Each rule is expressed in 
a separate constraint or shape so that they are identifiable and may have their 
own descriptive information (metadata).

## Metadata and Classification

#### Syntax for identifiers

The following syntax was defined to all constraints that relate to an EDM 
validation requirement, in particular:

- for constraints that are applied to a class:
> \<namespace\>/\<classname\>#\<category\>

- for constraints specific to a property: 
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

## Testing and Reporting

So that we could test the EDM shape definitions and the validation output, we 
have created a test suite for each of the EDM classes:
- ~~[ore:Aggregation](../tests/Aggregation.md)~~
- ~~[edm:ProvidedCHO](../tests/ProvidedCHO.md)~~
- ~~[edm:WebResource](../tests/WebResource.md)~~
- [edm:Agent](../tests/Agent.md)
- ~~[edm:Place](../tests/Place.md)~~
- [skos:Concept](../tests/Concept.md)
- ~~[edm:TimeSpan](../tests/TimeSpan.md)~~

Besides testing, we have already started to work on reports that aggregate
the result of a validation over a full dataset:
- [DBpedia Concepts Dataset](../reports/DBpediaConcepts.md)
- [DBpedia Agents Dataset](../reports/DBpediaAgents.md)

## Known limitations and possible improvements

We identified the following limitations while using SHACL to express the EDM
validation requirements:

- ~~**Comparison constraints are limited to datatyped literals:** SHACL provides
functions to compare datatyped literal (e.g. sh:lessThan, sh:equals, sh:notEquals) values between properties. It uses the associated datatype to determine how the 
values can be compared, which is the typical behaviour for typed programming 
languages. However, most properties defined or adopted by EDM do not prescribe a
datatype, in particular, all date related properties (dc:date, dcterms:created, 
rdaGr2:dateOfBirth, etc.) and geospatial coordinates (wgs_pos). This brings an 
additional challenge as for some of them the values should obey to a 
specific format (e.g. geospatial coordinates) even though not explicit stated 
through a datatype, but for others there may be more than one format possible 
(e.g. dc:date). In both cases, there should be a way to make the datatype 
explicit or be determined so that comparative functions can still be applied.~~
~~
> Looking at the EDM requirements, the following should be supported:
> *"Check that, if edm:begin and edm:end are present in an edm:Agent, edm:begin 
must be earlier than edm:end."*~~


- **Constraints are limited to a single focus node:** typically, a SHACL 
constraint is applied to a focus node and the value range of a property. 
The only way to get around it, is to define templates using SPARQL 
which greatly opens the expressive power of SHACL. However, using SPARQL 
looses the declarative advantage of using SHACL in the first place, especially
given that in many situations the only thing missing is a way to select a second
focus node.
> Here is an example of an EDM constraint that requires two focus nodes, one 
> for a edm:WebResource and a second for an edm:ProvidedCHO:
> *"Check that dcterms:created of a edm:WebResource is equal or earlier than 
> dcterms:issued and dcterms:created of the edm:ProvidedCHO"*. If the check 
> applied just to edm:WebResource (i.e. a single focus node), it could be 
> expressed in the following way: 
> ```
> :constraint
>   a sh:PropertyConstraint ;
>   sh:predicate dcterms:created ;
>   sh:lessThanOrEqual dcterms:issue ;
>.
> ``` 



Besides the two points mentioned above as limitations, there are some features
missing to SHACL which could greatly help improve the expressiveness of the 
language, like the following:

- **Shapes are limited to resource nodes:** The same way as shapes can be 
defined for resources, there should also be a way to define shapes that apply to
literals, but also, to xml:lang. The main interest of this option is to be able 
to reuse such shapes on several properties, or even, over a full range of literals
using scopes.
> As an example, in EDM there are a significant number of properties whose 
> values are dates, for which, we would like to validate against the same 
> pattern. The following pattern 
> ```sh:pattern "^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$" ;``` 
> was defined for dates, but could be further expanded to consider correct 
> values for day, month, etc. 


- **Missing (some) inverse comparison properties:** SHACL defines properties for 
comparing datatyped literals such as sh:equals, sh:lessThan and sh:lessThanOrEqual,
 but is missing their inverse (e.g. sh:moreThan) with the exception of sh:equals
(ie. notEquals). For the sake of consistency and also because there can be 
situations where inverting the order may not be ideal, such functions should be
available.

- **Better support for disjointness of properties:** It is possible to define
that the range of two properties is disjoint using the sh:notEquals. However,
in case several properties must be disjoint amongst each other, it is necessary
to create a sh:PropertyConstraint for each pair of properties, namely C(n,2).
This could be simplified if sh:notEquals could be used more than once per 
sh:PropertyConstraint. Another option would be to define a function at the level
of a shape stating the group of properties that must be pairwise disjoint.
> As an example, in EDM all SKOS relation properties should be disjoint, namely: 
> skos:broadMatch, skos:narrowMatch, skos:relatedMatch, skos:broader, 
> skos:narrower, skos:related, skos:exactMatch, skos:closeMatch
