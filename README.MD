# EDM Shapes Project

This project details an effort to represent validation constraints that are 
currenly defined in the [EDM schema](http://www.europeana.eu/schemas/edm/), 
but also constraints that had previously been identified in previous Europeana 
projects and the new requirements identified within the 
[Data Quality Committee](https://docs.google.com/document/d/1ZOSKrX7X9oU7Ob3wjinXVWenx8HCq5qnhUzljcpFKs8), 
using the [W3C SHACL Constraint Language](https://www.w3.org/TR/shacl/).

References:
- [EDM schema](http://www.europeana.eu/schemas/edm/) and [EDM documentation](http://pro.europeana.eu/page/edm-documentation)
- [Validation Rules identified by DDB and the DM2E project](https://docs.google.com/spreadsheets/d/1dI29hgckyHn3B0h5shmbYX3jcp3PZfX7TA30Ohp_dMI) for an overview of the rules identified in previous projects.
- [Problem Patterns Catalog](https://docs.google.com/spreadsheets/d/1zoU-1uPk2O5t5zRC1-MD3LakBQGJ2hsWlSnp3XS2iAk) for a fresh list of issues that are being worked on in the scope of the DQC

**Contact:** Hugo Manguinhas (hugo.manguinhas@europeana.eu)

## About SHACL

TODO

## Modules included in this Project

- [The EDM Schema constraints in SHACL](shapes-edm).
- ~~[New EDM contraints](shapes-dqc) from previous projects and DQC.~~
- A [SHACL Java implementation](shapes-validation) that is able to run EDM validation constraints against EDM data. 
  It also supports testing of constraints and generation of validation reports.
- A [software to generate documentation](shapes-doc) pages in GitHub so that constraints can be easily viewed, validate the constraints and build validation reports.

## License
Copyright 2007-2012 The Europeana Foundation Licenced under the EUPL, 
Version 1.1 (the "Licence") and subsequent versions as approved by the European 
Commission; You may not use this work except in compliance with the Licence. 
You may obtain a copy of the Licence at: http://joinup.ec.europa.eu/software/page/eupl .
Unless required by applicable law or agreed to in writing, software distributed 
under the Licence is distributed on an "AS IS" basis, without warranties 
or conditions of any kind, either express or implied. See the Licence for 
the specific language governing permissions and limitations under the Licence.

