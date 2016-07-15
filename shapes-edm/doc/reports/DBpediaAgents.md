## Validation report for the DBpediaAgents dataset
_This document was generated using this [software](/shapes-doc)_

### About the Dataset

This [Dataset]
(/shapes-edm/src/test/resources/etc/edm/datasets/data/DBpediaAgents.xml) 
is a sample (composed of 2097 resources) of a selective harvest from 
[DBPedia](http://wiki.dbpedia.org) containing only resources of type edm:Agent 
and which is currently being used as the target of [Semantic Enrichment](https://docs.google.com/document/d/1JvjrWMTpMIH7WnuieNqcT0zpJAXUPo6x4uMBj1pEx0Y) 
at Europeana.

### Validaton Report

The table below shows an overview of the constraint violations that were 
identified when applying the [EDM shape definitions](../shapes) using 
[TopBraid SHACL](http://github.com/TopQuadrant/shacl) validator. 
The results are grouped first by the type of resource and then by violating 
constraint. The complete list of results is stored in this 
[file](/shapes-edm/src/test/resources/etc/edm/datasets/results/DBpediaAgents.xml).

<table><tr><th>List of constraints that were violated</th>
<th>Nr. of resources</th><th>Nr. of violations</th></tr><tr><th align='left' colspan='3' style='padding-left:20px'>Violated constraints related to class edm:Agent</th>
</tr>
<tr><td><div style='padding-left:40px'><a href='/shapes-edm/doc/shapes/Agent.md#edm_end_cardinality'>There must be at most one edm:end</a></div></td>
<td align='right'>46</td><td align='right'>46</td></tr>
<tr><td><div style='padding-left:40px'><a href='/shapes-edm/doc/shapes/Agent.md#edm_isRelatedTo_type'>Values for edm:isRelatedTo must be Resources</a></div></td>
<td align='right'>6</td><td align='right'>17</td></tr>
<tr><td><div style='padding-left:40px'><a href='/shapes-edm/doc/shapes/Agent.md#rdaGr2_dateOfBirth_cardinality'>There must be at most one rdaGr2:dateOfBirth</a></div></td>
<td align='right'>94</td><td align='right'>94</td></tr>
<tr><td><div style='padding-left:40px'><a href='/shapes-edm/doc/shapes/Agent.md#rdaGr2_dateOfDeath_cardinality'>There must be at most one rdaGr2:dateOfDeath</a></div></td>
<td align='right'>46</td><td align='right'>46</td></tr>
<tr><td><div style='padding-left:40px'><a href='/shapes-edm/doc/shapes/Agent.md#rdaGr2_placeOfBirth_cardinality'>There must be at most one rdaGr2:placeOfBirth</a></div></td>
<td align='right'>637</td><td align='right'>637</td></tr>
<tr><td><div style='padding-left:40px'><a href='/shapes-edm/doc/shapes/Agent.md#rdaGr2_placeOfDeath_cardinality'>There must be at most one rdaGr2:placeOfDeath</a></div></td>
<td align='right'>192</td><td align='right'>192</td></tr>
<table>


