<h1>Create Enrollment</h1>

<g:form action="save">

<label>Student</label>

<g:select
name="student.id"
from="${students}"
optionKey="id"
optionValue="name"/>

<br><br>

<label>Course</label>

<g:select
name="course.id"
from="${courses}"
optionKey="id"
optionValue="title"/>

<br><br>

<label>Grade</label>

<g:textField name="grade"/>

<br><br>

<button type="submit">
Save
</button>

</g:form>
