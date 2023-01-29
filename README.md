# Paint Backend
- Implemented using Spring Boot framework
- Run Back-End Program on local host https://localhost:8080/ 
- Paint Front-End: https://github.com/AliELSharawy/paint-frontend

## Team Members:
    Ali Hassan ElSharawy
    Basel Ahmed
    Louay Magdy
    
## Design Patterns used:
   Delegation Pattern:
     - Relation between controller and the interface IPaintService
     - Relation between controller and the interface Shape
     - Relation between controller and Point Class
     - Relation between all the shapes classes and Point Class
   
   Interface pattern:
    - Relation between controller and the PaintService
    - Relation between controller and shapes classes
    
   Prototype Pattern:
   - All shapes classes together with the interface implement cloneable interface to be cloned (in deep copy)
   
##Paint Web Application provides:
 1- Drawing and coloring simple shapes (square, rectangle, circle, triangle, ellipse)\
 2- Undo, Redo and Save options\
 3- Copy, Move, Delete, Resize shapes
 
## Design Decisions made:
  - We can’t undo or redo options after saving the file.
  - We can’t use save options without previously using save as option to create new file.
  - We must use Cursor from shape list to be able to use function containing (fill-move-copy-delete-resize) functions.
  - all shape classes implement an interface so that, any other classes using functionality of such classes be independent from them
  - objects are sent between Front-End and Back-End as JSON-objects
