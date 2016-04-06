## Validation report for the DBpediaAgents dataset
_This document was generated using this [software](/shapes-doc)_

### About the Dataset

This [Dataset]
(/shapes-edm/src/test/resources/etc/edm/datasets/data/DBpediaAgents.xml) 
is a sample (2097) of a selective harvest from [DBPedia](http://wiki.dbpedia.org) 
containing only resources of type edm:Agent and which is currently being used as 
the target of [Semantic Enrichment](https://docs.google.com/document/d/1JvjrWMTpMIH7WnuieNqcT0zpJAXUPo6x4uMBj1pEx0Y) 
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
<tr><td><div style='padding-left:40px'>There must be at most one edm:end</div></td>
<td align='right'>46</td><td align='right'>46</td></tr>
<tr><td><div style='padding-left:40px'>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</div></td>
<td align='right'>291</td><td align='right'>296</td></tr>
<tr><td><div style='padding-left:40px'>Values for edm:isRelatedTo must be Resources</div></td>
<td align='right'>6</td><td align='right'>17</td></tr>
<tr><td><div style='padding-left:40px'>There must be at most one rdaGr2:dateOfBirth</div></td>
<td align='right'>94</td><td align='right'>94</td></tr>
<tr><td><div style='padding-left:40px'>rdaGr2:dateOfBirth must be earlier or equals than 
                    rdaGr2:dateOfDeath</div></td>
<td align='right'>16</td><td align='right'>20</td></tr>
<tr><td><div style='padding-left:40px'>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</div></td>
<td align='right'>578</td><td align='right'>589</td></tr>
<tr><td><div style='padding-left:40px'>There must be at most one rdaGr2:dateOfDeath</div></td>
<td align='right'>46</td><td align='right'>46</td></tr>
<tr><td><div style='padding-left:40px'>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</div></td>
<td align='right'>291</td><td align='right'>296</td></tr>
<tr><td><div style='padding-left:40px'>There must be at most one rdaGr2:placeOfBirth</div></td>
<td align='right'>637</td><td align='right'>637</td></tr>
<tr><td><div style='padding-left:40px'>There must be at most one rdaGr2:placeOfDeath</div></td>
<td align='right'>192</td><td align='right'>192</td></tr>
<table>


