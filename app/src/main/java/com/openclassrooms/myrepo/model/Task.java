package com.openclassrooms.myrepo.model;

import java.util.Date;
import java.util.Objects;

/**
 * Une classe représentant une tâche avec une description.
 */
public class Task {
    private String description;
    private Date dueDate;


    /**
     * Constructeur pour créer une nouvelle tâche avec une description.
     *
     * @param description La description de la tâche.
     */
    public Task(String description, Date dueDate) {
        this.description = description;
        this.dueDate = dueDate;
    }

    /**
     * Obtient la description de la tâche.
     *
     * @return La description de la tâche.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Modifie la description de la tâche.
     *
     * @param description La nouvelle description de la tâche.
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Obtient la date limite pour effectuer la tache.
     *
     * @return La date limite de la tâche.
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Modifie lq date limite pour effectuer la tache.
     *
     * @param dueDate La nouvelle date de la tâche.
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Vérifie si deux objets Task sont égaux en comparant leurs descriptions.
     *
     * @param o L'objet à comparer.
     * @return Vrai si les descriptions ainsi que les dates limite sont égales, sinon faux.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(description, task.description) && Objects.equals(dueDate, task.dueDate);
    }

    /**
     * Calcule le code de hachage en utilisant la description ainsi que la date limite de la tâche.
     *
     * @return Le code de hachage calculé.
     */
    @Override
    public int hashCode() {
        return Objects.hash(description, dueDate);
    }
}
