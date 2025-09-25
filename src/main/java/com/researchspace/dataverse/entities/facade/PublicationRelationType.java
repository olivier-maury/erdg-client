package com.researchspace.dataverse.entities.facade;

/**
 * Accepted types list for 'publicationRelationType' field.
 *
 * Le 28/07/2025 à 15:40, datainrae a écrit :
 * > Les différentes valeurs possibles sont :
 * >
 * > *Est cité par* : Ce jeu de données (ressource décrite) est cité par la
 * > publication associée. Par exemple une publication dont les résultats sont
 * > obtenus avec ce jeu de données.
 * > Ex. de publication : un Article dans une revue, un ouvrage ou chapitre
 * > d’ouvrage, Rapport
 * >
 * > *Cite***: Ce jeu de données (la ressource décrite) cite la
 * > publication associée. Par exemple si la méthode de collecte est inspirée
 * > de la publication associée.
 * > Ex. de publication : un Article dans une revue, un ouvrage ou chapitre
 * > d’ouvrage, Rapport
 * >
 * > *Est le supplément de* : ce jeu de données (la ressource décrite) est un
 * > supplément de la publication associée. Par exemple si le jeu de données
 * > consiste en des  supplementary materials, ou des données pouvant servir
 * > d'exemples complémentaires à la publication.
 * > Ex. de publication: un Article dans une revue, un ouvrage ou chapitre
 * > d’ouvrage,
 * >
 * > *A pour supplément *: ce jeu de données (la ressource décrite) a comme
 * > supplément une publication associée. Par exemple un Datapaper apportant
 * > des compléments sur le jeu de données.
 * > Ex. de publication : un PGD, un Datapaper, Rapport
 */
public enum PublicationRelationType {
    IsCitedBy, IsSupplementTo;
}
