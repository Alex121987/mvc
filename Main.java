public class Main {
    public static void main(String[] args) {
        Course model  = retriveCourseFromDatabase();
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);
        controller.updateView();
        controller.setCourseName("Python");
        controller.setCourseId("02");
        System.out.println("After updating, Course Details are as follows");
        controller.updateView();
    }
    private static Course retriveCourseFromDatabase(){
        Course course = new Course();
        course.setName("Java");
        course.setId("01");
        course.setCategory("Programming");
        return course;
    }
}
