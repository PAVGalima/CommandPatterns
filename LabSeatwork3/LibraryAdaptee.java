public class LibraryAdaptee implements SchoolManagementApp{
    
    private LibrarySys librarySystem;

    public LibraryAdaptee(LibrarySys librarySystem){
        this.librarySystem = librarySystem;
    }

    @Override
    public String integrate() {
        return librarySystem.manageBooks();
    }

}
