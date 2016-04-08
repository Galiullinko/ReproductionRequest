package ru.itis.inform.RequestReproduction.DAO.Models;

/**
 * Created by Galiullin_ko on 07/04/16.
 */
public enum SourcesOfMaterials {
    LEASE, OWN_RESOURCES, BUYING,
    FARM {
        public String whatFarm(String farm) {
            return farm;
        }
    }
}
