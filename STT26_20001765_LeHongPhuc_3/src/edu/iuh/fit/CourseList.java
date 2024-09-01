package edu.iuh.fit;

import java.util.Arrays;

/**
 * Description: This class represents a list of courses
 */
public class CourseList {

    private Course[] courses;
    private int count; // Removed static keyword for count, making it instance-specific

    /**
     * Description: Constructor with a parameter to initialize the array of courses with a specific length n
     * @param n The length of the array
     * @throws IllegalArgumentException if n is less than or equal to 0
     */
    public CourseList(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Length of the array must be greater than 0");
        courses = new Course[n]; // create an array of n elements
        count = 0; // initialize count to 0
    }

    /**
     * Description: Add a course to the list
     * @param course The course to be added
     * @return true if the course is added successfully, false otherwise
     */
    public boolean addCourse(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null");
        }
        if (exists(course.getId())) {
            throw new IllegalArgumentException("Course with the same ID already exists");
        }
        if (count == courses.length) {
            throw new IllegalArgumentException("Course list is full");
        }
        courses[count++] = course;
        return true;
    }

    /**
     * Description: Check if a course with the specified ID exists in the list
     * @param id The course ID to check
     * @return true if the course exists, false otherwise
     */
    public boolean exists(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i] != null && courses[i].getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Description: Get the current list of courses
     * @return An array of courses currently in the list
     */
    public Course[] getCourses() {
        return Arrays.copyOf(courses, count); // Return only the non-null elements
    }

    /**
     * Description: Remove a course by its ID
     * @param id The ID of the course to be removed
     * @return true if the course was successfully removed, false otherwise
     */
    public boolean removeCourse(String id) {
        for (int i = 0; i < count; i++) {
            if (courses[i] != null && courses[i].getId().equalsIgnoreCase(id)) {
                // Shift elements to fill the gap
                for (int j = i; j < count - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[--count] = null; // Decrease count and nullify the last element
                return true;
            }
        }
        return false;
    }
}
