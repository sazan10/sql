## SQL Assignment


The project assumes a database with at least two fields "name" and "last" for first and last names of students. Here, in the context of this project, database named "student", has a table named "student" with 10000 records of students. The sql project provides two options to search  data from a database student based on the field "name" and returns the first and last name:

	1=> to search without index on name
	2=> to search with index on name

On observation, without index it took longer time, ie 10ms+ and was not consistent. However, on performing search with index on name it dropped to 1ms and was consistent.

NOTE: To observe the output please import the 'student.sql' file in localhost and in the program please enter the username and password for the database.