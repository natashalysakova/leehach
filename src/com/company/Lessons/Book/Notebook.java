package com.company.Lessons.Book;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by quantark on 03.09.15.
 */
public class Notebook {

    ArrayList<Notes> notes = new ArrayList<>();

    public void AddNotes(String a, Date b, String c) {

        Notes N = new Notes();

        N.Name = a;
        N.Date = b;
        N.Tel = c;

        notes.add(N);
    }

    public void RemoveNotes(int index) {

        notes.remove(index);
    }

    public void RemoveNotes(Notes notes) {

        this.notes.remove(notes);
    }

    public void RemoveNotes(String name) {

        int ind = -1;

        for (int i = 0; i < notes.size(); i++) {

            if (notes.get(i).Name == name) {
                ind = i;
            }
        }

        if (ind != -1) {
            notes.remove(ind);
        }

    }

    public Notes GetNote(String name) {

        for (int i = 0; i < notes.size(); i++) {

            if (name == notes.get(i).Name) {

                return (notes.get(i));
            }
        }
        return null;
    }

    public Notes GetNote(int j) {

            if (j > -1 && j < notes.size()) {

                return(notes.get(j));
            }
        return null;
    }
}
