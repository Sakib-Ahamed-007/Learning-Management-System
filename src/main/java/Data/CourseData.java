/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author smsak
 */
public class CourseData {
    private String courseName;
    private String courseId;
    private String courseTeacher;
    private int batch;
    private String userName;
    private String classSchedule;
    
    public CourseData(String courseName, String courseId, String courseTeacher, int batch, String userName, String classSchedule){
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseTeacher = courseTeacher;
        this.batch = batch;
        this.userName = userName;
        this.classSchedule = classSchedule;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the courseId
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * @return the courseTeacher
     */
    public String getCourseTeacher() {
        return courseTeacher;
    }

    /**
     * @param courseTeacher the courseTeacher to set
     */
    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    /**
     * @return the batch
     */
    public int getBatch() {
        return batch;
    }

    /**
     * @param batch the batch to set
     */
    public void setBatch(int batch) {
        this.batch = batch;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the classSchedule
     */
    public String getClassSchedule() {
        return classSchedule;
    }

    /**
     * @param classSchedule the classSchedule to set
     */
    public void setClassSchedule(String classSchedule) {
        this.classSchedule = classSchedule;
    }
    
    
    
}
