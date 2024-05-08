package notebook;

import notebook.model.Entry;
import notebook.model.Notebook;
import notebook.presenter.NotebookPresenter;
import notebook.view.NotebookView;

public class Main {

    public static void main(String[] args) {
        
        Notebook model = new NotebookImpl();

        NotebookView view = new NotebookViewImpl();

        NotebookPresenter presenter = new NotebookPresenter(model, view);

        presenter.loadEntries();

        Entry entry = new Entry("Стоматолог", LocalDate.now().plusDays(1), "19:00");
        presenter.addEntry(entry);
    }
}
