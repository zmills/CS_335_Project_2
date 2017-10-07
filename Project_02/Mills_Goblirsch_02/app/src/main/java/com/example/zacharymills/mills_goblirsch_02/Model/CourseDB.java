package com.example.zacharymills.mills_goblirsch_02.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zachary Mills on 10/6/2017.
 */

public class CourseDB
{

    private static CourseDB sCourseDB; /* Create single instance of courseDB   */

    private List<Course> mListOfCourses;

    /***************************************************************************/
    /*                               Constructor                               */
    /***************************************************************************/
    private CourseDB()
    {
        /* Add courses to list                                                 */
        mListOfCourses = new ArrayList<>();
        mListOfCourses.add(new Course(1, "New Testament Survey 1", "BI-101"));
        mListOfCourses.add(new Course(2, "English Grammar", "EN-123"));
        mListOfCourses.add(new Course(3, "Database 1", "CS-303"));
        mListOfCourses.add(new Course(4, "Mobile Application Programming", "CS-335"));
        mListOfCourses.add(new Course(5, "Graphics Programming", "CS-441"));
    }

    /* Return all the courses in the list                                      */
    public List<Course> getAllCourses()
    {
        return mListOfCourses;
    }

    /* Return the single instance of courseDb                                  */
    public static  CourseDB get()
    {
        /* If no courseDb exist, create one and return it                      */
        if(sCourseDB == null)
        {
            sCourseDB = new CourseDB();
        }
        return  sCourseDB;
    }
}