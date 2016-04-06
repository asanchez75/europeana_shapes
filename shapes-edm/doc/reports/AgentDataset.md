## Validation report for dataset AgentDataset.xml
_This document was generated using this [software](/shapes-doc)_

### About the Dataset

This [dataset]
(/shapes-edm/src/test/resources/etc/edm/datasets/data/AgentDataset.xml) 
is a sample of a selective harvest from DBPedia containing only
resources of type edm:Agent and which is currenly being used as the target of
[semantic enrichment](https://docs.google.com/document/d/1JvjrWMTpMIH7WnuieNqcT0zpJAXUPo6x4uMBj1pEx0Y) 
at Europeana.

### Validaton Report

The table below shows an overview of the constraint violations that were 
identified when applying the [EDM shape definitions](../shapes). 
The results are grouped first by the type of resource and then by violating 
constraint. The complete list of results is stored in this 
[file](/shapes-edm/src/test/resources/etc/edm/datasets/results/AgentDataset.xml).

<table><tr><td></td>
<td>Nr. of resources</td><td>Nr. of violations</td></tr><tr><th align='left' colspan='3' style='padding-left:20px'>Violated constraints related to class edm:Agent</th>
</tr>
<tr><td><p style='padding-left:40px'>There must be at most one edm:end</p></td>
<td align='right'>46</td><td align='right'>46</td></tr>
<tr><td><p style='padding-left:40px'>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</p></td>
<td align='right'>291</td><td align='right'>296</td></tr>
<tr><td><p style='padding-left:40px'>Values for edm:isRelatedTo must be Resources</p></td>
<td align='right'>6</td><td align='right'>17</td></tr>
<tr><td><p style='padding-left:40px'>There must be at most one rdaGr2:dateOfBirth</p></td>
<td align='right'>94</td><td align='right'>94</td></tr>
<tr><td><p style='padding-left:40px'>rdaGr2:dateOfBirth must be earlier or equals than 
                    rdaGr2:dateOfDeath</p></td>
<td align='right'>16</td><td align='right'>20</td></tr>
<tr><td><p style='padding-left:40px'>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</p></td>
<td align='right'>578</td><td align='right'>589</td></tr>
<tr><td><p style='padding-left:40px'>There must be at most one rdaGr2:dateOfDeath</p></td>
<td align='right'>46</td><td align='right'>46</td></tr>
<tr><td><p style='padding-left:40px'>Check that the value for date matches ISO 8601 starting with
                    the year and hyphenating the day and month parts: 
                    YYYY-MM-DD</p></td>
<td align='right'>291</td><td align='right'>296</td></tr>
<tr><td><p style='padding-left:40px'>There must be at most one rdaGr2:placeOfBirth</p></td>
<td align='right'>637</td><td align='right'>637</td></tr>
<tr><td><p style='padding-left:40px'>There must be at most one rdaGr2:placeOfDeath</p></td>
<td align='right'>192</td><td align='right'>192</td></tr>
<table>


