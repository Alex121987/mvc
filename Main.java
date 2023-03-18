public class Main {
    public static void main(String[] args) {
        //Этот паттерн больше не нужен
        Course model  = Course.retriveCourseFromDatabase();
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);

        controller.updateView();
        controller.setCourseName("Python");
        controller.setCourseId("02");
        System.out.println("\nAfter updating, Course Details are as follows:\n");
        controller.updateView();
    }

}

